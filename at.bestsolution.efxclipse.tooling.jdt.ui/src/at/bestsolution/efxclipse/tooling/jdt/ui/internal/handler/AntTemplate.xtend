package at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler

import java.util.Properties
import java.util.Set
import java.util.Map
import java.util.Collection

class AntTemplate {
	def generateAnt(Map<String,Object> properties) {
		val projectName = properties.get("projectName") as String;
		
		'''
		<?xml version="1.0" encoding="UTF-8"?>
			<project name="«projectName»" default="do-deploy" basedir=".">
			«createInitTaskTarget(properties)»
			«compileTarget(properties)»
			«createDoDeployTarget(properties)»
		</project>
		'''.toString
	}
	
	def createInitTaskTarget(Map<String,Object> properties) {
		val sdkPath = properties.get("jfxSdk") as String;
		'''
		<target name="init-fx-tasks">
			<property name="javafx.tools.ant.jar" value="«sdkPath»/tools/ant-javafx.jar"/>
			
			<taskdef name="fxdeploy"
				classname="com.sun.javafx.tools.ant.DeployFXTask"
				classpath="${javafx.tools.ant.jar}"/>
			<taskdef name="fxjar"
				classname="com.sun.javafx.tools.ant.FXJar"
				classpath="${javafx.tools.ant.jar}"/>
			<taskdef name="fxsignjar"
				classname="com.sun.javafx.tools.ant.FXSignJarTask"
				classpath="${javafx.tools.ant.jar}"/>
		</target>
		'''
	}
	
	def compileTarget(Map<String,Object> properties) {
		val projectRefs = properties.get("projectRefSourceDirs") as Collection<String>;
		val externalLibs = properties.get("externalLibs") as Collection<String>;
		val projectSourceDirs = properties.get("projectSourceDirs") as Collection<String>;
		val sdkPath = properties.get("jfxSdk") as String;
		
		'''
		<target name='do-compile'>
			<delete dir="build" />
			<mkdir dir="build/src" />
			<mkdir dir="build/libs" />
			<mkdir dir="build/classes" />
		
			<!-- Copy project-libs references -->
			«FOR String s : externalLibs»
			<copy todir="build/libs">
				<fileset dir="externalLibs">
					<include name="«s»"/>
				</fileset>
			</copy>
			«ENDFOR»
		
			<!-- Copy project references -->
			«FOR String s : projectRefs»
			<copy todir="build/src">
				<fileset dir="projectRefs/«s»">
					<include name="**/*"/>
				</fileset>
			</copy>
			«ENDFOR»
		
			<!-- Copy project sources itself -->
			«FOR String s : projectSourceDirs»
			<copy todir="build/src">
				<fileset dir="project/«s»">
					<include name="**/*"/>
				</fileset>
			</copy>
			«ENDFOR»
		
			<javac srcdir="build/src" destdir="build/classes">
				<classpath>
					<fileset dir="build/libs">
						<include name="*"/>
					</fileset>
					<filelist>
						<file name="«sdkPath»\rt\lib\jfxrt.jar"/>
					</filelist>
				</classpath>
			</javac>
		</target>
		'''	
	}
	
	def createDoDeployTarget(Map<String,Object> properties) {
		val projectName = properties.get("projectName") as String;
		val sdkPath = properties.get("jfxSdk") as String;
		val mainClass = properties.get("applicationClass") as String;
		val appletWidth = properties.get("appletWith") as Integer;
		val appletHeight = properties.get("appletHeight") as Integer;
		val externalLibs = properties.get("externalLibs") as Collection<String>;
		val appVendor = properties.get("appVendor") as String;
		val appTitle = properties.get("appTitle") as String;
		val appVersion = properties.get("appVersion") as String;
		var keyStore = properties.get("keyStore") as String;
		var keyStoreAlias = properties.get("keyStoreAlias") as String;
		var keyStorePass = properties.get("keyStorePass") as String;
		
		'''
		<target name="do-deploy" depends="do-compile, init-fx-tasks">
			<delete file="dist"/>
			<mkdir name="dist" />
			
			<fxjar destfile="dist/«projectName».jar" classpath="«FOR String s : externalLibs»«s» «ENDFOR»" applicationClass="«mainClass»">
				<fileset dir="build/classes"/>
				<manifest>
					<attribute name="Implementation-Vendor" value="«appVendor»"/>
					<attribute name="Implementation-Title" value="«appTitle»"/>
					<attribute name="Implementation-Version" value="«appVersion»"/>
				</manifest>
			</fxjar>
			
			«IF keyStore != null»
			<fxsignjar keystore="«keyStore»" alias="«keyStoreAlias»" storepass="«keyStorePass»" destDir="sign">
				<fileset file="dist/«projectName».jar"/>
			</fxsignjar>
			«ENDIF»
		
			<fxdeploy width="«appletWidth»" height="«appletHeight»" outdir="deploy" embedJNLP="true" outfile="«projectName»">
				<info title="«projectName»" vendor="«appVendor»"/>
				<application name="«projectName»" appclass="«mainClass»"/>
				<resources type="eager">
					<fileset dir="dist">
						<include name="«projectName».jar"/>
					</fileset>
					<fileset dir="externalLibs">
						<include name="*"/>
					</fileset>	
				</resources>
			</fxdeploy>
		</target>
		'''
	}
}