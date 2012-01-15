package at.bestsolution.efxclipse.formats.svg.converter

import at.bestsolution.efxclipse.formats.svg.svg.ContentElement
import at.bestsolution.efxclipse.formats.svg.svg.SpreadMethod
import at.bestsolution.efxclipse.formats.svg.svg.Stroke_linecap
import at.bestsolution.efxclipse.formats.svg.svg.Stroke_linejoin
import at.bestsolution.efxclipse.formats.svg.svg.SvgDefsElement
import at.bestsolution.efxclipse.formats.svg.svg.SvgElement
import at.bestsolution.efxclipse.formats.svg.svg.SvgFeGaussianBlurElement
import at.bestsolution.efxclipse.formats.svg.svg.SvgFilterElement
import at.bestsolution.efxclipse.formats.svg.svg.SvgGElement
import at.bestsolution.efxclipse.formats.svg.svg.SvgLinearGradientElement
import at.bestsolution.efxclipse.formats.svg.svg.SvgPathElement
import at.bestsolution.efxclipse.formats.svg.svg.SvgRadialGradientElement
import at.bestsolution.efxclipse.formats.svg.svg.SvgRectElement
import at.bestsolution.efxclipse.formats.svg.svg.SvgStopElement
import at.bestsolution.efxclipse.formats.svg.svg.SvgSvgElement
import at.bestsolution.efxclipse.formats.svg.svg.XLinkAttributes
import javafx.scene.paint.CycleMethod
import javafx.scene.shape.StrokeLineCap
import javafx.scene.shape.StrokeLineJoin
import org.eclipse.emf.ecore.EObject
import at.bestsolution.efxclipse.formats.svg.svg.FilterPrimitiveElement
import at.bestsolution.efxclipse.formats.svg.svg.SvgEllipseElement
import at.bestsolution.efxclipse.formats.svg.svg.SvgCircleElement

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
		«val owner = resolveGradientStopElement(element)» 
		«IF owner != null»
			<stops>
			«FOR o : (owner as ContentElement).children.filter(typeof(SvgStopElement))»
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
		«val owner = resolveGradientStopElement(element)» 
		«IF owner != null»
			<stops>
			«FOR o : (owner as ContentElement).children.filter(typeof(SvgStopElement))»
				«handle(o)»
			«ENDFOR»
			</stops>
		«ENDIF»
	</RadialGradient>
	'''
	
	def resolveGradientStopElement(SvgElement element) {
		if( element instanceof ContentElement ) {
			val rv = (element as ContentElement); 
			if( rv.children.filter(typeof(SvgStopElement)).empty ) {
				if( element instanceof XLinkAttributes ) {
					val v = element as XLinkAttributes;
					if( v.resolvedInstance != null ) {
						System::err.println("Resolving from link");
						return resolveGradientStopElement(v.resolvedInstance);	
					}
				}
			} else {
				System::err.println("Found stops: " + rv.children);
				return rv;
			}
		}
		System::err.println("Returning null");
		return null;
	}
	
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
		«IF (element.fill != null && ! element.fill.equals("none")) || ( element.fill_opacity != null && ! element.fill_opacity.equals("1") ) »
		<fill>
			«IF element.fill != null && ! element.fill.equals("none") »
				«IF element.fill_opacity != null && ! element.fill_opacity.equals("1")»
					«element.fill.fillPaint(Double::parseDouble(element.fill_opacity))»
				«ELSE»
					«element.fill.fillPaint»
				«ENDIF»
			«ELSE»
				<Color>
					<opacity>«element.stroke_opacity»</opacity>
				</Color>
			«ENDIF»
		</fill>
		«ELSE»
		<fill>
			TRANSPARENT
		</fill>
		«ENDIF»
		«IF (element.stroke != null && ! element.stroke.equals("none")) || ( element.stroke_opacity != null && ! element.stroke_opacity.equals("1") )»
		<stroke>
			«IF element.stroke != null && ! element.stroke.equals("none")»
				«IF element.stroke_opacity != null && ! element.stroke_opacity.equals("1") »
					«element.stroke.fillPaint(Double::parseDouble(element.stroke_opacity))»
				«ELSE»
					«element.stroke.fillPaint»
				«ENDIF»
			«ELSE»
				<Color>
					<opacity>«element.stroke_opacity»</opacity>
				</Color>
			«ENDIF»
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
«««		«IF element.stroke_dasharray != null»«ENDIF»
		«IF element.stroke_dashoffset != null»strokeDashOffset="«element.stroke_dashoffset.parseLength»"«ENDIF»
		«IF element.stroke_linecap != null»strokeLineCap="«element.stroke_linecap.toFx»"«ENDIF»
		«IF element.stroke_linejoin != null»strokeLineJoin="«element.stroke_linejoin.toFx»"«ENDIF»
		«IF element.stroke_miterlimit != null»strokeMiterLimit="«element.stroke_miterlimit.parseLength»"«ENDIF»
		«IF element.stroke_width != null»strokeWidth="«element.stroke_width.parseLength»"«ENDIF»
«««		«IF element.stroke_opacity != null»«ENDIF»
		>
		«IF (element.fill != null && ! element.fill.equals("none")) || ( element.fill_opacity != null && ! element.fill_opacity.equals("1") ) »
		<fill>
			«IF element.fill != null && ! element.fill.equals("none") »
				«IF element.fill_opacity != null && ! element.fill_opacity.equals("1")»
					«element.fill.fillPaint(Double::parseDouble(element.fill_opacity))»
				«ELSE»
					«element.fill.fillPaint»
				«ENDIF»
			«ELSE»
				<Color>
					<opacity>«element.stroke_opacity»</opacity>
				</Color>
			«ENDIF»
		</fill>
		«ELSE»
		<fill>
			TRANSPARENT
		</fill>
		«ENDIF»
		«IF (element.stroke != null && ! element.stroke.equals("none")) || ( element.stroke_opacity != null && ! element.stroke_opacity.equals("1") )»
		<stroke>
			«IF element.stroke != null && ! element.stroke.equals("none")»
				«IF element.stroke_opacity != null && ! element.stroke_opacity.equals("1") »
					«element.stroke.fillPaint(Double::parseDouble(element.stroke_opacity))»
				«ELSE»
					«element.stroke.fillPaint»
				«ENDIF»
			«ELSE»
				<Color>
					<opacity>«element.stroke_opacity»</opacity>
				</Color>
			«ENDIF»
		</stroke>
		«ENDIF»
		«IF element.transform != null»
			<transforms>
				«element.transform.handleTransform»
			</transforms>
		«ENDIF»
		«IF element.filter != null»
			
		«ENDIF»
	</SVGPath>
	'''
	
	def dispatch handle(SvgEllipseElement element) '''
	<Ellipse
		«IF element.rx != null»radiusX="«element.rx.parseLength»"«ENDIF»
		«IF element.ry != null»radiusY="«element.ry.parseLength»"«ENDIF»
		«IF element.cx != null»centerX="«element.cx.parseCoordinate»"«ENDIF»
		«IF element.cy != null»centerY="«element.cy.parseCoordinate»"«ENDIF»
«««		«IF element.stroke_dasharray != null»«ENDIF»
		«IF element.stroke_dashoffset != null»strokeDashOffset="«element.stroke_dashoffset.parseLength»"«ENDIF»
		«IF element.stroke_linecap != null»strokeLineCap="«element.stroke_linecap.toFx»"«ENDIF»
		«IF element.stroke_linejoin != null»strokeLineJoin="«element.stroke_linejoin.toFx»"«ENDIF»
		«IF element.stroke_miterlimit != null»strokeMiterLimit="«element.stroke_miterlimit.parseLength»"«ENDIF»
		«IF element.stroke_width != null»strokeWidth="«element.stroke_width.parseLength»"«ENDIF»
«««		«IF element.stroke_opacity != null»«ENDIF»
		>
		«IF (element.fill != null && ! element.fill.equals("none")) || ( element.fill_opacity != null && ! element.fill_opacity.equals("1") ) »
		<fill>
			«IF element.fill != null && ! element.fill.equals("none") »
				«IF element.fill_opacity != null && ! element.fill_opacity.equals("1")»
					«element.fill.fillPaint(Double::parseDouble(element.fill_opacity))»
				«ELSE»
					«element.fill.fillPaint»
				«ENDIF»
			«ELSE»
				<Color>
					<opacity>«element.stroke_opacity»</opacity>
				</Color>
			«ENDIF»
		</fill>
		«ELSE»
		<fill>
			TRANSPARENT
		</fill>
		«ENDIF»
		«IF (element.stroke != null && ! element.stroke.equals("none")) || ( element.stroke_opacity != null && ! element.stroke_opacity.equals("1") )»
		<stroke>
			«IF element.stroke != null && ! element.stroke.equals("none")»
				«IF element.stroke_opacity != null && ! element.stroke_opacity.equals("1") »
					«element.stroke.fillPaint(Double::parseDouble(element.stroke_opacity))»
				«ELSE»
					«element.stroke.fillPaint»
				«ENDIF»
			«ELSE»
				<Color>
					<opacity>«element.stroke_opacity»</opacity>
				</Color>
			«ENDIF»
		</stroke>
		«ENDIF»
		«IF element.transform != null»
			<transforms>
				«element.transform.handleTransform»
			</transforms>
		«ENDIF»
	</Ellipse>
	'''

	def dispatch handle(SvgCircleElement element) '''
	<Circle
		«IF element.r != null»radius="«element.r.parseLength»"«ENDIF»
		«IF element.cx != null»centerX="«element.cx.parseCoordinate»"«ENDIF»
		«IF element.cy != null»centerY="«element.cy.parseCoordinate»"«ENDIF»
«««		«IF element.stroke_dasharray != null»«ENDIF»
		«IF element.stroke_dashoffset != null»strokeDashOffset="«element.stroke_dashoffset.parseLength»"«ENDIF»
		«IF element.stroke_linecap != null»strokeLineCap="«element.stroke_linecap.toFx»"«ENDIF»
		«IF element.stroke_linejoin != null»strokeLineJoin="«element.stroke_linejoin.toFx»"«ENDIF»
		«IF element.stroke_miterlimit != null»strokeMiterLimit="«element.stroke_miterlimit.parseLength»"«ENDIF»
		«IF element.stroke_width != null»strokeWidth="«element.stroke_width.parseLength»"«ENDIF»
«««		«IF element.stroke_opacity != null»«ENDIF»
		>
		«IF (element.fill != null && ! element.fill.equals("none")) || ( element.fill_opacity != null && ! element.fill_opacity.equals("1") ) »
		<fill>
			«IF element.fill != null && ! element.fill.equals("none") »
				«IF element.fill_opacity != null && ! element.fill_opacity.equals("1")»
					«element.fill.fillPaint(Double::parseDouble(element.fill_opacity))»
				«ELSE»
					«element.fill.fillPaint»
				«ENDIF»
			«ELSE»
				<Color>
					<opacity>«element.stroke_opacity»</opacity>
				</Color>
			«ENDIF»
		</fill>
		«ELSE»
		<fill>
			TRANSPARENT
		</fill>
		«ENDIF»
		«IF (element.stroke != null && ! element.stroke.equals("none")) || ( element.stroke_opacity != null && ! element.stroke_opacity.equals("1") )»
		<stroke>
			«IF element.stroke != null && ! element.stroke.equals("none")»
				«IF element.stroke_opacity != null && ! element.stroke_opacity.equals("1") »
					«element.stroke.fillPaint(Double::parseDouble(element.stroke_opacity))»
				«ELSE»
					«element.stroke.fillPaint»
				«ENDIF»
			«ELSE»
				<Color>
					<opacity>«element.stroke_opacity»</opacity>
				</Color>
			«ENDIF»
		</stroke>
		«ENDIF»
		«IF element.transform != null»
			<transforms>
				«element.transform.handleTransform»
			</transforms>
		«ENDIF»
	</Circle>
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
			
		} else if( fill.startsWith("url") ) {
			return '''<fx:reference source="«fill.substring(5,fill.length-1)»" />'''
		} else {
			val c = Colors::findColorByName(fill);
			if (c != null) {
				return c.hexvalue.hexColor(opacity);
			}
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
		mxy="«parts.get(2)»"
		myx="«parts.get(1)»"
		myy="«parts.get(3)»"
		tx="«parts.get(4)»"
		ty="«parts.get(5)»"
		>
	</Affine>
	«ENDIF»
	'''
	
	def dispatch handle(SvgFilterElement filter) '''
		«FOR f : filter.children.filter(typeof(FilterPrimitiveElement))»
			«handle(f)»
		«ENDFOR»
	'''
	
	def dispatch handle(SvgFeGaussianBlurElement f) '''
		<GaussianBlur
			«IF f.id != null»fx:id="«f.id»"«ENDIF»
«««			«f.stdDeviation»
		>
		</GaussianBlur>
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
	
	def StrokeLineCap toFx(Stroke_linecap m) {
		switch(m) {
			case Stroke_linecap::BUTT:
				return StrokeLineCap::BUTT
			case Stroke_linecap::ROUND:
				return StrokeLineCap::ROUND
			case Stroke_linecap::SQUARE:
				return StrokeLineCap::SQUARE
		}
		return StrokeLineCap::BUTT;
	}
	
	def StrokeLineJoin toFx(Stroke_linejoin m) {
		switch(m) {
			case Stroke_linejoin::BEVEL:
				return StrokeLineJoin::BEVEL
			case Stroke_linejoin::MITER:
				return StrokeLineJoin::MITER
			case Stroke_linejoin::ROUND:
				return StrokeLineJoin::ROUND
		}
		return StrokeLineJoin::BEVEL;
	}
	
	def parseLength(String length) {
		if( length.endsWith("px") ) {
			return Double::parseDouble(length.substring(0,length.length - 2)); 
		} else {
			return Double::parseDouble(length);	
		}
	}
	
	def parseCoordinate(String coordinate) {
		return Double::parseDouble(coordinate);
	}
	
	def parsePercentage(String perecentage) {
		return Double::parseDouble(perecentage);
	}
}