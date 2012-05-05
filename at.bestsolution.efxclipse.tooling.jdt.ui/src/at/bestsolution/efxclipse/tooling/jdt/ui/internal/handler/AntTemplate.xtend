package at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler

import java.io.File
import java.util.Collection
import java.util.Map

class AntTemplate {
	def generateAnt(Map<String,Object> properties) {
		val projectName = properties.get("projectName") as String;
		
		'''
		<?xml version="1.0" encoding="UTF-8"?>
			<project name="«projectName»" default="do-deploy" basedir="."  xmlns:fx="javafx:com.sun.javafx.tools.ant">
			«createInitTaskTarget(properties)»
			«createLocalSetup(properties)»
			«compileTarget(properties)»
			«createDoDeployTarget(properties)»
		</project>
		'''.toString
	}
	
	def createLocalSetup(Map<String,Object> properties) {
		val externalLibs = properties.get("orig.externalLibs") as Collection<File>;
		val projectSrcDirs = properties.get("orig.projectSourceDirs") as Collection<SetupDirectory>;
		var projectRefs = properties.get("orig.projectRefSourceDirs") as Collection<SetupDirectory>;
		'''
		<target name="setup-staging-area">
			<delete dir="externalLibs" />
			<delete dir="project" />
			<delete dir="projectRefs" />
			
			<mkdir dir="externalLibs" />
			
			«FOR File l : externalLibs»
			<copy todir="externalLibs"/>
				<fileset dir="«l.parent»">
					<filename name="«l.name»"/>	
				</fileset>
			</copy>
			«ENDFOR»
			
			<mkdir dir="project" />
			«FOR SetupDirectory d : projectSrcDirs»
			<copy todir="project">
				<fileset dir="«d.originalPath.absolutePath»">
					<include name="«d.relativePath.name»/**" />
				</fileset>
			</copy>
			«ENDFOR»
			
			<mkdir dir="projectRefs" />
			«FOR SetupDirectory d : projectRefs»
			<copy todir="projectRefs">
				<fileset dir="«d.originalPath.absolutePath»">
					<include name="«d.relativePath.path»/**" />
				</fileset>
			</copy>
			«ENDFOR»
		</target>
		'''
	}
	
	def createInitTaskTarget(Map<String,Object> properties) {
		val sdkPath = properties.get("jfxSdk") as String;
		'''
		<target name="init-fx-tasks">
			<property name="javafx.tools.ant.jar" value="«sdkPath»/tools/ant-javafx.jar"/>
			
			<taskdef resource="com/sun/javafx/tools/ant/antlib.xml"      
				uri="javafx:com.sun.javafx.tools.ant"
				classpath="${javafx.tools.ant.jar}"/>
		</target>
		'''
	}
	
	def compileTarget(Map<String,Object> properties) {
		val projectRefs = properties.get("projectRefSourceDirs") as Collection<String>;
		val externalLibs = properties.get("externalLibs") as Collection<String>;
		val projectSourceDirs = properties.get("projectSourceDirs") as Collection<String>;
		val sdkPath = properties.get("jfxSdk") as String;
		var encoding = properties.get("projectEncoding") as String;
		var sourceCompliance = properties.get("sourceCompliance") as String;
		var targetCompliance = properties.get("targetCompliance") as String;
		
		'''
		<target name='do-compile'>
			<delete dir="build" />
			<mkdir dir="build/src" />
			<mkdir dir="build/libs" />
			<mkdir dir="build/classes" />
		
			<!-- Copy project-libs references -->
			<copy todir="build/libs">
				<fileset dir="externalLibs">
					«FOR String s : externalLibs»
					<include name="«s»"/>
					«ENDFOR»
				</fileset>
			</copy>
		
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
		
			<javac source="«sourceCompliance»" target="«targetCompliance»" srcdir="build/src" destdir="build/classes"«IF encoding != null» encoding="«encoding»"«ENDIF»>
				<classpath>
					<fileset dir="build/libs">
						<include name="*"/>
					</fileset>
					<filelist>
						<file name="«sdkPath»\rt\lib\jfxrt.jar"/>
					</filelist>
				</classpath>
			</javac>
			
			<!-- Copy over none Java-Files -->
			<copy todir="build/classes">
			«FOR String s : projectSourceDirs»
				<fileset dir="project/«s»">
					<exclude name="**/*.java"/>
				</fileset>
			«ENDFOR»
			</copy>
		
			«FOR String s : projectRefs»
			<copy todir="build/classes">
				<fileset dir="projectRefs/«s»">
					<exclude name="**/*.java"/>
				</fileset>
			</copy>
			«ENDFOR»

		</target>
		'''	
	}
	
	def createDoDeployTarget(Map<String,Object> properties) {
		val projectName = properties.get("projectName") as String;
		val mainClass = properties.get("applicationClass") as String;
		val appletWidth = properties.get("appletWith") as String;
		val appletHeight = properties.get("appletHeight") as String;
		val appVendor = properties.get("appVendor") as String;
		val appTitle = properties.get("appTitle") as String;
		val appVersion = properties.get("appVersion") as String;
		val preloaderClass = properties.get("preloaderClass") as String;
		var preloaderPath = "";
		if( preloaderClass == null ) {
			preloaderPath = null;
		} else {
			preloaderPath = preloaderClass.replace('.','/');
		}
		val fallBackClass = properties.get("fallbackClass") as String;
		
		var keyStore = properties.get("keyStore") as String;
		var keyStoreAlias = properties.get("keyStoreAlias") as String;
		var keyStorePass = properties.get("keyStorePass") as String;
		var keyPass = properties.get("keyPass") as String;
		
		'''
		<target name="do-deploy" depends="setup-staging-area, do-compile, init-fx-tasks">
			<delete file="dist"/>
			<delete file="deploy" />
			
			<mkdir dir="dist" />
			<mkdir dir="dist/libs" />
			
			<copy todir="dist/libs">
				<fileset dir="externalLibs">
					<include name="*" />
				</fileset>
			</copy>
			
			«IF preloaderClass != null»
			<jar destfile="dist/libs/«projectName»-preloader.jar">
				<fileset dir="build/classes">
					<include name="«preloaderPath».class"/>
				</fileset>
			</jar>
			«ENDIF»
			
			<fx:resources id="appRes">
				«IF preloaderClass != null»
				<fx:fileset dir="dist" requiredFor="preloader"
					includes="«projectName»-preloader.jar"/>
				«ENDIF»
				<fx:fileset dir="dist" includes="«projectName».jar"/>
				<fx:fileset dir="dist" includes="libs/*"/>
			</fx:resources> 
			
			<fx:application id="fxApplication"
				name="«projectName»"
				mainClass="«mainClass»"
				«IF preloaderClass != null»
				preloaderClass="«preloaderClass»"
				«ENDIF»
				«IF fallBackClass != null»
				fallbackClass="«fallBackClass»"
				«ENDIF»
				/>
			
			<fx:jar destfile="dist/«projectName».jar">
				<fx:application refid="fxApplication"/>
				<fileset dir="build/classes">
				«IF preloaderClass != null»
					<exclude name="«preloaderPath».class" />
				«ENDIF»
				</fileset>
				<fx:resources refid="appRes"/>
				
				<manifest>
					<attribute name="Implementation-Vendor" value="«appVendor»"/>
					<attribute name="Implementation-Title" value="«appTitle»"/>
					<attribute name="Implementation-Version" value="«appVersion»"/>
				</manifest>
			</fx:jar>
			
			«IF keyStore != null»
			<!-- Need to use ${basedir} because somehow the ant task is calculating the directory differently -->
			<fx:signjar keystore="«keyStore»" alias="«keyStoreAlias»" «IF keyPass != null»keypass="«keyPass»" «ENDIF»«IF keyStorePass != null»storepass="«keyStorePass»" «ENDIF»destDir="${basedir}/dist">
				<fileset dir='dist'>
					<include name='**/*.jar' />
				</fileset>
			</fx:signjar>
			«ENDIF»
		
			«IF appletWidth != null && appletHeight != null»
			<mkdir dir="deploy" />
			<!-- Need to use ${basedir} because somehow the ant task is calculating the directory differently -->
			<fx:deploy width="«appletWidth»" height="«appletHeight»" outdir="${basedir}/deploy" embedJNLP="true" outfile="«projectName»">
				<fx:info title="«projectName»" vendor="«appVendor»"/>
				<fx:application refId="fxApplication"/>
				<fx:resources refid="appRes"/>
				<fx:permissions elevated="true"/>
			</fx:deploy>
			«ENDIF»
		</target>
		'''
	}
}