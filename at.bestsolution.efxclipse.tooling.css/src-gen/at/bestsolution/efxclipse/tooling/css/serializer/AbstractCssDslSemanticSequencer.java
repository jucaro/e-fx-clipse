package at.bestsolution.efxclipse.tooling.css.serializer;

import at.bestsolution.efxclipse.tooling.css.cssDsl.BgPosition;
import at.bestsolution.efxclipse.tooling.css.cssDsl.BgSize;
import at.bestsolution.efxclipse.tooling.css.cssDsl.BorderStyle;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ColorFunction;
import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.Dim4Size;
import at.bestsolution.efxclipse.tooling.css.cssDsl.EffectDropShadow;
import at.bestsolution.efxclipse.tooling.css.cssDsl.EffectInnerShadow;
import at.bestsolution.efxclipse.tooling.css.cssDsl.FONT;
import at.bestsolution.efxclipse.tooling.css.cssDsl.FONTSTYLE;
import at.bestsolution.efxclipse.tooling.css.cssDsl.FONTWEIGHT;
import at.bestsolution.efxclipse.tooling.css.cssDsl.HSBColor;
import at.bestsolution.efxclipse.tooling.css.cssDsl.LinearGradient;
import at.bestsolution.efxclipse.tooling.css.cssDsl.LookedUpColor;
import at.bestsolution.efxclipse.tooling.css.cssDsl.MultiPaint;
import at.bestsolution.efxclipse.tooling.css.cssDsl.NamedColor;
import at.bestsolution.efxclipse.tooling.css.cssDsl.RGBColor;
import at.bestsolution.efxclipse.tooling.css.cssDsl.RadialGradient;
import at.bestsolution.efxclipse.tooling.css.cssDsl.RepeatStyle;
import at.bestsolution.efxclipse.tooling.css.cssDsl.SizeFill;
import at.bestsolution.efxclipse.tooling.css.cssDsl.StopValue;
import at.bestsolution.efxclipse.tooling.css.cssDsl.URLType;
import at.bestsolution.efxclipse.tooling.css.cssDsl.css_generic_declaration;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_alignment_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_background_image_size_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_bar_policy_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_blend_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_boolean_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_image_slice_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_border_style_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_color_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_cursor_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_effect_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_family_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_size_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_style_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_font_weight_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_hposition_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_insets_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_integer_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multi_paint_properties;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_properties;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_multisize_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_properties;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_number_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_properties;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_paint_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_position_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_repeat_properties;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_side_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_properties;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_size_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_string_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_cap_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_stroke_line_join_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_origin_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_text_overrun_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_properties;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_url_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.fx_vposition_property;
import at.bestsolution.efxclipse.tooling.css.cssDsl.media;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset;
import at.bestsolution.efxclipse.tooling.css.cssDsl.selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.simple_selector;
import at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet;
import at.bestsolution.efxclipse.tooling.css.services.CssDslGrammarAccess;
import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("restriction")
public class AbstractCssDslSemanticSequencer extends AbstractSemanticSequencer {

	@Inject
	protected CssDslGrammarAccess grammarAccess;
	
	@Inject
	protected ISemanticSequencerDiagnosticProvider diagnosticProvider;
	
	@Inject
	protected ITransientValueService transientValues;
	
	@Inject
	@GenericSequencer
	protected Provider<ISemanticSequencer> genericSequencerProvider;
	
	protected ISemanticSequencer genericSequencer;
	
	
	@Override
	public void init(ISemanticSequencer sequencer, ISemanticSequenceAcceptor sequenceAcceptor, Acceptor errorAcceptor) {
		super.init(sequencer, sequenceAcceptor, errorAcceptor);
		this.genericSequencer = genericSequencerProvider.get();
		this.genericSequencer.init(sequencer, sequenceAcceptor, errorAcceptor);
	}
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == CssDslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case CssDslPackage.BG_POSITION:
				if(context == grammarAccess.getBgPositionRule()) {
					sequence_BgPosition_BgPosition(context, (BgPosition) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.BG_SIZE:
				if(context == grammarAccess.getBgSizeRule()) {
					sequence_BgSize_BgSize(context, (BgSize) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.BORDER_STYLE:
				if(context == grammarAccess.getBorderStyleRule()) {
					sequence_BorderStyle_BorderStyle(context, (BorderStyle) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.COLOR_FUNCTION:
				if(context == grammarAccess.getPaintRule() ||
				   context == grammarAccess.getColorRule() ||
				   context == grammarAccess.getColorFunctionRule()) {
					sequence_ColorFunction_ColorFunction(context, (ColorFunction) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.DIM4_SIZE:
				if(context == grammarAccess.getDim4SizeRule()) {
					sequence_Dim4Size_Dim4Size(context, (Dim4Size) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.EFFECT_DROP_SHADOW:
				if(context == grammarAccess.getEffectRule() ||
				   context == grammarAccess.getEffectDropShadowRule()) {
					sequence_EffectDropShadow_EffectDropShadow(context, (EffectDropShadow) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.EFFECT_INNER_SHADOW:
				if(context == grammarAccess.getEffectRule() ||
				   context == grammarAccess.getEffectInnerShadowRule()) {
					sequence_EffectInnerShadow_EffectInnerShadow(context, (EffectInnerShadow) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FONT:
				if(context == grammarAccess.getFONTRule()) {
					sequence_FONT_FONT(context, (FONT) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FONTSTYLE:
				if(context == grammarAccess.getFONTSTYLERule()) {
					sequence_FONTSTYLE_FONTSTYLE(context, (FONTSTYLE) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FONTWEIGHT:
				if(context == grammarAccess.getFONTWEIGHTRule()) {
					sequence_FONTWEIGHT_FONTWEIGHT(context, (FONTWEIGHT) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.HSB_COLOR:
				if(context == grammarAccess.getPaintRule() ||
				   context == grammarAccess.getColorRule() ||
				   context == grammarAccess.getHSBColorRule()) {
					sequence_HSBColor_HSBColor(context, (HSBColor) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.LINEAR_GRADIENT:
				if(context == grammarAccess.getPaintRule() ||
				   context == grammarAccess.getLinearGradientRule()) {
					sequence_LinearGradient_LinearGradient(context, (LinearGradient) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.LOOKED_UP_COLOR:
				if(context == grammarAccess.getPaintRule() ||
				   context == grammarAccess.getColorRule() ||
				   context == grammarAccess.getLookedUpColorRule()) {
					sequence_LookedUpColor_LookedUpColor(context, (LookedUpColor) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.MULTI_PAINT:
				if(context == grammarAccess.getMultiPaintRule()) {
					sequence_MultiPaint_MultiPaint(context, (MultiPaint) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.NAMED_COLOR:
				if(context == grammarAccess.getPaintRule() ||
				   context == grammarAccess.getColorRule() ||
				   context == grammarAccess.getNamedColorRule()) {
					sequence_NamedColor_NamedColor(context, (NamedColor) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.RGB_COLOR:
				if(context == grammarAccess.getPaintRule() ||
				   context == grammarAccess.getColorRule() ||
				   context == grammarAccess.getRGBColorRule()) {
					sequence_RGBColor_RGBColor(context, (RGBColor) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.RADIAL_GRADIENT:
				if(context == grammarAccess.getPaintRule() ||
				   context == grammarAccess.getRadialGradientRule()) {
					sequence_RadialGradient_RadialGradient(context, (RadialGradient) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.REPEAT_STYLE:
				if(context == grammarAccess.getRepeatStyleRule()) {
					sequence_RepeatStyle_RepeatStyle(context, (RepeatStyle) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.SIZE_FILL:
				if(context == grammarAccess.getSizeFillRule()) {
					sequence_SizeFill_SizeFill(context, (SizeFill) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.STOP_VALUE:
				if(context == grammarAccess.getStopValueRule()) {
					sequence_StopValue_StopValue(context, (StopValue) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.URL_TYPE:
				if(context == grammarAccess.getURLTypeRule()) {
					sequence_URLType_URLType(context, (URLType) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.CSS_GENERIC_DECLARATION:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_generic_declarationRule()) {
					sequence_css_generic_declaration_css_generic_declaration(context, (css_generic_declaration) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_ALIGNMENT_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_alignment_propertyRule()) {
					sequence_fx_alignment_property_fx_alignment_property(context, (fx_alignment_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_BACKGROUND_IMAGE_SIZE_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_background_image_size_propertyRule()) {
					sequence_fx_background_image_size_property_fx_background_image_size_property(context, (fx_background_image_size_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_BAR_POLICY_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_bar_policy_propertyRule()) {
					sequence_fx_bar_policy_property_fx_bar_policy_property(context, (fx_bar_policy_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_BLEND_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_blend_propertyRule()) {
					sequence_fx_blend_property_fx_blend_property(context, (fx_blend_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_BOOLEAN_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_boolean_propertyRule()) {
					sequence_fx_boolean_property_fx_boolean_property(context, (fx_boolean_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_BORDER_IMAGE_SLICE_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_border_image_slice_propertyRule()) {
					sequence_fx_border_image_slice_property_fx_border_image_slice_property(context, (fx_border_image_slice_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_BORDER_STYLE_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_border_style_propertyRule()) {
					sequence_fx_border_style_property_fx_border_style_property(context, (fx_border_style_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_COLOR_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_color_propertyRule()) {
					sequence_fx_color_property_fx_color_property(context, (fx_color_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_CURSOR_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_cursor_propertyRule()) {
					sequence_fx_cursor_property_fx_cursor_property(context, (fx_cursor_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_EFFECT_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_effect_propertyRule()) {
					sequence_fx_effect_property_fx_effect_property(context, (fx_effect_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_FONT_FAMILY_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_font_family_propertyRule()) {
					sequence_fx_font_family_property_fx_font_family_property(context, (fx_font_family_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_FONT_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_font_propertyRule()) {
					sequence_fx_font_property_fx_font_property(context, (fx_font_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_FONT_SIZE_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_font_size_propertyRule()) {
					sequence_fx_font_size_property_fx_font_size_property(context, (fx_font_size_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_FONT_STYLE_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_font_style_propertyRule()) {
					sequence_fx_font_style_property_fx_font_style_property(context, (fx_font_style_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_FONT_WEIGHT_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_font_weight_propertyRule()) {
					sequence_fx_font_weight_property_fx_font_weight_property(context, (fx_font_weight_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_HPOSITION_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_hposition_propertyRule()) {
					sequence_fx_hposition_property_fx_hposition_property(context, (fx_hposition_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_INSETS_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_insets_propertyRule()) {
					sequence_fx_insets_property_fx_insets_property(context, (fx_insets_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_INTEGER_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_integer_propertyRule()) {
					sequence_fx_integer_property_fx_integer_property(context, (fx_integer_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_MULTI_PAINT_PROPERTIES:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_multi_paint_propertiesRule()) {
					sequence_fx_multi_paint_properties_fx_multi_paint_properties(context, (fx_multi_paint_properties) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_MULTISIZE_PROPERTIES:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_multisize_propertiesRule()) {
					sequence_fx_multisize_properties_fx_multisize_properties(context, (fx_multisize_properties) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_MULTISIZE_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_multisize_propertyRule()) {
					sequence_fx_multisize_property_fx_multisize_property(context, (fx_multisize_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_NUMBER_PROPERTIES:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_number_propertiesRule()) {
					sequence_fx_number_properties_fx_number_properties(context, (fx_number_properties) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_NUMBER_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_number_propertyRule()) {
					sequence_fx_number_property_fx_number_property(context, (fx_number_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_PAINT_PROPERTIES:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_paint_propertiesRule()) {
					sequence_fx_paint_properties_fx_paint_properties(context, (fx_paint_properties) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_PAINT_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_paint_propertyRule()) {
					sequence_fx_paint_property_fx_paint_property(context, (fx_paint_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_POSITION_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_position_propertyRule()) {
					sequence_fx_position_property_fx_position_property(context, (fx_position_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_REPEAT_PROPERTIES:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_repeat_propertiesRule()) {
					sequence_fx_repeat_properties_fx_repeat_properties(context, (fx_repeat_properties) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_SIDE_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_side_propertyRule()) {
					sequence_fx_side_property_fx_side_property(context, (fx_side_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_SIZE_PROPERTIES:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_size_propertiesRule()) {
					sequence_fx_size_properties_fx_size_properties(context, (fx_size_properties) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_SIZE_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_size_propertyRule()) {
					sequence_fx_size_property_fx_size_property(context, (fx_size_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_STRING_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_string_propertyRule()) {
					sequence_fx_string_property_fx_string_property(context, (fx_string_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_STROKE_LINE_CAP_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_stroke_line_cap_propertyRule()) {
					sequence_fx_stroke_line_cap_property_fx_stroke_line_cap_property(context, (fx_stroke_line_cap_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_STROKE_LINE_JOIN_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_stroke_line_join_propertyRule()) {
					sequence_fx_stroke_line_join_property_fx_stroke_line_join_property(context, (fx_stroke_line_join_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_TEXT_ORIGIN_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_text_origin_propertyRule()) {
					sequence_fx_text_origin_property_fx_text_origin_property(context, (fx_text_origin_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_TEXT_OVERRUN_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_text_overrun_propertyRule()) {
					sequence_fx_text_overrun_property_fx_text_overrun_property(context, (fx_text_overrun_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_URL_PROPERTIES:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_url_propertiesRule()) {
					sequence_fx_url_properties_fx_url_properties(context, (fx_url_properties) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_URL_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_url_propertyRule()) {
					sequence_fx_url_property_fx_url_property(context, (fx_url_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.FX_VPOSITION_PROPERTY:
				if(context == grammarAccess.getCss_declarationRule() ||
				   context == grammarAccess.getCss_fx_declarationRule() ||
				   context == grammarAccess.getFx_vposition_propertyRule()) {
					sequence_fx_vposition_property_fx_vposition_property(context, (fx_vposition_property) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.MEDIA:
				if(context == grammarAccess.getMediaRule()) {
					sequence_media_media(context, (media) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.RULESET:
				if(context == grammarAccess.getRulesetRule()) {
					sequence_ruleset_ruleset(context, (ruleset) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.SELECTOR:
				if(context == grammarAccess.getSelectorRule()) {
					sequence_selector_selector(context, (selector) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.SIMPLE_SELECTOR:
				if(context == grammarAccess.getSimple_selectorRule()) {
					sequence_simple_selector_simple_selector(context, (simple_selector) semanticObject); 
					return; 
				}
				else break;
			case CssDslPackage.STYLESHEET:
				if(context == grammarAccess.getStylesheetRule()) {
					sequence_stylesheet_stylesheet(context, (stylesheet) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     ((absx=SIZE | relx='left' | relx='center' | relx='right') (absy=SIZE | rely='top' | rely='center' | rely='bottom'))
	 *
	 * Features:
	 *    absx[0, 1]
	 *         EXCLUDE_IF_SET relx
	 *         EXCLUDE_IF_SET relx
	 *         EXCLUDE_IF_SET relx
	 *    relx[0, 3]
	 *         EXCLUDE_IF_SET absx
	 *    absy[0, 1]
	 *         EXCLUDE_IF_SET rely
	 *         EXCLUDE_IF_SET rely
	 *         EXCLUDE_IF_SET rely
	 *    rely[0, 3]
	 *         EXCLUDE_IF_SET absy
	 */
	protected void sequence_BgPosition_BgPosition(EObject context, BgPosition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (((xsize=SIZE | xsize='auto') (ysize=SIZE | ysize='auto')?) | predefined='cover' | predefined='contain')
	 *
	 * Features:
	 *    xsize[0, 2]
	 *         EXCLUDE_IF_SET predefined
	 *         EXCLUDE_IF_SET predefined
	 *    ysize[0, 2]
	 *         EXCLUDE_IF_SET predefined
	 *         EXCLUDE_IF_SET predefined
	 *    predefined[0, 2]
	 *         EXCLUDE_IF_SET xsize
	 *         EXCLUDE_IF_SET xsize
	 *         EXCLUDE_IF_SET ysize
	 *         EXCLUDE_IF_SET ysize
	 */
	protected void sequence_BgSize_BgSize(EObject context, BgSize semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (dashStyle='none' | dashStyle='solid' | dashStyle='dotted' | dashStyle='dashed') 
	 *         (location='centered' | location='inside' | location='outside')? 
	 *         (miterAbs=NUMBER | miterPredefined='bevel' | miterPredefined='round')? 
	 *         (lineCap='square' | lineCap='butt' | lineCap='round')?
	 *     )
	 *
	 * Features:
	 *    dashStyle[0, 4]
	 *    location[0, 3]
	 *    miterAbs[0, 1]
	 *         EXCLUDE_IF_SET miterPredefined
	 *         EXCLUDE_IF_SET miterPredefined
	 *    miterPredefined[0, 2]
	 *         EXCLUDE_IF_SET miterAbs
	 *    lineCap[0, 3]
	 */
	protected void sequence_BorderStyle_BorderStyle(EObject context, BorderStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((orig=Color mod=unary_operator?) | (orig=Color (stopNumbers+=NUMBER stopColors+=Color)+))
	 *
	 * Features:
	 *    orig[2, 2]
	 *    mod[0, 1]
	 *         EXCLUDE_IF_UNSET orig
	 *         EXCLUDE_IF_SET orig
	 *         EXCLUDE_IF_SET stopNumbers
	 *         EXCLUDE_IF_SET stopColors
	 *    stopNumbers[1, *]
	 *         SAME stopColors
	 *         EXCLUDE_IF_UNSET orig
	 *         MANDATORY_IF_SET orig
	 *         EXCLUDE_IF_SET orig
	 *         EXCLUDE_IF_SET mod
	 *    stopColors[1, *]
	 *         SAME stopNumbers
	 *         EXCLUDE_IF_UNSET orig
	 *         MANDATORY_IF_SET orig
	 *         EXCLUDE_IF_SET orig
	 *         EXCLUDE_IF_SET mod
	 */
	protected void sequence_ColorFunction_ColorFunction(EObject context, ColorFunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values+=SIZE | (values+=SIZE values+=SIZE values+=SIZE values+=SIZE))
	 *
	 * Features:
	 *    values[4, 5]
	 */
	protected void sequence_Dim4Size_Dim4Size(EObject context, Dim4Size semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         blur=BLUR 
	 *         color=Color 
	 *         blurRadius=NUMBER 
	 *         spread=NUMBER 
	 *         offsetX=NUMBER 
	 *         offsetY=NUMBER
	 *     )
	 *
	 * Features:
	 *    blur[1, 1]
	 *    color[1, 1]
	 *    blurRadius[1, 1]
	 *    offsetX[1, 1]
	 *    offsetY[1, 1]
	 *    spread[1, 1]
	 */
	protected void sequence_EffectDropShadow_EffectDropShadow(EObject context, EffectDropShadow semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.EFFECT__BLUR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.EFFECT__BLUR));
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.EFFECT__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.EFFECT__COLOR));
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.EFFECT__BLUR_RADIUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.EFFECT__BLUR_RADIUS));
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.EFFECT__OFFSET_X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.EFFECT__OFFSET_X));
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.EFFECT__OFFSET_Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.EFFECT__OFFSET_Y));
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.EFFECT_DROP_SHADOW__SPREAD) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.EFFECT_DROP_SHADOW__SPREAD));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEffectDropShadowAccess().getBlurBLURParserRuleCall_4_0(), semanticObject.getBlur());
		feeder.accept(grammarAccess.getEffectDropShadowAccess().getColorColorParserRuleCall_6_0(), semanticObject.getColor());
		feeder.accept(grammarAccess.getEffectDropShadowAccess().getBlurRadiusNUMBERParserRuleCall_8_0(), semanticObject.getBlurRadius());
		feeder.accept(grammarAccess.getEffectDropShadowAccess().getSpreadNUMBERParserRuleCall_10_0(), semanticObject.getSpread());
		feeder.accept(grammarAccess.getEffectDropShadowAccess().getOffsetXNUMBERParserRuleCall_12_0(), semanticObject.getOffsetX());
		feeder.accept(grammarAccess.getEffectDropShadowAccess().getOffsetYNUMBERParserRuleCall_14_0(), semanticObject.getOffsetY());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         blur=BLUR 
	 *         color=Color 
	 *         blurRadius=NUMBER 
	 *         choke=NUMBER 
	 *         offsetX=NUMBER 
	 *         offsetY=NUMBER
	 *     )
	 *
	 * Features:
	 *    blur[1, 1]
	 *    color[1, 1]
	 *    blurRadius[1, 1]
	 *    offsetX[1, 1]
	 *    offsetY[1, 1]
	 *    choke[1, 1]
	 */
	protected void sequence_EffectInnerShadow_EffectInnerShadow(EObject context, EffectInnerShadow semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.EFFECT__BLUR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.EFFECT__BLUR));
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.EFFECT__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.EFFECT__COLOR));
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.EFFECT__BLUR_RADIUS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.EFFECT__BLUR_RADIUS));
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.EFFECT__OFFSET_X) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.EFFECT__OFFSET_X));
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.EFFECT__OFFSET_Y) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.EFFECT__OFFSET_Y));
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.EFFECT_INNER_SHADOW__CHOKE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.EFFECT_INNER_SHADOW__CHOKE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEffectInnerShadowAccess().getBlurBLURParserRuleCall_4_0(), semanticObject.getBlur());
		feeder.accept(grammarAccess.getEffectInnerShadowAccess().getColorColorParserRuleCall_6_0(), semanticObject.getColor());
		feeder.accept(grammarAccess.getEffectInnerShadowAccess().getBlurRadiusNUMBERParserRuleCall_8_0(), semanticObject.getBlurRadius());
		feeder.accept(grammarAccess.getEffectInnerShadowAccess().getChokeNUMBERParserRuleCall_10_0(), semanticObject.getChoke());
		feeder.accept(grammarAccess.getEffectInnerShadowAccess().getOffsetXNUMBERParserRuleCall_12_0(), semanticObject.getOffsetX());
		feeder.accept(grammarAccess.getEffectInnerShadowAccess().getOffsetYNUMBERParserRuleCall_14_0(), semanticObject.getOffsetY());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (value='normal' | value='italic' | value='oblique')
	 *
	 * Features:
	 *    value[0, 3]
	 */
	protected void sequence_FONTSTYLE_FONTSTYLE(EObject context, FONTSTYLE semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueString='normal' | valueString='bold' | valueString='bolder' | valueString='lighter' | valueInt=integer)
	 *
	 * Features:
	 *    valueString[0, 4]
	 *         EXCLUDE_IF_SET valueInt
	 *    valueInt[0, 1]
	 *         EXCLUDE_IF_SET valueString
	 *         EXCLUDE_IF_SET valueString
	 *         EXCLUDE_IF_SET valueString
	 *         EXCLUDE_IF_SET valueString
	 */
	protected void sequence_FONTWEIGHT_FONTWEIGHT(EObject context, FONTWEIGHT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             styleOrWeightString='italic' | 
	 *             styleOrWeightString='oblique' | 
	 *             styleOrWeightString='normal' | 
	 *             styleOrWeightString='bold' | 
	 *             styleOrWeightString='bolder' | 
	 *             styleOrWeightString='lighter' | 
	 *             weight=num
	 *         )? 
	 *         size=SIZE 
	 *         family=FONTFAMILY
	 *     )
	 *
	 * Features:
	 *    styleOrWeightString[0, 6]
	 *         EXCLUDE_IF_SET weight
	 *    weight[0, 1]
	 *         EXCLUDE_IF_SET styleOrWeightString
	 *         EXCLUDE_IF_SET styleOrWeightString
	 *         EXCLUDE_IF_SET styleOrWeightString
	 *         EXCLUDE_IF_SET styleOrWeightString
	 *         EXCLUDE_IF_SET styleOrWeightString
	 *         EXCLUDE_IF_SET styleOrWeightString
	 *    size[1, 1]
	 *    family[1, 1]
	 */
	protected void sequence_FONT_FONT(EObject context, FONT semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((hue=NUMBER saturation=PERCENTAGE brightness=PERCENTAGE) | (hue=NUMBER saturation=PERCENTAGE brightness=PERCENTAGE alpha=NUMBER))
	 *
	 * Features:
	 *    hue[2, 2]
	 *    saturation[2, 2]
	 *    brightness[2, 2]
	 *    alpha[1, 1]
	 *         EXCLUDE_IF_UNSET hue
	 *         MANDATORY_IF_SET hue
	 *         EXCLUDE_IF_UNSET saturation
	 *         MANDATORY_IF_SET saturation
	 *         EXCLUDE_IF_UNSET brightness
	 *         MANDATORY_IF_SET brightness
	 *         EXCLUDE_IF_SET hue
	 *         EXCLUDE_IF_SET saturation
	 *         EXCLUDE_IF_SET brightness
	 */
	protected void sequence_HSBColor_HSBColor(EObject context, HSBColor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (x1=SIZE y1=SIZE x2=SIZE y2=SIZE stops+=StopValue+)
	 *
	 * Features:
	 *    x1[1, 1]
	 *    y1[1, 1]
	 *    x2[1, 1]
	 *    y2[1, 1]
	 *    stops[1, *]
	 */
	protected void sequence_LinearGradient_LinearGradient(EObject context, LinearGradient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=COLOR_PROPERTIES | value=IDENT)
	 *
	 * Features:
	 *    value[0, 2]
	 */
	protected void sequence_LookedUpColor_LookedUpColor(EObject context, LookedUpColor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (values+=Paint values+=Paint*)
	 *
	 * Features:
	 *    values[1, *]
	 */
	protected void sequence_MultiPaint_MultiPaint(EObject context, MultiPaint semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         value='aliceblue' | 
	 *         value='antiquewhite' | 
	 *         value='aqua' | 
	 *         value='aquamarine' | 
	 *         value='azure' | 
	 *         value='beige' | 
	 *         value='bisque' | 
	 *         value='black' | 
	 *         value='blanchedalmond' | 
	 *         value='blue' | 
	 *         value='blueviolet' | 
	 *         value='brown' | 
	 *         value='burlywood' | 
	 *         value='cadetblue' | 
	 *         value='chartreuse' | 
	 *         value='chocolate' | 
	 *         value='coral' | 
	 *         value='cornflowerblue' | 
	 *         value='cornsilk' | 
	 *         value='crimson' | 
	 *         value='cyan' | 
	 *         value='darkblue' | 
	 *         value='darkcyan' | 
	 *         value='darkgoldenrod' | 
	 *         value='darkgray' | 
	 *         value='darkgreen' | 
	 *         value='darkgrey' | 
	 *         value='darkkhaki' | 
	 *         value='darkmagenta' | 
	 *         value='darkolivegreen' | 
	 *         value='darkorange' | 
	 *         value='darkorchid' | 
	 *         value='darkred' | 
	 *         value='darksalmon' | 
	 *         value='darkseagreen' | 
	 *         value='darkslateblue' | 
	 *         value='darkslategray' | 
	 *         value='darkslategrey' | 
	 *         value='darkturquoise' | 
	 *         value='darkviolet' | 
	 *         value='deeppink' | 
	 *         value='deepskyblue' | 
	 *         value='dimgray' | 
	 *         value='dimgrey' | 
	 *         value='dodgerblue' | 
	 *         value='firebrick' | 
	 *         value='floralwhite' | 
	 *         value='forestgreen' | 
	 *         value='fuchsia' | 
	 *         value='gainsboro' | 
	 *         value='ghostwhite' | 
	 *         value='gold' | 
	 *         value='goldenrod' | 
	 *         value='gray' | 
	 *         value='green' | 
	 *         value='greenyellow' | 
	 *         value='grey' | 
	 *         value='honeydew' | 
	 *         value='hotpink' | 
	 *         value='indianred' | 
	 *         value='indigo' | 
	 *         value='ivory' | 
	 *         value='khaki' | 
	 *         value='lavender' | 
	 *         value='lavenderblush' | 
	 *         value='lawngreen' | 
	 *         value='lemonchiffon' | 
	 *         value='lightblue' | 
	 *         value='lightcoral' | 
	 *         value='lightcyan' | 
	 *         value='lightgoldenrodyellow' | 
	 *         value='lightgray' | 
	 *         value='lightgreen' | 
	 *         value='lightgrey' | 
	 *         value='lightpink' | 
	 *         value='lightsalmon' | 
	 *         value='lightseagreen' | 
	 *         value='lightskyblue' | 
	 *         value='lightslategray' | 
	 *         value='lightslategrey' | 
	 *         value='lightsteelblue' | 
	 *         value='lightyellow' | 
	 *         value='lime' | 
	 *         value='limegreen' | 
	 *         value='linen' | 
	 *         value='magenta' | 
	 *         value='maroon' | 
	 *         value='mediumaquamarine' | 
	 *         value='mediumblue' | 
	 *         value='mediumorchid' | 
	 *         value='mediumpurple' | 
	 *         value='mediumseagreen' | 
	 *         value='mediumslateblue' | 
	 *         value='mediumspringgreen' | 
	 *         value='mediumturquoise' | 
	 *         value='mediumvioletred' | 
	 *         value='midnightblue' | 
	 *         value='mintcream' | 
	 *         value='mistyrose' | 
	 *         value='moccasin' | 
	 *         value='navajowhite' | 
	 *         value='navy' | 
	 *         value='oldlace' | 
	 *         value='olive' | 
	 *         value='olivedrab' | 
	 *         value='orange' | 
	 *         value='orangered' | 
	 *         value='orchid' | 
	 *         value='palegoldenrod' | 
	 *         value='palegreen' | 
	 *         value='paleturquoise' | 
	 *         value='palevioletred' | 
	 *         value='papayawhip' | 
	 *         value='peachpuff' | 
	 *         value='peru' | 
	 *         value='pink' | 
	 *         value='plum' | 
	 *         value='powderblue' | 
	 *         value='purple' | 
	 *         value='red' | 
	 *         value='rosybrown' | 
	 *         value='royalblue' | 
	 *         value='saddlebrown' | 
	 *         value='salmon' | 
	 *         value='sandybrown' | 
	 *         value='seagreen' | 
	 *         value='seashell' | 
	 *         value='sienna' | 
	 *         value='silver' | 
	 *         value='skyblue' | 
	 *         value='slateblue' | 
	 *         value='slategray' | 
	 *         value='slategrey' | 
	 *         value='snow' | 
	 *         value='springgreen' | 
	 *         value='steelblue' | 
	 *         value='tan' | 
	 *         value='teal' | 
	 *         value='thistle' | 
	 *         value='tomato' | 
	 *         value='turquoise' | 
	 *         value='violet' | 
	 *         value='wheat' | 
	 *         value='white' | 
	 *         value='whitesmoke' | 
	 *         value='yellow' | 
	 *         value='yellowgreen' | 
	 *         value='transparent'
	 *     )
	 *
	 * Features:
	 *    value[0, 148]
	 */
	protected void sequence_NamedColor_NamedColor(EObject context, NamedColor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         hexcolor=HexColor | 
	 *         (r=integer g=integer b=integer) | 
	 *         (rp=integer gp=integer bp=integer) | 
	 *         (r=integer g=integer b=integer alpha=NUMBER) | 
	 *         (rp=integer gp=integer bp=integer alpha=NUMBER)
	 *     )
	 *
	 * Features:
	 *    hexcolor[0, 1]
	 *         EXCLUDE_IF_SET r
	 *         EXCLUDE_IF_SET g
	 *         EXCLUDE_IF_SET b
	 *         EXCLUDE_IF_SET rp
	 *         EXCLUDE_IF_SET gp
	 *         EXCLUDE_IF_SET bp
	 *         EXCLUDE_IF_SET r
	 *         EXCLUDE_IF_SET g
	 *         EXCLUDE_IF_SET b
	 *         EXCLUDE_IF_SET alpha
	 *         EXCLUDE_IF_SET rp
	 *         EXCLUDE_IF_SET gp
	 *         EXCLUDE_IF_SET bp
	 *         EXCLUDE_IF_SET alpha
	 *    r[2, 2]
	 *         EXCLUDE_IF_SET hexcolor
	 *         EXCLUDE_IF_SET rp
	 *         EXCLUDE_IF_SET gp
	 *         EXCLUDE_IF_SET bp
	 *         EXCLUDE_IF_SET rp
	 *         EXCLUDE_IF_SET gp
	 *         EXCLUDE_IF_SET bp
	 *         EXCLUDE_IF_SET alpha
	 *    g[2, 2]
	 *         EXCLUDE_IF_SET hexcolor
	 *         EXCLUDE_IF_SET rp
	 *         EXCLUDE_IF_SET gp
	 *         EXCLUDE_IF_SET bp
	 *         EXCLUDE_IF_SET rp
	 *         EXCLUDE_IF_SET gp
	 *         EXCLUDE_IF_SET bp
	 *         EXCLUDE_IF_SET alpha
	 *    b[2, 2]
	 *         EXCLUDE_IF_SET hexcolor
	 *         EXCLUDE_IF_SET rp
	 *         EXCLUDE_IF_SET gp
	 *         EXCLUDE_IF_SET bp
	 *         EXCLUDE_IF_SET rp
	 *         EXCLUDE_IF_SET gp
	 *         EXCLUDE_IF_SET bp
	 *         EXCLUDE_IF_SET alpha
	 *    rp[2, 2]
	 *         EXCLUDE_IF_SET hexcolor
	 *         EXCLUDE_IF_SET r
	 *         EXCLUDE_IF_SET g
	 *         EXCLUDE_IF_SET b
	 *         EXCLUDE_IF_SET r
	 *         EXCLUDE_IF_SET g
	 *         EXCLUDE_IF_SET b
	 *         EXCLUDE_IF_SET alpha
	 *    gp[2, 2]
	 *         EXCLUDE_IF_SET hexcolor
	 *         EXCLUDE_IF_SET r
	 *         EXCLUDE_IF_SET g
	 *         EXCLUDE_IF_SET b
	 *         EXCLUDE_IF_SET r
	 *         EXCLUDE_IF_SET g
	 *         EXCLUDE_IF_SET b
	 *         EXCLUDE_IF_SET alpha
	 *    bp[2, 2]
	 *         EXCLUDE_IF_SET hexcolor
	 *         EXCLUDE_IF_SET r
	 *         EXCLUDE_IF_SET g
	 *         EXCLUDE_IF_SET b
	 *         EXCLUDE_IF_SET r
	 *         EXCLUDE_IF_SET g
	 *         EXCLUDE_IF_SET b
	 *         EXCLUDE_IF_SET alpha
	 *    alpha[2, 2]
	 *         EXCLUDE_IF_SET hexcolor
	 *         EXCLUDE_IF_SET r
	 *         EXCLUDE_IF_SET g
	 *         EXCLUDE_IF_SET b
	 *         EXCLUDE_IF_SET rp
	 *         EXCLUDE_IF_SET gp
	 *         EXCLUDE_IF_SET bp
	 */
	protected void sequence_RGBColor_RGBColor(EObject context, RGBColor semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((cx=SIZE cy=SIZE)? radius=SIZE fx=SIZE fy=SIZE stops+=StopValue+)
	 *
	 * Features:
	 *    cx[0, 1]
	 *         EXCLUDE_IF_UNSET cy
	 *         MANDATORY_IF_SET cy
	 *    cy[0, 1]
	 *         EXCLUDE_IF_UNSET cx
	 *         MANDATORY_IF_SET cx
	 *    radius[1, 1]
	 *    fx[1, 1]
	 *    fy[1, 1]
	 *    stops[1, *]
	 */
	protected void sequence_RadialGradient_RadialGradient(EObject context, RadialGradient semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         v='repeat-x' | 
	 *         v='repeat-y' | 
	 *         ((v='repeat' | v='space' | v='round' | v='no-repeat' | v='stretch') (v2='repeat' | v2='space' | v2='round' | v2='no-repeat' | v2='stretch')?)
	 *     )
	 *
	 * Features:
	 *    v[0, 7]
	 *    v2[0, 5]
	 *         EXCLUDE_IF_SET v
	 *         EXCLUDE_IF_SET v
	 */
	protected void sequence_RepeatStyle_RepeatStyle(EObject context, RepeatStyle semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=Dim4Size fill='fill'?)
	 *
	 * Features:
	 *    value[1, 1]
	 *    fill[0, 1]
	 */
	protected void sequence_SizeFill_SizeFill(EObject context, SizeFill semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (pos=SIZE color=Color)
	 *
	 * Features:
	 *    pos[1, 1]
	 *    color[1, 1]
	 */
	protected void sequence_StopValue_StopValue(EObject context, StopValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.STOP_VALUE__POS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.STOP_VALUE__POS));
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.STOP_VALUE__COLOR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.STOP_VALUE__COLOR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStopValueAccess().getPosSIZEParserRuleCall_0_0(), semanticObject.getPos());
		feeder.accept(grammarAccess.getStopValueAccess().getColorColorParserRuleCall_2_0(), semanticObject.getColor());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     url=STRING
	 *
	 * Features:
	 *    url[1, 1]
	 */
	protected void sequence_URLType_URLType(EObject context, URLType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.URL_TYPE__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.URL_TYPE__URL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getURLTypeAccess().getUrlSTRINGTerminalRuleCall_4_0(), semanticObject.getUrl());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (property=css_property expression=expr)
	 *
	 * Features:
	 *    property[1, 1]
	 *    expression[1, 1]
	 */
	protected void sequence_css_generic_declaration_css_generic_declaration(EObject context, css_generic_declaration semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.CSS_GENERIC_DECLARATION__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.CSS_GENERIC_DECLARATION__PROPERTY));
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.CSS_GENERIC_DECLARATION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.CSS_GENERIC_DECLARATION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getCss_generic_declarationAccess().getPropertyCss_propertyParserRuleCall_0_0(), semanticObject.getProperty());
		feeder.accept(grammarAccess.getCss_generic_declarationAccess().getExpressionExprParserRuleCall_3_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-text-alignment' | property='-fx-alignment') (value='left' | value='center' | value='right' | value='justify'))
	 *
	 * Features:
	 *    property[0, 2]
	 *    value[0, 4]
	 */
	protected void sequence_fx_alignment_property_fx_alignment_property(EObject context, fx_alignment_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property='-fx-background-image-size' values+=BgSize values+=BgSize*)
	 *
	 * Features:
	 *    property[1, 1]
	 *    values[1, *]
	 */
	protected void sequence_fx_background_image_size_property_fx_background_image_size_property(EObject context, fx_background_image_size_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-hbar-policy' | property='-fx-vbar-policy') (value='never' | value='always' | value='as_needed'))
	 *
	 * Features:
	 *    property[0, 2]
	 *    value[0, 3]
	 */
	protected void sequence_fx_bar_policy_property_fx_bar_policy_property(EObject context, fx_bar_policy_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         property='-fx-blend-mode' 
	 *         (
	 *             value='add' | 
	 *             value='blue' | 
	 *             value='color-burn' | 
	 *             value='color-dodge' | 
	 *             value='darken' | 
	 *             value='difference' | 
	 *             value='exclusion' | 
	 *             value='green' | 
	 *             value='hard-light' | 
	 *             value='lighten' | 
	 *             value='multiply' | 
	 *             value='overlay' | 
	 *             value='red' | 
	 *             value='screen' | 
	 *             value='soft-light' | 
	 *             value='src-atop' | 
	 *             value='src-in' | 
	 *             value='src-out' | 
	 *             value='src-over'
	 *         )
	 *     )
	 *
	 * Features:
	 *    property[1, 1]
	 *    value[0, 19]
	 */
	protected void sequence_fx_blend_property_fx_blend_property(EObject context, fx_blend_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-focus-traversable' | 
	 *             property='-fx-pannable' | 
	 *             property='-fx-hgap' | 
	 *             property='-fx-vpos' | 
	 *             property='-fx-snap-to-pixel' | 
	 *             property='-fx-vertical' | 
	 *             property='-fx-smooth' | 
	 *             property='-fx-strikethrough' | 
	 *             property='-fx-underline' | 
	 *             property='-fx-scale-shape' | 
	 *             property='-fx-vertical-zero-line-visible' | 
	 *             property='-fx-vertical-grid-line-visible' | 
	 *             property='-fx-horizontal-zero-line-visible' | 
	 *             property='-fx-horizontal-grid-line-visible' | 
	 *             property='-fx-pie-value-visible' | 
	 *             property='-fx-pie-to-label-line-curved' | 
	 *             property='-fx-pie-label-visible' | 
	 *             property='-fx-clockwise' | 
	 *             property='-fx-show-symbols' | 
	 *             property='-fx-legend-visible' | 
	 *             property='-fx-scale-bubble-radius-using-axis' | 
	 *             property='-fx-select-on-focus' | 
	 *             property='-fx-editable' | 
	 *             property='-fx-snap-to-ticks' | 
	 *             property='-fx-show-tick-marks' | 
	 *             property='-fx-show-tick-labels' | 
	 *             property='-fx-fit-to-width' | 
	 *             property='-fx-minor-tick-visible' | 
	 *             property='-fx-gap-start-and-end' | 
	 *             property='-fx-tick-mark-visible' | 
	 *             property='-fx-tick-labels-visible' | 
	 *             property='-fx-fit-to-height' | 
	 *             property='-fx-click-to-position' | 
	 *             property='-fx-text-wrap' | 
	 *             property='-fx-position-shape'
	 *         ) 
	 *         (value='true' | value='false')
	 *     )
	 *
	 * Features:
	 *    property[0, 35]
	 *    value[0, 2]
	 */
	protected void sequence_fx_boolean_property_fx_boolean_property(EObject context, fx_boolean_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property='-fx-border-image-slice' values+=SizeFill values+=SizeFill*)
	 *
	 * Features:
	 *    property[1, 1]
	 *    values[1, *]
	 */
	protected void sequence_fx_border_image_slice_property_fx_border_image_slice_property(EObject context, fx_border_image_slice_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property='-fx-border-style' values+=BorderStyle values+=BorderStyle*)
	 *
	 * Features:
	 *    property[1, 1]
	 *    values[1, *]
	 */
	protected void sequence_fx_border_style_property_fx_border_style_property(EObject context, fx_border_style_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property=COLOR_PROPERTIES value=Color)
	 *
	 * Features:
	 *    property[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_fx_color_property_fx_color_property(EObject context, fx_color_property semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.FX_COLOR_PROPERTY__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.FX_COLOR_PROPERTY__PROPERTY));
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.FX_COLOR_PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.FX_COLOR_PROPERTY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFx_color_propertyAccess().getPropertyCOLOR_PROPERTIESParserRuleCall_0_0(), semanticObject.getProperty());
		feeder.accept(grammarAccess.getFx_color_propertyAccess().getValueColorParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         property='-fx-cursor' 
	 *         (
	 *             value='crosshair' | 
	 *             value='default' | 
	 *             value='hand' | 
	 *             value='move' | 
	 *             value='e-resize' | 
	 *             value='h-resize' | 
	 *             value='ne-resize' | 
	 *             value='nw-resize' | 
	 *             value='n-resize' | 
	 *             value='se-resize' | 
	 *             value='sw-resize' | 
	 *             value='s-resize' | 
	 *             value='w-resize' | 
	 *             value='v-resize' | 
	 *             value='text' | 
	 *             value='wait'
	 *         )
	 *     )
	 *
	 * Features:
	 *    property[1, 1]
	 *    value[0, 16]
	 */
	protected void sequence_fx_cursor_property_fx_cursor_property(EObject context, fx_cursor_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=Effect
	 *
	 * Features:
	 *    value[1, 1]
	 */
	protected void sequence_fx_effect_property_fx_effect_property(EObject context, fx_effect_property semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.FX_EFFECT_PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.FX_EFFECT_PROPERTY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFx_effect_propertyAccess().getValueEffectParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-font-family' | 
	 *             property='-fx-title-font-family' | 
	 *             property='-fx-pie-label-font-family' | 
	 *             property='-fx-pie-value-label-font-family' | 
	 *             property='-fx-label-font-family' | 
	 *             property='-fx-tick-label-font-family'
	 *         ) 
	 *         value=FONTFAMILY
	 *     )
	 *
	 * Features:
	 *    property[0, 6]
	 *    value[1, 1]
	 */
	protected void sequence_fx_font_family_property_fx_font_family_property(EObject context, fx_font_family_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-font' | 
	 *             property='-fx-title-font' | 
	 *             property='-fx-pie-label-font' | 
	 *             property='-fx-pie-value-label-font' | 
	 *             property='-fx-label-font' | 
	 *             property='-fx-tick-label-font'
	 *         ) 
	 *         value=FONT
	 *     )
	 *
	 * Features:
	 *    property[0, 6]
	 *    value[1, 1]
	 */
	protected void sequence_fx_font_property_fx_font_property(EObject context, fx_font_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-font-size' | 
	 *             property='-fx-title-font-size' | 
	 *             property='-fx-pie-label-font-size' | 
	 *             property='-fx-pie-value-label-font-size' | 
	 *             property='-fx-label-font-size' | 
	 *             property='-fx-tick-label-font-size'
	 *         ) 
	 *         value=SIZE
	 *     )
	 *
	 * Features:
	 *    property[0, 6]
	 *    value[1, 1]
	 */
	protected void sequence_fx_font_size_property_fx_font_size_property(EObject context, fx_font_size_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-font-style' | 
	 *             property='-fx-title-font-style' | 
	 *             property='-fx-pie-label-font-style' | 
	 *             property='-fx-pie-value-label-font-style' | 
	 *             property='-fx-label-font-style' | 
	 *             property='-fx-tick-label-font-style'
	 *         ) 
	 *         value=FONTSTYLE
	 *     )
	 *
	 * Features:
	 *    property[0, 6]
	 *    value[1, 1]
	 */
	protected void sequence_fx_font_style_property_fx_font_style_property(EObject context, fx_font_style_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-font-weight' | 
	 *             property='-fx-title-font-weight' | 
	 *             property='-fx-pie-label-font-weight' | 
	 *             property='-fx-pie-value-label-font-weight' | 
	 *             property='-fx-label-font-weight' | 
	 *             property='-fx-tick-label-font-weight'
	 *         ) 
	 *         value=FONTWEIGHT
	 *     )
	 *
	 * Features:
	 *    property[0, 6]
	 *    value[1, 1]
	 */
	protected void sequence_fx_font_weight_property_fx_font_weight_property(EObject context, fx_font_weight_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-hpos' | property='-fx-node-hpos' | property='-fx-graphic-hpos') value=HPosition)
	 *
	 * Features:
	 *    property[0, 3]
	 *    value[1, 1]
	 */
	protected void sequence_fx_hposition_property_fx_hposition_property(EObject context, fx_hposition_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-insets' value+=NUMBER) | (value+=NUMBER value+=NUMBER value+=NUMBER value+=NUMBER))
	 *
	 * Features:
	 *    property[1, 1]
	 *         EXCLUDE_IF_UNSET value
	 *         MANDATORY_IF_SET value
	 *         EXCLUDE_IF_SET value
	 *         EXCLUDE_IF_SET value
	 *         EXCLUDE_IF_SET value
	 *         EXCLUDE_IF_SET value
	 *    value[5, 5]
	 */
	protected void sequence_fx_insets_property_fx_insets_property(EObject context, fx_insets_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-columns' | property='-fx-rows' | property='-fx-lines' | property='-fx-minor-tick-count') value=integer)
	 *
	 * Features:
	 *    property[0, 4]
	 *    value[1, 1]
	 */
	protected void sequence_fx_integer_property_fx_integer_property(EObject context, fx_integer_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property='-fx-border-color' (values+=MultiPaint values+=MultiPaint*)?)
	 *
	 * Features:
	 *    property[1, 1]
	 *    values[0, *]
	 */
	protected void sequence_fx_multi_paint_properties_fx_multi_paint_properties(EObject context, fx_multi_paint_properties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-background-insets' | 
	 *             property='-fx-background-radius' | 
	 *             property='-fx-border-insets' | 
	 *             property='-fx-border-radius' | 
	 *             property='-fx-border-width' | 
	 *             property='-fx-border-image-insets' | 
	 *             property='-fx-border-image-width'
	 *         ) 
	 *         values+=Dim4Size 
	 *         values+=Dim4Size*
	 *     )
	 *
	 * Features:
	 *    property[0, 7]
	 *    values[1, *]
	 */
	protected void sequence_fx_multisize_properties_fx_multisize_properties(EObject context, fx_multisize_properties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property='-fx-padding' value=Dim4Size)
	 *
	 * Features:
	 *    property[1, 1]
	 *    value[1, 1]
	 */
	protected void sequence_fx_multisize_property_fx_multisize_property(EObject context, fx_multisize_property semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.FX_MULTISIZE_PROPERTY__PROPERTY) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.FX_MULTISIZE_PROPERTY__PROPERTY));
			if(transientValues.isValueTransient(semanticObject, CssDslPackage.Literals.FX_MULTISIZE_PROPERTY__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, CssDslPackage.Literals.FX_MULTISIZE_PROPERTY__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFx_multisize_propertyAccess().getPropertyFxPaddingKeyword_0_0(), semanticObject.getProperty());
		feeder.accept(grammarAccess.getFx_multisize_propertyAccess().getValueDim4SizeParserRuleCall_4_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-horizontal-grid-line-stroke-dash-array' | property='-fx-vertical-grid-line-stroke-dash-array') value+=NUMBER+)
	 *
	 * Features:
	 *    property[0, 2]
	 *    value[1, *]
	 */
	protected void sequence_fx_number_properties_fx_number_properties(EObject context, fx_number_properties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-rotate' | 
	 *             property='-fx-scale-x' | 
	 *             property='-fx-scale-y' | 
	 *             property='-fx-scale-z' | 
	 *             property='-fx-translate-x' | 
	 *             property='-fx-translate-y' | 
	 *             property='-fx-translate-z' | 
	 *             property='-fx-vgap' | 
	 *             property='-fx-tile-height' | 
	 *             property='-fx-tile-width' | 
	 *             property='-fx-stroke-dash-offset' | 
	 *             property='-fx-stroke-miter-limit' | 
	 *             property='-fx-block-increment' | 
	 *             property='-fx-unit-increment' | 
	 *             property='-fx-major-tick-unit' | 
	 *             property='-fx-data-opacity' | 
	 *             property='-fx-radius-scale' | 
	 *             property='-fx-pie-to-label-line-one-length' | 
	 *             property='-fx-pie-to-label-line-stroke-width' | 
	 *             property='-fx-pie-to-label-line-two-length' | 
	 *             property='-fx-start-angle' | 
	 *             property='-fx-tick-unit' | 
	 *             property='-fx-indent'
	 *         ) 
	 *         value=NUMBER
	 *     )
	 *
	 * Features:
	 *    property[0, 23]
	 *    value[1, 1]
	 */
	protected void sequence_fx_number_property_fx_number_property(EObject context, fx_number_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property='-fx-background-color' (values+=Paint values+=Paint*)?)
	 *
	 * Features:
	 *    property[1, 1]
	 *    values[0, *]
	 */
	protected void sequence_fx_paint_properties_fx_paint_properties(EObject context, fx_paint_properties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-fill' | 
	 *             property='-fx-stroke' | 
	 *             property='-fx-text-fill' | 
	 *             property='-fx-bar-fill' | 
	 *             property='-fx-bar-stroke' | 
	 *             property='-fx-bottom-shelf-fill' | 
	 *             property='-fx-bottom-shelf-stroke' | 
	 *             property='-fx-side-shelf-fill' | 
	 *             property='-fx-side-shelf-stroke' | 
	 *             property='-fx-zero-shelf-fill' | 
	 *             property='-fx-zero-shelf-stroke' | 
	 *             property='-fx-chart-background-fill' | 
	 *             property='-fx-chart-background-stroke' | 
	 *             property='-fx-hover-stroke' | 
	 *             property='-fx-title-fill' | 
	 *             property='-fx-pie-label-fill' | 
	 *             property='-fx-pie-stroke' | 
	 *             property='-fx-pie-to-label-line-stroke' | 
	 *             property='-fx-pie-value-label-fill' | 
	 *             property='-fx-horizontal-alternate-row-fill' | 
	 *             property='-fx-plot-background-fill' | 
	 *             property='-fx-horizontal-grid-line-stroke' | 
	 *             property='-fx-plot-background-stroke' | 
	 *             property='-fx-vertical-alternate-row-fill' | 
	 *             property='-fx-vertical-grid-line-stroke' | 
	 *             property='-fx-axis-stroke' | 
	 *             property='-fx-tick-label-fill' | 
	 *             property='-fx-label-fill' | 
	 *             property='-fx-tick-mark-stroke' | 
	 *             property='-fx-hover-fill'
	 *         ) 
	 *         value=Paint
	 *     )
	 *
	 * Features:
	 *    property[0, 30]
	 *    value[1, 1]
	 */
	protected void sequence_fx_paint_property_fx_paint_property(EObject context, fx_paint_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-background-image-position' | property='-fx-background-position') values+=BgPosition values+=BgPosition*)
	 *
	 * Features:
	 *    property[0, 2]
	 *    values[1, *]
	 */
	protected void sequence_fx_position_property_fx_position_property(EObject context, fx_position_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (property='-fx-background-image-repeat' | property='-fx-border-image-repeat' | property='-fx-background-repeat') 
	 *         values+=RepeatStyle 
	 *         values+=RepeatStyle*
	 *     )
	 *
	 * Features:
	 *    property[0, 3]
	 *    values[1, *]
	 */
	protected void sequence_fx_repeat_properties_fx_repeat_properties(EObject context, fx_repeat_properties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-legend-side' | property='-fx-title-side' | property='-fx-side') (value='top' | value='bottom' | value='left' | value='right'))
	 *
	 * Features:
	 *    property[0, 3]
	 *    value[0, 4]
	 */
	protected void sequence_fx_side_property_fx_side_property(EObject context, fx_side_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property='-fx-stroke-dash-array' values+=SIZE)
	 *
	 * Features:
	 *    property[1, 1]
	 *    values[1, 1]
	 */
	protected void sequence_fx_size_properties_fx_size_properties(EObject context, fx_size_properties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (
	 *             property='-fx-spacing' | 
	 *             property='-fx-arc-height' | 
	 *             property='-fx-arc-width' | 
	 *             property='-fx-minor-tick-length' | 
	 *             property='-fx-stroke-width' | 
	 *             property='-fx-start-margin' | 
	 *             property='-fx-end-margin' | 
	 *             property='-fx-tick-mark-stroke-width' | 
	 *             property='-fx-tick-mark-length' | 
	 *             property='-fx-tick-label-tick-gap' | 
	 *             property='-fx-axis-stroke-width' | 
	 *             property='-fx-label-tick-gap' | 
	 *             property='-fx-vertical-grid-line-stroke-width' | 
	 *             property='-fx-plot-background-stroke-width' | 
	 *             property='-fx-horizontal-grid-line-stroke-width' | 
	 *             property='-fx-pie-thickness' | 
	 *             property='-fx-pie-stroke-width' | 
	 *             property='-fx-title-gap' | 
	 *             property='-fx-legend-gap' | 
	 *             property='-fx-hover-stroke-width' | 
	 *             property='-fx-chart-background-stroke-width' | 
	 *             property='-fx-offset-y' | 
	 *             property='-fx-offset-x' | 
	 *             property='-fx-category-gap' | 
	 *             property='-fx-bar-gap' | 
	 *             property='-fx-graphic-text-gap' | 
	 *             property='-fx-tab-spacing'
	 *         ) 
	 *         value=SIZE
	 *     )
	 *
	 * Features:
	 *    property[0, 27]
	 *    value[1, 1]
	 */
	protected void sequence_fx_size_property_fx_size_property(EObject context, fx_size_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-skin' | property='-fx-shape' | property='-fx-text' | property='-fx-echo-char') value=STRING?)
	 *
	 * Features:
	 *    property[0, 4]
	 *    value[0, 1]
	 */
	protected void sequence_fx_string_property_fx_string_property(EObject context, fx_string_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property='-fx-stroke-line-cap' (value='square' | value='butt' | value='round'))
	 *
	 * Features:
	 *    property[1, 1]
	 *    value[0, 3]
	 */
	protected void sequence_fx_stroke_line_cap_property_fx_stroke_line_cap_property(EObject context, fx_stroke_line_cap_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property='-fx-stroke-line-join' (value='miter' | value='bevel' | value='round'))
	 *
	 * Features:
	 *    property[1, 1]
	 *    value[0, 3]
	 */
	protected void sequence_fx_stroke_line_join_property_fx_stroke_line_join_property(EObject context, fx_stroke_line_join_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (property='-fx-text-origin' (value='baseline' | value='top' | value='bottom'))
	 *
	 * Features:
	 *    property[1, 1]
	 *    value[0, 3]
	 */
	protected void sequence_fx_text_origin_property_fx_text_origin_property(EObject context, fx_text_origin_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         property='-fx-text-overrun' 
	 *         (
	 *             value='center-ellipses' | 
	 *             value='center-word-ellipses' | 
	 *             value='clip' | 
	 *             value='ellipses' | 
	 *             value='leading-ellipses' | 
	 *             value='leading-word-ellipses' | 
	 *             value='word-ellipses'
	 *         )
	 *     )
	 *
	 * Features:
	 *    property[1, 1]
	 *    value[0, 7]
	 */
	protected void sequence_fx_text_overrun_property_fx_text_overrun_property(EObject context, fx_text_overrun_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-background-image' | property='-fx-border-image') values+=URLType values+=URLType*)
	 *
	 * Features:
	 *    property[0, 2]
	 *    values[1, *]
	 */
	protected void sequence_fx_url_properties_fx_url_properties(EObject context, fx_url_properties semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-image' | property='-fx-graphic' | property='-fx-border-image-source') value=URLType)
	 *
	 * Features:
	 *    property[0, 3]
	 *    value[1, 1]
	 */
	protected void sequence_fx_url_property_fx_url_property(EObject context, fx_url_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((property='-fx-vpos' | property='-fx-node-vpos' | property='-fx-graphic-vpos') value=VPosition)
	 *
	 * Features:
	 *    property[0, 3]
	 *    value[1, 1]
	 */
	protected void sequence_fx_vposition_property_fx_vposition_property(EObject context, fx_vposition_property semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (medialist=media_list rulesets+=ruleset*)
	 *
	 * Features:
	 *    medialist[1, 1]
	 *    rulesets[0, *]
	 */
	protected void sequence_media_media(EObject context, media semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (selectors+=selector selectors+=selector* declarations+=css_declaration*)
	 *
	 * Features:
	 *    selectors[1, *]
	 *    declarations[0, *]
	 */
	protected void sequence_ruleset_ruleset(EObject context, ruleset semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (simpleselectors+=simple_selector (selector=selector | selector=selector?)?)
	 *
	 * Features:
	 *    simpleselectors[1, 1]
	 *    selector[0, 2]
	 */
	protected void sequence_selector_selector(EObject context, selector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (element=element_name id=css_id? class=css_class? pseudoclasses+=css_pseudo*) | 
	 *         (id=css_id class=css_class? pseudoclasses+=css_pseudo*) | 
	 *         (class=css_class pseudoclasses+=css_pseudo*) | 
	 *         pseudoclasses+=css_pseudo+
	 *     )
	 *
	 * Features:
	 *    element[1, 1]
	 *         MANDATORY_IF_SET id
	 *         MANDATORY_IF_SET class
	 *         MANDATORY_IF_SET pseudoclasses
	 *         EXCLUDE_IF_SET id
	 *         EXCLUDE_IF_SET class
	 *         EXCLUDE_IF_SET pseudoclasses
	 *         EXCLUDE_IF_SET class
	 *         EXCLUDE_IF_SET pseudoclasses
	 *         EXCLUDE_IF_SET pseudoclasses
	 *    id[1, 2]
	 *         EXCLUDE_IF_SET class
	 *         EXCLUDE_IF_SET pseudoclasses
	 *         EXCLUDE_IF_SET pseudoclasses
	 *    class[1, 3]
	 *         EXCLUDE_IF_SET pseudoclasses
	 *    pseudoclasses[0, *]
	 */
	protected void sequence_simple_selector_simple_selector(EObject context, simple_selector semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ruleset+=ruleset | media+=media)*
	 *
	 * Features:
	 *    ruleset[0, *]
	 *    media[0, *]
	 */
	protected void sequence_stylesheet_stylesheet(EObject context, stylesheet semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
