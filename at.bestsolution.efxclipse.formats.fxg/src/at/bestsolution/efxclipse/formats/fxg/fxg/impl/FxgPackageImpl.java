/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg.impl;

import at.bestsolution.efxclipse.formats.fxg.fxg.AlignmentBaseline;
import at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter;
import at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilterType;
import at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill;
import at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage;
import at.bestsolution.efxclipse.formats.fxg.fxg.BlendMode;
import at.bestsolution.efxclipse.formats.fxg.fxg.BlockProgression;
import at.bestsolution.efxclipse.formats.fxg.fxg.BlurFilter;
import at.bestsolution.efxclipse.formats.fxg.fxg.BreakOpportunity;
import at.bestsolution.efxclipse.formats.fxg.fxg.Cap;
import at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes;
import at.bestsolution.efxclipse.formats.fxg.fxg.ColorMatrixFilter;
import at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform;
import at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes;
import at.bestsolution.efxclipse.formats.fxg.fxg.ContainerElement;
import at.bestsolution.efxclipse.formats.fxg.fxg.Definition;
import at.bestsolution.efxclipse.formats.fxg.fxg.DigitCase;
import at.bestsolution.efxclipse.formats.fxg.fxg.DigitWidth;
import at.bestsolution.efxclipse.formats.fxg.fxg.DominantBaseline;
import at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter;
import at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse;
import at.bestsolution.efxclipse.formats.fxg.fxg.FXGElement;
import at.bestsolution.efxclipse.formats.fxg.fxg.Fill;
import at.bestsolution.efxclipse.formats.fxg.fxg.FillMode;
import at.bestsolution.efxclipse.formats.fxg.fxg.Filter;
import at.bestsolution.efxclipse.formats.fxg.fxg.FontStyle;
import at.bestsolution.efxclipse.formats.fxg.fxg.FontWeight;
import at.bestsolution.efxclipse.formats.fxg.fxg.FxgFactory;
import at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage;
import at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter;
import at.bestsolution.efxclipse.formats.fxg.fxg.GradientEntry;
import at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter;
import at.bestsolution.efxclipse.formats.fxg.fxg.Graphic;
import at.bestsolution.efxclipse.formats.fxg.fxg.Group;
import at.bestsolution.efxclipse.formats.fxg.fxg.InterpolationMethod;
import at.bestsolution.efxclipse.formats.fxg.fxg.Joint;
import at.bestsolution.efxclipse.formats.fxg.fxg.JustificationRule;
import at.bestsolution.efxclipse.formats.fxg.fxg.JustificationStyle;
import at.bestsolution.efxclipse.formats.fxg.fxg.Kerning;
import at.bestsolution.efxclipse.formats.fxg.fxg.LeadingModel;
import at.bestsolution.efxclipse.formats.fxg.fxg.Library;
import at.bestsolution.efxclipse.formats.fxg.fxg.LigatureLevel;
import at.bestsolution.efxclipse.formats.fxg.fxg.Line;
import at.bestsolution.efxclipse.formats.fxg.fxg.LineBreak;
import at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient;
import at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke;
import at.bestsolution.efxclipse.formats.fxg.fxg.MaskType;
import at.bestsolution.efxclipse.formats.fxg.fxg.Matrix;
import at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes;
import at.bestsolution.efxclipse.formats.fxg.fxg.Path;
import at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject;
import at.bestsolution.efxclipse.formats.fxg.fxg.Private;
import at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient;
import at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke;
import at.bestsolution.efxclipse.formats.fxg.fxg.Rect;
import at.bestsolution.efxclipse.formats.fxg.fxg.RichText;
import at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContent;
import at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContentContainer;
import at.bestsolution.efxclipse.formats.fxg.fxg.ScaleMode;
import at.bestsolution.efxclipse.formats.fxg.fxg.Shape;
import at.bestsolution.efxclipse.formats.fxg.fxg.SolidColor;
import at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke;
import at.bestsolution.efxclipse.formats.fxg.fxg.SpreadMethod;
import at.bestsolution.efxclipse.formats.fxg.fxg.Stroke;
import at.bestsolution.efxclipse.formats.fxg.fxg.TextAlign;
import at.bestsolution.efxclipse.formats.fxg.fxg.TextDecoration;
import at.bestsolution.efxclipse.formats.fxg.fxg.TextJustify;
import at.bestsolution.efxclipse.formats.fxg.fxg.TextRotation;
import at.bestsolution.efxclipse.formats.fxg.fxg.Transform;
import at.bestsolution.efxclipse.formats.fxg.fxg.TypographicCase;
import at.bestsolution.efxclipse.formats.fxg.fxg.VerticalAlign;
import at.bestsolution.efxclipse.formats.fxg.fxg.WhitespaceCollapse;
import at.bestsolution.efxclipse.formats.fxg.fxg.Winding;
import at.bestsolution.efxclipse.formats.fxg.fxg.a;
import at.bestsolution.efxclipse.formats.fxg.fxg.br;
import at.bestsolution.efxclipse.formats.fxg.fxg.div;
import at.bestsolution.efxclipse.formats.fxg.fxg.img;
import at.bestsolution.efxclipse.formats.fxg.fxg.linkActiveFormat;
import at.bestsolution.efxclipse.formats.fxg.fxg.linkHoverFormat;
import at.bestsolution.efxclipse.formats.fxg.fxg.linkNormalFormat;
import at.bestsolution.efxclipse.formats.fxg.fxg.p;
import at.bestsolution.efxclipse.formats.fxg.fxg.rawtext;
import at.bestsolution.efxclipse.formats.fxg.fxg.span;
import at.bestsolution.efxclipse.formats.fxg.fxg.tab;
import at.bestsolution.efxclipse.formats.fxg.fxg.tcy;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FxgPackageImpl extends EPackageImpl implements FxgPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass libraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass placeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass matrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ellipseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richTextContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass richTextContentContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paragraphAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass characterAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rawtextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tcyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass aEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imgEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass brEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tabEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkNormalFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkHoverFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkActiveFormatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitmapImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solidColorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearGradientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radialGradientEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bitmapFillEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strokeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass solidColorStrokeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linearGradientStrokeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass radialGradientStrokeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradientEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorTransformEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass filterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blurFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dropShadowFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bevelFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradientGlowFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gradientBevelFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colorMatrixFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxgElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum blendModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum windingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum maskTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontWeightEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textDecorationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum whitespaceCollapseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum kerningEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum spreadMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interpolationMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum capEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jointEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scaleModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bevelFilterTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fillModeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textAlignEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum justificationRuleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum justificationStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textJustifyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum leadingModelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum blockProgressionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verticalAlignEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lineBreakEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum breakOpportunityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum digitCaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum digitWidthEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dominantBaselineEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignmentBaselineEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ligatureLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typographicCaseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum textRotationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pathDataEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType angleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lengthEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType percentEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType colorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType alphaEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FxgPackageImpl() {
		super(eNS_URI, FxgFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link FxgPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FxgPackage init() {
		if (isInited) return (FxgPackage)EPackage.Registry.INSTANCE.getEPackage(FxgPackage.eNS_URI);

		// Obtain or create and register package
		FxgPackageImpl theFxgPackage = (FxgPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof FxgPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new FxgPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theFxgPackage.createPackageContents();

		// Initialize created meta-data
		theFxgPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFxgPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FxgPackage.eNS_URI, theFxgPackage);
		return theFxgPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGraphic() {
		return graphicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphic_ScaleGridLeft() {
		return (EAttribute)graphicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphic_ScaleGridRight() {
		return (EAttribute)graphicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphic_ScaleGridTop() {
		return (EAttribute)graphicEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphic_ScaleGridBottom() {
		return (EAttribute)graphicEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphic_ViewWidth() {
		return (EAttribute)graphicEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphic_ViewHeight() {
		return (EAttribute)graphicEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGraphic_Version() {
		return (EAttribute)graphicEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGraphic_Mask() {
		return (EReference)graphicEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLibrary() {
		return libraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivate() {
		return privateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinition() {
		return definitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinition_Name() {
		return (EAttribute)definitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Rotation() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_ScaleX() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_ScaleY() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_X() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Y() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_BlendMode() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Alpha() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Id() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_TransformX() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_TransformY() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_MaskType() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_Visible() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_ScaleGridLeft() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_ScaleGridRight() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_ScaleGridTop() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGroup_ScaleGridBottom() {
		return (EAttribute)groupEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Transform() {
		return (EReference)groupEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Filters() {
		return (EReference)groupEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransform() {
		return transformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransform_Matrix() {
		return (EReference)transformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransform_ColorTransform() {
		return (EReference)transformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlaceObject() {
		return placeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlaceObject_Id() {
		return (EAttribute)placeObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceObject_Transform() {
		return (EReference)placeObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceObject_Filters() {
		return (EReference)placeObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlaceObject_Mask() {
		return (EReference)placeObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMatrix() {
		return matrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix_A() {
		return (EAttribute)matrixEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix_B() {
		return (EAttribute)matrixEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix_C() {
		return (EAttribute)matrixEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix_D() {
		return (EAttribute)matrixEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix_Tx() {
		return (EAttribute)matrixEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMatrix_Ty() {
		return (EAttribute)matrixEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPath() {
		return pathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPath_Data() {
		return (EAttribute)pathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPath_X() {
		return (EAttribute)pathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPath_Y() {
		return (EAttribute)pathEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPath_Rotation() {
		return (EAttribute)pathEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPath_ScaleX() {
		return (EAttribute)pathEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPath_ScaleY() {
		return (EAttribute)pathEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPath_BlendMode() {
		return (EAttribute)pathEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPath_Visible() {
		return (EAttribute)pathEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPath_Alpha() {
		return (EAttribute)pathEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPath_Winding() {
		return (EAttribute)pathEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPath_Fill() {
		return (EReference)pathEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPath_Stroke() {
		return (EReference)pathEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPath_Filters() {
		return (EReference)pathEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPath_Transform() {
		return (EReference)pathEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPath_Mask() {
		return (EReference)pathEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getShape() {
		return shapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRect() {
		return rectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_Width() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_Height() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_RadiusX() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_RadiusY() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_TopLeftRadiusX() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_TopLeftRadiusY() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_TopRightRadiusX() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_TopRightRadiusY() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_BottomLeftRadiusX() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_BottomLeftRadiusY() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_BottomRightRadiusX() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_BottomRightRadiusY() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_X() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_Y() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_Rotation() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_ScaleX() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_ScaleY() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_BlendMode() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_Visible() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRect_Alpha() {
		return (EAttribute)rectEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRect_Transform() {
		return (EReference)rectEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRect_Filters() {
		return (EReference)rectEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRect_Fill() {
		return (EReference)rectEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRect_Stroke() {
		return (EReference)rectEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRect_Mask() {
		return (EReference)rectEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEllipse() {
		return ellipseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_Alpha() {
		return (EAttribute)ellipseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_Width() {
		return (EAttribute)ellipseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_Height() {
		return (EAttribute)ellipseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_X() {
		return (EAttribute)ellipseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_Y() {
		return (EAttribute)ellipseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_Rotation() {
		return (EAttribute)ellipseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_ScaleX() {
		return (EAttribute)ellipseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_ScaleY() {
		return (EAttribute)ellipseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_BlendMode() {
		return (EAttribute)ellipseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEllipse_Visible() {
		return (EAttribute)ellipseEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipse_Transform() {
		return (EReference)ellipseEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipse_Filters() {
		return (EReference)ellipseEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipse_Fill() {
		return (EReference)ellipseEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipse_Stroke() {
		return (EReference)ellipseEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEllipse_Mask() {
		return (EReference)ellipseEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLine() {
		return lineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_XFrom() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_YFrom() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_XTo() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_YTo() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_X() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Y() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Rotation() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_ScaleX() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_ScaleY() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_BlendMode() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Alpha() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Id() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_MaskType() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLine_Visible() {
		return (EAttribute)lineEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_Transform() {
		return (EReference)lineEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_Filters() {
		return (EReference)lineEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_Fill() {
		return (EReference)lineEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_Stroke() {
		return (EReference)lineEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLine_Mask() {
		return (EReference)lineEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichText() {
		return richTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichText_Rotation() {
		return (EAttribute)richTextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichText_ScaleX() {
		return (EAttribute)richTextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichText_ScaleY() {
		return (EAttribute)richTextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichText_X() {
		return (EAttribute)richTextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichText_Y() {
		return (EAttribute)richTextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichText_BlendMode() {
		return (EAttribute)richTextEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichText_Alpha() {
		return (EAttribute)richTextEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichText_Id() {
		return (EAttribute)richTextEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichText_MaskType() {
		return (EAttribute)richTextEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichText_Visible() {
		return (EAttribute)richTextEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichText_Width() {
		return (EAttribute)richTextEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichText_Height() {
		return (EAttribute)richTextEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichText_Content() {
		return (EReference)richTextEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRichText__tempcontent() {
		return (EAttribute)richTextEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichTextContent() {
		return richTextContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRichTextContentContainer() {
		return richTextContentContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRichTextContentContainer__children() {
		return (EReference)richTextContentContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParagraphAttributes() {
		return paragraphAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraphAttributes_TextAlign() {
		return (EAttribute)paragraphAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraphAttributes_TextAlignLast() {
		return (EAttribute)paragraphAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraphAttributes_TextIndent() {
		return (EAttribute)paragraphAttributesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraphAttributes_ParagraphStartIndent() {
		return (EAttribute)paragraphAttributesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraphAttributes_ParagraphEndIndent() {
		return (EAttribute)paragraphAttributesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraphAttributes_ParagraphSpaceBefore() {
		return (EAttribute)paragraphAttributesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraphAttributes_ParagraphSpaceAfter() {
		return (EAttribute)paragraphAttributesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraphAttributes_JustificationRule() {
		return (EAttribute)paragraphAttributesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraphAttributes_JustificationStyle() {
		return (EAttribute)paragraphAttributesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraphAttributes_TextJustify() {
		return (EAttribute)paragraphAttributesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraphAttributes_LeadingModel() {
		return (EAttribute)paragraphAttributesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParagraphAttributes_TabStops() {
		return (EAttribute)paragraphAttributesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerAttributes() {
		return containerAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerAttributes_BlockProgression() {
		return (EAttribute)containerAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerAttributes_PaddingLeft() {
		return (EAttribute)containerAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerAttributes_PaddingRight() {
		return (EAttribute)containerAttributesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerAttributes_PaddingTop() {
		return (EAttribute)containerAttributesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerAttributes_PaddingBottom() {
		return (EAttribute)containerAttributesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerAttributes_ColumnGap() {
		return (EAttribute)containerAttributesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerAttributes_ColumnCount() {
		return (EAttribute)containerAttributesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerAttributes_ColumnWidth() {
		return (EAttribute)containerAttributesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerAttributes_FirstBaselineOffset() {
		return (EAttribute)containerAttributesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerAttributes_VerticalAlign() {
		return (EAttribute)containerAttributesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContainerAttributes_LineBreak() {
		return (EAttribute)containerAttributesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharacterAttributes() {
		return characterAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_FontFamily() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_FontSize() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_FontStyle() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_FontWeight() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_LineHeight() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_TextDecoration() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_LineThrough() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_Color() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_TextAlpha() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_WhiteSpaceCollapse() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_Kerning() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_BackgroundAlpha() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_BackgroundColor() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_BaselineShift() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_BreakOpportunity() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_DigitCase() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_DigitWidth() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_DominantBaseline() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_AlignmentBaseline() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_LigatureLevel() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_Locale() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_TypographicCase() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_TextRotation() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_TrackingLeft() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharacterAttributes_TrackingRight() {
		return (EAttribute)characterAttributesEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getrawtext() {
		return rawtextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getrawtext__text() {
		return (EAttribute)rawtextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getdiv() {
		return divEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getp() {
		return pEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettcy() {
		return tcyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass geta() {
		return aEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getimg() {
		return imgEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getspan() {
		return spanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getbr() {
		return brEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass gettab() {
		return tabEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlinkNormalFormat() {
		return linkNormalFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlinkHoverFormat() {
		return linkHoverFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getlinkActiveFormat() {
		return linkActiveFormatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitmapImage() {
		return bitmapImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapImage_X() {
		return (EAttribute)bitmapImageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapImage_Y() {
		return (EAttribute)bitmapImageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapImage_Width() {
		return (EAttribute)bitmapImageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapImage_Height() {
		return (EAttribute)bitmapImageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapImage_Rotation() {
		return (EAttribute)bitmapImageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapImage_ScaleX() {
		return (EAttribute)bitmapImageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapImage_ScaleY() {
		return (EAttribute)bitmapImageEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapImage_FillMode() {
		return (EAttribute)bitmapImageEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapImage_Source() {
		return (EAttribute)bitmapImageEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapImage_Visible() {
		return (EAttribute)bitmapImageEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapImage_Alpha() {
		return (EAttribute)bitmapImageEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapImage_BlendMode() {
		return (EAttribute)bitmapImageEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFill() {
		return fillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolidColor() {
		return solidColorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidColor_Alpha() {
		return (EAttribute)solidColorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidColor_Color() {
		return (EAttribute)solidColorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearGradient() {
		return linearGradientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradient_X() {
		return (EAttribute)linearGradientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradient_Y() {
		return (EAttribute)linearGradientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradient_ScaleX() {
		return (EAttribute)linearGradientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradient_Rotation() {
		return (EAttribute)linearGradientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradient_SpreadMethod() {
		return (EAttribute)linearGradientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradient_InterpolationMethod() {
		return (EAttribute)linearGradientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearGradient_Matrix() {
		return (EReference)linearGradientEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadialGradient() {
		return radialGradientEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradient_X() {
		return (EAttribute)radialGradientEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradient_Y() {
		return (EAttribute)radialGradientEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradient_ScaleX() {
		return (EAttribute)radialGradientEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradient_ScaleY() {
		return (EAttribute)radialGradientEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradient_Rotation() {
		return (EAttribute)radialGradientEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradient_SpreadMethod() {
		return (EAttribute)radialGradientEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradient_InterpolationMethod() {
		return (EAttribute)radialGradientEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradient_FocalPointRatio() {
		return (EAttribute)radialGradientEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRadialGradient_Matrix() {
		return (EReference)radialGradientEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBitmapFill() {
		return bitmapFillEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapFill_X() {
		return (EAttribute)bitmapFillEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapFill_Y() {
		return (EAttribute)bitmapFillEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapFill_ScaleX() {
		return (EAttribute)bitmapFillEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapFill_ScaleY() {
		return (EAttribute)bitmapFillEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapFill_Rotation() {
		return (EAttribute)bitmapFillEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapFill_Source() {
		return (EAttribute)bitmapFillEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBitmapFill_FillMode() {
		return (EAttribute)bitmapFillEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBitmapFill_Matrix() {
		return (EReference)bitmapFillEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStroke() {
		return strokeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSolidColorStroke() {
		return solidColorStrokeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidColorStroke_Alpha() {
		return (EAttribute)solidColorStrokeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidColorStroke_Caps() {
		return (EAttribute)solidColorStrokeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidColorStroke_Color() {
		return (EAttribute)solidColorStrokeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidColorStroke_Joints() {
		return (EAttribute)solidColorStrokeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidColorStroke_MiterLimit() {
		return (EAttribute)solidColorStrokeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidColorStroke_PixelHinting() {
		return (EAttribute)solidColorStrokeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidColorStroke_ScaleMode() {
		return (EAttribute)solidColorStrokeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSolidColorStroke_Weight() {
		return (EAttribute)solidColorStrokeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinearGradientStroke() {
		return linearGradientStrokeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientStroke_X() {
		return (EAttribute)linearGradientStrokeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientStroke_Y() {
		return (EAttribute)linearGradientStrokeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientStroke_ScaleX() {
		return (EAttribute)linearGradientStrokeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientStroke_Rotation() {
		return (EAttribute)linearGradientStrokeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientStroke_SpreadMethod() {
		return (EAttribute)linearGradientStrokeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientStroke_InterpolationMethod() {
		return (EAttribute)linearGradientStrokeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientStroke_ScaleMode() {
		return (EAttribute)linearGradientStrokeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientStroke_Caps() {
		return (EAttribute)linearGradientStrokeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientStroke_Joints() {
		return (EAttribute)linearGradientStrokeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientStroke_MiterLimit() {
		return (EAttribute)linearGradientStrokeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientStroke_Weight() {
		return (EAttribute)linearGradientStrokeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinearGradientStroke_PixelHinting() {
		return (EAttribute)linearGradientStrokeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinearGradientStroke_Matrix() {
		return (EReference)linearGradientStrokeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRadialGradientStroke() {
		return radialGradientStrokeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientStroke_X() {
		return (EAttribute)radialGradientStrokeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientStroke_Y() {
		return (EAttribute)radialGradientStrokeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientStroke_ScaleX() {
		return (EAttribute)radialGradientStrokeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientStroke_ScaleY() {
		return (EAttribute)radialGradientStrokeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientStroke_Rotation() {
		return (EAttribute)radialGradientStrokeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientStroke_SpreadMethod() {
		return (EAttribute)radialGradientStrokeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientStroke_InterpolationMethod() {
		return (EAttribute)radialGradientStrokeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientStroke_FocalPointRatio() {
		return (EAttribute)radialGradientStrokeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientStroke_ScaleMode() {
		return (EAttribute)radialGradientStrokeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientStroke_Caps() {
		return (EAttribute)radialGradientStrokeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientStroke_Joints() {
		return (EAttribute)radialGradientStrokeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientStroke_MiterLimit() {
		return (EAttribute)radialGradientStrokeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientStroke_Weight() {
		return (EAttribute)radialGradientStrokeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRadialGradientStroke_PixelHinting() {
		return (EAttribute)radialGradientStrokeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRadialGradientStroke_Matrix() {
		return (EReference)radialGradientStrokeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGradientEntry() {
		return gradientEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientEntry_Color() {
		return (EAttribute)gradientEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientEntry_Alpha() {
		return (EAttribute)gradientEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientEntry_Ratio() {
		return (EAttribute)gradientEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorTransform() {
		return colorTransformEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorTransform_AlphaMultiplier() {
		return (EAttribute)colorTransformEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorTransform_AlphaOffset() {
		return (EAttribute)colorTransformEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorTransform_BlueMultiplier() {
		return (EAttribute)colorTransformEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorTransform_BlueOffset() {
		return (EAttribute)colorTransformEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorTransform_GreenMultiplier() {
		return (EAttribute)colorTransformEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorTransform_GreenOffset() {
		return (EAttribute)colorTransformEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorTransform_RedMultiplier() {
		return (EAttribute)colorTransformEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorTransform_RedOffset() {
		return (EAttribute)colorTransformEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFilter() {
		return filterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlurFilter() {
		return blurFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlurFilter_BlurX() {
		return (EAttribute)blurFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlurFilter_BlurY() {
		return (EAttribute)blurFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBlurFilter_Quality() {
		return (EAttribute)blurFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDropShadowFilter() {
		return dropShadowFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropShadowFilter_Alpha() {
		return (EAttribute)dropShadowFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropShadowFilter_Angle() {
		return (EAttribute)dropShadowFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropShadowFilter_BlurX() {
		return (EAttribute)dropShadowFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropShadowFilter_BlurY() {
		return (EAttribute)dropShadowFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropShadowFilter_Color() {
		return (EAttribute)dropShadowFilterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropShadowFilter_Distance() {
		return (EAttribute)dropShadowFilterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropShadowFilter_Inner() {
		return (EAttribute)dropShadowFilterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropShadowFilter_HideObject() {
		return (EAttribute)dropShadowFilterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropShadowFilter_Knockout() {
		return (EAttribute)dropShadowFilterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropShadowFilter_Quality() {
		return (EAttribute)dropShadowFilterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDropShadowFilter_Strength() {
		return (EAttribute)dropShadowFilterEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBevelFilter() {
		return bevelFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBevelFilter_Angle() {
		return (EAttribute)bevelFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBevelFilter_BlurX() {
		return (EAttribute)bevelFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBevelFilter_BlurY() {
		return (EAttribute)bevelFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBevelFilter_HighlightAlpha() {
		return (EAttribute)bevelFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBevelFilter_HighlightColor() {
		return (EAttribute)bevelFilterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBevelFilter_Distance() {
		return (EAttribute)bevelFilterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBevelFilter_Knockout() {
		return (EAttribute)bevelFilterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBevelFilter_Quality() {
		return (EAttribute)bevelFilterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBevelFilter_ShadowAlpha() {
		return (EAttribute)bevelFilterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBevelFilter_ShadowColor() {
		return (EAttribute)bevelFilterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBevelFilter_Strength() {
		return (EAttribute)bevelFilterEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBevelFilter_Type() {
		return (EAttribute)bevelFilterEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGradientGlowFilter() {
		return gradientGlowFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientGlowFilter_Angle() {
		return (EAttribute)gradientGlowFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientGlowFilter_BlurX() {
		return (EAttribute)gradientGlowFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientGlowFilter_BlurY() {
		return (EAttribute)gradientGlowFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientGlowFilter_Distance() {
		return (EAttribute)gradientGlowFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientGlowFilter_Inner() {
		return (EAttribute)gradientGlowFilterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientGlowFilter_Knockout() {
		return (EAttribute)gradientGlowFilterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientGlowFilter_Quality() {
		return (EAttribute)gradientGlowFilterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientGlowFilter_Strength() {
		return (EAttribute)gradientGlowFilterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGradientBevelFilter() {
		return gradientBevelFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientBevelFilter_Angle() {
		return (EAttribute)gradientBevelFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientBevelFilter_BlurX() {
		return (EAttribute)gradientBevelFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientBevelFilter_BlurY() {
		return (EAttribute)gradientBevelFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientBevelFilter_Distance() {
		return (EAttribute)gradientBevelFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientBevelFilter_Knockout() {
		return (EAttribute)gradientBevelFilterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientBevelFilter_Quality() {
		return (EAttribute)gradientBevelFilterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientBevelFilter_Strength() {
		return (EAttribute)gradientBevelFilterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGradientBevelFilter_Type() {
		return (EAttribute)gradientBevelFilterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColorMatrixFilter() {
		return colorMatrixFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColorMatrixFilter_Matrix() {
		return (EAttribute)colorMatrixFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFXGElement() {
		return fxgElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContainerElement() {
		return containerElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContainerElement__children() {
		return (EReference)containerElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBlendMode() {
		return blendModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWinding() {
		return windingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMaskType() {
		return maskTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFontStyle() {
		return fontStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFontWeight() {
		return fontWeightEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextDecoration() {
		return textDecorationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWhitespaceCollapse() {
		return whitespaceCollapseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getKerning() {
		return kerningEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpreadMethod() {
		return spreadMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInterpolationMethod() {
		return interpolationMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCap() {
		return capEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJoint() {
		return jointEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScaleMode() {
		return scaleModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBevelFilterType() {
		return bevelFilterTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFillMode() {
		return fillModeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextAlign() {
		return textAlignEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJustificationRule() {
		return justificationRuleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJustificationStyle() {
		return justificationStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextJustify() {
		return textJustifyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLeadingModel() {
		return leadingModelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBlockProgression() {
		return blockProgressionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVerticalAlign() {
		return verticalAlignEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLineBreak() {
		return lineBreakEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBreakOpportunity() {
		return breakOpportunityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDigitCase() {
		return digitCaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDigitWidth() {
		return digitWidthEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDominantBaseline() {
		return dominantBaselineEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAlignmentBaseline() {
		return alignmentBaselineEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLigatureLevel() {
		return ligatureLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTypographicCase() {
		return typographicCaseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTextRotation() {
		return textRotationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPathData() {
		return pathDataEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAngle() {
		return angleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getLength() {
		return lengthEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPercent() {
		return percentEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getColor() {
		return colorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getAlpha() {
		return alphaEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxgFactory getFxgFactory() {
		return (FxgFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		graphicEClass = createEClass(GRAPHIC);
		createEAttribute(graphicEClass, GRAPHIC__SCALE_GRID_LEFT);
		createEAttribute(graphicEClass, GRAPHIC__SCALE_GRID_RIGHT);
		createEAttribute(graphicEClass, GRAPHIC__SCALE_GRID_TOP);
		createEAttribute(graphicEClass, GRAPHIC__SCALE_GRID_BOTTOM);
		createEAttribute(graphicEClass, GRAPHIC__VIEW_WIDTH);
		createEAttribute(graphicEClass, GRAPHIC__VIEW_HEIGHT);
		createEAttribute(graphicEClass, GRAPHIC__VERSION);
		createEReference(graphicEClass, GRAPHIC__MASK);

		libraryEClass = createEClass(LIBRARY);

		privateEClass = createEClass(PRIVATE);

		definitionEClass = createEClass(DEFINITION);
		createEAttribute(definitionEClass, DEFINITION__NAME);

		groupEClass = createEClass(GROUP);
		createEAttribute(groupEClass, GROUP__ROTATION);
		createEAttribute(groupEClass, GROUP__SCALE_X);
		createEAttribute(groupEClass, GROUP__SCALE_Y);
		createEAttribute(groupEClass, GROUP__X);
		createEAttribute(groupEClass, GROUP__Y);
		createEAttribute(groupEClass, GROUP__BLEND_MODE);
		createEAttribute(groupEClass, GROUP__ALPHA);
		createEAttribute(groupEClass, GROUP__ID);
		createEAttribute(groupEClass, GROUP__TRANSFORM_X);
		createEAttribute(groupEClass, GROUP__TRANSFORM_Y);
		createEAttribute(groupEClass, GROUP__MASK_TYPE);
		createEAttribute(groupEClass, GROUP__VISIBLE);
		createEAttribute(groupEClass, GROUP__SCALE_GRID_LEFT);
		createEAttribute(groupEClass, GROUP__SCALE_GRID_RIGHT);
		createEAttribute(groupEClass, GROUP__SCALE_GRID_TOP);
		createEAttribute(groupEClass, GROUP__SCALE_GRID_BOTTOM);
		createEReference(groupEClass, GROUP__TRANSFORM);
		createEReference(groupEClass, GROUP__FILTERS);

		transformEClass = createEClass(TRANSFORM);
		createEReference(transformEClass, TRANSFORM__MATRIX);
		createEReference(transformEClass, TRANSFORM__COLOR_TRANSFORM);

		placeObjectEClass = createEClass(PLACE_OBJECT);
		createEAttribute(placeObjectEClass, PLACE_OBJECT__ID);
		createEReference(placeObjectEClass, PLACE_OBJECT__TRANSFORM);
		createEReference(placeObjectEClass, PLACE_OBJECT__FILTERS);
		createEReference(placeObjectEClass, PLACE_OBJECT__MASK);

		matrixEClass = createEClass(MATRIX);
		createEAttribute(matrixEClass, MATRIX__A);
		createEAttribute(matrixEClass, MATRIX__B);
		createEAttribute(matrixEClass, MATRIX__C);
		createEAttribute(matrixEClass, MATRIX__D);
		createEAttribute(matrixEClass, MATRIX__TX);
		createEAttribute(matrixEClass, MATRIX__TY);

		pathEClass = createEClass(PATH);
		createEAttribute(pathEClass, PATH__DATA);
		createEAttribute(pathEClass, PATH__X);
		createEAttribute(pathEClass, PATH__Y);
		createEAttribute(pathEClass, PATH__ROTATION);
		createEAttribute(pathEClass, PATH__SCALE_X);
		createEAttribute(pathEClass, PATH__SCALE_Y);
		createEAttribute(pathEClass, PATH__BLEND_MODE);
		createEAttribute(pathEClass, PATH__VISIBLE);
		createEAttribute(pathEClass, PATH__ALPHA);
		createEAttribute(pathEClass, PATH__WINDING);
		createEReference(pathEClass, PATH__FILL);
		createEReference(pathEClass, PATH__STROKE);
		createEReference(pathEClass, PATH__FILTERS);
		createEReference(pathEClass, PATH__TRANSFORM);
		createEReference(pathEClass, PATH__MASK);

		shapeEClass = createEClass(SHAPE);

		rectEClass = createEClass(RECT);
		createEAttribute(rectEClass, RECT__WIDTH);
		createEAttribute(rectEClass, RECT__HEIGHT);
		createEAttribute(rectEClass, RECT__RADIUS_X);
		createEAttribute(rectEClass, RECT__RADIUS_Y);
		createEAttribute(rectEClass, RECT__TOP_LEFT_RADIUS_X);
		createEAttribute(rectEClass, RECT__TOP_LEFT_RADIUS_Y);
		createEAttribute(rectEClass, RECT__TOP_RIGHT_RADIUS_X);
		createEAttribute(rectEClass, RECT__TOP_RIGHT_RADIUS_Y);
		createEAttribute(rectEClass, RECT__BOTTOM_LEFT_RADIUS_X);
		createEAttribute(rectEClass, RECT__BOTTOM_LEFT_RADIUS_Y);
		createEAttribute(rectEClass, RECT__BOTTOM_RIGHT_RADIUS_X);
		createEAttribute(rectEClass, RECT__BOTTOM_RIGHT_RADIUS_Y);
		createEAttribute(rectEClass, RECT__X);
		createEAttribute(rectEClass, RECT__Y);
		createEAttribute(rectEClass, RECT__ROTATION);
		createEAttribute(rectEClass, RECT__SCALE_X);
		createEAttribute(rectEClass, RECT__SCALE_Y);
		createEAttribute(rectEClass, RECT__BLEND_MODE);
		createEAttribute(rectEClass, RECT__VISIBLE);
		createEAttribute(rectEClass, RECT__ALPHA);
		createEReference(rectEClass, RECT__TRANSFORM);
		createEReference(rectEClass, RECT__FILTERS);
		createEReference(rectEClass, RECT__FILL);
		createEReference(rectEClass, RECT__STROKE);
		createEReference(rectEClass, RECT__MASK);

		ellipseEClass = createEClass(ELLIPSE);
		createEAttribute(ellipseEClass, ELLIPSE__ALPHA);
		createEAttribute(ellipseEClass, ELLIPSE__WIDTH);
		createEAttribute(ellipseEClass, ELLIPSE__HEIGHT);
		createEAttribute(ellipseEClass, ELLIPSE__X);
		createEAttribute(ellipseEClass, ELLIPSE__Y);
		createEAttribute(ellipseEClass, ELLIPSE__ROTATION);
		createEAttribute(ellipseEClass, ELLIPSE__SCALE_X);
		createEAttribute(ellipseEClass, ELLIPSE__SCALE_Y);
		createEAttribute(ellipseEClass, ELLIPSE__BLEND_MODE);
		createEAttribute(ellipseEClass, ELLIPSE__VISIBLE);
		createEReference(ellipseEClass, ELLIPSE__TRANSFORM);
		createEReference(ellipseEClass, ELLIPSE__FILTERS);
		createEReference(ellipseEClass, ELLIPSE__FILL);
		createEReference(ellipseEClass, ELLIPSE__STROKE);
		createEReference(ellipseEClass, ELLIPSE__MASK);

		lineEClass = createEClass(LINE);
		createEAttribute(lineEClass, LINE__XFROM);
		createEAttribute(lineEClass, LINE__YFROM);
		createEAttribute(lineEClass, LINE__XTO);
		createEAttribute(lineEClass, LINE__YTO);
		createEAttribute(lineEClass, LINE__X);
		createEAttribute(lineEClass, LINE__Y);
		createEAttribute(lineEClass, LINE__ROTATION);
		createEAttribute(lineEClass, LINE__SCALE_X);
		createEAttribute(lineEClass, LINE__SCALE_Y);
		createEAttribute(lineEClass, LINE__BLEND_MODE);
		createEAttribute(lineEClass, LINE__ALPHA);
		createEAttribute(lineEClass, LINE__ID);
		createEAttribute(lineEClass, LINE__MASK_TYPE);
		createEAttribute(lineEClass, LINE__VISIBLE);
		createEReference(lineEClass, LINE__TRANSFORM);
		createEReference(lineEClass, LINE__FILTERS);
		createEReference(lineEClass, LINE__FILL);
		createEReference(lineEClass, LINE__STROKE);
		createEReference(lineEClass, LINE__MASK);

		richTextEClass = createEClass(RICH_TEXT);
		createEAttribute(richTextEClass, RICH_TEXT__ROTATION);
		createEAttribute(richTextEClass, RICH_TEXT__SCALE_X);
		createEAttribute(richTextEClass, RICH_TEXT__SCALE_Y);
		createEAttribute(richTextEClass, RICH_TEXT__X);
		createEAttribute(richTextEClass, RICH_TEXT__Y);
		createEAttribute(richTextEClass, RICH_TEXT__BLEND_MODE);
		createEAttribute(richTextEClass, RICH_TEXT__ALPHA);
		createEAttribute(richTextEClass, RICH_TEXT__ID);
		createEAttribute(richTextEClass, RICH_TEXT__MASK_TYPE);
		createEAttribute(richTextEClass, RICH_TEXT__VISIBLE);
		createEAttribute(richTextEClass, RICH_TEXT__WIDTH);
		createEAttribute(richTextEClass, RICH_TEXT__HEIGHT);
		createEReference(richTextEClass, RICH_TEXT__CONTENT);
		createEAttribute(richTextEClass, RICH_TEXT__TEMPCONTENT);

		richTextContentEClass = createEClass(RICH_TEXT_CONTENT);

		richTextContentContainerEClass = createEClass(RICH_TEXT_CONTENT_CONTAINER);
		createEReference(richTextContentContainerEClass, RICH_TEXT_CONTENT_CONTAINER__CHILDREN);

		paragraphAttributesEClass = createEClass(PARAGRAPH_ATTRIBUTES);
		createEAttribute(paragraphAttributesEClass, PARAGRAPH_ATTRIBUTES__TEXT_ALIGN);
		createEAttribute(paragraphAttributesEClass, PARAGRAPH_ATTRIBUTES__TEXT_ALIGN_LAST);
		createEAttribute(paragraphAttributesEClass, PARAGRAPH_ATTRIBUTES__TEXT_INDENT);
		createEAttribute(paragraphAttributesEClass, PARAGRAPH_ATTRIBUTES__PARAGRAPH_START_INDENT);
		createEAttribute(paragraphAttributesEClass, PARAGRAPH_ATTRIBUTES__PARAGRAPH_END_INDENT);
		createEAttribute(paragraphAttributesEClass, PARAGRAPH_ATTRIBUTES__PARAGRAPH_SPACE_BEFORE);
		createEAttribute(paragraphAttributesEClass, PARAGRAPH_ATTRIBUTES__PARAGRAPH_SPACE_AFTER);
		createEAttribute(paragraphAttributesEClass, PARAGRAPH_ATTRIBUTES__JUSTIFICATION_RULE);
		createEAttribute(paragraphAttributesEClass, PARAGRAPH_ATTRIBUTES__JUSTIFICATION_STYLE);
		createEAttribute(paragraphAttributesEClass, PARAGRAPH_ATTRIBUTES__TEXT_JUSTIFY);
		createEAttribute(paragraphAttributesEClass, PARAGRAPH_ATTRIBUTES__LEADING_MODEL);
		createEAttribute(paragraphAttributesEClass, PARAGRAPH_ATTRIBUTES__TAB_STOPS);

		containerAttributesEClass = createEClass(CONTAINER_ATTRIBUTES);
		createEAttribute(containerAttributesEClass, CONTAINER_ATTRIBUTES__BLOCK_PROGRESSION);
		createEAttribute(containerAttributesEClass, CONTAINER_ATTRIBUTES__PADDING_LEFT);
		createEAttribute(containerAttributesEClass, CONTAINER_ATTRIBUTES__PADDING_RIGHT);
		createEAttribute(containerAttributesEClass, CONTAINER_ATTRIBUTES__PADDING_TOP);
		createEAttribute(containerAttributesEClass, CONTAINER_ATTRIBUTES__PADDING_BOTTOM);
		createEAttribute(containerAttributesEClass, CONTAINER_ATTRIBUTES__COLUMN_GAP);
		createEAttribute(containerAttributesEClass, CONTAINER_ATTRIBUTES__COLUMN_COUNT);
		createEAttribute(containerAttributesEClass, CONTAINER_ATTRIBUTES__COLUMN_WIDTH);
		createEAttribute(containerAttributesEClass, CONTAINER_ATTRIBUTES__FIRST_BASELINE_OFFSET);
		createEAttribute(containerAttributesEClass, CONTAINER_ATTRIBUTES__VERTICAL_ALIGN);
		createEAttribute(containerAttributesEClass, CONTAINER_ATTRIBUTES__LINE_BREAK);

		characterAttributesEClass = createEClass(CHARACTER_ATTRIBUTES);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__FONT_FAMILY);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__FONT_SIZE);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__FONT_STYLE);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__FONT_WEIGHT);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__LINE_HEIGHT);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__TEXT_DECORATION);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__LINE_THROUGH);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__COLOR);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__TEXT_ALPHA);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__WHITE_SPACE_COLLAPSE);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__KERNING);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__BACKGROUND_ALPHA);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__BACKGROUND_COLOR);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__BASELINE_SHIFT);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__BREAK_OPPORTUNITY);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__DIGIT_CASE);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__DIGIT_WIDTH);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__DOMINANT_BASELINE);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__ALIGNMENT_BASELINE);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__LIGATURE_LEVEL);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__LOCALE);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__TYPOGRAPHIC_CASE);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__TEXT_ROTATION);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__TRACKING_LEFT);
		createEAttribute(characterAttributesEClass, CHARACTER_ATTRIBUTES__TRACKING_RIGHT);

		rawtextEClass = createEClass(RAWTEXT);
		createEAttribute(rawtextEClass, RAWTEXT__TEXT);

		divEClass = createEClass(DIV);

		pEClass = createEClass(P);

		tcyEClass = createEClass(TCY);

		aEClass = createEClass(A);

		imgEClass = createEClass(IMG);

		spanEClass = createEClass(SPAN);

		brEClass = createEClass(BR);

		tabEClass = createEClass(TAB);

		linkNormalFormatEClass = createEClass(LINK_NORMAL_FORMAT);

		linkHoverFormatEClass = createEClass(LINK_HOVER_FORMAT);

		linkActiveFormatEClass = createEClass(LINK_ACTIVE_FORMAT);

		bitmapImageEClass = createEClass(BITMAP_IMAGE);
		createEAttribute(bitmapImageEClass, BITMAP_IMAGE__X);
		createEAttribute(bitmapImageEClass, BITMAP_IMAGE__Y);
		createEAttribute(bitmapImageEClass, BITMAP_IMAGE__WIDTH);
		createEAttribute(bitmapImageEClass, BITMAP_IMAGE__HEIGHT);
		createEAttribute(bitmapImageEClass, BITMAP_IMAGE__ROTATION);
		createEAttribute(bitmapImageEClass, BITMAP_IMAGE__SCALE_X);
		createEAttribute(bitmapImageEClass, BITMAP_IMAGE__SCALE_Y);
		createEAttribute(bitmapImageEClass, BITMAP_IMAGE__FILL_MODE);
		createEAttribute(bitmapImageEClass, BITMAP_IMAGE__SOURCE);
		createEAttribute(bitmapImageEClass, BITMAP_IMAGE__VISIBLE);
		createEAttribute(bitmapImageEClass, BITMAP_IMAGE__ALPHA);
		createEAttribute(bitmapImageEClass, BITMAP_IMAGE__BLEND_MODE);

		fillEClass = createEClass(FILL);

		solidColorEClass = createEClass(SOLID_COLOR);
		createEAttribute(solidColorEClass, SOLID_COLOR__ALPHA);
		createEAttribute(solidColorEClass, SOLID_COLOR__COLOR);

		linearGradientEClass = createEClass(LINEAR_GRADIENT);
		createEAttribute(linearGradientEClass, LINEAR_GRADIENT__X);
		createEAttribute(linearGradientEClass, LINEAR_GRADIENT__Y);
		createEAttribute(linearGradientEClass, LINEAR_GRADIENT__SCALE_X);
		createEAttribute(linearGradientEClass, LINEAR_GRADIENT__ROTATION);
		createEAttribute(linearGradientEClass, LINEAR_GRADIENT__SPREAD_METHOD);
		createEAttribute(linearGradientEClass, LINEAR_GRADIENT__INTERPOLATION_METHOD);
		createEReference(linearGradientEClass, LINEAR_GRADIENT__MATRIX);

		radialGradientEClass = createEClass(RADIAL_GRADIENT);
		createEAttribute(radialGradientEClass, RADIAL_GRADIENT__X);
		createEAttribute(radialGradientEClass, RADIAL_GRADIENT__Y);
		createEAttribute(radialGradientEClass, RADIAL_GRADIENT__SCALE_X);
		createEAttribute(radialGradientEClass, RADIAL_GRADIENT__SCALE_Y);
		createEAttribute(radialGradientEClass, RADIAL_GRADIENT__ROTATION);
		createEAttribute(radialGradientEClass, RADIAL_GRADIENT__SPREAD_METHOD);
		createEAttribute(radialGradientEClass, RADIAL_GRADIENT__INTERPOLATION_METHOD);
		createEAttribute(radialGradientEClass, RADIAL_GRADIENT__FOCAL_POINT_RATIO);
		createEReference(radialGradientEClass, RADIAL_GRADIENT__MATRIX);

		bitmapFillEClass = createEClass(BITMAP_FILL);
		createEAttribute(bitmapFillEClass, BITMAP_FILL__X);
		createEAttribute(bitmapFillEClass, BITMAP_FILL__Y);
		createEAttribute(bitmapFillEClass, BITMAP_FILL__SCALE_X);
		createEAttribute(bitmapFillEClass, BITMAP_FILL__SCALE_Y);
		createEAttribute(bitmapFillEClass, BITMAP_FILL__ROTATION);
		createEAttribute(bitmapFillEClass, BITMAP_FILL__SOURCE);
		createEAttribute(bitmapFillEClass, BITMAP_FILL__FILL_MODE);
		createEReference(bitmapFillEClass, BITMAP_FILL__MATRIX);

		strokeEClass = createEClass(STROKE);

		solidColorStrokeEClass = createEClass(SOLID_COLOR_STROKE);
		createEAttribute(solidColorStrokeEClass, SOLID_COLOR_STROKE__ALPHA);
		createEAttribute(solidColorStrokeEClass, SOLID_COLOR_STROKE__CAPS);
		createEAttribute(solidColorStrokeEClass, SOLID_COLOR_STROKE__COLOR);
		createEAttribute(solidColorStrokeEClass, SOLID_COLOR_STROKE__JOINTS);
		createEAttribute(solidColorStrokeEClass, SOLID_COLOR_STROKE__MITER_LIMIT);
		createEAttribute(solidColorStrokeEClass, SOLID_COLOR_STROKE__PIXEL_HINTING);
		createEAttribute(solidColorStrokeEClass, SOLID_COLOR_STROKE__SCALE_MODE);
		createEAttribute(solidColorStrokeEClass, SOLID_COLOR_STROKE__WEIGHT);

		linearGradientStrokeEClass = createEClass(LINEAR_GRADIENT_STROKE);
		createEAttribute(linearGradientStrokeEClass, LINEAR_GRADIENT_STROKE__X);
		createEAttribute(linearGradientStrokeEClass, LINEAR_GRADIENT_STROKE__Y);
		createEAttribute(linearGradientStrokeEClass, LINEAR_GRADIENT_STROKE__SCALE_X);
		createEAttribute(linearGradientStrokeEClass, LINEAR_GRADIENT_STROKE__ROTATION);
		createEAttribute(linearGradientStrokeEClass, LINEAR_GRADIENT_STROKE__SPREAD_METHOD);
		createEAttribute(linearGradientStrokeEClass, LINEAR_GRADIENT_STROKE__INTERPOLATION_METHOD);
		createEAttribute(linearGradientStrokeEClass, LINEAR_GRADIENT_STROKE__SCALE_MODE);
		createEAttribute(linearGradientStrokeEClass, LINEAR_GRADIENT_STROKE__CAPS);
		createEAttribute(linearGradientStrokeEClass, LINEAR_GRADIENT_STROKE__JOINTS);
		createEAttribute(linearGradientStrokeEClass, LINEAR_GRADIENT_STROKE__MITER_LIMIT);
		createEAttribute(linearGradientStrokeEClass, LINEAR_GRADIENT_STROKE__WEIGHT);
		createEAttribute(linearGradientStrokeEClass, LINEAR_GRADIENT_STROKE__PIXEL_HINTING);
		createEReference(linearGradientStrokeEClass, LINEAR_GRADIENT_STROKE__MATRIX);

		radialGradientStrokeEClass = createEClass(RADIAL_GRADIENT_STROKE);
		createEAttribute(radialGradientStrokeEClass, RADIAL_GRADIENT_STROKE__X);
		createEAttribute(radialGradientStrokeEClass, RADIAL_GRADIENT_STROKE__Y);
		createEAttribute(radialGradientStrokeEClass, RADIAL_GRADIENT_STROKE__SCALE_X);
		createEAttribute(radialGradientStrokeEClass, RADIAL_GRADIENT_STROKE__SCALE_Y);
		createEAttribute(radialGradientStrokeEClass, RADIAL_GRADIENT_STROKE__ROTATION);
		createEAttribute(radialGradientStrokeEClass, RADIAL_GRADIENT_STROKE__SPREAD_METHOD);
		createEAttribute(radialGradientStrokeEClass, RADIAL_GRADIENT_STROKE__INTERPOLATION_METHOD);
		createEAttribute(radialGradientStrokeEClass, RADIAL_GRADIENT_STROKE__FOCAL_POINT_RATIO);
		createEAttribute(radialGradientStrokeEClass, RADIAL_GRADIENT_STROKE__SCALE_MODE);
		createEAttribute(radialGradientStrokeEClass, RADIAL_GRADIENT_STROKE__CAPS);
		createEAttribute(radialGradientStrokeEClass, RADIAL_GRADIENT_STROKE__JOINTS);
		createEAttribute(radialGradientStrokeEClass, RADIAL_GRADIENT_STROKE__MITER_LIMIT);
		createEAttribute(radialGradientStrokeEClass, RADIAL_GRADIENT_STROKE__WEIGHT);
		createEAttribute(radialGradientStrokeEClass, RADIAL_GRADIENT_STROKE__PIXEL_HINTING);
		createEReference(radialGradientStrokeEClass, RADIAL_GRADIENT_STROKE__MATRIX);

		gradientEntryEClass = createEClass(GRADIENT_ENTRY);
		createEAttribute(gradientEntryEClass, GRADIENT_ENTRY__COLOR);
		createEAttribute(gradientEntryEClass, GRADIENT_ENTRY__ALPHA);
		createEAttribute(gradientEntryEClass, GRADIENT_ENTRY__RATIO);

		colorTransformEClass = createEClass(COLOR_TRANSFORM);
		createEAttribute(colorTransformEClass, COLOR_TRANSFORM__ALPHA_MULTIPLIER);
		createEAttribute(colorTransformEClass, COLOR_TRANSFORM__ALPHA_OFFSET);
		createEAttribute(colorTransformEClass, COLOR_TRANSFORM__BLUE_MULTIPLIER);
		createEAttribute(colorTransformEClass, COLOR_TRANSFORM__BLUE_OFFSET);
		createEAttribute(colorTransformEClass, COLOR_TRANSFORM__GREEN_MULTIPLIER);
		createEAttribute(colorTransformEClass, COLOR_TRANSFORM__GREEN_OFFSET);
		createEAttribute(colorTransformEClass, COLOR_TRANSFORM__RED_MULTIPLIER);
		createEAttribute(colorTransformEClass, COLOR_TRANSFORM__RED_OFFSET);

		filterEClass = createEClass(FILTER);

		blurFilterEClass = createEClass(BLUR_FILTER);
		createEAttribute(blurFilterEClass, BLUR_FILTER__BLUR_X);
		createEAttribute(blurFilterEClass, BLUR_FILTER__BLUR_Y);
		createEAttribute(blurFilterEClass, BLUR_FILTER__QUALITY);

		dropShadowFilterEClass = createEClass(DROP_SHADOW_FILTER);
		createEAttribute(dropShadowFilterEClass, DROP_SHADOW_FILTER__ALPHA);
		createEAttribute(dropShadowFilterEClass, DROP_SHADOW_FILTER__ANGLE);
		createEAttribute(dropShadowFilterEClass, DROP_SHADOW_FILTER__BLUR_X);
		createEAttribute(dropShadowFilterEClass, DROP_SHADOW_FILTER__BLUR_Y);
		createEAttribute(dropShadowFilterEClass, DROP_SHADOW_FILTER__COLOR);
		createEAttribute(dropShadowFilterEClass, DROP_SHADOW_FILTER__DISTANCE);
		createEAttribute(dropShadowFilterEClass, DROP_SHADOW_FILTER__INNER);
		createEAttribute(dropShadowFilterEClass, DROP_SHADOW_FILTER__HIDE_OBJECT);
		createEAttribute(dropShadowFilterEClass, DROP_SHADOW_FILTER__KNOCKOUT);
		createEAttribute(dropShadowFilterEClass, DROP_SHADOW_FILTER__QUALITY);
		createEAttribute(dropShadowFilterEClass, DROP_SHADOW_FILTER__STRENGTH);

		bevelFilterEClass = createEClass(BEVEL_FILTER);
		createEAttribute(bevelFilterEClass, BEVEL_FILTER__ANGLE);
		createEAttribute(bevelFilterEClass, BEVEL_FILTER__BLUR_X);
		createEAttribute(bevelFilterEClass, BEVEL_FILTER__BLUR_Y);
		createEAttribute(bevelFilterEClass, BEVEL_FILTER__HIGHLIGHT_ALPHA);
		createEAttribute(bevelFilterEClass, BEVEL_FILTER__HIGHLIGHT_COLOR);
		createEAttribute(bevelFilterEClass, BEVEL_FILTER__DISTANCE);
		createEAttribute(bevelFilterEClass, BEVEL_FILTER__KNOCKOUT);
		createEAttribute(bevelFilterEClass, BEVEL_FILTER__QUALITY);
		createEAttribute(bevelFilterEClass, BEVEL_FILTER__SHADOW_ALPHA);
		createEAttribute(bevelFilterEClass, BEVEL_FILTER__SHADOW_COLOR);
		createEAttribute(bevelFilterEClass, BEVEL_FILTER__STRENGTH);
		createEAttribute(bevelFilterEClass, BEVEL_FILTER__TYPE);

		gradientGlowFilterEClass = createEClass(GRADIENT_GLOW_FILTER);
		createEAttribute(gradientGlowFilterEClass, GRADIENT_GLOW_FILTER__ANGLE);
		createEAttribute(gradientGlowFilterEClass, GRADIENT_GLOW_FILTER__BLUR_X);
		createEAttribute(gradientGlowFilterEClass, GRADIENT_GLOW_FILTER__BLUR_Y);
		createEAttribute(gradientGlowFilterEClass, GRADIENT_GLOW_FILTER__DISTANCE);
		createEAttribute(gradientGlowFilterEClass, GRADIENT_GLOW_FILTER__INNER);
		createEAttribute(gradientGlowFilterEClass, GRADIENT_GLOW_FILTER__KNOCKOUT);
		createEAttribute(gradientGlowFilterEClass, GRADIENT_GLOW_FILTER__QUALITY);
		createEAttribute(gradientGlowFilterEClass, GRADIENT_GLOW_FILTER__STRENGTH);

		gradientBevelFilterEClass = createEClass(GRADIENT_BEVEL_FILTER);
		createEAttribute(gradientBevelFilterEClass, GRADIENT_BEVEL_FILTER__ANGLE);
		createEAttribute(gradientBevelFilterEClass, GRADIENT_BEVEL_FILTER__BLUR_X);
		createEAttribute(gradientBevelFilterEClass, GRADIENT_BEVEL_FILTER__BLUR_Y);
		createEAttribute(gradientBevelFilterEClass, GRADIENT_BEVEL_FILTER__DISTANCE);
		createEAttribute(gradientBevelFilterEClass, GRADIENT_BEVEL_FILTER__KNOCKOUT);
		createEAttribute(gradientBevelFilterEClass, GRADIENT_BEVEL_FILTER__QUALITY);
		createEAttribute(gradientBevelFilterEClass, GRADIENT_BEVEL_FILTER__STRENGTH);
		createEAttribute(gradientBevelFilterEClass, GRADIENT_BEVEL_FILTER__TYPE);

		colorMatrixFilterEClass = createEClass(COLOR_MATRIX_FILTER);
		createEAttribute(colorMatrixFilterEClass, COLOR_MATRIX_FILTER__MATRIX);

		fxgElementEClass = createEClass(FXG_ELEMENT);

		containerElementEClass = createEClass(CONTAINER_ELEMENT);
		createEReference(containerElementEClass, CONTAINER_ELEMENT__CHILDREN);

		// Create enums
		blendModeEEnum = createEEnum(BLEND_MODE);
		windingEEnum = createEEnum(WINDING);
		maskTypeEEnum = createEEnum(MASK_TYPE);
		fontStyleEEnum = createEEnum(FONT_STYLE);
		fontWeightEEnum = createEEnum(FONT_WEIGHT);
		textDecorationEEnum = createEEnum(TEXT_DECORATION);
		whitespaceCollapseEEnum = createEEnum(WHITESPACE_COLLAPSE);
		kerningEEnum = createEEnum(KERNING);
		spreadMethodEEnum = createEEnum(SPREAD_METHOD);
		interpolationMethodEEnum = createEEnum(INTERPOLATION_METHOD);
		capEEnum = createEEnum(CAP);
		jointEEnum = createEEnum(JOINT);
		scaleModeEEnum = createEEnum(SCALE_MODE);
		bevelFilterTypeEEnum = createEEnum(BEVEL_FILTER_TYPE);
		fillModeEEnum = createEEnum(FILL_MODE);
		textAlignEEnum = createEEnum(TEXT_ALIGN);
		justificationRuleEEnum = createEEnum(JUSTIFICATION_RULE);
		justificationStyleEEnum = createEEnum(JUSTIFICATION_STYLE);
		textJustifyEEnum = createEEnum(TEXT_JUSTIFY);
		leadingModelEEnum = createEEnum(LEADING_MODEL);
		blockProgressionEEnum = createEEnum(BLOCK_PROGRESSION);
		verticalAlignEEnum = createEEnum(VERTICAL_ALIGN);
		lineBreakEEnum = createEEnum(LINE_BREAK);
		breakOpportunityEEnum = createEEnum(BREAK_OPPORTUNITY);
		digitCaseEEnum = createEEnum(DIGIT_CASE);
		digitWidthEEnum = createEEnum(DIGIT_WIDTH);
		dominantBaselineEEnum = createEEnum(DOMINANT_BASELINE);
		alignmentBaselineEEnum = createEEnum(ALIGNMENT_BASELINE);
		ligatureLevelEEnum = createEEnum(LIGATURE_LEVEL);
		typographicCaseEEnum = createEEnum(TYPOGRAPHIC_CASE);
		textRotationEEnum = createEEnum(TEXT_ROTATION);

		// Create data types
		pathDataEDataType = createEDataType(PATH_DATA);
		angleEDataType = createEDataType(ANGLE);
		lengthEDataType = createEDataType(LENGTH);
		percentEDataType = createEDataType(PERCENT);
		colorEDataType = createEDataType(COLOR);
		alphaEDataType = createEDataType(ALPHA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter containerElementEClass_T = addETypeParameter(containerElementEClass, "T");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getFXGElement());
		containerElementEClass_T.getEBounds().add(g1);

		// Add supertypes to classes
		g1 = createEGenericType(this.getContainerElement());
		EGenericType g2 = createEGenericType(this.getFXGElement());
		g1.getETypeArguments().add(g2);
		graphicEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContainerElement());
		g2 = createEGenericType(this.getDefinition());
		g1.getETypeArguments().add(g2);
		libraryEClass.getEGenericSuperTypes().add(g1);
		privateEClass.getESuperTypes().add(this.getFXGElement());
		g1 = createEGenericType(this.getContainerElement());
		g2 = createEGenericType(this.getGroup());
		g1.getETypeArguments().add(g2);
		definitionEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContainerElement());
		g2 = createEGenericType(this.getFXGElement());
		g1.getETypeArguments().add(g2);
		groupEClass.getEGenericSuperTypes().add(g1);
		transformEClass.getESuperTypes().add(this.getFXGElement());
		placeObjectEClass.getESuperTypes().add(this.getFXGElement());
		matrixEClass.getESuperTypes().add(this.getFXGElement());
		pathEClass.getESuperTypes().add(this.getFXGElement());
		shapeEClass.getESuperTypes().add(this.getFXGElement());
		rectEClass.getESuperTypes().add(this.getShape());
		ellipseEClass.getESuperTypes().add(this.getShape());
		lineEClass.getESuperTypes().add(this.getShape());
		richTextEClass.getESuperTypes().add(this.getFXGElement());
		richTextEClass.getESuperTypes().add(this.getParagraphAttributes());
		richTextEClass.getESuperTypes().add(this.getContainerAttributes());
		richTextEClass.getESuperTypes().add(this.getCharacterAttributes());
		richTextContentContainerEClass.getESuperTypes().add(this.getRichTextContent());
		rawtextEClass.getESuperTypes().add(this.getRichTextContent());
		divEClass.getESuperTypes().add(this.getRichTextContent());
		divEClass.getESuperTypes().add(this.getRichTextContentContainer());
		pEClass.getESuperTypes().add(this.getRichTextContent());
		pEClass.getESuperTypes().add(this.getRichTextContentContainer());
		pEClass.getESuperTypes().add(this.getParagraphAttributes());
		tcyEClass.getESuperTypes().add(this.getRichTextContent());
		tcyEClass.getESuperTypes().add(this.getRichTextContentContainer());
		aEClass.getESuperTypes().add(this.getRichTextContent());
		aEClass.getESuperTypes().add(this.getRichTextContentContainer());
		imgEClass.getESuperTypes().add(this.getRichTextContent());
		spanEClass.getESuperTypes().add(this.getRichTextContent());
		spanEClass.getESuperTypes().add(this.getRichTextContentContainer());
		brEClass.getESuperTypes().add(this.getRichTextContent());
		tabEClass.getESuperTypes().add(this.getRichTextContent());
		linkNormalFormatEClass.getESuperTypes().add(this.getRichTextContent());
		linkHoverFormatEClass.getESuperTypes().add(this.getRichTextContent());
		bitmapImageEClass.getESuperTypes().add(this.getFXGElement());
		fillEClass.getESuperTypes().add(this.getFXGElement());
		solidColorEClass.getESuperTypes().add(this.getFill());
		g1 = createEGenericType(this.getFill());
		linearGradientEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContainerElement());
		g2 = createEGenericType(this.getGradientEntry());
		g1.getETypeArguments().add(g2);
		linearGradientEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFill());
		radialGradientEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContainerElement());
		g2 = createEGenericType(this.getGradientEntry());
		g1.getETypeArguments().add(g2);
		radialGradientEClass.getEGenericSuperTypes().add(g1);
		bitmapFillEClass.getESuperTypes().add(this.getFill());
		strokeEClass.getESuperTypes().add(this.getFXGElement());
		solidColorStrokeEClass.getESuperTypes().add(this.getStroke());
		g1 = createEGenericType(this.getStroke());
		linearGradientStrokeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContainerElement());
		g2 = createEGenericType(this.getGradientEntry());
		g1.getETypeArguments().add(g2);
		linearGradientStrokeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getStroke());
		radialGradientStrokeEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContainerElement());
		g2 = createEGenericType(this.getGradientEntry());
		g1.getETypeArguments().add(g2);
		radialGradientStrokeEClass.getEGenericSuperTypes().add(g1);
		gradientEntryEClass.getESuperTypes().add(this.getFXGElement());
		colorTransformEClass.getESuperTypes().add(this.getFXGElement());
		filterEClass.getESuperTypes().add(this.getFXGElement());
		blurFilterEClass.getESuperTypes().add(this.getFilter());
		dropShadowFilterEClass.getESuperTypes().add(this.getFilter());
		bevelFilterEClass.getESuperTypes().add(this.getFilter());
		g1 = createEGenericType(this.getFilter());
		gradientGlowFilterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContainerElement());
		g2 = createEGenericType(this.getGradientEntry());
		g1.getETypeArguments().add(g2);
		gradientGlowFilterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getFilter());
		gradientBevelFilterEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getContainerElement());
		g2 = createEGenericType(this.getGradientEntry());
		g1.getETypeArguments().add(g2);
		gradientBevelFilterEClass.getEGenericSuperTypes().add(g1);
		colorMatrixFilterEClass.getESuperTypes().add(this.getFilter());
		containerElementEClass.getESuperTypes().add(this.getFXGElement());

		// Initialize classes and features; add operations and parameters
		initEClass(graphicEClass, Graphic.class, "Graphic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGraphic_ScaleGridLeft(), ecorePackage.getEString(), "scaleGridLeft", null, 0, 1, Graphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphic_ScaleGridRight(), ecorePackage.getEString(), "scaleGridRight", null, 0, 1, Graphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphic_ScaleGridTop(), ecorePackage.getEString(), "scaleGridTop", null, 0, 1, Graphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphic_ScaleGridBottom(), ecorePackage.getEString(), "scaleGridBottom", null, 0, 1, Graphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphic_ViewWidth(), ecorePackage.getEInt(), "viewWidth", null, 0, 1, Graphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphic_ViewHeight(), ecorePackage.getEInt(), "viewHeight", null, 0, 1, Graphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGraphic_Version(), ecorePackage.getEString(), "version", null, 0, 1, Graphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraphic_Mask(), this.getGroup(), null, "mask", null, 0, 1, Graphic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(libraryEClass, Library.class, "Library", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(privateEClass, Private.class, "Private", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(definitionEClass, Definition.class, "Definition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, Definition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(groupEClass, Group.class, "Group", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGroup_Rotation(), ecorePackage.getEString(), "rotation", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_ScaleX(), ecorePackage.getEString(), "scaleX", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_ScaleY(), ecorePackage.getEString(), "scaleY", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_X(), ecorePackage.getEString(), "x", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Y(), ecorePackage.getEString(), "y", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_BlendMode(), this.getBlendMode(), "blendMode", "BlendMode.NOT_SET", 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Alpha(), this.getAlpha(), "alpha", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Id(), ecorePackage.getEString(), "id", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_TransformX(), ecorePackage.getEString(), "transformX", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_TransformY(), ecorePackage.getEString(), "transformY", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_MaskType(), ecorePackage.getEString(), "maskType", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_Visible(), ecorePackage.getEString(), "visible", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_ScaleGridLeft(), ecorePackage.getEString(), "scaleGridLeft", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_ScaleGridRight(), ecorePackage.getEString(), "scaleGridRight", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_ScaleGridTop(), ecorePackage.getEString(), "scaleGridTop", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGroup_ScaleGridBottom(), ecorePackage.getEString(), "scaleGridBottom", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Transform(), this.getTransform(), null, "transform", null, 0, 1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGroup_Filters(), this.getFilter(), null, "filters", null, 0, -1, Group.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformEClass, Transform.class, "Transform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransform_Matrix(), this.getMatrix(), null, "matrix", null, 0, 1, Transform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransform_ColorTransform(), this.getColorTransform(), null, "colorTransform", null, 0, 1, Transform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(placeObjectEClass, PlaceObject.class, "PlaceObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlaceObject_Id(), ecorePackage.getEString(), "id", null, 0, 1, PlaceObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaceObject_Transform(), this.getTransform(), null, "transform", null, 0, 1, PlaceObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaceObject_Filters(), this.getFilter(), null, "filters", null, 0, -1, PlaceObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlaceObject_Mask(), this.getGroup(), null, "mask", null, 0, 1, PlaceObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(matrixEClass, Matrix.class, "Matrix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMatrix_A(), ecorePackage.getEDoubleObject(), "a", null, 0, 1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix_B(), ecorePackage.getEDoubleObject(), "b", null, 0, 1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix_C(), ecorePackage.getEDoubleObject(), "c", null, 0, 1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix_D(), ecorePackage.getEDoubleObject(), "d", null, 0, 1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix_Tx(), ecorePackage.getEDoubleObject(), "tx", null, 0, 1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMatrix_Ty(), ecorePackage.getEDoubleObject(), "ty", null, 0, 1, Matrix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pathEClass, Path.class, "Path", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPath_Data(), this.getPathData(), "data", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPath_X(), ecorePackage.getEDoubleObject(), "x", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPath_Y(), ecorePackage.getEDoubleObject(), "y", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPath_Rotation(), this.getAngle(), "rotation", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPath_ScaleX(), ecorePackage.getEDoubleObject(), "scaleX", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPath_ScaleY(), ecorePackage.getEDoubleObject(), "scaleY", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPath_BlendMode(), this.getBlendMode(), "blendMode", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPath_Visible(), ecorePackage.getEBooleanObject(), "visible", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPath_Alpha(), ecorePackage.getEDoubleObject(), "alpha", "1", 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPath_Winding(), this.getWinding(), "winding", "Winding.NOT_SET", 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPath_Fill(), this.getFill(), null, "fill", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPath_Stroke(), this.getStroke(), null, "stroke", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPath_Filters(), this.getFilter(), null, "filters", null, 0, -1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPath_Transform(), this.getTransform(), null, "transform", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPath_Mask(), this.getGroup(), null, "mask", null, 0, 1, Path.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(shapeEClass, Shape.class, "Shape", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rectEClass, Rect.class, "Rect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRect_Width(), this.getLength(), "width", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_Height(), this.getLength(), "height", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_RadiusX(), this.getLength(), "radiusX", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_RadiusY(), this.getLength(), "radiusY", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_TopLeftRadiusX(), this.getLength(), "topLeftRadiusX", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_TopLeftRadiusY(), this.getLength(), "topLeftRadiusY", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_TopRightRadiusX(), this.getLength(), "topRightRadiusX", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_TopRightRadiusY(), this.getLength(), "topRightRadiusY", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_BottomLeftRadiusX(), this.getLength(), "bottomLeftRadiusX", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_BottomLeftRadiusY(), this.getLength(), "bottomLeftRadiusY", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_BottomRightRadiusX(), this.getLength(), "bottomRightRadiusX", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_BottomRightRadiusY(), this.getLength(), "bottomRightRadiusY", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_X(), ecorePackage.getEDoubleObject(), "x", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_Y(), ecorePackage.getEDoubleObject(), "y", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_Rotation(), this.getAngle(), "rotation", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_ScaleX(), ecorePackage.getEDoubleObject(), "scaleX", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_ScaleY(), ecorePackage.getEDoubleObject(), "scaleY", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_BlendMode(), this.getBlendMode(), "blendMode", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_Visible(), ecorePackage.getEBooleanObject(), "visible", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRect_Alpha(), this.getAlpha(), "alpha", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRect_Transform(), this.getTransform(), null, "transform", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRect_Filters(), this.getFilter(), null, "filters", null, 0, -1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRect_Fill(), this.getFill(), null, "fill", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRect_Stroke(), this.getStroke(), null, "stroke", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRect_Mask(), this.getGroup(), null, "mask", null, 0, 1, Rect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ellipseEClass, Ellipse.class, "Ellipse", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEllipse_Alpha(), this.getAlpha(), "alpha", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEllipse_Width(), this.getLength(), "width", "\"0\"", 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEllipse_Height(), this.getLength(), "height", "\"0\"", 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEllipse_X(), ecorePackage.getEDoubleObject(), "x", "0", 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEllipse_Y(), ecorePackage.getEDoubleObject(), "y", "0", 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEllipse_Rotation(), this.getAngle(), "rotation", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEllipse_ScaleX(), ecorePackage.getEDoubleObject(), "scaleX", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEllipse_ScaleY(), ecorePackage.getEDoubleObject(), "scaleY", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEllipse_BlendMode(), this.getBlendMode(), "blendMode", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEllipse_Visible(), ecorePackage.getEBooleanObject(), "visible", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEllipse_Transform(), this.getTransform(), null, "transform", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEllipse_Filters(), this.getFilter(), null, "filters", null, 0, -1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEllipse_Fill(), this.getFill(), null, "fill", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEllipse_Stroke(), this.getStroke(), null, "stroke", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEllipse_Mask(), this.getGroup(), null, "mask", null, 0, 1, Ellipse.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineEClass, Line.class, "Line", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLine_XFrom(), ecorePackage.getEDoubleObject(), "xFrom", "0", 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_YFrom(), ecorePackage.getEDoubleObject(), "yFrom", "0", 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_XTo(), ecorePackage.getEDoubleObject(), "xTo", "0", 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_YTo(), ecorePackage.getEDoubleObject(), "yTo", "0", 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_X(), ecorePackage.getEDoubleObject(), "x", "0", 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_Y(), ecorePackage.getEDoubleObject(), "y", "0", 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_Rotation(), this.getAngle(), "rotation", "0", 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_ScaleX(), ecorePackage.getEDoubleObject(), "scaleX", "1", 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_ScaleY(), ecorePackage.getEDoubleObject(), "scaleY", "1", 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_BlendMode(), this.getBlendMode(), "blendMode", "BlendMode.LAYER", 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_Alpha(), ecorePackage.getEDoubleObject(), "alpha", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_Id(), ecorePackage.getEString(), "id", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_MaskType(), this.getMaskType(), "maskType", "MaskType.CLIP", 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLine_Visible(), ecorePackage.getEBooleanObject(), "visible", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_Transform(), this.getTransform(), null, "transform", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_Filters(), this.getFilter(), null, "filters", null, 0, -1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_Fill(), this.getFill(), null, "fill", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_Stroke(), this.getStroke(), null, "stroke", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLine_Mask(), this.getGroup(), null, "mask", null, 0, 1, Line.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richTextEClass, RichText.class, "RichText", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRichText_Rotation(), this.getAngle(), "rotation", "0", 0, 1, RichText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichText_ScaleX(), ecorePackage.getEDoubleObject(), "scaleX", "1", 0, 1, RichText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichText_ScaleY(), ecorePackage.getEDoubleObject(), "scaleY", "1", 0, 1, RichText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichText_X(), ecorePackage.getEDoubleObject(), "x", null, 0, 1, RichText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichText_Y(), ecorePackage.getEDoubleObject(), "y", null, 0, 1, RichText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichText_BlendMode(), this.getBlendMode(), "blendMode", "BlendMode.LAYER", 0, 1, RichText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichText_Alpha(), ecorePackage.getEDoubleObject(), "alpha", null, 0, 1, RichText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichText_Id(), ecorePackage.getEString(), "id", null, 0, 1, RichText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichText_MaskType(), this.getMaskType(), "maskType", "MaskType.CLIP", 0, 1, RichText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichText_Visible(), ecorePackage.getEBooleanObject(), "visible", null, 0, 1, RichText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichText_Width(), ecorePackage.getEDoubleObject(), "width", null, 0, 1, RichText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichText_Height(), ecorePackage.getEDoubleObject(), "height", null, 0, 1, RichText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRichText_Content(), this.getRichTextContent(), null, "content", null, 0, -1, RichText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRichText__tempcontent(), ecorePackage.getEString(), "_tempcontent", null, 0, 1, RichText.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(richTextContentEClass, RichTextContent.class, "RichTextContent", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(richTextContentContainerEClass, RichTextContentContainer.class, "RichTextContentContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRichTextContentContainer__children(), this.getRichTextContent(), null, "_children", null, 0, -1, RichTextContentContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paragraphAttributesEClass, ParagraphAttributes.class, "ParagraphAttributes", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParagraphAttributes_TextAlign(), this.getTextAlign(), "textAlign", null, 0, 1, ParagraphAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraphAttributes_TextAlignLast(), this.getTextAlign(), "textAlignLast", null, 0, 1, ParagraphAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraphAttributes_TextIndent(), ecorePackage.getEDoubleObject(), "textIndent", null, 0, 1, ParagraphAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraphAttributes_ParagraphStartIndent(), ecorePackage.getEString(), "paragraphStartIndent", null, 0, 1, ParagraphAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraphAttributes_ParagraphEndIndent(), ecorePackage.getEString(), "paragraphEndIndent", null, 0, 1, ParagraphAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraphAttributes_ParagraphSpaceBefore(), ecorePackage.getEString(), "paragraphSpaceBefore", null, 0, 1, ParagraphAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraphAttributes_ParagraphSpaceAfter(), ecorePackage.getEString(), "paragraphSpaceAfter", null, 0, 1, ParagraphAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraphAttributes_JustificationRule(), this.getJustificationRule(), "justificationRule", null, 0, 1, ParagraphAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraphAttributes_JustificationStyle(), this.getJustificationStyle(), "justificationStyle", null, 0, 1, ParagraphAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraphAttributes_TextJustify(), this.getTextJustify(), "textJustify", null, 0, 1, ParagraphAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraphAttributes_LeadingModel(), this.getLeadingModel(), "leadingModel", null, 0, 1, ParagraphAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParagraphAttributes_TabStops(), ecorePackage.getEString(), "tabStops", null, 0, 1, ParagraphAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(containerAttributesEClass, ContainerAttributes.class, "ContainerAttributes", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContainerAttributes_BlockProgression(), this.getBlockProgression(), "blockProgression", null, 0, 1, ContainerAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerAttributes_PaddingLeft(), ecorePackage.getEDoubleObject(), "paddingLeft", null, 0, 1, ContainerAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerAttributes_PaddingRight(), ecorePackage.getEDoubleObject(), "paddingRight", null, 0, 1, ContainerAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerAttributes_PaddingTop(), ecorePackage.getEDoubleObject(), "paddingTop", null, 0, 1, ContainerAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerAttributes_PaddingBottom(), ecorePackage.getEDoubleObject(), "paddingBottom", null, 0, 1, ContainerAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerAttributes_ColumnGap(), ecorePackage.getEDoubleObject(), "columnGap", null, 0, 1, ContainerAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerAttributes_ColumnCount(), ecorePackage.getEString(), "columnCount", null, 0, 1, ContainerAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerAttributes_ColumnWidth(), ecorePackage.getEString(), "columnWidth", null, 0, 1, ContainerAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerAttributes_FirstBaselineOffset(), ecorePackage.getEString(), "firstBaselineOffset", null, 0, 1, ContainerAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerAttributes_VerticalAlign(), this.getVerticalAlign(), "verticalAlign", null, 0, 1, ContainerAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContainerAttributes_LineBreak(), this.getLineBreak(), "lineBreak", null, 0, 1, ContainerAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(characterAttributesEClass, CharacterAttributes.class, "CharacterAttributes", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharacterAttributes_FontFamily(), ecorePackage.getEString(), "fontFamily", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_FontSize(), ecorePackage.getEDoubleObject(), "fontSize", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_FontStyle(), this.getFontStyle(), "fontStyle", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_FontWeight(), this.getFontWeight(), "fontWeight", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_LineHeight(), ecorePackage.getEString(), "lineHeight", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_TextDecoration(), this.getTextDecoration(), "textDecoration", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_LineThrough(), ecorePackage.getEBooleanObject(), "lineThrough", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_Color(), this.getColor(), "color", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_TextAlpha(), this.getAlpha(), "textAlpha", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_WhiteSpaceCollapse(), this.getWhitespaceCollapse(), "whiteSpaceCollapse", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_Kerning(), this.getKerning(), "kerning", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_BackgroundAlpha(), this.getAlpha(), "backgroundAlpha", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_BackgroundColor(), this.getColor(), "backgroundColor", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_BaselineShift(), ecorePackage.getEString(), "baselineShift", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_BreakOpportunity(), this.getBreakOpportunity(), "breakOpportunity", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_DigitCase(), this.getDigitCase(), "digitCase", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_DigitWidth(), this.getDigitWidth(), "digitWidth", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_DominantBaseline(), this.getDominantBaseline(), "dominantBaseline", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_AlignmentBaseline(), this.getAlignmentBaseline(), "alignmentBaseline", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_LigatureLevel(), this.getLigatureLevel(), "ligatureLevel", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_Locale(), ecorePackage.getEString(), "locale", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_TypographicCase(), this.getTypographicCase(), "typographicCase", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_TextRotation(), this.getTextRotation(), "textRotation", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_TrackingLeft(), ecorePackage.getEString(), "trackingLeft", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharacterAttributes_TrackingRight(), ecorePackage.getEString(), "trackingRight", null, 0, 1, CharacterAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rawtextEClass, rawtext.class, "rawtext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getrawtext__text(), ecorePackage.getEString(), "_text", null, 0, 1, rawtext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(divEClass, div.class, "div", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pEClass, p.class, "p", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tcyEClass, tcy.class, "tcy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(aEClass, a.class, "a", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(imgEClass, img.class, "img", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spanEClass, span.class, "span", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(brEClass, br.class, "br", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tabEClass, tab.class, "tab", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkNormalFormatEClass, linkNormalFormat.class, "linkNormalFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkHoverFormatEClass, linkHoverFormat.class, "linkHoverFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(linkActiveFormatEClass, linkActiveFormat.class, "linkActiveFormat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bitmapImageEClass, BitmapImage.class, "BitmapImage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBitmapImage_X(), ecorePackage.getEDoubleObject(), "x", null, 0, 1, BitmapImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmapImage_Y(), ecorePackage.getEDoubleObject(), "y", null, 0, 1, BitmapImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmapImage_Width(), ecorePackage.getEDoubleObject(), "width", null, 0, 1, BitmapImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmapImage_Height(), ecorePackage.getEDoubleObject(), "height", null, 0, 1, BitmapImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmapImage_Rotation(), ecorePackage.getEDoubleObject(), "rotation", null, 0, 1, BitmapImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmapImage_ScaleX(), ecorePackage.getEDoubleObject(), "scaleX", null, 0, 1, BitmapImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmapImage_ScaleY(), ecorePackage.getEDoubleObject(), "scaleY", null, 0, 1, BitmapImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmapImage_FillMode(), this.getFillMode(), "fillMode", null, 0, 1, BitmapImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmapImage_Source(), ecorePackage.getEString(), "source", null, 0, 1, BitmapImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmapImage_Visible(), ecorePackage.getEBooleanObject(), "visible", null, 0, 1, BitmapImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmapImage_Alpha(), ecorePackage.getEDoubleObject(), "alpha", null, 0, 1, BitmapImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmapImage_BlendMode(), this.getBlendMode(), "blendMode", null, 0, 1, BitmapImage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fillEClass, Fill.class, "Fill", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solidColorEClass, SolidColor.class, "SolidColor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolidColor_Alpha(), this.getAlpha(), "alpha", null, 0, 1, SolidColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolidColor_Color(), this.getColor(), "color", null, 0, 1, SolidColor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linearGradientEClass, LinearGradient.class, "LinearGradient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinearGradient_X(), ecorePackage.getEDoubleObject(), "x", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradient_Y(), ecorePackage.getEDoubleObject(), "y", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradient_ScaleX(), ecorePackage.getEDoubleObject(), "scaleX", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradient_Rotation(), this.getAngle(), "rotation", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradient_SpreadMethod(), this.getSpreadMethod(), "spreadMethod", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradient_InterpolationMethod(), this.getInterpolationMethod(), "interpolationMethod", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinearGradient_Matrix(), this.getMatrix(), null, "matrix", null, 0, 1, LinearGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(radialGradientEClass, RadialGradient.class, "RadialGradient", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRadialGradient_X(), ecorePackage.getEDoubleObject(), "x", null, 0, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradient_Y(), ecorePackage.getEDoubleObject(), "y", null, 0, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradient_ScaleX(), ecorePackage.getEDoubleObject(), "scaleX", null, 0, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradient_ScaleY(), ecorePackage.getEDoubleObject(), "scaleY", null, 0, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradient_Rotation(), this.getAngle(), "rotation", null, 0, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradient_SpreadMethod(), this.getSpreadMethod(), "spreadMethod", "SpreadMethod.NOT_SET", 0, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradient_InterpolationMethod(), this.getInterpolationMethod(), "interpolationMethod", "InterpolationMethod.NOT_SET", 0, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradient_FocalPointRatio(), ecorePackage.getEDoubleObject(), "focalPointRatio", null, 0, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRadialGradient_Matrix(), this.getMatrix(), null, "matrix", null, 0, 1, RadialGradient.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bitmapFillEClass, BitmapFill.class, "BitmapFill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBitmapFill_X(), ecorePackage.getEDoubleObject(), "x", null, 0, 1, BitmapFill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmapFill_Y(), ecorePackage.getEDoubleObject(), "y", null, 0, 1, BitmapFill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmapFill_ScaleX(), ecorePackage.getEDoubleObject(), "scaleX", null, 0, 1, BitmapFill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmapFill_ScaleY(), ecorePackage.getEDoubleObject(), "scaleY", null, 0, 1, BitmapFill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmapFill_Rotation(), this.getAngle(), "rotation", null, 0, 1, BitmapFill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmapFill_Source(), ecorePackage.getEString(), "source", null, 0, 1, BitmapFill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBitmapFill_FillMode(), this.getFillMode(), "fillMode", null, 0, 1, BitmapFill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBitmapFill_Matrix(), this.getMatrix(), null, "matrix", null, 0, 1, BitmapFill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strokeEClass, Stroke.class, "Stroke", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(solidColorStrokeEClass, SolidColorStroke.class, "SolidColorStroke", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSolidColorStroke_Alpha(), this.getAlpha(), "alpha", null, 0, 1, SolidColorStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolidColorStroke_Caps(), this.getCap(), "caps", null, 0, 1, SolidColorStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolidColorStroke_Color(), this.getColor(), "color", null, 0, 1, SolidColorStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolidColorStroke_Joints(), this.getJoint(), "joints", null, 0, 1, SolidColorStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolidColorStroke_MiterLimit(), ecorePackage.getEDoubleObject(), "miterLimit", null, 0, 1, SolidColorStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolidColorStroke_PixelHinting(), ecorePackage.getEBooleanObject(), "pixelHinting", null, 0, 1, SolidColorStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolidColorStroke_ScaleMode(), this.getScaleMode(), "scaleMode", null, 0, 1, SolidColorStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSolidColorStroke_Weight(), ecorePackage.getEDoubleObject(), "weight", null, 0, 1, SolidColorStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linearGradientStrokeEClass, LinearGradientStroke.class, "LinearGradientStroke", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinearGradientStroke_X(), ecorePackage.getEDoubleObject(), "x", null, 0, 1, LinearGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientStroke_Y(), ecorePackage.getEDoubleObject(), "y", null, 0, 1, LinearGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientStroke_ScaleX(), ecorePackage.getEDoubleObject(), "scaleX", null, 0, 1, LinearGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientStroke_Rotation(), this.getAngle(), "rotation", null, 0, 1, LinearGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientStroke_SpreadMethod(), this.getSpreadMethod(), "spreadMethod", null, 0, 1, LinearGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientStroke_InterpolationMethod(), this.getInterpolationMethod(), "interpolationMethod", null, 0, 1, LinearGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientStroke_ScaleMode(), this.getScaleMode(), "scaleMode", null, 0, 1, LinearGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientStroke_Caps(), this.getCap(), "caps", null, 0, 1, LinearGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientStroke_Joints(), this.getJoint(), "joints", null, 0, 1, LinearGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientStroke_MiterLimit(), ecorePackage.getEDoubleObject(), "miterLimit", null, 0, 1, LinearGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientStroke_Weight(), ecorePackage.getEDoubleObject(), "weight", null, 0, 1, LinearGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinearGradientStroke_PixelHinting(), ecorePackage.getEBooleanObject(), "pixelHinting", null, 0, 1, LinearGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLinearGradientStroke_Matrix(), this.getMatrix(), null, "matrix", null, 0, 1, LinearGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(radialGradientStrokeEClass, RadialGradientStroke.class, "RadialGradientStroke", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRadialGradientStroke_X(), ecorePackage.getEDoubleObject(), "x", null, 0, 1, RadialGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientStroke_Y(), ecorePackage.getEDoubleObject(), "y", null, 0, 1, RadialGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientStroke_ScaleX(), ecorePackage.getEDoubleObject(), "scaleX", null, 0, 1, RadialGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientStroke_ScaleY(), ecorePackage.getEDoubleObject(), "scaleY", null, 0, 1, RadialGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientStroke_Rotation(), this.getAngle(), "rotation", null, 0, 1, RadialGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientStroke_SpreadMethod(), this.getSpreadMethod(), "spreadMethod", null, 0, 1, RadialGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientStroke_InterpolationMethod(), this.getInterpolationMethod(), "interpolationMethod", null, 0, 1, RadialGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientStroke_FocalPointRatio(), ecorePackage.getEDoubleObject(), "focalPointRatio", null, 0, 1, RadialGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientStroke_ScaleMode(), this.getScaleMode(), "scaleMode", null, 0, 1, RadialGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientStroke_Caps(), this.getCap(), "caps", null, 0, 1, RadialGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientStroke_Joints(), this.getJoint(), "joints", null, 0, 1, RadialGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientStroke_MiterLimit(), ecorePackage.getEDoubleObject(), "miterLimit", null, 0, 1, RadialGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientStroke_Weight(), ecorePackage.getEDoubleObject(), "weight", null, 0, 1, RadialGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRadialGradientStroke_PixelHinting(), ecorePackage.getEBooleanObject(), "pixelHinting", null, 0, 1, RadialGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRadialGradientStroke_Matrix(), this.getMatrix(), null, "matrix", null, 0, 1, RadialGradientStroke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradientEntryEClass, GradientEntry.class, "GradientEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGradientEntry_Color(), this.getColor(), "color", null, 0, 1, GradientEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientEntry_Alpha(), this.getAlpha(), "alpha", null, 0, 1, GradientEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientEntry_Ratio(), ecorePackage.getEDoubleObject(), "ratio", null, 0, 1, GradientEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorTransformEClass, ColorTransform.class, "ColorTransform", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorTransform_AlphaMultiplier(), ecorePackage.getEDoubleObject(), "alphaMultiplier", null, 0, 1, ColorTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorTransform_AlphaOffset(), ecorePackage.getEDoubleObject(), "alphaOffset", null, 0, 1, ColorTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorTransform_BlueMultiplier(), ecorePackage.getEDoubleObject(), "blueMultiplier", null, 0, 1, ColorTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorTransform_BlueOffset(), ecorePackage.getEDoubleObject(), "blueOffset", null, 0, 1, ColorTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorTransform_GreenMultiplier(), ecorePackage.getEDoubleObject(), "greenMultiplier", null, 0, 1, ColorTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorTransform_GreenOffset(), ecorePackage.getEDoubleObject(), "greenOffset", null, 0, 1, ColorTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorTransform_RedMultiplier(), ecorePackage.getEDoubleObject(), "redMultiplier", null, 0, 1, ColorTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColorTransform_RedOffset(), ecorePackage.getEDoubleObject(), "redOffset", null, 0, 1, ColorTransform.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(filterEClass, Filter.class, "Filter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(blurFilterEClass, BlurFilter.class, "BlurFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlurFilter_BlurX(), ecorePackage.getEDoubleObject(), "blurX", null, 0, 1, BlurFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlurFilter_BlurY(), ecorePackage.getEDoubleObject(), "blurY", null, 0, 1, BlurFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBlurFilter_Quality(), ecorePackage.getEDoubleObject(), "quality", null, 0, 1, BlurFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dropShadowFilterEClass, DropShadowFilter.class, "DropShadowFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDropShadowFilter_Alpha(), this.getAlpha(), "alpha", null, 0, 1, DropShadowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropShadowFilter_Angle(), this.getAngle(), "angle", null, 0, 1, DropShadowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropShadowFilter_BlurX(), ecorePackage.getEDoubleObject(), "blurX", null, 0, 1, DropShadowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropShadowFilter_BlurY(), ecorePackage.getEDoubleObject(), "blurY", null, 0, 1, DropShadowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropShadowFilter_Color(), this.getColor(), "color", null, 0, 1, DropShadowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropShadowFilter_Distance(), ecorePackage.getEDoubleObject(), "distance", null, 0, 1, DropShadowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropShadowFilter_Inner(), ecorePackage.getEBooleanObject(), "inner", null, 0, 1, DropShadowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropShadowFilter_HideObject(), ecorePackage.getEBooleanObject(), "hideObject", null, 0, 1, DropShadowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropShadowFilter_Knockout(), ecorePackage.getEBooleanObject(), "knockout", null, 0, 1, DropShadowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropShadowFilter_Quality(), ecorePackage.getEDoubleObject(), "quality", null, 0, 1, DropShadowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDropShadowFilter_Strength(), ecorePackage.getEDoubleObject(), "strength", null, 0, 1, DropShadowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bevelFilterEClass, BevelFilter.class, "BevelFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBevelFilter_Angle(), this.getAngle(), "angle", null, 0, 1, BevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBevelFilter_BlurX(), ecorePackage.getEDoubleObject(), "blurX", null, 0, 1, BevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBevelFilter_BlurY(), ecorePackage.getEDoubleObject(), "blurY", null, 0, 1, BevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBevelFilter_HighlightAlpha(), this.getAlpha(), "highlightAlpha", null, 0, 1, BevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBevelFilter_HighlightColor(), this.getColor(), "highlightColor", null, 0, 1, BevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBevelFilter_Distance(), ecorePackage.getEDoubleObject(), "distance", null, 0, 1, BevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBevelFilter_Knockout(), ecorePackage.getEBooleanObject(), "knockout", null, 0, 1, BevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBevelFilter_Quality(), ecorePackage.getEDoubleObject(), "quality", null, 0, 1, BevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBevelFilter_ShadowAlpha(), this.getAlpha(), "shadowAlpha", null, 0, 1, BevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBevelFilter_ShadowColor(), this.getColor(), "shadowColor", null, 0, 1, BevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBevelFilter_Strength(), ecorePackage.getEDoubleObject(), "strength", null, 0, 1, BevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBevelFilter_Type(), this.getBevelFilterType(), "type", null, 0, 1, BevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradientGlowFilterEClass, GradientGlowFilter.class, "GradientGlowFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGradientGlowFilter_Angle(), this.getAngle(), "angle", null, 0, 1, GradientGlowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientGlowFilter_BlurX(), ecorePackage.getEDoubleObject(), "blurX", null, 0, 1, GradientGlowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientGlowFilter_BlurY(), ecorePackage.getEDoubleObject(), "blurY", null, 0, 1, GradientGlowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientGlowFilter_Distance(), ecorePackage.getEDoubleObject(), "distance", null, 0, 1, GradientGlowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientGlowFilter_Inner(), ecorePackage.getEBooleanObject(), "inner", null, 0, 1, GradientGlowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientGlowFilter_Knockout(), ecorePackage.getEBooleanObject(), "knockout", null, 0, 1, GradientGlowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientGlowFilter_Quality(), ecorePackage.getEDoubleObject(), "quality", null, 0, 1, GradientGlowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientGlowFilter_Strength(), ecorePackage.getEDoubleObject(), "strength", null, 0, 1, GradientGlowFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gradientBevelFilterEClass, GradientBevelFilter.class, "GradientBevelFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGradientBevelFilter_Angle(), this.getAngle(), "angle", null, 0, 1, GradientBevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientBevelFilter_BlurX(), ecorePackage.getEDoubleObject(), "blurX", null, 0, 1, GradientBevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientBevelFilter_BlurY(), ecorePackage.getEDoubleObject(), "blurY", null, 0, 1, GradientBevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientBevelFilter_Distance(), ecorePackage.getEDoubleObject(), "distance", null, 0, 1, GradientBevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientBevelFilter_Knockout(), ecorePackage.getEBooleanObject(), "knockout", null, 0, 1, GradientBevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientBevelFilter_Quality(), ecorePackage.getEDoubleObject(), "quality", null, 0, 1, GradientBevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientBevelFilter_Strength(), ecorePackage.getEDoubleObject(), "strength", null, 0, 1, GradientBevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGradientBevelFilter_Type(), this.getBevelFilterType(), "type", null, 0, 1, GradientBevelFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colorMatrixFilterEClass, ColorMatrixFilter.class, "ColorMatrixFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColorMatrixFilter_Matrix(), ecorePackage.getEString(), "matrix", null, 0, 1, ColorMatrixFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fxgElementEClass, FXGElement.class, "FXGElement", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(containerElementEClass, ContainerElement.class, "ContainerElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		g1 = createEGenericType(containerElementEClass_T);
		initEReference(getContainerElement__children(), g1, null, "_children", null, 0, -1, ContainerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(blendModeEEnum, BlendMode.class, "BlendMode");
		addEEnumLiteral(blendModeEEnum, BlendMode.NOT_SET);
		addEEnumLiteral(blendModeEEnum, BlendMode.ADD);
		addEEnumLiteral(blendModeEEnum, BlendMode.ALPHA);
		addEEnumLiteral(blendModeEEnum, BlendMode.DARKEN);
		addEEnumLiteral(blendModeEEnum, BlendMode.DIFFERENCE);
		addEEnumLiteral(blendModeEEnum, BlendMode.ERASE);
		addEEnumLiteral(blendModeEEnum, BlendMode.HARDLIGHT);
		addEEnumLiteral(blendModeEEnum, BlendMode.INVERT);
		addEEnumLiteral(blendModeEEnum, BlendMode.LAYER);
		addEEnumLiteral(blendModeEEnum, BlendMode.LIGHTEN);
		addEEnumLiteral(blendModeEEnum, BlendMode.MULTIPLY);
		addEEnumLiteral(blendModeEEnum, BlendMode.NORMAL);
		addEEnumLiteral(blendModeEEnum, BlendMode.OVERLAY);
		addEEnumLiteral(blendModeEEnum, BlendMode.SCREEN);
		addEEnumLiteral(blendModeEEnum, BlendMode.SHADER);
		addEEnumLiteral(blendModeEEnum, BlendMode.SUBTRACT);

		initEEnum(windingEEnum, Winding.class, "Winding");
		addEEnumLiteral(windingEEnum, Winding.NOT_SET);
		addEEnumLiteral(windingEEnum, Winding.EVEN_ODD);
		addEEnumLiteral(windingEEnum, Winding.NON_ZERO);

		initEEnum(maskTypeEEnum, MaskType.class, "MaskType");
		addEEnumLiteral(maskTypeEEnum, MaskType.CLIP);
		addEEnumLiteral(maskTypeEEnum, MaskType.ALPHA);

		initEEnum(fontStyleEEnum, FontStyle.class, "FontStyle");
		addEEnumLiteral(fontStyleEEnum, FontStyle.NORMAL);
		addEEnumLiteral(fontStyleEEnum, FontStyle.ITALIC);

		initEEnum(fontWeightEEnum, FontWeight.class, "FontWeight");
		addEEnumLiteral(fontWeightEEnum, FontWeight.NORMAL);
		addEEnumLiteral(fontWeightEEnum, FontWeight.BOLD);

		initEEnum(textDecorationEEnum, TextDecoration.class, "TextDecoration");
		addEEnumLiteral(textDecorationEEnum, TextDecoration.NONE);
		addEEnumLiteral(textDecorationEEnum, TextDecoration.UNDERLINE);

		initEEnum(whitespaceCollapseEEnum, WhitespaceCollapse.class, "WhitespaceCollapse");
		addEEnumLiteral(whitespaceCollapseEEnum, WhitespaceCollapse.PRESERVE);
		addEEnumLiteral(whitespaceCollapseEEnum, WhitespaceCollapse.COLLAPSE);

		initEEnum(kerningEEnum, Kerning.class, "Kerning");
		addEEnumLiteral(kerningEEnum, Kerning.ON);
		addEEnumLiteral(kerningEEnum, Kerning.OFF);
		addEEnumLiteral(kerningEEnum, Kerning.AUTO);

		initEEnum(spreadMethodEEnum, SpreadMethod.class, "SpreadMethod");
		addEEnumLiteral(spreadMethodEEnum, SpreadMethod.NOT_SET);
		addEEnumLiteral(spreadMethodEEnum, SpreadMethod.PAD);
		addEEnumLiteral(spreadMethodEEnum, SpreadMethod.REFLECT);
		addEEnumLiteral(spreadMethodEEnum, SpreadMethod.REPEAT);

		initEEnum(interpolationMethodEEnum, InterpolationMethod.class, "InterpolationMethod");
		addEEnumLiteral(interpolationMethodEEnum, InterpolationMethod.NOT_SET);
		addEEnumLiteral(interpolationMethodEEnum, InterpolationMethod.RGB);
		addEEnumLiteral(interpolationMethodEEnum, InterpolationMethod.LINEAR_RGB);

		initEEnum(capEEnum, Cap.class, "Cap");
		addEEnumLiteral(capEEnum, Cap.ROUND);
		addEEnumLiteral(capEEnum, Cap.SQUARE);
		addEEnumLiteral(capEEnum, Cap.NONE);

		initEEnum(jointEEnum, Joint.class, "Joint");
		addEEnumLiteral(jointEEnum, Joint.ROUND);
		addEEnumLiteral(jointEEnum, Joint.MITER);
		addEEnumLiteral(jointEEnum, Joint.BEVEL);

		initEEnum(scaleModeEEnum, ScaleMode.class, "ScaleMode");
		addEEnumLiteral(scaleModeEEnum, ScaleMode.NORMAL);
		addEEnumLiteral(scaleModeEEnum, ScaleMode.NONE);
		addEEnumLiteral(scaleModeEEnum, ScaleMode.HORIZONTAL);
		addEEnumLiteral(scaleModeEEnum, ScaleMode.VERTICAL);

		initEEnum(bevelFilterTypeEEnum, BevelFilterType.class, "BevelFilterType");
		addEEnumLiteral(bevelFilterTypeEEnum, BevelFilterType.INNER);
		addEEnumLiteral(bevelFilterTypeEEnum, BevelFilterType.OUTER);
		addEEnumLiteral(bevelFilterTypeEEnum, BevelFilterType.FULL);

		initEEnum(fillModeEEnum, FillMode.class, "FillMode");
		addEEnumLiteral(fillModeEEnum, FillMode.SCALE);
		addEEnumLiteral(fillModeEEnum, FillMode.CLIP);
		addEEnumLiteral(fillModeEEnum, FillMode.REPEAT);

		initEEnum(textAlignEEnum, TextAlign.class, "TextAlign");
		addEEnumLiteral(textAlignEEnum, TextAlign.START);
		addEEnumLiteral(textAlignEEnum, TextAlign.END);
		addEEnumLiteral(textAlignEEnum, TextAlign.LEFT);
		addEEnumLiteral(textAlignEEnum, TextAlign.CENTER);
		addEEnumLiteral(textAlignEEnum, TextAlign.RIGHT);
		addEEnumLiteral(textAlignEEnum, TextAlign.JUSTIFY);

		initEEnum(justificationRuleEEnum, JustificationRule.class, "JustificationRule");
		addEEnumLiteral(justificationRuleEEnum, JustificationRule.AUTO);
		addEEnumLiteral(justificationRuleEEnum, JustificationRule.SPACE);
		addEEnumLiteral(justificationRuleEEnum, JustificationRule.EAST_ASIAN);

		initEEnum(justificationStyleEEnum, JustificationStyle.class, "JustificationStyle");
		addEEnumLiteral(justificationStyleEEnum, JustificationStyle.AUTO);
		addEEnumLiteral(justificationStyleEEnum, JustificationStyle.PRIORITIZE_LEAST_ADJUSTMENT);
		addEEnumLiteral(justificationStyleEEnum, JustificationStyle.PUSH_IN_KINSOKU);
		addEEnumLiteral(justificationStyleEEnum, JustificationStyle.PUSH_OUT_ONLY);

		initEEnum(textJustifyEEnum, TextJustify.class, "TextJustify");
		addEEnumLiteral(textJustifyEEnum, TextJustify.INTER_WORD);
		addEEnumLiteral(textJustifyEEnum, TextJustify.DISTRIBUTE);

		initEEnum(leadingModelEEnum, LeadingModel.class, "LeadingModel");
		addEEnumLiteral(leadingModelEEnum, LeadingModel.AUTO);
		addEEnumLiteral(leadingModelEEnum, LeadingModel.ROMAN_UP);
		addEEnumLiteral(leadingModelEEnum, LeadingModel.IDEOGRAPHIC_TOP_UP);
		addEEnumLiteral(leadingModelEEnum, LeadingModel.IDEOGRAPHIC_CENTER_UP);
		addEEnumLiteral(leadingModelEEnum, LeadingModel.ASCENT_DESCENT_UP);
		addEEnumLiteral(leadingModelEEnum, LeadingModel.IDEOGRAPHIC_TOP_DOWN);
		addEEnumLiteral(leadingModelEEnum, LeadingModel.IDEOGRAPHIC_CENTER_DOWN);

		initEEnum(blockProgressionEEnum, BlockProgression.class, "BlockProgression");
		addEEnumLiteral(blockProgressionEEnum, BlockProgression.TB);
		addEEnumLiteral(blockProgressionEEnum, BlockProgression.RL);

		initEEnum(verticalAlignEEnum, VerticalAlign.class, "VerticalAlign");
		addEEnumLiteral(verticalAlignEEnum, VerticalAlign.TOP);
		addEEnumLiteral(verticalAlignEEnum, VerticalAlign.MIDDLE);
		addEEnumLiteral(verticalAlignEEnum, VerticalAlign.BOTTOM);
		addEEnumLiteral(verticalAlignEEnum, VerticalAlign.JUSTIFY);
		addEEnumLiteral(verticalAlignEEnum, VerticalAlign.INHERIT);

		initEEnum(lineBreakEEnum, LineBreak.class, "LineBreak");
		addEEnumLiteral(lineBreakEEnum, LineBreak.TO_FIT);
		addEEnumLiteral(lineBreakEEnum, LineBreak.EXPLICIT);

		initEEnum(breakOpportunityEEnum, BreakOpportunity.class, "BreakOpportunity");
		addEEnumLiteral(breakOpportunityEEnum, BreakOpportunity.AUTO);
		addEEnumLiteral(breakOpportunityEEnum, BreakOpportunity.ANY);
		addEEnumLiteral(breakOpportunityEEnum, BreakOpportunity.NONE);
		addEEnumLiteral(breakOpportunityEEnum, BreakOpportunity.ALL);

		initEEnum(digitCaseEEnum, DigitCase.class, "DigitCase");
		addEEnumLiteral(digitCaseEEnum, DigitCase.DEFAULT);
		addEEnumLiteral(digitCaseEEnum, DigitCase.LINING);
		addEEnumLiteral(digitCaseEEnum, DigitCase.OLD_STYLE);

		initEEnum(digitWidthEEnum, DigitWidth.class, "DigitWidth");
		addEEnumLiteral(digitWidthEEnum, DigitWidth.DEFAULT);
		addEEnumLiteral(digitWidthEEnum, DigitWidth.PROPORTIONAL);
		addEEnumLiteral(digitWidthEEnum, DigitWidth.TABULAR);

		initEEnum(dominantBaselineEEnum, DominantBaseline.class, "DominantBaseline");
		addEEnumLiteral(dominantBaselineEEnum, DominantBaseline.AUTO);
		addEEnumLiteral(dominantBaselineEEnum, DominantBaseline.ROMAN);
		addEEnumLiteral(dominantBaselineEEnum, DominantBaseline.ASCENT);
		addEEnumLiteral(dominantBaselineEEnum, DominantBaseline.DESCENT);
		addEEnumLiteral(dominantBaselineEEnum, DominantBaseline.IDEOGRAPHIC_TOP);
		addEEnumLiteral(dominantBaselineEEnum, DominantBaseline.IDEOGRAPHIC_CENTER);
		addEEnumLiteral(dominantBaselineEEnum, DominantBaseline.IDEOGRAPHIC_BOTTOM);

		initEEnum(alignmentBaselineEEnum, AlignmentBaseline.class, "AlignmentBaseline");
		addEEnumLiteral(alignmentBaselineEEnum, AlignmentBaseline.AUTO);
		addEEnumLiteral(alignmentBaselineEEnum, AlignmentBaseline.ROMAN);
		addEEnumLiteral(alignmentBaselineEEnum, AlignmentBaseline.ASCENT);
		addEEnumLiteral(alignmentBaselineEEnum, AlignmentBaseline.DESCENT);
		addEEnumLiteral(alignmentBaselineEEnum, AlignmentBaseline.IDEOGRAPHIC_TOP);
		addEEnumLiteral(alignmentBaselineEEnum, AlignmentBaseline.IDEOGRAPHIC_CENTER);
		addEEnumLiteral(alignmentBaselineEEnum, AlignmentBaseline.IDEOGRAPHIC_BOTTOM);
		addEEnumLiteral(alignmentBaselineEEnum, AlignmentBaseline.USE_DOMINANT_BASELINE);

		initEEnum(ligatureLevelEEnum, LigatureLevel.class, "LigatureLevel");
		addEEnumLiteral(ligatureLevelEEnum, LigatureLevel.MINIMUM);
		addEEnumLiteral(ligatureLevelEEnum, LigatureLevel.COMMON);
		addEEnumLiteral(ligatureLevelEEnum, LigatureLevel.UNCOMMON);
		addEEnumLiteral(ligatureLevelEEnum, LigatureLevel.EXOTIC);

		initEEnum(typographicCaseEEnum, TypographicCase.class, "TypographicCase");
		addEEnumLiteral(typographicCaseEEnum, TypographicCase.DEFAULT);
		addEEnumLiteral(typographicCaseEEnum, TypographicCase.CAPS_TO_SMALL_CAPS);
		addEEnumLiteral(typographicCaseEEnum, TypographicCase.UPPERCASE);
		addEEnumLiteral(typographicCaseEEnum, TypographicCase.LOWERCASE);
		addEEnumLiteral(typographicCaseEEnum, TypographicCase.LOWERCASE_TO_SMALL_CAPS);

		initEEnum(textRotationEEnum, TextRotation.class, "TextRotation");
		addEEnumLiteral(textRotationEEnum, TextRotation.AUTO);
		addEEnumLiteral(textRotationEEnum, TextRotation.ROTATE0);
		addEEnumLiteral(textRotationEEnum, TextRotation.ROTATE90);
		addEEnumLiteral(textRotationEEnum, TextRotation.ROTATE180);
		addEEnumLiteral(textRotationEEnum, TextRotation.ROTATE270);

		// Initialize data types
		initEDataType(pathDataEDataType, String.class, "PathData", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(angleEDataType, Double.class, "Angle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lengthEDataType, String.class, "Length", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(percentEDataType, String.class, "Percent", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(colorEDataType, String.class, "Color", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(alphaEDataType, Double.class, "Alpha", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //FxgPackageImpl
