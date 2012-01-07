/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg.util;

import at.bestsolution.efxclipse.formats.fxg.fxg.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage
 * @generated
 */
public class FxgAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FxgPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxgAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FxgPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FxgSwitch<Adapter> modelSwitch =
		new FxgSwitch<Adapter>() {
			@Override
			public Adapter caseGraphic(Graphic object) {
				return createGraphicAdapter();
			}
			@Override
			public Adapter caseLibrary(Library object) {
				return createLibraryAdapter();
			}
			@Override
			public Adapter casePrivate(Private object) {
				return createPrivateAdapter();
			}
			@Override
			public Adapter caseDefinition(Definition object) {
				return createDefinitionAdapter();
			}
			@Override
			public Adapter caseGroup(Group object) {
				return createGroupAdapter();
			}
			@Override
			public Adapter caseTransform(Transform object) {
				return createTransformAdapter();
			}
			@Override
			public Adapter casePlaceObject(PlaceObject object) {
				return createPlaceObjectAdapter();
			}
			@Override
			public Adapter caseMatrix(Matrix object) {
				return createMatrixAdapter();
			}
			@Override
			public Adapter casePath(Path object) {
				return createPathAdapter();
			}
			@Override
			public Adapter caseShape(Shape object) {
				return createShapeAdapter();
			}
			@Override
			public Adapter caseRect(Rect object) {
				return createRectAdapter();
			}
			@Override
			public Adapter caseEllipse(Ellipse object) {
				return createEllipseAdapter();
			}
			@Override
			public Adapter caseLine(Line object) {
				return createLineAdapter();
			}
			@Override
			public Adapter caseRichText(RichText object) {
				return createRichTextAdapter();
			}
			@Override
			public Adapter caseRichTextContent(RichTextContent object) {
				return createRichTextContentAdapter();
			}
			@Override
			public Adapter caseRichTextContentContainer(RichTextContentContainer object) {
				return createRichTextContentContainerAdapter();
			}
			@Override
			public Adapter caseParagraphAttributes(ParagraphAttributes object) {
				return createParagraphAttributesAdapter();
			}
			@Override
			public Adapter caseContainerAttributes(ContainerAttributes object) {
				return createContainerAttributesAdapter();
			}
			@Override
			public Adapter caseCharacterAttributes(CharacterAttributes object) {
				return createCharacterAttributesAdapter();
			}
			@Override
			public Adapter caserawtext(rawtext object) {
				return createrawtextAdapter();
			}
			@Override
			public Adapter casediv(div object) {
				return createdivAdapter();
			}
			@Override
			public Adapter casep(p object) {
				return createpAdapter();
			}
			@Override
			public Adapter casetcy(tcy object) {
				return createtcyAdapter();
			}
			@Override
			public Adapter casea(a object) {
				return createaAdapter();
			}
			@Override
			public Adapter caseimg(img object) {
				return createimgAdapter();
			}
			@Override
			public Adapter casespan(span object) {
				return createspanAdapter();
			}
			@Override
			public Adapter casebr(br object) {
				return createbrAdapter();
			}
			@Override
			public Adapter casetab(tab object) {
				return createtabAdapter();
			}
			@Override
			public Adapter caselinkNormalFormat(linkNormalFormat object) {
				return createlinkNormalFormatAdapter();
			}
			@Override
			public Adapter caselinkHoverFormat(linkHoverFormat object) {
				return createlinkHoverFormatAdapter();
			}
			@Override
			public Adapter caselinkActiveFormat(linkActiveFormat object) {
				return createlinkActiveFormatAdapter();
			}
			@Override
			public Adapter caseBitmapImage(BitmapImage object) {
				return createBitmapImageAdapter();
			}
			@Override
			public Adapter caseFill(Fill object) {
				return createFillAdapter();
			}
			@Override
			public Adapter caseSolidColor(SolidColor object) {
				return createSolidColorAdapter();
			}
			@Override
			public Adapter caseLinearGradient(LinearGradient object) {
				return createLinearGradientAdapter();
			}
			@Override
			public Adapter caseRadialGradient(RadialGradient object) {
				return createRadialGradientAdapter();
			}
			@Override
			public Adapter caseBitmapFill(BitmapFill object) {
				return createBitmapFillAdapter();
			}
			@Override
			public Adapter caseStroke(Stroke object) {
				return createStrokeAdapter();
			}
			@Override
			public Adapter caseSolidColorStroke(SolidColorStroke object) {
				return createSolidColorStrokeAdapter();
			}
			@Override
			public Adapter caseLinearGradientStroke(LinearGradientStroke object) {
				return createLinearGradientStrokeAdapter();
			}
			@Override
			public Adapter caseRadialGradientStroke(RadialGradientStroke object) {
				return createRadialGradientStrokeAdapter();
			}
			@Override
			public Adapter caseGradientEntry(GradientEntry object) {
				return createGradientEntryAdapter();
			}
			@Override
			public Adapter caseColorTransform(ColorTransform object) {
				return createColorTransformAdapter();
			}
			@Override
			public Adapter caseFilter(Filter object) {
				return createFilterAdapter();
			}
			@Override
			public Adapter caseBlurFilter(BlurFilter object) {
				return createBlurFilterAdapter();
			}
			@Override
			public Adapter caseDropShadowFilter(DropShadowFilter object) {
				return createDropShadowFilterAdapter();
			}
			@Override
			public Adapter caseBevelFilter(BevelFilter object) {
				return createBevelFilterAdapter();
			}
			@Override
			public Adapter caseGradientGlowFilter(GradientGlowFilter object) {
				return createGradientGlowFilterAdapter();
			}
			@Override
			public Adapter caseGradientBevelFilter(GradientBevelFilter object) {
				return createGradientBevelFilterAdapter();
			}
			@Override
			public Adapter caseColorMatrixFilter(ColorMatrixFilter object) {
				return createColorMatrixFilterAdapter();
			}
			@Override
			public Adapter caseFXGElement(FXGElement object) {
				return createFXGElementAdapter();
			}
			@Override
			public <T extends FXGElement> Adapter caseContainerElement(ContainerElement<T> object) {
				return createContainerElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Graphic <em>Graphic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Graphic
	 * @generated
	 */
	public Adapter createGraphicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Library <em>Library</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Library
	 * @generated
	 */
	public Adapter createLibraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Private <em>Private</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Private
	 * @generated
	 */
	public Adapter createPrivateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Definition
	 * @generated
	 */
	public Adapter createDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Group <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Group
	 * @generated
	 */
	public Adapter createGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Transform <em>Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Transform
	 * @generated
	 */
	public Adapter createTransformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject <em>Place Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject
	 * @generated
	 */
	public Adapter createPlaceObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Matrix <em>Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Matrix
	 * @generated
	 */
	public Adapter createMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Path
	 * @generated
	 */
	public Adapter createPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Shape
	 * @generated
	 */
	public Adapter createShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect <em>Rect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Rect
	 * @generated
	 */
	public Adapter createRectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse <em>Ellipse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Ellipse
	 * @generated
	 */
	public Adapter createEllipseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Line <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Line
	 * @generated
	 */
	public Adapter createLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichText <em>Rich Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichText
	 * @generated
	 */
	public Adapter createRichTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContent <em>Rich Text Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContent
	 * @generated
	 */
	public Adapter createRichTextContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContentContainer <em>Rich Text Content Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContentContainer
	 * @generated
	 */
	public Adapter createRichTextContentContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes <em>Paragraph Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ParagraphAttributes
	 * @generated
	 */
	public Adapter createParagraphAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes <em>Container Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes
	 * @generated
	 */
	public Adapter createContainerAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes <em>Character Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.CharacterAttributes
	 * @generated
	 */
	public Adapter createCharacterAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.rawtext <em>rawtext</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.rawtext
	 * @generated
	 */
	public Adapter createrawtextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.div <em>div</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.div
	 * @generated
	 */
	public Adapter createdivAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.p <em>p</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.p
	 * @generated
	 */
	public Adapter createpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.tcy <em>tcy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.tcy
	 * @generated
	 */
	public Adapter createtcyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.a <em>a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.a
	 * @generated
	 */
	public Adapter createaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.img <em>img</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.img
	 * @generated
	 */
	public Adapter createimgAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.span <em>span</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.span
	 * @generated
	 */
	public Adapter createspanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.br <em>br</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.br
	 * @generated
	 */
	public Adapter createbrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.tab <em>tab</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.tab
	 * @generated
	 */
	public Adapter createtabAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.linkNormalFormat <em>link Normal Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.linkNormalFormat
	 * @generated
	 */
	public Adapter createlinkNormalFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.linkHoverFormat <em>link Hover Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.linkHoverFormat
	 * @generated
	 */
	public Adapter createlinkHoverFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.linkActiveFormat <em>link Active Format</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.linkActiveFormat
	 * @generated
	 */
	public Adapter createlinkActiveFormatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage <em>Bitmap Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapImage
	 * @generated
	 */
	public Adapter createBitmapImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Fill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Fill
	 * @generated
	 */
	public Adapter createFillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColor <em>Solid Color</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.SolidColor
	 * @generated
	 */
	public Adapter createSolidColorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient <em>Linear Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradient
	 * @generated
	 */
	public Adapter createLinearGradientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient <em>Radial Gradient</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradient
	 * @generated
	 */
	public Adapter createRadialGradientAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill <em>Bitmap Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BitmapFill
	 * @generated
	 */
	public Adapter createBitmapFillAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Stroke <em>Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Stroke
	 * @generated
	 */
	public Adapter createStrokeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke <em>Solid Color Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.SolidColorStroke
	 * @generated
	 */
	public Adapter createSolidColorStrokeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke <em>Linear Gradient Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LinearGradientStroke
	 * @generated
	 */
	public Adapter createLinearGradientStrokeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke <em>Radial Gradient Stroke</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.RadialGradientStroke
	 * @generated
	 */
	public Adapter createRadialGradientStrokeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientEntry <em>Gradient Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientEntry
	 * @generated
	 */
	public Adapter createGradientEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform <em>Color Transform</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ColorTransform
	 * @generated
	 */
	public Adapter createColorTransformAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Filter <em>Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Filter
	 * @generated
	 */
	public Adapter createFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BlurFilter <em>Blur Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BlurFilter
	 * @generated
	 */
	public Adapter createBlurFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter <em>Drop Shadow Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.DropShadowFilter
	 * @generated
	 */
	public Adapter createDropShadowFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter <em>Bevel Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BevelFilter
	 * @generated
	 */
	public Adapter createBevelFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter <em>Gradient Glow Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientGlowFilter
	 * @generated
	 */
	public Adapter createGradientGlowFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter <em>Gradient Bevel Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.GradientBevelFilter
	 * @generated
	 */
	public Adapter createGradientBevelFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ColorMatrixFilter <em>Color Matrix Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ColorMatrixFilter
	 * @generated
	 */
	public Adapter createColorMatrixFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.FXGElement <em>FXG Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FXGElement
	 * @generated
	 */
	public Adapter createFXGElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerElement <em>Container Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.ContainerElement
	 * @generated
	 */
	public Adapter createContainerElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FxgAdapterFactory
