package at.bestsolution.efxclipse.tooling.css.serializer;

import at.bestsolution.efxclipse.tooling.css.services.CssDslGrammarAccess;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("restriction")
public class AbstractCssDslSyntacticSequencer extends AbstractSyntacticSequencer {

	protected CssDslGrammarAccess grammarAccess;
	protected AbstractElementAlias match_BgPosition_WSTerminalRuleCall_1_a;
	protected AbstractElementAlias match_Dim4Size_WSTerminalRuleCall_1_1_a;
	protected AbstractElementAlias match_Dim4Size_WSTerminalRuleCall_1_3_a;
	protected AbstractElementAlias match_Dim4Size_WSTerminalRuleCall_1_5_a;
	protected AbstractElementAlias match_EffectDropShadow_WSTerminalRuleCall_15_a;
	protected AbstractElementAlias match_EffectDropShadow_WSTerminalRuleCall_1_a_LeftParenthesisKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_EffectInnerShadow_WSTerminalRuleCall_15_a;
	protected AbstractElementAlias match_EffectInnerShadow_WSTerminalRuleCall_1_a_LeftParenthesisKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_FONT_WSTerminalRuleCall_0_1_p;
	protected AbstractElementAlias match_FONT_WSTerminalRuleCall_2_a;
	protected AbstractElementAlias match_LinearGradient_RightParenthesisKeyword_17_3_WSTerminalRuleCall_17_0_a;
	protected AbstractElementAlias match_LinearGradient_WSTerminalRuleCall_15_a_StopsKeyword_16_WSTerminalRuleCall_17_0_a;
	protected AbstractElementAlias match_LinearGradient_WSTerminalRuleCall_1_a;
	protected AbstractElementAlias match_LinearGradient_WSTerminalRuleCall_7_a_ToKeyword_8_WSTerminalRuleCall_9_a;
	protected AbstractElementAlias match_RGBColor_WSTerminalRuleCall_1_2_a;
	protected AbstractElementAlias match_RGBColor_WSTerminalRuleCall_1_8_a;
	protected AbstractElementAlias match_RadialGradient_RightParenthesisKeyword_7_3_WSTerminalRuleCall_7_0_a;
	protected AbstractElementAlias match_RadialGradient_WSTerminalRuleCall_1_a;
	protected AbstractElementAlias match_RadialGradient_WSTerminalRuleCall_4_0_a_FocusKeyword_4_1_WSTerminalRuleCall_4_2_a_LeftParenthesisKeyword_4_3_WSTerminalRuleCall_4_4_a;
	protected AbstractElementAlias match_RadialGradient_WSTerminalRuleCall_4_8_a_RightParenthesisKeyword_4_9_WSTerminalRuleCall_5_a_StopsKeyword_6_WSTerminalRuleCall_7_0_a;
	protected AbstractElementAlias match_RepeatStyle_WSTerminalRuleCall_1_1_0_p;
	protected AbstractElementAlias match_SizeFill_WSTerminalRuleCall_1_a;
	protected AbstractElementAlias match_SizeFill_WSTerminalRuleCall_1_p;
	protected AbstractElementAlias match_css_generic_declaration_WSTerminalRuleCall_2_a;
	protected AbstractElementAlias match_fx_alignment_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_background_image_size_property_WSTerminalRuleCall_1_a;
	protected AbstractElementAlias match_fx_background_image_size_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p;
	protected AbstractElementAlias match_fx_bar_policy_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_blend_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_boolean_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_border_image_slice_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p;
	protected AbstractElementAlias match_fx_border_style_property_WSTerminalRuleCall_1_a;
	protected AbstractElementAlias match_fx_color_property_WSTerminalRuleCall_1_a;
	protected AbstractElementAlias match_fx_color_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p;
	protected AbstractElementAlias match_fx_cursor_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_effect_property_WSTerminalRuleCall_1_a;
	protected AbstractElementAlias match_fx_effect_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p;
	protected AbstractElementAlias match_fx_font_family_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_font_property_WSTerminalRuleCall_1_a;
	protected AbstractElementAlias match_fx_font_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p;
	protected AbstractElementAlias match_fx_font_size_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_font_style_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p;
	protected AbstractElementAlias match_fx_font_weight_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p;
	protected AbstractElementAlias match_fx_hposition_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_insets_property_WSTerminalRuleCall_0_1_a_ColonKeyword_0_2_WSTerminalRuleCall_0_3_a;
	protected AbstractElementAlias match_fx_insets_property_WSTerminalRuleCall_1_1_p;
	protected AbstractElementAlias match_fx_insets_property_WSTerminalRuleCall_1_3_p;
	protected AbstractElementAlias match_fx_insets_property_WSTerminalRuleCall_1_5_p;
	protected AbstractElementAlias match_fx_integer_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_multi_paint_properties_WSTerminalRuleCall_1_a;
	protected AbstractElementAlias match_fx_multi_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_multi_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p;
	protected AbstractElementAlias match_fx_multi_paint_properties_WSTerminalRuleCall_4_0_1_a;
	protected AbstractElementAlias match_fx_multi_paint_properties_WSTerminalRuleCall_4_0_1_p;
	protected AbstractElementAlias match_fx_multisize_properties_WSTerminalRuleCall_1_a;
	protected AbstractElementAlias match_fx_multisize_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p;
	protected AbstractElementAlias match_fx_multisize_property_WSTerminalRuleCall_1_a;
	protected AbstractElementAlias match_fx_multisize_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p;
	protected AbstractElementAlias match_fx_number_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_number_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_paint_properties_WSTerminalRuleCall_1_a;
	protected AbstractElementAlias match_fx_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p;
	protected AbstractElementAlias match_fx_paint_properties_WSTerminalRuleCall_4_0_1_2_p;
	protected AbstractElementAlias match_fx_paint_property_WSTerminalRuleCall_1_a;
	protected AbstractElementAlias match_fx_paint_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p;
	protected AbstractElementAlias match_fx_position_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p;
	protected AbstractElementAlias match_fx_repeat_properties_WSTerminalRuleCall_1_a;
	protected AbstractElementAlias match_fx_repeat_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p;
	protected AbstractElementAlias match_fx_side_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_size_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_size_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_string_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_stroke_line_cap_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_stroke_line_join_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_text_origin_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_text_overrun_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_url_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_url_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_fx_vposition_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a;
	protected AbstractElementAlias match_media_WSTerminalRuleCall_1_a;
	protected AbstractElementAlias match_media_WSTerminalRuleCall_4_a_RightCurlyBracketKeyword_6_WSTerminalRuleCall_7_p;
	protected AbstractElementAlias match_media_WSTerminalRuleCall_4_p;
	protected AbstractElementAlias match_media_WSTerminalRuleCall_7_p;
	protected AbstractElementAlias match_ruleset_WSTerminalRuleCall_3_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p;
	protected AbstractElementAlias match_ruleset_WSTerminalRuleCall_4_2_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (CssDslGrammarAccess) access;
		match_BgPosition_WSTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getBgPositionAccess().getWSTerminalRuleCall_1());
		match_Dim4Size_WSTerminalRuleCall_1_1_a = new TokenAlias(true, true, grammarAccess.getDim4SizeAccess().getWSTerminalRuleCall_1_1());
		match_Dim4Size_WSTerminalRuleCall_1_3_a = new TokenAlias(true, true, grammarAccess.getDim4SizeAccess().getWSTerminalRuleCall_1_3());
		match_Dim4Size_WSTerminalRuleCall_1_5_a = new TokenAlias(true, true, grammarAccess.getDim4SizeAccess().getWSTerminalRuleCall_1_5());
		match_EffectDropShadow_WSTerminalRuleCall_15_a = new TokenAlias(true, true, grammarAccess.getEffectDropShadowAccess().getWSTerminalRuleCall_15());
		match_EffectDropShadow_WSTerminalRuleCall_1_a_LeftParenthesisKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getEffectDropShadowAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getEffectDropShadowAccess().getLeftParenthesisKeyword_2()), new TokenAlias(true, true, grammarAccess.getEffectDropShadowAccess().getWSTerminalRuleCall_3()));
		match_EffectInnerShadow_WSTerminalRuleCall_15_a = new TokenAlias(true, true, grammarAccess.getEffectInnerShadowAccess().getWSTerminalRuleCall_15());
		match_EffectInnerShadow_WSTerminalRuleCall_1_a_LeftParenthesisKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getEffectInnerShadowAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getEffectInnerShadowAccess().getLeftParenthesisKeyword_2()), new TokenAlias(true, true, grammarAccess.getEffectInnerShadowAccess().getWSTerminalRuleCall_3()));
		match_FONT_WSTerminalRuleCall_0_1_p = new TokenAlias(false, true, grammarAccess.getFONTAccess().getWSTerminalRuleCall_0_1());
		match_FONT_WSTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getFONTAccess().getWSTerminalRuleCall_2());
		match_LinearGradient_RightParenthesisKeyword_17_3_WSTerminalRuleCall_17_0_a = new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getLinearGradientAccess().getRightParenthesisKeyword_17_3()), new TokenAlias(true, true, grammarAccess.getLinearGradientAccess().getWSTerminalRuleCall_17_0()));
		match_LinearGradient_WSTerminalRuleCall_15_a_StopsKeyword_16_WSTerminalRuleCall_17_0_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getLinearGradientAccess().getWSTerminalRuleCall_15()), new TokenAlias(false, false, grammarAccess.getLinearGradientAccess().getStopsKeyword_16()), new TokenAlias(true, true, grammarAccess.getLinearGradientAccess().getWSTerminalRuleCall_17_0()));
		match_LinearGradient_WSTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getLinearGradientAccess().getWSTerminalRuleCall_1());
		match_LinearGradient_WSTerminalRuleCall_7_a_ToKeyword_8_WSTerminalRuleCall_9_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getLinearGradientAccess().getWSTerminalRuleCall_7()), new TokenAlias(false, false, grammarAccess.getLinearGradientAccess().getToKeyword_8()), new TokenAlias(true, true, grammarAccess.getLinearGradientAccess().getWSTerminalRuleCall_9()));
		match_RGBColor_WSTerminalRuleCall_1_2_a = new TokenAlias(true, true, grammarAccess.getRGBColorAccess().getWSTerminalRuleCall_1_2());
		match_RGBColor_WSTerminalRuleCall_1_8_a = new TokenAlias(true, true, grammarAccess.getRGBColorAccess().getWSTerminalRuleCall_1_8());
		match_RadialGradient_RightParenthesisKeyword_7_3_WSTerminalRuleCall_7_0_a = new GroupAlias(false, false, new TokenAlias(false, false, grammarAccess.getRadialGradientAccess().getRightParenthesisKeyword_7_3()), new TokenAlias(true, true, grammarAccess.getRadialGradientAccess().getWSTerminalRuleCall_7_0()));
		match_RadialGradient_WSTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getRadialGradientAccess().getWSTerminalRuleCall_1());
		match_RadialGradient_WSTerminalRuleCall_4_0_a_FocusKeyword_4_1_WSTerminalRuleCall_4_2_a_LeftParenthesisKeyword_4_3_WSTerminalRuleCall_4_4_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getRadialGradientAccess().getWSTerminalRuleCall_4_0()), new TokenAlias(false, false, grammarAccess.getRadialGradientAccess().getFocusKeyword_4_1()), new TokenAlias(true, true, grammarAccess.getRadialGradientAccess().getWSTerminalRuleCall_4_2()), new TokenAlias(false, false, grammarAccess.getRadialGradientAccess().getLeftParenthesisKeyword_4_3()), new TokenAlias(true, true, grammarAccess.getRadialGradientAccess().getWSTerminalRuleCall_4_4()));
		match_RadialGradient_WSTerminalRuleCall_4_8_a_RightParenthesisKeyword_4_9_WSTerminalRuleCall_5_a_StopsKeyword_6_WSTerminalRuleCall_7_0_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getRadialGradientAccess().getWSTerminalRuleCall_4_8()), new TokenAlias(false, false, grammarAccess.getRadialGradientAccess().getRightParenthesisKeyword_4_9()), new TokenAlias(true, true, grammarAccess.getRadialGradientAccess().getWSTerminalRuleCall_5()), new TokenAlias(false, false, grammarAccess.getRadialGradientAccess().getStopsKeyword_6()), new TokenAlias(true, true, grammarAccess.getRadialGradientAccess().getWSTerminalRuleCall_7_0()));
		match_RepeatStyle_WSTerminalRuleCall_1_1_0_p = new TokenAlias(false, true, grammarAccess.getRepeatStyleAccess().getWSTerminalRuleCall_1_1_0());
		match_SizeFill_WSTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getSizeFillAccess().getWSTerminalRuleCall_1());
		match_SizeFill_WSTerminalRuleCall_1_p = new TokenAlias(false, true, grammarAccess.getSizeFillAccess().getWSTerminalRuleCall_1());
		match_css_generic_declaration_WSTerminalRuleCall_2_a = new TokenAlias(true, true, grammarAccess.getCss_generic_declarationAccess().getWSTerminalRuleCall_2());
		match_fx_alignment_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_alignment_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_alignment_propertyAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_alignment_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_background_image_size_property_WSTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getFx_background_image_size_propertyAccess().getWSTerminalRuleCall_1());
		match_fx_background_image_size_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_background_image_size_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_background_image_size_propertyAccess().getColonKeyword_2()), new TokenAlias(false, true, grammarAccess.getFx_background_image_size_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_bar_policy_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_bar_policy_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_bar_policy_propertyAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_bar_policy_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_blend_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_blend_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_blend_propertyAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_blend_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_boolean_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_boolean_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_boolean_propertyAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_boolean_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_border_image_slice_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_border_image_slice_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_border_image_slice_propertyAccess().getColonKeyword_2()), new TokenAlias(false, true, grammarAccess.getFx_border_image_slice_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_border_style_property_WSTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getFx_border_style_propertyAccess().getWSTerminalRuleCall_1());
		match_fx_color_property_WSTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getFx_color_propertyAccess().getWSTerminalRuleCall_1());
		match_fx_color_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_color_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_color_propertyAccess().getColonKeyword_2()), new TokenAlias(false, true, grammarAccess.getFx_color_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_cursor_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_cursor_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_cursor_propertyAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_cursor_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_effect_property_WSTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getFx_effect_propertyAccess().getWSTerminalRuleCall_1());
		match_fx_effect_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_effect_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_effect_propertyAccess().getColonKeyword_2()), new TokenAlias(false, true, grammarAccess.getFx_effect_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_font_family_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_font_family_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_font_family_propertyAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_font_family_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_font_property_WSTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getFx_font_propertyAccess().getWSTerminalRuleCall_1());
		match_fx_font_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_font_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_font_propertyAccess().getColonKeyword_2()), new TokenAlias(false, true, grammarAccess.getFx_font_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_font_size_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_font_size_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_font_size_propertyAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_font_size_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_font_style_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_font_style_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_font_style_propertyAccess().getColonKeyword_2()), new TokenAlias(false, true, grammarAccess.getFx_font_style_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_font_weight_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_font_weight_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_font_weight_propertyAccess().getColonKeyword_2()), new TokenAlias(false, true, grammarAccess.getFx_font_weight_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_hposition_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_hposition_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_hposition_propertyAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_hposition_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_insets_property_WSTerminalRuleCall_0_1_a_ColonKeyword_0_2_WSTerminalRuleCall_0_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_insets_propertyAccess().getWSTerminalRuleCall_0_1()), new TokenAlias(false, false, grammarAccess.getFx_insets_propertyAccess().getColonKeyword_0_2()), new TokenAlias(true, true, grammarAccess.getFx_insets_propertyAccess().getWSTerminalRuleCall_0_3()));
		match_fx_insets_property_WSTerminalRuleCall_1_1_p = new TokenAlias(false, true, grammarAccess.getFx_insets_propertyAccess().getWSTerminalRuleCall_1_1());
		match_fx_insets_property_WSTerminalRuleCall_1_3_p = new TokenAlias(false, true, grammarAccess.getFx_insets_propertyAccess().getWSTerminalRuleCall_1_3());
		match_fx_insets_property_WSTerminalRuleCall_1_5_p = new TokenAlias(false, true, grammarAccess.getFx_insets_propertyAccess().getWSTerminalRuleCall_1_5());
		match_fx_integer_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_integer_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_integer_propertyAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_integer_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_multi_paint_properties_WSTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getFx_multi_paint_propertiesAccess().getWSTerminalRuleCall_1());
		match_fx_multi_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_multi_paint_propertiesAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_multi_paint_propertiesAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_multi_paint_propertiesAccess().getWSTerminalRuleCall_3()));
		match_fx_multi_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_multi_paint_propertiesAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_multi_paint_propertiesAccess().getColonKeyword_2()), new TokenAlias(false, true, grammarAccess.getFx_multi_paint_propertiesAccess().getWSTerminalRuleCall_3()));
		match_fx_multi_paint_properties_WSTerminalRuleCall_4_0_1_a = new TokenAlias(true, true, grammarAccess.getFx_multi_paint_propertiesAccess().getWSTerminalRuleCall_4_0_1());
		match_fx_multi_paint_properties_WSTerminalRuleCall_4_0_1_p = new TokenAlias(false, true, grammarAccess.getFx_multi_paint_propertiesAccess().getWSTerminalRuleCall_4_0_1());
		match_fx_multisize_properties_WSTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getFx_multisize_propertiesAccess().getWSTerminalRuleCall_1());
		match_fx_multisize_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_multisize_propertiesAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_multisize_propertiesAccess().getColonKeyword_2()), new TokenAlias(false, true, grammarAccess.getFx_multisize_propertiesAccess().getWSTerminalRuleCall_3()));
		match_fx_multisize_property_WSTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getFx_multisize_propertyAccess().getWSTerminalRuleCall_1());
		match_fx_multisize_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_multisize_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_multisize_propertyAccess().getColonKeyword_2()), new TokenAlias(false, true, grammarAccess.getFx_multisize_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_number_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_number_propertiesAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_number_propertiesAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_number_propertiesAccess().getWSTerminalRuleCall_3()));
		match_fx_number_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_number_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_number_propertyAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_number_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_paint_properties_WSTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getFx_paint_propertiesAccess().getWSTerminalRuleCall_1());
		match_fx_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_paint_propertiesAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_paint_propertiesAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_paint_propertiesAccess().getWSTerminalRuleCall_3()));
		match_fx_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_paint_propertiesAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_paint_propertiesAccess().getColonKeyword_2()), new TokenAlias(false, true, grammarAccess.getFx_paint_propertiesAccess().getWSTerminalRuleCall_3()));
		match_fx_paint_properties_WSTerminalRuleCall_4_0_1_2_p = new TokenAlias(false, true, grammarAccess.getFx_paint_propertiesAccess().getWSTerminalRuleCall_4_0_1_2());
		match_fx_paint_property_WSTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getFx_paint_propertyAccess().getWSTerminalRuleCall_1());
		match_fx_paint_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_paint_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_paint_propertyAccess().getColonKeyword_2()), new TokenAlias(false, true, grammarAccess.getFx_paint_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_position_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_position_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_position_propertyAccess().getColonKeyword_2()), new TokenAlias(false, true, grammarAccess.getFx_position_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_repeat_properties_WSTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getFx_repeat_propertiesAccess().getWSTerminalRuleCall_1());
		match_fx_repeat_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_repeat_propertiesAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_repeat_propertiesAccess().getColonKeyword_2()), new TokenAlias(false, true, grammarAccess.getFx_repeat_propertiesAccess().getWSTerminalRuleCall_3()));
		match_fx_side_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_side_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_side_propertyAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_side_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_size_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_size_propertiesAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_size_propertiesAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_size_propertiesAccess().getWSTerminalRuleCall_3()));
		match_fx_size_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_size_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_size_propertyAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_size_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_string_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_string_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_string_propertyAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_string_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_stroke_line_cap_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_stroke_line_cap_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_stroke_line_cap_propertyAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_stroke_line_cap_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_stroke_line_join_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_stroke_line_join_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_stroke_line_join_propertyAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_stroke_line_join_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_text_origin_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_text_origin_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_text_origin_propertyAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_text_origin_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_text_overrun_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_text_overrun_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_text_overrun_propertyAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_text_overrun_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_url_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_url_propertiesAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_url_propertiesAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_url_propertiesAccess().getWSTerminalRuleCall_3()));
		match_fx_url_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_url_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_url_propertyAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_url_propertyAccess().getWSTerminalRuleCall_3()));
		match_fx_vposition_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getFx_vposition_propertyAccess().getWSTerminalRuleCall_1()), new TokenAlias(false, false, grammarAccess.getFx_vposition_propertyAccess().getColonKeyword_2()), new TokenAlias(true, true, grammarAccess.getFx_vposition_propertyAccess().getWSTerminalRuleCall_3()));
		match_media_WSTerminalRuleCall_1_a = new TokenAlias(true, true, grammarAccess.getMediaAccess().getWSTerminalRuleCall_1());
		match_media_WSTerminalRuleCall_4_a_RightCurlyBracketKeyword_6_WSTerminalRuleCall_7_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getMediaAccess().getWSTerminalRuleCall_4()), new TokenAlias(false, false, grammarAccess.getMediaAccess().getRightCurlyBracketKeyword_6()), new TokenAlias(false, true, grammarAccess.getMediaAccess().getWSTerminalRuleCall_7()));
		match_media_WSTerminalRuleCall_4_p = new TokenAlias(false, true, grammarAccess.getMediaAccess().getWSTerminalRuleCall_4());
		match_media_WSTerminalRuleCall_7_p = new TokenAlias(false, true, grammarAccess.getMediaAccess().getWSTerminalRuleCall_7());
		match_ruleset_WSTerminalRuleCall_3_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getRulesetAccess().getWSTerminalRuleCall_3()), new TokenAlias(false, false, grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_5()), new TokenAlias(false, true, grammarAccess.getRulesetAccess().getWSTerminalRuleCall_6()));
		match_ruleset_WSTerminalRuleCall_4_2_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p = new GroupAlias(false, false, new TokenAlias(true, true, grammarAccess.getRulesetAccess().getWSTerminalRuleCall_4_2()), new TokenAlias(false, false, grammarAccess.getRulesetAccess().getRightCurlyBracketKeyword_5()), new TokenAlias(false, true, grammarAccess.getRulesetAccess().getWSTerminalRuleCall_6()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getCOMMARule())
			return getCOMMAToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getPERCENTAGERule())
			return getPERCENTAGEToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(ruleCall, node);
		else if(ruleCall.getRule() == grammarAccess.getCombinatorRule())
			return getcombinatorToken(ruleCall, node);
		return "";
	}
	
	protected String getCOMMAToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ",";
	}
	protected String getPERCENTAGEToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "%";
	}
	protected String getWSToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	protected String getcombinatorToken(RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "+";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (!transition.isSyntacticallyAmbiguous())
			return;
		if(match_BgPosition_WSTerminalRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_BgPosition_WSTerminalRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_Dim4Size_WSTerminalRuleCall_1_1_a.equals(transition.getAmbiguousSyntax()))
			emit_Dim4Size_WSTerminalRuleCall_1_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_Dim4Size_WSTerminalRuleCall_1_3_a.equals(transition.getAmbiguousSyntax()))
			emit_Dim4Size_WSTerminalRuleCall_1_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_Dim4Size_WSTerminalRuleCall_1_5_a.equals(transition.getAmbiguousSyntax()))
			emit_Dim4Size_WSTerminalRuleCall_1_5_a(semanticObject, transition, fromNode, toNode);
		else if(match_EffectDropShadow_WSTerminalRuleCall_15_a.equals(transition.getAmbiguousSyntax()))
			emit_EffectDropShadow_WSTerminalRuleCall_15_a(semanticObject, transition, fromNode, toNode);
		else if(match_EffectDropShadow_WSTerminalRuleCall_1_a_LeftParenthesisKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_EffectDropShadow_WSTerminalRuleCall_1_a_LeftParenthesisKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_EffectInnerShadow_WSTerminalRuleCall_15_a.equals(transition.getAmbiguousSyntax()))
			emit_EffectInnerShadow_WSTerminalRuleCall_15_a(semanticObject, transition, fromNode, toNode);
		else if(match_EffectInnerShadow_WSTerminalRuleCall_1_a_LeftParenthesisKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_EffectInnerShadow_WSTerminalRuleCall_1_a_LeftParenthesisKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_FONT_WSTerminalRuleCall_0_1_p.equals(transition.getAmbiguousSyntax()))
			emit_FONT_WSTerminalRuleCall_0_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_FONT_WSTerminalRuleCall_2_a.equals(transition.getAmbiguousSyntax()))
			emit_FONT_WSTerminalRuleCall_2_a(semanticObject, transition, fromNode, toNode);
		else if(match_LinearGradient_RightParenthesisKeyword_17_3_WSTerminalRuleCall_17_0_a.equals(transition.getAmbiguousSyntax()))
			emit_LinearGradient_RightParenthesisKeyword_17_3_WSTerminalRuleCall_17_0_a(semanticObject, transition, fromNode, toNode);
		else if(match_LinearGradient_WSTerminalRuleCall_15_a_StopsKeyword_16_WSTerminalRuleCall_17_0_a.equals(transition.getAmbiguousSyntax()))
			emit_LinearGradient_WSTerminalRuleCall_15_a_StopsKeyword_16_WSTerminalRuleCall_17_0_a(semanticObject, transition, fromNode, toNode);
		else if(match_LinearGradient_WSTerminalRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_LinearGradient_WSTerminalRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_LinearGradient_WSTerminalRuleCall_7_a_ToKeyword_8_WSTerminalRuleCall_9_a.equals(transition.getAmbiguousSyntax()))
			emit_LinearGradient_WSTerminalRuleCall_7_a_ToKeyword_8_WSTerminalRuleCall_9_a(semanticObject, transition, fromNode, toNode);
		else if(match_RGBColor_WSTerminalRuleCall_1_2_a.equals(transition.getAmbiguousSyntax()))
			emit_RGBColor_WSTerminalRuleCall_1_2_a(semanticObject, transition, fromNode, toNode);
		else if(match_RGBColor_WSTerminalRuleCall_1_8_a.equals(transition.getAmbiguousSyntax()))
			emit_RGBColor_WSTerminalRuleCall_1_8_a(semanticObject, transition, fromNode, toNode);
		else if(match_RadialGradient_RightParenthesisKeyword_7_3_WSTerminalRuleCall_7_0_a.equals(transition.getAmbiguousSyntax()))
			emit_RadialGradient_RightParenthesisKeyword_7_3_WSTerminalRuleCall_7_0_a(semanticObject, transition, fromNode, toNode);
		else if(match_RadialGradient_WSTerminalRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_RadialGradient_WSTerminalRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_RadialGradient_WSTerminalRuleCall_4_0_a_FocusKeyword_4_1_WSTerminalRuleCall_4_2_a_LeftParenthesisKeyword_4_3_WSTerminalRuleCall_4_4_a.equals(transition.getAmbiguousSyntax()))
			emit_RadialGradient_WSTerminalRuleCall_4_0_a_FocusKeyword_4_1_WSTerminalRuleCall_4_2_a_LeftParenthesisKeyword_4_3_WSTerminalRuleCall_4_4_a(semanticObject, transition, fromNode, toNode);
		else if(match_RadialGradient_WSTerminalRuleCall_4_8_a_RightParenthesisKeyword_4_9_WSTerminalRuleCall_5_a_StopsKeyword_6_WSTerminalRuleCall_7_0_a.equals(transition.getAmbiguousSyntax()))
			emit_RadialGradient_WSTerminalRuleCall_4_8_a_RightParenthesisKeyword_4_9_WSTerminalRuleCall_5_a_StopsKeyword_6_WSTerminalRuleCall_7_0_a(semanticObject, transition, fromNode, toNode);
		else if(match_RepeatStyle_WSTerminalRuleCall_1_1_0_p.equals(transition.getAmbiguousSyntax()))
			emit_RepeatStyle_WSTerminalRuleCall_1_1_0_p(semanticObject, transition, fromNode, toNode);
		else if(match_SizeFill_WSTerminalRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_SizeFill_WSTerminalRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_SizeFill_WSTerminalRuleCall_1_p.equals(transition.getAmbiguousSyntax()))
			emit_SizeFill_WSTerminalRuleCall_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_css_generic_declaration_WSTerminalRuleCall_2_a.equals(transition.getAmbiguousSyntax()))
			emit_css_generic_declaration_WSTerminalRuleCall_2_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_alignment_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_alignment_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_background_image_size_property_WSTerminalRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_background_image_size_property_WSTerminalRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_background_image_size_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p.equals(transition.getAmbiguousSyntax()))
			emit_fx_background_image_size_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_fx_bar_policy_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_bar_policy_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_blend_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_blend_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_boolean_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_boolean_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_border_image_slice_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p.equals(transition.getAmbiguousSyntax()))
			emit_fx_border_image_slice_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_fx_border_style_property_WSTerminalRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_border_style_property_WSTerminalRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_color_property_WSTerminalRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_color_property_WSTerminalRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_color_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p.equals(transition.getAmbiguousSyntax()))
			emit_fx_color_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_fx_cursor_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_cursor_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_effect_property_WSTerminalRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_effect_property_WSTerminalRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_effect_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p.equals(transition.getAmbiguousSyntax()))
			emit_fx_effect_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_fx_font_family_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_font_family_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_font_property_WSTerminalRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_font_property_WSTerminalRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_font_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p.equals(transition.getAmbiguousSyntax()))
			emit_fx_font_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_fx_font_size_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_font_size_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_font_style_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p.equals(transition.getAmbiguousSyntax()))
			emit_fx_font_style_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_fx_font_weight_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p.equals(transition.getAmbiguousSyntax()))
			emit_fx_font_weight_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_fx_hposition_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_hposition_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_insets_property_WSTerminalRuleCall_0_1_a_ColonKeyword_0_2_WSTerminalRuleCall_0_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_insets_property_WSTerminalRuleCall_0_1_a_ColonKeyword_0_2_WSTerminalRuleCall_0_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_insets_property_WSTerminalRuleCall_1_1_p.equals(transition.getAmbiguousSyntax()))
			emit_fx_insets_property_WSTerminalRuleCall_1_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_fx_insets_property_WSTerminalRuleCall_1_3_p.equals(transition.getAmbiguousSyntax()))
			emit_fx_insets_property_WSTerminalRuleCall_1_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_fx_insets_property_WSTerminalRuleCall_1_5_p.equals(transition.getAmbiguousSyntax()))
			emit_fx_insets_property_WSTerminalRuleCall_1_5_p(semanticObject, transition, fromNode, toNode);
		else if(match_fx_integer_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_integer_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_multi_paint_properties_WSTerminalRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_multi_paint_properties_WSTerminalRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_multi_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_multi_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_multi_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p.equals(transition.getAmbiguousSyntax()))
			emit_fx_multi_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_fx_multi_paint_properties_WSTerminalRuleCall_4_0_1_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_multi_paint_properties_WSTerminalRuleCall_4_0_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_multi_paint_properties_WSTerminalRuleCall_4_0_1_p.equals(transition.getAmbiguousSyntax()))
			emit_fx_multi_paint_properties_WSTerminalRuleCall_4_0_1_p(semanticObject, transition, fromNode, toNode);
		else if(match_fx_multisize_properties_WSTerminalRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_multisize_properties_WSTerminalRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_multisize_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p.equals(transition.getAmbiguousSyntax()))
			emit_fx_multisize_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_fx_multisize_property_WSTerminalRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_multisize_property_WSTerminalRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_multisize_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p.equals(transition.getAmbiguousSyntax()))
			emit_fx_multisize_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_fx_number_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_number_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_number_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_number_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_paint_properties_WSTerminalRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_paint_properties_WSTerminalRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p.equals(transition.getAmbiguousSyntax()))
			emit_fx_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_fx_paint_properties_WSTerminalRuleCall_4_0_1_2_p.equals(transition.getAmbiguousSyntax()))
			emit_fx_paint_properties_WSTerminalRuleCall_4_0_1_2_p(semanticObject, transition, fromNode, toNode);
		else if(match_fx_paint_property_WSTerminalRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_paint_property_WSTerminalRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_paint_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p.equals(transition.getAmbiguousSyntax()))
			emit_fx_paint_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_fx_position_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p.equals(transition.getAmbiguousSyntax()))
			emit_fx_position_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_fx_repeat_properties_WSTerminalRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_repeat_properties_WSTerminalRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_repeat_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p.equals(transition.getAmbiguousSyntax()))
			emit_fx_repeat_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(semanticObject, transition, fromNode, toNode);
		else if(match_fx_side_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_side_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_size_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_size_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_size_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_size_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_string_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_string_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_stroke_line_cap_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_stroke_line_cap_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_stroke_line_join_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_stroke_line_join_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_text_origin_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_text_origin_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_text_overrun_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_text_overrun_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_url_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_url_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_url_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_url_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_fx_vposition_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a.equals(transition.getAmbiguousSyntax()))
			emit_fx_vposition_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(semanticObject, transition, fromNode, toNode);
		else if(match_media_WSTerminalRuleCall_1_a.equals(transition.getAmbiguousSyntax()))
			emit_media_WSTerminalRuleCall_1_a(semanticObject, transition, fromNode, toNode);
		else if(match_media_WSTerminalRuleCall_4_a_RightCurlyBracketKeyword_6_WSTerminalRuleCall_7_p.equals(transition.getAmbiguousSyntax()))
			emit_media_WSTerminalRuleCall_4_a_RightCurlyBracketKeyword_6_WSTerminalRuleCall_7_p(semanticObject, transition, fromNode, toNode);
		else if(match_media_WSTerminalRuleCall_4_p.equals(transition.getAmbiguousSyntax()))
			emit_media_WSTerminalRuleCall_4_p(semanticObject, transition, fromNode, toNode);
		else if(match_media_WSTerminalRuleCall_7_p.equals(transition.getAmbiguousSyntax()))
			emit_media_WSTerminalRuleCall_7_p(semanticObject, transition, fromNode, toNode);
		else if(match_ruleset_WSTerminalRuleCall_3_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p.equals(transition.getAmbiguousSyntax()))
			emit_ruleset_WSTerminalRuleCall_3_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p(semanticObject, transition, fromNode, toNode);
		else if(match_ruleset_WSTerminalRuleCall_4_2_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p.equals(transition.getAmbiguousSyntax()))
			emit_ruleset_WSTerminalRuleCall_4_2_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p(semanticObject, transition, fromNode, toNode);
		else acceptNodes(transition, fromNode, toNode);
	}

	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_BgPosition_WSTerminalRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Dim4Size_WSTerminalRuleCall_1_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Dim4Size_WSTerminalRuleCall_1_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_Dim4Size_WSTerminalRuleCall_1_5_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_EffectDropShadow_WSTerminalRuleCall_15_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* '(' WS*
	 */
	protected void emit_EffectDropShadow_WSTerminalRuleCall_1_a_LeftParenthesisKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_EffectInnerShadow_WSTerminalRuleCall_15_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* '(' WS*
	 */
	protected void emit_EffectInnerShadow_WSTerminalRuleCall_1_a_LeftParenthesisKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_FONT_WSTerminalRuleCall_0_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_FONT_WSTerminalRuleCall_2_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ')' WS*
	 */
	protected void emit_LinearGradient_RightParenthesisKeyword_17_3_WSTerminalRuleCall_17_0_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* 'stops' WS*
	 */
	protected void emit_LinearGradient_WSTerminalRuleCall_15_a_StopsKeyword_16_WSTerminalRuleCall_17_0_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_LinearGradient_WSTerminalRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* 'to' WS*
	 */
	protected void emit_LinearGradient_WSTerminalRuleCall_7_a_ToKeyword_8_WSTerminalRuleCall_9_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_RGBColor_WSTerminalRuleCall_1_2_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_RGBColor_WSTerminalRuleCall_1_8_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     ')' WS*
	 */
	protected void emit_RadialGradient_RightParenthesisKeyword_7_3_WSTerminalRuleCall_7_0_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_RadialGradient_WSTerminalRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* 'focus' WS* '(' WS*
	 */
	protected void emit_RadialGradient_WSTerminalRuleCall_4_0_a_FocusKeyword_4_1_WSTerminalRuleCall_4_2_a_LeftParenthesisKeyword_4_3_WSTerminalRuleCall_4_4_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ')' WS* 'stops' WS*
	 */
	protected void emit_RadialGradient_WSTerminalRuleCall_4_8_a_RightParenthesisKeyword_4_9_WSTerminalRuleCall_5_a_StopsKeyword_6_WSTerminalRuleCall_7_0_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_RepeatStyle_WSTerminalRuleCall_1_1_0_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_SizeFill_WSTerminalRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_SizeFill_WSTerminalRuleCall_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_css_generic_declaration_WSTerminalRuleCall_2_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_alignment_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_fx_background_image_size_property_WSTerminalRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS+
	 */
	protected void emit_fx_background_image_size_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_bar_policy_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_blend_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_boolean_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS+
	 */
	protected void emit_fx_border_image_slice_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_fx_border_style_property_WSTerminalRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_fx_color_property_WSTerminalRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS+
	 */
	protected void emit_fx_color_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_cursor_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_fx_effect_property_WSTerminalRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS+
	 */
	protected void emit_fx_effect_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_font_family_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_fx_font_property_WSTerminalRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS+
	 */
	protected void emit_fx_font_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_font_size_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS+
	 */
	protected void emit_fx_font_style_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS+
	 */
	protected void emit_fx_font_weight_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_hposition_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_insets_property_WSTerminalRuleCall_0_1_a_ColonKeyword_0_2_WSTerminalRuleCall_0_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_fx_insets_property_WSTerminalRuleCall_1_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_fx_insets_property_WSTerminalRuleCall_1_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_fx_insets_property_WSTerminalRuleCall_1_5_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_integer_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_fx_multi_paint_properties_WSTerminalRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_multi_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS+
	 */
	protected void emit_fx_multi_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_fx_multi_paint_properties_WSTerminalRuleCall_4_0_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_fx_multi_paint_properties_WSTerminalRuleCall_4_0_1_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_fx_multisize_properties_WSTerminalRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS+
	 */
	protected void emit_fx_multisize_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_fx_multisize_property_WSTerminalRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS+
	 */
	protected void emit_fx_multisize_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_number_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_number_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_fx_paint_properties_WSTerminalRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS+
	 */
	protected void emit_fx_paint_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_fx_paint_properties_WSTerminalRuleCall_4_0_1_2_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_fx_paint_property_WSTerminalRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS+
	 */
	protected void emit_fx_paint_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS+
	 */
	protected void emit_fx_position_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_fx_repeat_properties_WSTerminalRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS+
	 */
	protected void emit_fx_repeat_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_side_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_size_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_size_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_string_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_stroke_line_cap_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_stroke_line_join_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_text_origin_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_text_overrun_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_url_properties_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_url_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* ':' WS*
	 */
	protected void emit_fx_vposition_property_WSTerminalRuleCall_1_a_ColonKeyword_2_WSTerminalRuleCall_3_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS*
	 */
	protected void emit_media_WSTerminalRuleCall_1_a(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* '}' WS+
	 */
	protected void emit_media_WSTerminalRuleCall_4_a_RightCurlyBracketKeyword_6_WSTerminalRuleCall_7_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_media_WSTerminalRuleCall_4_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS+
	 */
	protected void emit_media_WSTerminalRuleCall_7_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* '}' WS+
	 */
	protected void emit_ruleset_WSTerminalRuleCall_3_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
	/**
	 * Syntax:
	 *     WS* '}' WS+
	 */
	protected void emit_ruleset_WSTerminalRuleCall_4_2_a_RightCurlyBracketKeyword_5_WSTerminalRuleCall_6_p(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		acceptNodes(transition, fromNode, toNode);
	}
	
}
