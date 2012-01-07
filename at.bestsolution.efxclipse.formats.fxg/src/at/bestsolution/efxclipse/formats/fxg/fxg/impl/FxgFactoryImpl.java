/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg.impl;

import at.bestsolution.efxclipse.formats.fxg.fxg.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FxgFactoryImpl extends EFactoryImpl implements FxgFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FxgFactory init() {
		try {
			FxgFactory theFxgFactory = (FxgFactory)EPackage.Registry.INSTANCE.getEFactory("http://ns.adobe.com/fxg/2008"); 
			if (theFxgFactory != null) {
				return theFxgFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FxgFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxgFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FxgPackage.GRAPHIC: return createGraphic();
			case FxgPackage.LIBRARY: return createLibrary();
			case FxgPackage.PRIVATE: return createPrivate();
			case FxgPackage.DEFINITION: return createDefinition();
			case FxgPackage.GROUP: return createGroup();
			case FxgPackage.TRANSFORM: return createTransform();
			case FxgPackage.PLACE_OBJECT: return createPlaceObject();
			case FxgPackage.MATRIX: return createMatrix();
			case FxgPackage.PATH: return createPath();
			case FxgPackage.RECT: return createRect();
			case FxgPackage.ELLIPSE: return createEllipse();
			case FxgPackage.LINE: return createLine();
			case FxgPackage.RICH_TEXT: return createRichText();
			case FxgPackage.RICH_TEXT_CONTENT_CONTAINER: return createRichTextContentContainer();
			case FxgPackage.RAWTEXT: return createrawtext();
			case FxgPackage.DIV: return creatediv();
			case FxgPackage.P: return createp();
			case FxgPackage.TCY: return createtcy();
			case FxgPackage.A: return createa();
			case FxgPackage.IMG: return createimg();
			case FxgPackage.SPAN: return createspan();
			case FxgPackage.BR: return createbr();
			case FxgPackage.TAB: return createtab();
			case FxgPackage.LINK_NORMAL_FORMAT: return createlinkNormalFormat();
			case FxgPackage.LINK_HOVER_FORMAT: return createlinkHoverFormat();
			case FxgPackage.LINK_ACTIVE_FORMAT: return createlinkActiveFormat();
			case FxgPackage.BITMAP_IMAGE: return createBitmapImage();
			case FxgPackage.SOLID_COLOR: return createSolidColor();
			case FxgPackage.LINEAR_GRADIENT: return createLinearGradient();
			case FxgPackage.RADIAL_GRADIENT: return createRadialGradient();
			case FxgPackage.BITMAP_FILL: return createBitmapFill();
			case FxgPackage.SOLID_COLOR_STROKE: return createSolidColorStroke();
			case FxgPackage.LINEAR_GRADIENT_STROKE: return createLinearGradientStroke();
			case FxgPackage.RADIAL_GRADIENT_STROKE: return createRadialGradientStroke();
			case FxgPackage.GRADIENT_ENTRY: return createGradientEntry();
			case FxgPackage.COLOR_TRANSFORM: return createColorTransform();
			case FxgPackage.BLUR_FILTER: return createBlurFilter();
			case FxgPackage.DROP_SHADOW_FILTER: return createDropShadowFilter();
			case FxgPackage.BEVEL_FILTER: return createBevelFilter();
			case FxgPackage.GRADIENT_GLOW_FILTER: return createGradientGlowFilter();
			case FxgPackage.GRADIENT_BEVEL_FILTER: return createGradientBevelFilter();
			case FxgPackage.COLOR_MATRIX_FILTER: return createColorMatrixFilter();
			case FxgPackage.CONTAINER_ELEMENT: return createContainerElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FxgPackage.BLEND_MODE:
				return createBlendModeFromString(eDataType, initialValue);
			case FxgPackage.WINDING:
				return createWindingFromString(eDataType, initialValue);
			case FxgPackage.MASK_TYPE:
				return createMaskTypeFromString(eDataType, initialValue);
			case FxgPackage.FONT_STYLE:
				return createFontStyleFromString(eDataType, initialValue);
			case FxgPackage.FONT_WEIGHT:
				return createFontWeightFromString(eDataType, initialValue);
			case FxgPackage.TEXT_DECORATION:
				return createTextDecorationFromString(eDataType, initialValue);
			case FxgPackage.WHITESPACE_COLLAPSE:
				return createWhitespaceCollapseFromString(eDataType, initialValue);
			case FxgPackage.KERNING:
				return createKerningFromString(eDataType, initialValue);
			case FxgPackage.SPREAD_METHOD:
				return createSpreadMethodFromString(eDataType, initialValue);
			case FxgPackage.INTERPOLATION_METHOD:
				return createInterpolationMethodFromString(eDataType, initialValue);
			case FxgPackage.CAP:
				return createCapFromString(eDataType, initialValue);
			case FxgPackage.JOINT:
				return createJointFromString(eDataType, initialValue);
			case FxgPackage.SCALE_MODE:
				return createScaleModeFromString(eDataType, initialValue);
			case FxgPackage.BEVEL_FILTER_TYPE:
				return createBevelFilterTypeFromString(eDataType, initialValue);
			case FxgPackage.FILL_MODE:
				return createFillModeFromString(eDataType, initialValue);
			case FxgPackage.TEXT_ALIGN:
				return createTextAlignFromString(eDataType, initialValue);
			case FxgPackage.JUSTIFICATION_RULE:
				return createJustificationRuleFromString(eDataType, initialValue);
			case FxgPackage.JUSTIFICATION_STYLE:
				return createJustificationStyleFromString(eDataType, initialValue);
			case FxgPackage.TEXT_JUSTIFY:
				return createTextJustifyFromString(eDataType, initialValue);
			case FxgPackage.LEADING_MODEL:
				return createLeadingModelFromString(eDataType, initialValue);
			case FxgPackage.BLOCK_PROGRESSION:
				return createBlockProgressionFromString(eDataType, initialValue);
			case FxgPackage.VERTICAL_ALIGN:
				return createVerticalAlignFromString(eDataType, initialValue);
			case FxgPackage.LINE_BREAK:
				return createLineBreakFromString(eDataType, initialValue);
			case FxgPackage.BREAK_OPPORTUNITY:
				return createBreakOpportunityFromString(eDataType, initialValue);
			case FxgPackage.DIGIT_CASE:
				return createDigitCaseFromString(eDataType, initialValue);
			case FxgPackage.DIGIT_WIDTH:
				return createDigitWidthFromString(eDataType, initialValue);
			case FxgPackage.DOMINANT_BASELINE:
				return createDominantBaselineFromString(eDataType, initialValue);
			case FxgPackage.ALIGNMENT_BASELINE:
				return createAlignmentBaselineFromString(eDataType, initialValue);
			case FxgPackage.LIGATURE_LEVEL:
				return createLigatureLevelFromString(eDataType, initialValue);
			case FxgPackage.TYPOGRAPHIC_CASE:
				return createTypographicCaseFromString(eDataType, initialValue);
			case FxgPackage.TEXT_ROTATION:
				return createTextRotationFromString(eDataType, initialValue);
			case FxgPackage.PATH_DATA:
				return createPathDataFromString(eDataType, initialValue);
			case FxgPackage.ANGLE:
				return createAngleFromString(eDataType, initialValue);
			case FxgPackage.LENGTH:
				return createLengthFromString(eDataType, initialValue);
			case FxgPackage.PERCENT:
				return createPercentFromString(eDataType, initialValue);
			case FxgPackage.COLOR:
				return createColorFromString(eDataType, initialValue);
			case FxgPackage.ALPHA:
				return createAlphaFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FxgPackage.BLEND_MODE:
				return convertBlendModeToString(eDataType, instanceValue);
			case FxgPackage.WINDING:
				return convertWindingToString(eDataType, instanceValue);
			case FxgPackage.MASK_TYPE:
				return convertMaskTypeToString(eDataType, instanceValue);
			case FxgPackage.FONT_STYLE:
				return convertFontStyleToString(eDataType, instanceValue);
			case FxgPackage.FONT_WEIGHT:
				return convertFontWeightToString(eDataType, instanceValue);
			case FxgPackage.TEXT_DECORATION:
				return convertTextDecorationToString(eDataType, instanceValue);
			case FxgPackage.WHITESPACE_COLLAPSE:
				return convertWhitespaceCollapseToString(eDataType, instanceValue);
			case FxgPackage.KERNING:
				return convertKerningToString(eDataType, instanceValue);
			case FxgPackage.SPREAD_METHOD:
				return convertSpreadMethodToString(eDataType, instanceValue);
			case FxgPackage.INTERPOLATION_METHOD:
				return convertInterpolationMethodToString(eDataType, instanceValue);
			case FxgPackage.CAP:
				return convertCapToString(eDataType, instanceValue);
			case FxgPackage.JOINT:
				return convertJointToString(eDataType, instanceValue);
			case FxgPackage.SCALE_MODE:
				return convertScaleModeToString(eDataType, instanceValue);
			case FxgPackage.BEVEL_FILTER_TYPE:
				return convertBevelFilterTypeToString(eDataType, instanceValue);
			case FxgPackage.FILL_MODE:
				return convertFillModeToString(eDataType, instanceValue);
			case FxgPackage.TEXT_ALIGN:
				return convertTextAlignToString(eDataType, instanceValue);
			case FxgPackage.JUSTIFICATION_RULE:
				return convertJustificationRuleToString(eDataType, instanceValue);
			case FxgPackage.JUSTIFICATION_STYLE:
				return convertJustificationStyleToString(eDataType, instanceValue);
			case FxgPackage.TEXT_JUSTIFY:
				return convertTextJustifyToString(eDataType, instanceValue);
			case FxgPackage.LEADING_MODEL:
				return convertLeadingModelToString(eDataType, instanceValue);
			case FxgPackage.BLOCK_PROGRESSION:
				return convertBlockProgressionToString(eDataType, instanceValue);
			case FxgPackage.VERTICAL_ALIGN:
				return convertVerticalAlignToString(eDataType, instanceValue);
			case FxgPackage.LINE_BREAK:
				return convertLineBreakToString(eDataType, instanceValue);
			case FxgPackage.BREAK_OPPORTUNITY:
				return convertBreakOpportunityToString(eDataType, instanceValue);
			case FxgPackage.DIGIT_CASE:
				return convertDigitCaseToString(eDataType, instanceValue);
			case FxgPackage.DIGIT_WIDTH:
				return convertDigitWidthToString(eDataType, instanceValue);
			case FxgPackage.DOMINANT_BASELINE:
				return convertDominantBaselineToString(eDataType, instanceValue);
			case FxgPackage.ALIGNMENT_BASELINE:
				return convertAlignmentBaselineToString(eDataType, instanceValue);
			case FxgPackage.LIGATURE_LEVEL:
				return convertLigatureLevelToString(eDataType, instanceValue);
			case FxgPackage.TYPOGRAPHIC_CASE:
				return convertTypographicCaseToString(eDataType, instanceValue);
			case FxgPackage.TEXT_ROTATION:
				return convertTextRotationToString(eDataType, instanceValue);
			case FxgPackage.PATH_DATA:
				return convertPathDataToString(eDataType, instanceValue);
			case FxgPackage.ANGLE:
				return convertAngleToString(eDataType, instanceValue);
			case FxgPackage.LENGTH:
				return convertLengthToString(eDataType, instanceValue);
			case FxgPackage.PERCENT:
				return convertPercentToString(eDataType, instanceValue);
			case FxgPackage.COLOR:
				return convertColorToString(eDataType, instanceValue);
			case FxgPackage.ALPHA:
				return convertAlphaToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graphic createGraphic() {
		GraphicImpl graphic = new GraphicImpl();
		return graphic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Library createLibrary() {
		LibraryImpl library = new LibraryImpl();
		return library;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Private createPrivate() {
		PrivateImpl private_ = new PrivateImpl();
		return private_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definition createDefinition() {
		DefinitionImpl definition = new DefinitionImpl();
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group createGroup() {
		GroupImpl group = new GroupImpl();
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transform createTransform() {
		TransformImpl transform = new TransformImpl();
		return transform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceObject createPlaceObject() {
		PlaceObjectImpl placeObject = new PlaceObjectImpl();
		return placeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Matrix createMatrix() {
		MatrixImpl matrix = new MatrixImpl();
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rect createRect() {
		RectImpl rect = new RectImpl();
		return rect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ellipse createEllipse() {
		EllipseImpl ellipse = new EllipseImpl();
		return ellipse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Line createLine() {
		LineImpl line = new LineImpl();
		return line;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichText createRichText() {
		RichTextImpl richText = new RichTextImpl();
		return richText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RichTextContentContainer createRichTextContentContainer() {
		RichTextContentContainerImpl richTextContentContainer = new RichTextContentContainerImpl();
		return richTextContentContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public rawtext createrawtext() {
		rawtextImpl rawtext = new rawtextImpl();
		return rawtext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public div creatediv() {
		divImpl div = new divImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public p createp() {
		pImpl p = new pImpl();
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tcy createtcy() {
		tcyImpl tcy = new tcyImpl();
		return tcy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public a createa() {
		aImpl a = new aImpl();
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public img createimg() {
		imgImpl img = new imgImpl();
		return img;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public span createspan() {
		spanImpl span = new spanImpl();
		return span;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public br createbr() {
		brImpl br = new brImpl();
		return br;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public tab createtab() {
		tabImpl tab = new tabImpl();
		return tab;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public linkNormalFormat createlinkNormalFormat() {
		linkNormalFormatImpl linkNormalFormat = new linkNormalFormatImpl();
		return linkNormalFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public linkHoverFormat createlinkHoverFormat() {
		linkHoverFormatImpl linkHoverFormat = new linkHoverFormatImpl();
		return linkHoverFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public linkActiveFormat createlinkActiveFormat() {
		linkActiveFormatImpl linkActiveFormat = new linkActiveFormatImpl();
		return linkActiveFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitmapImage createBitmapImage() {
		BitmapImageImpl bitmapImage = new BitmapImageImpl();
		return bitmapImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolidColor createSolidColor() {
		SolidColorImpl solidColor = new SolidColorImpl();
		return solidColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearGradient createLinearGradient() {
		LinearGradientImpl linearGradient = new LinearGradientImpl();
		return linearGradient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadialGradient createRadialGradient() {
		RadialGradientImpl radialGradient = new RadialGradientImpl();
		return radialGradient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BitmapFill createBitmapFill() {
		BitmapFillImpl bitmapFill = new BitmapFillImpl();
		return bitmapFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SolidColorStroke createSolidColorStroke() {
		SolidColorStrokeImpl solidColorStroke = new SolidColorStrokeImpl();
		return solidColorStroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinearGradientStroke createLinearGradientStroke() {
		LinearGradientStrokeImpl linearGradientStroke = new LinearGradientStrokeImpl();
		return linearGradientStroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RadialGradientStroke createRadialGradientStroke() {
		RadialGradientStrokeImpl radialGradientStroke = new RadialGradientStrokeImpl();
		return radialGradientStroke;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientEntry createGradientEntry() {
		GradientEntryImpl gradientEntry = new GradientEntryImpl();
		return gradientEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorTransform createColorTransform() {
		ColorTransformImpl colorTransform = new ColorTransformImpl();
		return colorTransform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlurFilter createBlurFilter() {
		BlurFilterImpl blurFilter = new BlurFilterImpl();
		return blurFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DropShadowFilter createDropShadowFilter() {
		DropShadowFilterImpl dropShadowFilter = new DropShadowFilterImpl();
		return dropShadowFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BevelFilter createBevelFilter() {
		BevelFilterImpl bevelFilter = new BevelFilterImpl();
		return bevelFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientGlowFilter createGradientGlowFilter() {
		GradientGlowFilterImpl gradientGlowFilter = new GradientGlowFilterImpl();
		return gradientGlowFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GradientBevelFilter createGradientBevelFilter() {
		GradientBevelFilterImpl gradientBevelFilter = new GradientBevelFilterImpl();
		return gradientBevelFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColorMatrixFilter createColorMatrixFilter() {
		ColorMatrixFilterImpl colorMatrixFilter = new ColorMatrixFilterImpl();
		return colorMatrixFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public <T extends FXGElement> ContainerElement<T> createContainerElement() {
		ContainerElementImpl<T> containerElement = new ContainerElementImpl<T>();
		return containerElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlendMode createBlendModeFromString(EDataType eDataType, String initialValue) {
		BlendMode result = BlendMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBlendModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Winding createWindingFromString(EDataType eDataType, String initialValue) {
		Winding result = Winding.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWindingToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaskType createMaskTypeFromString(EDataType eDataType, String initialValue) {
		MaskType result = MaskType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaskTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyle createFontStyleFromString(EDataType eDataType, String initialValue) {
		FontStyle result = FontStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontWeight createFontWeightFromString(EDataType eDataType, String initialValue) {
		FontWeight result = FontWeight.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontWeightToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextDecoration createTextDecorationFromString(EDataType eDataType, String initialValue) {
		TextDecoration result = TextDecoration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextDecorationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhitespaceCollapse createWhitespaceCollapseFromString(EDataType eDataType, String initialValue) {
		WhitespaceCollapse result = WhitespaceCollapse.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWhitespaceCollapseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Kerning createKerningFromString(EDataType eDataType, String initialValue) {
		Kerning result = Kerning.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertKerningToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpreadMethod createSpreadMethodFromString(EDataType eDataType, String initialValue) {
		SpreadMethod result = SpreadMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpreadMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpolationMethod createInterpolationMethodFromString(EDataType eDataType, String initialValue) {
		InterpolationMethod result = InterpolationMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInterpolationMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cap createCapFromString(EDataType eDataType, String initialValue) {
		Cap result = Cap.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Joint createJointFromString(EDataType eDataType, String initialValue) {
		Joint result = Joint.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJointToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScaleMode createScaleModeFromString(EDataType eDataType, String initialValue) {
		ScaleMode result = ScaleMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScaleModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BevelFilterType createBevelFilterTypeFromString(EDataType eDataType, String initialValue) {
		BevelFilterType result = BevelFilterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBevelFilterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillMode createFillModeFromString(EDataType eDataType, String initialValue) {
		FillMode result = FillMode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillModeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextAlign createTextAlignFromString(EDataType eDataType, String initialValue) {
		TextAlign result = TextAlign.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextAlignToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JustificationRule createJustificationRuleFromString(EDataType eDataType, String initialValue) {
		JustificationRule result = JustificationRule.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJustificationRuleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JustificationStyle createJustificationStyleFromString(EDataType eDataType, String initialValue) {
		JustificationStyle result = JustificationStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJustificationStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextJustify createTextJustifyFromString(EDataType eDataType, String initialValue) {
		TextJustify result = TextJustify.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextJustifyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LeadingModel createLeadingModelFromString(EDataType eDataType, String initialValue) {
		LeadingModel result = LeadingModel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLeadingModelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockProgression createBlockProgressionFromString(EDataType eDataType, String initialValue) {
		BlockProgression result = BlockProgression.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBlockProgressionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalAlign createVerticalAlignFromString(EDataType eDataType, String initialValue) {
		VerticalAlign result = VerticalAlign.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerticalAlignToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineBreak createLineBreakFromString(EDataType eDataType, String initialValue) {
		LineBreak result = LineBreak.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLineBreakToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BreakOpportunity createBreakOpportunityFromString(EDataType eDataType, String initialValue) {
		BreakOpportunity result = BreakOpportunity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBreakOpportunityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitCase createDigitCaseFromString(EDataType eDataType, String initialValue) {
		DigitCase result = DigitCase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDigitCaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DigitWidth createDigitWidthFromString(EDataType eDataType, String initialValue) {
		DigitWidth result = DigitWidth.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDigitWidthToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DominantBaseline createDominantBaselineFromString(EDataType eDataType, String initialValue) {
		DominantBaseline result = DominantBaseline.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDominantBaselineToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignmentBaseline createAlignmentBaselineFromString(EDataType eDataType, String initialValue) {
		AlignmentBaseline result = AlignmentBaseline.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignmentBaselineToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LigatureLevel createLigatureLevelFromString(EDataType eDataType, String initialValue) {
		LigatureLevel result = LigatureLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLigatureLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypographicCase createTypographicCaseFromString(EDataType eDataType, String initialValue) {
		TypographicCase result = TypographicCase.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTypographicCaseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TextRotation createTextRotationFromString(EDataType eDataType, String initialValue) {
		TextRotation result = TextRotation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTextRotationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPathDataFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPathDataToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAngleFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAngleToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createLengthFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLengthToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createPercentFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPercentToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createColorFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double createAlphaFromString(EDataType eDataType, String initialValue) {
		return (Double)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlphaToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxgPackage getFxgPackage() {
		return (FxgPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FxgPackage getPackage() {
		return FxgPackage.eINSTANCE;
	}

} //FxgFactoryImpl
