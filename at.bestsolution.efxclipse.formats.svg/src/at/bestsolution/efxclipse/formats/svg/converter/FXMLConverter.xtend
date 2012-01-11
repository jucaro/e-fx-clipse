package at.bestsolution.efxclipse.formats.svg.converter

import at.bestsolution.efxclipse.formats.svg.svg.SvgSvgElement
import org.eclipse.emf.ecore.EObject
import at.bestsolution.efxclipse.formats.svg.svg.SvgRectElement
import at.bestsolution.efxclipse.formats.svg.svg.SvgDefsElement
import at.bestsolution.efxclipse.formats.svg.svg.SvgLinearGradientElement
import at.bestsolution.efxclipse.formats.svg.svg.SvgRadialGradientElement
import at.bestsolution.efxclipse.formats.svg.svg.SpreadMethod
import javafx.scene.paint.CycleMethod
import at.bestsolution.efxclipse.formats.svg.svg.SvgStopElement
import at.bestsolution.efxclipse.formats.svg.svg.SvgGElement
import at.bestsolution.efxclipse.formats.svg.svg.SvgPathElement
import java.util.List
import java.util.ArrayList
import at.bestsolution.efxclipse.formats.svg.svg.SvgFilterElement
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeGaussianBlurElement
import at.bestsolution.efxclipse.formats.svg.svg.ContentElement

class FXMLConverter { 
	def generate(SvgSvgElement rootElement) ''' 
	«val content = handle(rootElement)»
	<?xml version="1.0" encoding="UTF-8"?>
	
	<?import java.lang.*?>
	<?import javafx.scene.*?>
	<?import javafx.scene.shape.*?>
	<?import javafx.scene.paint.*?>
	<?import javafx.scene.image.*?>
	<?import javafx.scene.transform.*?>
	<?import javafx.scene.effect.*?>
	
	«content»
	'''
	
	def dispatch handle(EObject o) '''
		<!-- Unhandled type '«o.eClass.name»' -->
	'''
	
	def dispatch handle(SvgSvgElement element) '''
	<Group fx:id='_root' xmlns:fx="http://javafx.com/fxml" xmlns:fxsvg="http://efxclipse.org/fxml-svg">
		<children>
			«FOR o : element.children»
				«handle(o)»
			«ENDFOR»
		</children>
	</Group>
	'''
	
	def dispatch handle(SvgDefsElement element) '''
	<fx:define>
		«FOR o : element.children»
			«handle(o)»
		«ENDFOR»
	</fx:define>
	'''
	
	def dispatch handle(SvgLinearGradientElement element) '''
	<LinearGradient
		«IF element.x1 != null»startX="«element.x1.parseCoordinate»"«ENDIF»
		«IF element.y1 != null»startY="«element.y1.parseCoordinate»"«ENDIF»
		«IF element.x2 != null»endX="«element.x2.parseCoordinate»"«ENDIF»
		«IF element.y2 != null»endY="«element.y2.parseCoordinate»"«ENDIF»
		«IF element.spreadMethod != SpreadMethod::PAD»cycleMethod="«element.spreadMethod.toFx»"«ENDIF»
		«IF element.id != null»fx:id="«element.id»"«ENDIF»
		>
		«IF ! element.children.filter(typeof(SvgStopElement)).empty»
			<stops>
			«FOR o : element.children.filter(typeof(SvgStopElement))»
				«handle(o)»
			«ENDFOR»
			</stops>
		«ENDIF»
	</LinearGradient>
	'''
	
	def dispatch handle(SvgRadialGradientElement element) '''
	<RadialGradient
		«IF element.cx != null»centerX="«element.cx.parseCoordinate»"«ENDIF»
		«IF element.cy != null»centerY="«element.cy.parseCoordinate»"«ENDIF»
		«IF element.r != null»radius="«element.r.parseLength»"«ENDIF»
		«IF element.spreadMethod != SpreadMethod::PAD»cycleMethod="«element.spreadMethod.toFx»"«ENDIF»
		«/*IF element.fx != null || element.fy != null»fxsvg:todo="Need to handle focus stuff"«ENDIF*/»
		«IF element.id != null»fx:id="«element.id»"«ENDIF»
		>
		«IF ! element.children.filter(typeof(SvgStopElement)).empty || element.resolvedInstance != null»
			<stops>
			«FOR o : element.children.filter(typeof(SvgStopElement))»
				«handle(o)»
			«ENDFOR»
			«IF element.xlink__href != null»
			«val link = element.resolvedInstance»
			«IF link != null && link instanceof ContentElement»
			«FOR o : (link as ContentElement).children.filter(typeof(SvgStopElement))»
				«handle(o)»
			«ENDFOR»
			«ENDIF»
			«ENDIF»
			</stops>
		«ENDIF»
	</RadialGradient>
	'''
	
	def dispatch handle(SvgStopElement element) '''
	<Stop
		«IF element.offset != null»offset="«element.offset.parsePercentage»"«ENDIF»
		>
		«IF element.stop_opacity != null»
		<color>
			«IF element.stop_color != null»
				«element.stop_color.fillPaint(Double::parseDouble(element.stop_opacity))»
			«ELSE»
				<opacity>«element.stop_opacity»</opacity>
			«ENDIF»
		</color>
		«ELSEIF element.stop_color != null»
		<color>
			«element.stop_color.fillPaint»
		</color>
		«ENDIF»
	</Stop>
	'''
	
	def dispatch handle(SvgRectElement element) '''
	<Rectangle
		«IF element.x != null»x="«element.x.parseLength»"«ENDIF»
		«IF element.y != null»y="«element.y.parseLength»"«ENDIF»
		«IF element.width != null»width="«element.width.parseLength»"«ENDIF»
		«IF element.height != null»height="«element.height.parseLength»"«ENDIF»
		«IF element.stroke_width != null»strokeWidth="«element.stroke_width.parseLength»"«ENDIF»
		>
		«IF element.fill != null && ! element.fill.equals("none")»
		<fill>
			«element.fill.fillPaint»
		</fill>
		«ELSE»
		<fill>
			TRANSPARENT
		</fill>
		«ENDIF»
		«IF element.stroke != null && ! element.stroke.equals("none")»
		<stroke>
			«element.stroke.fillPaint»
		</stroke>
		«ENDIF»
		«IF element.transform != null»
			<transforms>
				«element.transform.handleTransform»
			</transforms>
		«ENDIF»
	</Rectangle>
	'''
	
	def dispatch handle(SvgGElement element) '''
	<Group
		«IF element.x != null»translateX="«element.x.parseCoordinate»"«ENDIF»
		«IF element.y != null»translateY="«element.y.parseCoordinate»"«ENDIF»
		>
		<children>
			«FOR o : element.children»
				«handle(o)»
			«ENDFOR»
		</children>
		«IF element.transform != null»
			<transforms>
				«element.transform.handleTransform»
			</transforms>
		«ENDIF»
	</Group>
	'''
	
	def dispatch handle(SvgPathElement element) '''
	<SVGPath
		«IF element.d != null»content="«element.d»"«ENDIF»
		>
		«IF element.fill != null && ! element.fill.equals("none")»
		<fill>
			«element.fill.fillPaint»
		</fill>
		«ELSE»
		<fill>
			TRANSPARENT
		</fill>
		«ENDIF»
		«IF element.stroke != null && ! element.stroke.equals("none")»
		<stroke>
			«element.stroke.fillPaint»
		</stroke>
		«ENDIF»
		«IF element.transform != null»
			<transforms>
				«element.transform.handleTransform»
			</transforms>
		«ENDIF»
	</SVGPath>
	'''
	
	def dispatch handle(SvgFilterElement element) '''
	«IF element.children.size == 1»
		«val f = element.children.get(0)»
		«IF f instanceof SvgFeGaussianBlurElement»
		«val g = f as SvgFeGaussianBlurElement»
		<GaussianBlur 
			«IF g.stdDeviation != null»radius="«g.stdDeviation»"«ENDIF»
		>
		</GaussianBlur>
		«ELSE»
		<!-- Unknown filter type «f» -->
		«ENDIF»
	«ENDIF»
	'''
	
	def fillPaint(String fill) {
		if( fill.startsWith("#") ) {
			return fill.hexColor
		} else if( fill.startsWith("rgb") ) {
			
		} else if( fill.startsWith("argb") ) {
			
		} else if( fill.startsWith("url") ) {
			return '''<fx:reference source="«fill.substring(5,fill.length-1)»" />'''
		} else {
			return fill.toUpperCase
		}
	}
	
	def fillPaint(String fill, Double opacity) {
		if( fill.startsWith("#") ) {
			return fill.hexColor(opacity)
		} else if( fill.startsWith("rgb") ) {
			
		} else if( fill.startsWith("argb") ) {
			
		} else {
			return fill.toUpperCase
		}
	}
	
	def hexColor(String fill) '''
	<Color>
		<red>«fill.hexRed»</red>
		<green>«fill.hexGreen»</green>
		<blue>«fill.hexBlue»</blue>
	</Color>
	'''
	
	def hexColor(String fill, Double opacity) '''
	<Color>
		<red>«fill.hexRed»</red>
		<green>«fill.hexGreen»</green>
		<blue>«fill.hexBlue»</blue>
		<opacity>«opacity»</opacity>
	</Color>
	'''
	
	def hexRed(String color) {
		return Integer::valueOf(color.substring(1,3),16) as double / Double::valueOf('255.0');
	}
	
	def hexGreen(String color) {
		return Integer::valueOf(color.substring(3,5),16) as double / Double::valueOf('255.0');
	}
	
	def hexBlue(String color) {
		return Integer::valueOf(color.substring(5,7),16) as double / Double::valueOf('255.0');
	}
	
	def handleTransform(String transform) '''
	«val params = transform.substring(transform.indexOf("(")+1,transform.indexOf(")"))»
	«IF transform.startsWith("translate")»
	<Translate
		«IF params.indexOf(",") != -1»
			«val parts = params.split(",")»
			x="«parts.get(0)»"
			y="«parts.get(1)»"
		«ELSE»
			x="«params»"
		«ENDIF»
		>
	</Translate>
	«ELSEIF transform.startsWith("scale")»
	<Scale
		«IF params.indexOf(",") != -1»
			«val parts = params.split(",")»
			x="«parts.get(0)»"
			y="«parts.get(1)»"
		«ELSE»
			x="«params»"
		«ENDIF»
	>
	</Scale>
	«ELSEIF transform.startsWith("rotate")»
	<Rotate
		«IF params.indexOf(",") != -1»
			«val parts = params.split(",")»
			«IF parts.size == 2»
				angle="«parts.get(0)»"
				pivotX="«parts.get(1)»"
			«ELSEIF parts.size == 2»
				angle="«parts.get(0)»"
				pivotX="«parts.get(1)»"
				pivotY="«parts.get(2)»"
			«ENDIF»
		«ELSE»
			angle="«params»"
		«ENDIF»
	>
	</Rotate>
	«ELSEIF transform.startsWith("matrix")»
	«val parts = params.split(",")»
	<Affine
		mxx="«parts.get(0)»"
		mxy="«parts.get(1)»"
		myx="«parts.get(2)»"
		myy="«parts.get(3)»"
		tx="«parts.get(4)»"
		ty="«parts.get(5)»"
		>
	</Affine>
	«ENDIF»
	'''
	
	def CycleMethod toFx(SpreadMethod m) {
		switch(m) {
			case SpreadMethod::PAD:
				return CycleMethod::NO_CYCLE
			case SpreadMethod::REFLECT:
				return CycleMethod::REFLECT
			case SpreadMethod::REPEAT:
				return CycleMethod::REPEAT
		}
		
		return CycleMethod::NO_CYCLE;
	}
	
	def parseLength(String length) {
		return Double::parseDouble(length);
	}
	
	def parseCoordinate(String coordinate) {
		return Double::parseDouble(coordinate);
	}
	
	def parsePercentage(String perecentage) {
		return Double::parseDouble(perecentage);
	}
}