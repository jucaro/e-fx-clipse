package at.bestsolution.efxclipse.formats.fxg.converter

import at.bestsolution.efxclipse.formats.fxg.fxg.BlendMode
import at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse
import at.bestsolution.efxclipse.formats.fxg.fxg.GradientEntry
import at.bestsolution.efxclipse.formats.fxg.fxg.Graphic
import at.bestsolution.efxclipse.formats.fxg.fxg.Group
import at.bestsolution.efxclipse.formats.fxg.fxg.InterpolationMethod
import at.bestsolution.efxclipse.formats.fxg.fxg.Library
import at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient
import at.bestsolution.efxclipse.formats.fxg.fxg.Path
import at.bestsolution.efxclipse.formats.fxg.fxg.Private
import at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient
import at.bestsolution.efxclipse.formats.fxg.fxg.Rect
import at.bestsolution.efxclipse.formats.fxg.fxg.SolidColor
import at.bestsolution.efxclipse.formats.fxg.fxg.SpreadMethod
import at.bestsolution.efxclipse.formats.fxg.fxg.Transform
import at.bestsolution.efxclipse.formats.fxg.fxg.Winding
import javafx.scene.paint.CycleMethod
import javafx.scene.shape.FillRule
import org.eclipse.emf.ecore.EObject

class FXMLConverter {
	def generate(Graphic graphic) '''
	«val content = handle(graphic)»
	<?xml version="1.0" encoding="UTF-8"?>
	
	<?import java.lang.*?>
	<?import javafx.scene.*?>
	<?import javafx.scene.shape.*?>
	<?import javafx.scene.paint.*?>
	<?import javafx.scene.image.*?>
	
	«content»
	'''
	
	def handle(Graphic graphic) '''
	<Group fx:id='_root' xmlns:fx="http://javafx.com/fxml">
		<children>
			«FOR o : graphic.get_children.filter(o|!(o instanceof Library || o instanceof Private))»
				«handle(o)»
			«ENDFOR»
		</children>
	</Group>
	'''
	
	def dispatch handle(EObject o) '''
		<!-- Unhandled type '«o.eClass.name»' -->
	'''
	
	def dispatch handle(Group group) '''
	<Group
		«IF group.alpha != null»opacity="«group.alpha»"«ENDIF»
		«IF group.blendMode != BlendMode::NOT_SET»blendMode="«group.blendMode.toFX»"«ENDIF»
		«IF group.id != null»fx:id="«group.id»"«ENDIF»
		«IF group.rotation != null»rotate="«group.rotation»"«ENDIF»
		«IF group.scaleGridBottom != null»fx:todo="scaleGridBottom"«ENDIF»
		«IF group.scaleGridLeft != null»fx:todo="scaleGridLeft"«ENDIF»
		«IF group.scaleGridRight != null»fx:todo="scaleGridRight"«ENDIF»
		«IF group.scaleGridTop != null»fx:todo="scaleGridTop"«ENDIF»
		«IF group.scaleX != null»scaleX="«group.scaleX»"«ENDIF»
		«IF group.scaleY != null»scaleY="«group.scaleY»"«ENDIF»
		«IF group.visible != null»visible="«group.visible»"«ENDIF»
		«IF group.x != null»translateX="«group.x»"«ENDIF»
		«IF group.y != null»translateY="«group.y»"«ENDIF»>
		«IF ! group.get_children.nullOrEmpty »
			<children>
				«FOR o : group.get_children»
					«handle(o)»
				«ENDFOR»
			</children>
		«ENDIF»
		«IF group.mask != null»
			«IF group.maskType == null || group.maskType.equals("clip")»
				<clip>
					«handle(group.mask)»
				</clip>
			«ELSE»
				<!-- TODO Handle masktype: «group.maskType» -->
			«ENDIF»
		«ENDIF»
	</Group>
	'''
	
	def dispatch handle(Transform transform) '''
	'''
	
	def dispatch handle(Rect rect) '''
	<Rectangle
		«IF rect.alpha != null»opacity="«rect.alpha»"«ENDIF»
		«IF rect.blendMode != BlendMode::NOT_SET»blendMode="«rect.blendMode.toFX»"«ENDIF»
		«IF rect.bottomLeftRadiusX != null»fx:todo="bottomLeftRadiusX"«ENDIF»
		«IF rect.bottomLeftRadiusY != null»fx:todo="bottomLeftRadiusY"«ENDIF»
		«IF rect.bottomRightRadiusX != null»fx:todo="bottomRightRadiusX"«ENDIF»
		«IF rect.bottomRightRadiusY != null»fx:todo="bottomRightRadiusY"«ENDIF»
		«IF rect.height != null»height="«rect.height»"«ENDIF»
		«IF rect.radiusX != null»fx:todo="radiusX"«ENDIF»
		«IF rect.radiusY != null»fx:todo="radiusY"«ENDIF»
		«IF rect.rotation != null»rotate="«rect.rotation»"«ENDIF»
		«IF rect.scaleX != null»scaleX="«rect.scaleX»"«ENDIF»
		«IF rect.scaleY != null»scaleY="«rect.scaleY»"«ENDIF»
		«IF rect.topLeftRadiusX != null»fx:todo="topLeftRadiusX"«ENDIF»
		«IF rect.topLeftRadiusY != null»fx:todo="topLeftRadiusY"«ENDIF»
		«IF rect.topRightRadiusX != null»fx:todo="topRightRadiusX"«ENDIF»
		«IF rect.topRightRadiusY != null»fx:todo="topRightRadiusY"«ENDIF»
		«IF rect.visible != null»visible="«rect.visible»"«ENDIF»
		«IF rect.width != null»width="«rect.width»"«ENDIF»
		«IF rect.x != null»x="«rect.x»"«ENDIF»
		«IF rect.y != null»y="«rect.y»"«ENDIF»>
		«IF rect.fill != null»
			<fill>
				«handle(rect.fill)»
			</fill>
		«ENDIF»
		«IF rect.mask != null»
			<clip>
				«handle(rect.mask)»
			</clip>
		«ENDIF»
	</Rectangle>
	'''
	
	def dispatch handle(SolidColor color) '''
	<Color>
		«IF(color.color != null)»<red>«color.color.red»</red>«ENDIF»
		«IF(color.color != null)»<green>«color.color.green»</green>«ENDIF»
		«IF(color.color != null)»<blue>«color.color.blue»</blue>«ENDIF»
		«IF(color.alpha != null)»<opacity>«color.alpha»</opacity>«ENDIF»
	</Color>
	'''
	
	def dispatch handle(RadialGradient gradient) '''
	<RadialGradient
		«IF gradient.focalPointRatio != null»fx:todo="focalPointRatio"«ENDIF»
		«IF gradient.interpolationMethod != InterpolationMethod::NOT_SET»fx:todo="interpolationMethod"«ENDIF»
		«IF gradient.rotation != null»fx:todo="rotation"«ENDIF»
		«IF gradient.scaleX != null»radius="«gradient.scaleX»"«ENDIF»
		«IF gradient.scaleY != null»fx:todo="scaleY"«ENDIF»
		«IF gradient.spreadMethod != SpreadMethod::NOT_SET»cycleMethod="«IF(gradient.spreadMethod==SpreadMethod::REFLECT)»«CycleMethod::REFLECT.name»«ELSE»«CycleMethod::REPEAT.name»«ENDIF»"«ENDIF»
		«IF gradient.x != null»centerX="«gradient.x»"«ENDIF»
		«IF gradient.y != null»centerY="«gradient.y»"«ENDIF»
		proporional="false">
		«IF ! gradient.get_children.nullOrEmpty»
			<stops>
				«FOR o : gradient.get_children»
					«handle(o)»
				«ENDFOR»
			</stops>
		«ENDIF»
	</RadialGradient>
	'''
	
	def dispatch handle(LinearGradient gradient) '''
	<LinearGradient
		«IF gradient.interpolationMethod != InterpolationMethod::NOT_SET»fx:todo="interpolationMethod"«ENDIF»
		«IF gradient.rotation != null»fx:todo="rotation"«ENDIF»
		«IF gradient.scaleX != null»endX="«gradient.scaleX»"«ENDIF»
		«IF gradient.scaleX != null»endY="«gradient.scaleX»"«ENDIF»
		«IF gradient.spreadMethod != SpreadMethod::NOT_SET»cycleMethod="«IF(gradient.spreadMethod==SpreadMethod::REFLECT)»«CycleMethod::REFLECT.name»«ELSE»«CycleMethod::REPEAT.name»«ENDIF»"«ENDIF»
		«IF gradient.x != null»startX="«gradient.x»"«ENDIF»
		«IF gradient.y != null»startY="«gradient.y»"«ENDIF»
		proporional="false">
		«IF ! gradient.get_children.nullOrEmpty»
			<stops>
				«FOR o : gradient.get_children»
					«handle(o)»
				«ENDFOR»
			</stops>
		«ENDIF»
	</LinearGradient>
	'''
	
	def dispatch handle(GradientEntry entry) '''
	<Stop
		«IF entry.ratio != null»offset="«entry.ratio»"«ENDIF»>
		«IF entry.color != null»
		<color>
			<red>«entry.color.red»</red>
			<green>«entry.color.green»</green>
			<blue>«entry.color.blue»</blue>
			«IF(entry.alpha != null)»<opacity>«entry.alpha»</opacity>«ENDIF»
		</color>
		«ENDIF»
	</Stop>
	'''
	
	def red(String color) {
		return Integer::valueOf(color.substring(1,3),16) as double / Double::valueOf('255.0');
	}
	
	def green(String color) {
		return Integer::valueOf(color.substring(3,5),16) as double / Double::valueOf('255.0');
	}
	
	def blue(String color) {
		return Integer::valueOf(color.substring(5,7),16) as double / Double::valueOf('255.0');
	}
	
	def dispatch handle(Path path) '''
	<SVGPath
		«IF path.alpha != null»opacity="«path.alpha»"«ENDIF»
		«IF path.blendMode != BlendMode::NOT_SET»blendMode="«path.blendMode.toFX»"«ENDIF»
		«IF path.data != null»content="«path.data»"«ENDIF»
		«IF path.rotation != null»rotate="«path.rotation»"«ENDIF»
		«IF path.scaleX != null»scaleX="«path.scaleX»"«ENDIF»
		«IF path.scaleY != null»scaleY="«path.scaleY»"«ENDIF»
		«IF path.visible != null»visible="«path.visible»"«ENDIF»
		«IF path.winding != Winding::NOT_SET»fillRule="«if(path.winding == Winding::EVEN_ODD) FillRule::EVEN_ODD.name else FillRule::NON_ZERO.name»"«ENDIF»
		«IF path.x != null»fx:todo="x"«ENDIF»
		«IF path.y != null»fx:todo="y"«ENDIF»>
		«IF path.fill != null»
		<fill>
			«handle(path.fill)»
		</fill>
		«ENDIF»
		«IF path.mask != null»
			<clip>
				«handle(path.mask)»
			</clip>
		«ENDIF»
	</SVGPath>
	'''
	
	def dispatch handle(Ellipse ellipse) '''
	<Ellipse
		«IF ellipse.alpha != null»opacity="«ellipse.alpha»"«ENDIF»
		«IF ellipse.blendMode != BlendMode::NOT_SET»blendMode="«ellipse.blendMode.toFX»"«ENDIF»
		«IF ellipse.height != null»radiusX="«ellipse.width.parseLength * Double::valueOf('0.5')»"«ENDIF»
		«IF ellipse.rotation != null»rotate="«ellipse.rotation»"«ENDIF»
		«IF ellipse.scaleX != null»scaleX="«ellipse.scaleX»"«ENDIF»
		«IF ellipse.scaleY != null»scaleY="«ellipse.scaleY»"«ENDIF»
		«IF ellipse.visible != null»visible="«ellipse.visible»"«ENDIF»
		«IF ellipse.width != null»radiusY="«ellipse.height.parseLength * Double::valueOf('0.5')»"«ENDIF»
		«IF ellipse.x != null»centerX="«if( ellipse.width == null ) { ellipse.x } else { ellipse.x + (ellipse.width.parseLength * Double::valueOf('0.5'))}»"«ENDIF»
		«IF ellipse.y != null»centerY="«if( ellipse.height == null ) { ellipse.y } else { ellipse.y + (ellipse.height.parseLength * Double::valueOf('0.5'))}»"«ENDIF»>
		«IF ellipse.fill != null»
			<fill>
				«handle(ellipse.fill)»
			</fill>
		«ENDIF»
		«IF ellipse.mask != null»
			<clip>
				«handle(ellipse.mask)»
			</clip>
		«ENDIF»
	</Ellipse>
	'''
	
	def parseLength(String length) {
		return Double::parseDouble(length);
	}
	
	def toFX(BlendMode fxgMode) {
		switch(fxgMode) {
			case BlendMode::ADD:
				return javafx::scene::effect::BlendMode::ADD.toString
			case BlendMode::ALPHA:
				return "null"
			case BlendMode::DARKEN:
				return javafx::scene::effect::BlendMode::DARKEN.toString
			case BlendMode::DIFFERENCE:
				return javafx::scene::effect::BlendMode::DIFFERENCE.toString
			case BlendMode::ERASE:
				return "null"
			case BlendMode::HARDLIGHT:
				return "null"
			case BlendMode::INVERT:
				return "null"
			case BlendMode::LAYER:
				return "null"
			case BlendMode::LIGHTEN:
				return javafx::scene::effect::BlendMode::LIGHTEN.toString
			case BlendMode::MULTIPLY:
				return javafx::scene::effect::BlendMode::MULTIPLY.toString
			case BlendMode::NORMAL:
				return "null"
			case BlendMode::OVERLAY:
				return javafx::scene::effect::BlendMode::OVERLAY.toString
			case BlendMode::SCREEN:
				return javafx::scene::effect::BlendMode::SCREEN.toString
			case BlendMode::SHADER:
				return "null"
			case BlendMode::SUBTRACT:
				return "null"
			case BlendMode::NOT_SET:
				return "null"
		}
		return "null";
	}
}