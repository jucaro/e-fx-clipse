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
import org.eclipse.emf.ecore.util.EcoreUtil
import at.bestsolution.efxclipse.formats.svg.svg.SvgClipPathElement
import at.bestsolution.efxclipse.formats.svg.svg.GradientUnits
import at.bestsolution.efxclipse.formats.svg.svg.CoreAttributes
import java.awt.geom.AffineTransform
import java.awt.geom.Point2D
import at.bestsolution.efxclipse.formats.svg.svg.Fill_rule

class FXMLConverter {
	private SvgSvgElement rootElement
	
	new(SvgSvgElement rootElement) {
		this.rootElement = rootElement;
	}
	
	def generate() ''' 
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
	
	def dispatch handle(SvgLinearGradientElement o) {
		// Nothing to do we reference them directly when needed because they can contain relative sizes
	}
	
	def dispatch handle(SvgRadialGradientElement o) {
		// Nothing to do we reference them directly when needed because they can contain relative sizes
	}
	
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
	
	def handleGradient(SvgLinearGradientElement element, Double opacity) '''
	<LinearGradient
		«val t = createAffineTransform(element.gradientTransform) as AffineTransform»
		«IF element.x1 != null»startX="«t.transform( new Point2D$Double(element.x1.parseCoordinate,0), null).x»"«ENDIF»
		«IF element.y1 != null»startY="«t.transform( new Point2D$Double(0,element.y1.parseCoordinate),null).y»"«ENDIF»
		«IF element.x2 != null»endX="«t.transform( new Point2D$Double(element.x2.parseCoordinate,0), null).x»"«ENDIF»
		«IF element.y2 != null»endY="«t.transform( new Point2D$Double(0,element.y2.parseCoordinate), null).y»"«ENDIF»
		«IF element.spreadMethod != SpreadMethod::PAD»cycleMethod="«element.spreadMethod.toFx»"«ENDIF»
		«IF element.id != null»fx:id="«element.id»"«ENDIF»
		«IF element.gradientUnits != null»proportional="«element.gradientUnits != GradientUnits::USER_SPACE_ON_USE»"«ENDIF»
		>
		«val owner = resolveGradientStopElement(element)»
		«IF owner != null»
			<stops>
			«FOR o : (owner as ContentElement).children.filter(typeof(SvgStopElement))»
				«handleStop(o,opacity)»
			«ENDFOR»
			</stops>
		«ENDIF»
	</LinearGradient>
	'''
	
	def createAffineTransform(String transformSpec) {
		if( transformSpec == null ) {
			return new AffineTransform();
		} else {
			val params = transformSpec.substring(transformSpec.indexOf("(")+1,transformSpec.indexOf(")"))
			if( transformSpec.startsWith("matrix") ) {
				val parts = params.split(",");
				return new AffineTransform(
					Double::parseDouble(parts.get(0)),
					Double::parseDouble(parts.get(1)),
					Double::parseDouble(parts.get(2)),
					Double::parseDouble(parts.get(3)),
					Double::parseDouble(parts.get(4)),
					Double::parseDouble(parts.get(5))
				);
			} else if( transformSpec.startsWith("translate") ) {
				val parts = params.split(",");
				val rv = new AffineTransform();
				rv.translate(
					Double::parseDouble(parts.get(0)),
					Double::parseDouble(parts.get(1))					
				);
				return rv;
			} else if( transformSpec.startsWith("scale") ) {
				val parts = params.split(",");
				val rv = new AffineTransform();
				rv.scale(
					Double::parseDouble(parts.get(0)),
					Double::parseDouble(parts.get(1))					
				);
				return rv;			
			} else if( transformSpec.startsWith("rotate") ) {
				val parts = params.split(",");
				val rv = new AffineTransform();
				rv.rotate(
					Double::parseDouble(parts.get(0)),
					Double::parseDouble(parts.get(1)),
					Double::parseDouble(parts.get(2))				
				);
				return rv;	
			}	
		}
		
		return new AffineTransform();
	}
	
	def handleGradient(SvgRadialGradientElement element, Double opacity) '''
	<RadialGradient
		«val t = createAffineTransform(element.gradientTransform) as AffineTransform»
		«IF element.cx != null»centerX="«t.transform( new Point2D$Double(element.cx.parseCoordinate,0), null).x»"«ENDIF»
		«IF element.cy != null»centerY="«t.transform( new Point2D$Double(0,element.cy.parseCoordinate), null).y»"«ENDIF»
		«IF element.r != null»radius="«element.r.parseLength»"«ENDIF»
		«IF element.fx != null || element.fy != null»focusDistance="«calculateFocusDistance(t,element.cx.parseCoordinate,element.cy.parseCoordinate,element.fx.parseCoordinate,element.fy.parseCoordinate)»"«ENDIF»
		«IF element.fx != null || element.fy != null»focusAngle="«calculateFocusDistance(t,element.cx.parseCoordinate,element.cy.parseCoordinate,element.fx.parseCoordinate,element.fy.parseCoordinate)»"«ENDIF»
		«IF element.spreadMethod != SpreadMethod::PAD»cycleMethod="«element.spreadMethod.toFx»"«ENDIF»
		«IF element.gradientUnits != null»proportional="«element.gradientUnits != GradientUnits::USER_SPACE_ON_USE»"«ENDIF»
		«IF element.id != null»fx:id="«element.id»"«ENDIF»
		>
		«val owner = resolveGradientStopElement(element)» 
		«IF owner != null»
			<stops>
			«FOR o : (owner as ContentElement).children.filter(typeof(SvgStopElement))»
				«handleStop(o,opacity)»
			«ENDFOR»
			</stops>
		«ENDIF»
	</RadialGradient>
	'''
	
	def calculateFocusDistance(AffineTransform transform, double cx, double cy, double fx, double fy) {
		if( fx == cx && fy == cy ) {
			return 0;
		} else {
			val c = transform.transform(new Point2D$Double(cx,cy),null)
			val f = transform.transform(new Point2D$Double(fx,fy),null)
			return Math::sqrt(Math::pow(c.x - f.x,2) + Math::pow(c.y - f.y,2));
		}
	}
	
	def calculateFocusAngle(AffineTransform transform, double cx, double cy, double fx, double fy) {
		if( fx == cx && fy == cy ) {
			return 0;
		} else {
			val c = transform.transform(new Point2D$Double(cx,cy),null)
			val f = transform.transform(new Point2D$Double(fx,fy),null)
			return Math::atan(Math::pow(c.y - f.y,2) / Math::pow(c.x - f.x,2));
		}
	}
	
	def resolveGradientStopElement(SvgElement element) {
		if( element instanceof ContentElement ) {
			val rv = (element as ContentElement); 
			if( rv.children.filter(typeof(SvgStopElement)).empty ) {
				if( element instanceof XLinkAttributes ) {
					val v = element as XLinkAttributes;
					if( v.resolvedInstance != null ) {
						return resolveGradientStopElement(v.resolvedInstance);	
					}
				}
			} else {
				return rv;
			}
		}
		return null;
	}
	
	def resolveElement(String id) {
		val treeIt = EcoreUtil::getAllContents(rootElement,true).filter(typeof(SvgElement));
		while( treeIt.hasNext ) {
			val o = treeIt.next;
			if( o instanceof CoreAttributes ) {
				if( id.equals((o as CoreAttributes).id) ) {
					return o;
				}
			} else {
				val eo = o as SvgElement;
				val f = eo.eClass.getEStructuralFeature("id");
				if( f != null && id.equals(eo.eGet(f)) ) {
					return o;
				}	
			}
		}
		
		return null;
	}
	
	def handleStop(SvgStopElement element,Double opacity) '''
	<Stop
		«IF element.offset != null»offset="«element.offset.parsePercentage»"«ENDIF»
		>
		«IF element.stop_opacity != null»
		<color>
			«IF opacity != null»
				«IF element.stop_color != null»
					«element.stop_color.fillPaint(Double::parseDouble(element.stop_opacity)*opacity)»
				«ELSE»
					<opacity>«Double::parseDouble(element.stop_opacity)*opacity»</opacity>
				«ENDIF»
			«ELSE»
				«IF element.stop_color != null»
					«element.stop_color.fillPaint(Double::parseDouble(element.stop_opacity))»
				«ELSE»
					<opacity>«element.stop_opacity»</opacity>
				«ENDIF»
			«ENDIF»
		</color>
		«ELSEIF element.stop_color != null»
		<color>
			«IF opacity != null»
				«element.stop_color.fillPaint(opacity)»
			«ELSE»
				«element.stop_color.fillPaint»
			«ENDIF»
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
		«IF element.opacity != null»opacity="«element.opacity»"«ENDIF»
		«IF element.rx != null»arcWidth="«element.rx.parseLength * Double::valueOf("2.0")»"«ENDIF»
		«IF element.ry != null»arcHeight="«element.ry.parseLength * Double::valueOf("2.0")»"«ENDIF»
		>
		«handlePaint("fill",element.fill,element.fill_opacity)»
		«handlePaint("stroke",element.stroke,element.stroke_opacity)»
		«IF element.transform != null»
			<transforms>
				«element.transform.handleTransform»
			</transforms>
		«ENDIF»
		«IF element.filter != null»
			«val e = resolveElement(element.filter.substring(5,element.filter.length-1).trim) as SvgFilterElement»
			«IF e != null»
				«IF e.children.filter(typeof(FilterPrimitiveElement)).size == 1»
				«val fiElement = e.children.filter(typeof(FilterPrimitiveElement)).head as SvgElement»
				<filter>
					«handleFilter(fiElement)»
				</filter>
				«ELSE»
				<!-- Multi filter needs different handling -->
				«ENDIF»
			«ENDIF»
		«ENDIF»
		«IF element.clip_path != null && element.clip_path.trim.length > 0 && ! element.clip_path.trim.equals("none")»
			<clip>
				«val clipElement = resolveElement(element.clip_path.substring(5,element.clip_path.length-1)) as SvgClipPathElement»
				<Group>
					<children>
						«FOR e : clipElement.children»
							«handle(e)»
						«ENDFOR»
					</children>
					«IF clipElement.transform != null && clipElement.transform.trim.length > 0 && ! element.clip_path.equals("none")»
					<transforms>
						«handleTransform(clipElement.transform)»
					</transforms>
					«ENDIF»
				</Group>
			</clip>
		«ENDIF»
	</Rectangle>
	'''
	
	def dispatch handle(SvgGElement element) '''
	<Group
		«IF element.x != null»translateX="«element.x.parseCoordinate»"«ENDIF»
		«IF element.y != null»translateY="«element.y.parseCoordinate»"«ENDIF»
		«IF element.opacity != null»opacity="«element.opacity.parseDouble * element.fill_opacity.parseDouble»"«ENDIF»
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
		«IF element.filter != null»
			«val e = resolveElement(element.filter.substring(5,element.filter.length-1).trim) as SvgFilterElement»
			«IF e != null»
				«IF e.children.filter(typeof(FilterPrimitiveElement)).size == 1»
				«val fiElement = e.children.filter(typeof(FilterPrimitiveElement)).head as SvgElement»
				<filter>
					«handleFilter(fiElement)»
				</filter>
				«ELSE»
				<!-- Multi filter needs different handling -->
				«ENDIF»
			«ENDIF»
		«ENDIF»
		«IF element.clip_path != null && element.clip_path.trim.length > 0 && ! element.clip_path.trim.equals("none")»
			<clip>
				«val clipElement = resolveElement(element.clip_path.substring(5,element.clip_path.length-1)) as SvgClipPathElement»
				<Group>
					<children>
						«FOR e : clipElement.children»
							«handle(e)»
						«ENDFOR»
					</children>
					«IF clipElement.transform != null && clipElement.transform.trim.length > 0 && ! element.clip_path.equals("none")»
					<transforms>
						«handleTransform(clipElement.transform)»
					</transforms>
					«ENDIF»
				</Group>
			</clip>
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
		«IF element.opacity != null»opacity="«element.opacity»"«ENDIF»
		«IF element.fill_rule != Fill_rule::NONZERO»fillRule="EVEN_ODD"«ENDIF»
		>
		«handlePaint("fill",element.fill,element.fill_opacity)»
		«handlePaint("stroke",element.stroke,element.stroke_opacity)»
		«IF element.transform != null»
			<transforms>
				«element.transform.handleTransform»
			</transforms>
		«ENDIF»
		«IF element.filter != null»
			«val e = resolveElement(element.filter.substring(5,element.filter.length-1).trim) as SvgFilterElement»
			«IF e != null»
				«IF e.children.filter(typeof(FilterPrimitiveElement)).size == 1»
				«val fiElement = e.children.filter(typeof(FilterPrimitiveElement)).head as SvgElement»
				<filter>
					«handleFilter(fiElement)»
				</filter>
				«ELSE»
				<!-- Multi filter needs different handling -->
				«ENDIF»
			«ENDIF»
		«ENDIF»
		«IF element.clip_path != null && element.clip_path.trim.length > 0 && ! element.clip_path.trim.equals("none")»
			<clip>
				«val clipElement = resolveElement(element.clip_path.substring(5,element.clip_path.length-1)) as SvgClipPathElement»
				<Group>
					<children>
						«FOR e : clipElement.children»
							«handle(e)»
						«ENDFOR»
					</children>
					«IF clipElement.transform != null && clipElement.transform.trim.length > 0 && ! element.clip_path.equals("none")»
					<transforms>
						«handleTransform(clipElement.transform)»
					</transforms>
					«ENDIF»
				</Group>
			</clip>
		«ENDIF»
	</SVGPath>
	'''
	
	def dispatch handleFilter(EObject o) '''
	<!-- Unsupported filter type -->
	'''
	
	def dispatch handleFilter(SvgFeGaussianBlurElement blur) '''
		<GaussianBlur>
		</GaussianBlur>
	'''
	
	def handlePaint(String type, String fillDefinition, String typeOpacity) '''
	<«type»>
		«IF fillDefinition == null || fillDefinition.equals("none")»
			TRANSPARENT
		«ELSEIF typeOpacity != null && Double::parseDouble(typeOpacity) != Double::valueOf("1.0")»
			«fillDefinition.fillPaint(Double::parseDouble(typeOpacity))»
		«ELSE»
			«fillDefinition.fillPaint»
		«ENDIF»
	</«type»>
	'''
	
	def dispatch handle(SvgClipPathElement element) {
	}
	
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
		«IF element.opacity != null»opacity="«element.opacity»"«ENDIF»
		>
		«handlePaint("fill",element.fill,element.fill_opacity)»
		«handlePaint("stroke",element.stroke,element.stroke_opacity)»
		«IF element.transform != null»
			<transforms>
				«element.transform.handleTransform»
			</transforms>
		«ENDIF»
		«IF element.filter != null»
			«val e = resolveElement(element.filter.substring(5,element.filter.length-1).trim) as SvgFilterElement»
			«IF e != null»
				«IF e.children.filter(typeof(FilterPrimitiveElement)).size == 1»
				«val fiElement = e.children.filter(typeof(FilterPrimitiveElement)).head as SvgElement»
				<filter>
					«handleFilter(fiElement)»
				</filter>
				«ELSE»
				<!-- Multi filter needs different handling -->
				«ENDIF»
			«ENDIF»
		«ENDIF»
		«IF element.clip_path != null && element.clip_path.trim.length > 0 && ! element.clip_path.trim.equals("none")»
			<clip>
				«val clipElement = resolveElement(element.clip_path.substring(5,element.clip_path.length-1)) as SvgClipPathElement»
				<Group>
					<children>
						«FOR e : clipElement.children»
							«handle(e)»
						«ENDFOR»
					</children>
					«IF clipElement.transform != null && clipElement.transform.trim.length > 0 && ! element.clip_path.equals("none")»
					<transforms>
						«handleTransform(clipElement.transform)»
					</transforms>
					«ENDIF»
				</Group>
			</clip>
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
		«IF element.opacity != null»opacity="«element.opacity»"«ENDIF»
		>
		«handlePaint("fill",element.fill,element.fill_opacity)»
		«handlePaint("stroke",element.stroke,element.stroke_opacity)»
		«IF element.transform != null»
			<transforms>
				«element.transform.handleTransform»
			</transforms>
		«ENDIF»
		«IF element.filter != null»
			«val e = resolveElement(element.filter.substring(5,element.filter.length-1).trim) as SvgFilterElement»
			«IF e != null»
				«IF e.children.filter(typeof(FilterPrimitiveElement)).size == 1»
				«val fiElement = e.children.filter(typeof(FilterPrimitiveElement)).head as SvgElement»
				<filter>
					«handleFilter(fiElement)»
				</filter>
				«ELSE»
				<!-- Multi filter needs different handling -->
				«ENDIF»
			«ENDIF»
		«ENDIF»
		«IF element.clip_path != null && element.clip_path.trim.length > 0 && ! element.clip_path.trim.equals("none")»
			<clip>
				«val clipElement = resolveElement(element.clip_path.substring(5,element.clip_path.length-1)) as SvgClipPathElement»
				<Group>
					<children>
						«FOR e : clipElement.children»
							«handle(e)»
						«ENDFOR»
					</children>
					«IF clipElement.transform != null && clipElement.transform.trim.length > 0 && ! element.clip_path.equals("none")»
					<transforms>
						«handleTransform(clipElement.transform)»
					</transforms>
					«ENDIF»
				</Group>
			</clip>
		«ENDIF»
	</Circle>
	'''

	def fillPaint(String fill) {
		if( fill.startsWith("#") ) {
			return fill.hexColor
		} else if( fill.startsWith("rgb") ) {
			
		} else if( fill.startsWith("argb") ) {
			
		} else if( fill.startsWith("url") ) {
			val e = resolveElement(fill.substring(5,fill.length-1));
			if( e instanceof SvgLinearGradientElement ) {
				return handleGradient(e as SvgLinearGradientElement,null);
			} else if( e instanceof SvgRadialGradientElement ) {
				return handleGradient(e as SvgRadialGradientElement,null);
			}
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
			val e = resolveElement(fill.substring(5,fill.length-1));
			if( e instanceof SvgLinearGradientElement ) {
				return handleGradient(e as SvgLinearGradientElement,opacity);
			} else if( e instanceof SvgRadialGradientElement ) {
				return handleGradient(e as SvgRadialGradientElement,opacity);
			}
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
		return Colors::hexRed(color);
	}
	
	def hexGreen(String color) {
		return Colors::hexGreen(color);
	}
	
	def hexBlue(String color) {
		return Colors::hexBlue(color);
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
		myx="«parts.get(1)»"
		mxy="«parts.get(2)»"
		myy="«parts.get(3)»"
		tx="«parts.get(4)»"
		ty="«parts.get(5)»"
		>
	</Affine>
	«ENDIF»
	'''
	
	def dispatch handle(SvgFilterElement filter) {
		
	}
	
	def dispatch handle(SvgFeGaussianBlurElement f) {
		
	}

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
	
	def parseDouble(String value) {
		return Double::parseDouble(value)
	}
}