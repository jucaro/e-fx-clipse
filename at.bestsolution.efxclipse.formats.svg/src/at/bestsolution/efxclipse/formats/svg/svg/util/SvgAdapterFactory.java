/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.svg.svg.util;

import at.bestsolution.efxclipse.formats.svg.svg.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage
 * @generated
 */
public class SvgAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SvgPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvgAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SvgPackage.eINSTANCE;
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
	protected SvgSwitch<Adapter> modelSwitch =
		new SvgSwitch<Adapter>() {
			@Override
			public <T extends SvgElement> Adapter caseContentElement(ContentElement<T> object) {
				return createContentElementAdapter();
			}
			@Override
			public <T extends SvgElement> Adapter caseContainerElement(ContainerElement<T> object) {
				return createContainerElementAdapter();
			}
			@Override
			public Adapter caseStructuralElement(StructuralElement object) {
				return createStructuralElementAdapter();
			}
			@Override
			public Adapter caseSvgElement(SvgElement object) {
				return createSvgElementAdapter();
			}
			@Override
			public Adapter caseDescriptiveElement(DescriptiveElement object) {
				return createDescriptiveElementAdapter();
			}
			@Override
			public Adapter caseGraphicsElement(GraphicsElement object) {
				return createGraphicsElementAdapter();
			}
			@Override
			public Adapter caseGraphicsReferencingElement(GraphicsReferencingElement object) {
				return createGraphicsReferencingElementAdapter();
			}
			@Override
			public Adapter caseShapeElement(ShapeElement object) {
				return createShapeElementAdapter();
			}
			@Override
			public Adapter caseBasicShapeElement(BasicShapeElement object) {
				return createBasicShapeElementAdapter();
			}
			@Override
			public Adapter caseTextContentElement(TextContentElement object) {
				return createTextContentElementAdapter();
			}
			@Override
			public Adapter caseTextContentChildElement(TextContentChildElement object) {
				return createTextContentChildElementAdapter();
			}
			@Override
			public Adapter caseGradientElement(GradientElement object) {
				return createGradientElementAdapter();
			}
			@Override
			public Adapter caseLightSourceElement(LightSourceElement object) {
				return createLightSourceElementAdapter();
			}
			@Override
			public Adapter caseFilterPrimitiveElement(FilterPrimitiveElement object) {
				return createFilterPrimitiveElementAdapter();
			}
			@Override
			public Adapter case____ENUMS____(____ENUMS____ object) {
				return create____ENUMS____Adapter();
			}
			@Override
			public Adapter case____DATATYPES____(____DATATYPES____ object) {
				return create____DATATYPES____Adapter();
			}
			@Override
			public Adapter case____ATTRIBUTES____(____ATTRIBUTES____ object) {
				return create____ATTRIBUTES____Adapter();
			}
			@Override
			public Adapter caseConditionalProcessingAttributes(ConditionalProcessingAttributes object) {
				return createConditionalProcessingAttributesAdapter();
			}
			@Override
			public Adapter caseCoreAttributes(CoreAttributes object) {
				return createCoreAttributesAdapter();
			}
			@Override
			public Adapter caseDocumentEventAttributes(DocumentEventAttributes object) {
				return createDocumentEventAttributesAdapter();
			}
			@Override
			public Adapter caseGraphicalEventAttributes(GraphicalEventAttributes object) {
				return createGraphicalEventAttributesAdapter();
			}
			@Override
			public Adapter casePresentationAttributes(PresentationAttributes object) {
				return createPresentationAttributesAdapter();
			}
			@Override
			public Adapter caseXLinkAttributes(XLinkAttributes object) {
				return createXLinkAttributesAdapter();
			}
			@Override
			public Adapter caseFilterPrimitiveAttributes(FilterPrimitiveAttributes object) {
				return createFilterPrimitiveAttributesAdapter();
			}
			@Override
			public Adapter case____ELEMENTES____(____ELEMENTES____ object) {
				return create____ELEMENTES____Adapter();
			}
			@Override
			public Adapter caseSvgSvgElement(SvgSvgElement object) {
				return createSvgSvgElementAdapter();
			}
			@Override
			public Adapter caseSvgGElement(SvgGElement object) {
				return createSvgGElementAdapter();
			}
			@Override
			public Adapter caseSvgDefsElement(SvgDefsElement object) {
				return createSvgDefsElementAdapter();
			}
			@Override
			public Adapter caseSvgDescElement(SvgDescElement object) {
				return createSvgDescElementAdapter();
			}
			@Override
			public Adapter caseSvgTitleElement(SvgTitleElement object) {
				return createSvgTitleElementAdapter();
			}
			@Override
			public Adapter caseSvgSymbolElement(SvgSymbolElement object) {
				return createSvgSymbolElementAdapter();
			}
			@Override
			public Adapter caseSvgUseElement(SvgUseElement object) {
				return createSvgUseElementAdapter();
			}
			@Override
			public Adapter caseSvgImageElement(SvgImageElement object) {
				return createSvgImageElementAdapter();
			}
			@Override
			public Adapter caseSvgSwitchElement(SvgSwitchElement object) {
				return createSvgSwitchElementAdapter();
			}
			@Override
			public Adapter caseSvgPathElement(SvgPathElement object) {
				return createSvgPathElementAdapter();
			}
			@Override
			public Adapter caseSvgRectElement(SvgRectElement object) {
				return createSvgRectElementAdapter();
			}
			@Override
			public Adapter caseSvgCircleElement(SvgCircleElement object) {
				return createSvgCircleElementAdapter();
			}
			@Override
			public Adapter caseSvgEllipseElement(SvgEllipseElement object) {
				return createSvgEllipseElementAdapter();
			}
			@Override
			public Adapter caseSvgLineElement(SvgLineElement object) {
				return createSvgLineElementAdapter();
			}
			@Override
			public Adapter caseSvgPolylineElement(SvgPolylineElement object) {
				return createSvgPolylineElementAdapter();
			}
			@Override
			public Adapter caseSvgPolygonElement(SvgPolygonElement object) {
				return createSvgPolygonElementAdapter();
			}
			@Override
			public Adapter caseSvgTextElement(SvgTextElement object) {
				return createSvgTextElementAdapter();
			}
			@Override
			public Adapter caseSvgTspanElement(SvgTspanElement object) {
				return createSvgTspanElementAdapter();
			}
			@Override
			public Adapter caseSvgTrefElement(SvgTrefElement object) {
				return createSvgTrefElementAdapter();
			}
			@Override
			public Adapter caseSvgTextPathElement(SvgTextPathElement object) {
				return createSvgTextPathElementAdapter();
			}
			@Override
			public Adapter caseSvgAltGlyphElement(SvgAltGlyphElement object) {
				return createSvgAltGlyphElementAdapter();
			}
			@Override
			public Adapter caseSvgAltGlyphDefElement(SvgAltGlyphDefElement object) {
				return createSvgAltGlyphDefElementAdapter();
			}
			@Override
			public Adapter caseSvgAltGlyphItemElement(SvgAltGlyphItemElement object) {
				return createSvgAltGlyphItemElementAdapter();
			}
			@Override
			public Adapter caseSvgAltGlyphRefElement(SvgAltGlyphRefElement object) {
				return createSvgAltGlyphRefElementAdapter();
			}
			@Override
			public Adapter caseSvgMarkerElement(SvgMarkerElement object) {
				return createSvgMarkerElementAdapter();
			}
			@Override
			public Adapter caseSvgColorProfileElement(SvgColorProfileElement object) {
				return createSvgColorProfileElementAdapter();
			}
			@Override
			public Adapter caseSvgLinearGradientElement(SvgLinearGradientElement object) {
				return createSvgLinearGradientElementAdapter();
			}
			@Override
			public Adapter caseSvgRadialGradientElement(SvgRadialGradientElement object) {
				return createSvgRadialGradientElementAdapter();
			}
			@Override
			public Adapter caseSvgGradientStopElement(SvgGradientStopElement object) {
				return createSvgGradientStopElementAdapter();
			}
			@Override
			public Adapter caseSvgPatternElement(SvgPatternElement object) {
				return createSvgPatternElementAdapter();
			}
			@Override
			public Adapter caseSvgClipPathElement(SvgClipPathElement object) {
				return createSvgClipPathElementAdapter();
			}
			@Override
			public Adapter caseSvgMaskElement(SvgMaskElement object) {
				return createSvgMaskElementAdapter();
			}
			@Override
			public Adapter caseSvgFilterElement(SvgFilterElement object) {
				return createSvgFilterElementAdapter();
			}
			@Override
			public Adapter caseSvgFeDistantLight(SvgFeDistantLight object) {
				return createSvgFeDistantLightAdapter();
			}
			@Override
			public Adapter caseSvgFePointLight(SvgFePointLight object) {
				return createSvgFePointLightAdapter();
			}
			@Override
			public Adapter caseSvgFeSpotLight(SvgFeSpotLight object) {
				return createSvgFeSpotLightAdapter();
			}
			@Override
			public Adapter caseSvgFeBlend(SvgFeBlend object) {
				return createSvgFeBlendAdapter();
			}
			@Override
			public Adapter caseSvgFeColorMatrix(SvgFeColorMatrix object) {
				return createSvgFeColorMatrixAdapter();
			}
			@Override
			public Adapter caseSvgFeComponentTransfer(SvgFeComponentTransfer object) {
				return createSvgFeComponentTransferAdapter();
			}
			@Override
			public Adapter caseSvgFeFuncR(SvgFeFuncR object) {
				return createSvgFeFuncRAdapter();
			}
			@Override
			public Adapter caseSvgFeFuncG(SvgFeFuncG object) {
				return createSvgFeFuncGAdapter();
			}
			@Override
			public Adapter caseSvgFeFuncB(SvgFeFuncB object) {
				return createSvgFeFuncBAdapter();
			}
			@Override
			public Adapter caseSvgFeFuncA(SvgFeFuncA object) {
				return createSvgFeFuncAAdapter();
			}
			@Override
			public Adapter caseSvgFeComposite(SvgFeComposite object) {
				return createSvgFeCompositeAdapter();
			}
			@Override
			public Adapter caseSvgFeConvolveMatrix(SvgFeConvolveMatrix object) {
				return createSvgFeConvolveMatrixAdapter();
			}
			@Override
			public Adapter caseSvgFeDiffuseLighting(SvgFeDiffuseLighting object) {
				return createSvgFeDiffuseLightingAdapter();
			}
			@Override
			public Adapter caseSvgFeDisplacementMap(SvgFeDisplacementMap object) {
				return createSvgFeDisplacementMapAdapter();
			}
			@Override
			public Adapter caseSvgFeFlood(SvgFeFlood object) {
				return createSvgFeFloodAdapter();
			}
			@Override
			public Adapter caseSvgFeGaussianBlur(SvgFeGaussianBlur object) {
				return createSvgFeGaussianBlurAdapter();
			}
			@Override
			public Adapter caseSvgFeImage(SvgFeImage object) {
				return createSvgFeImageAdapter();
			}
			@Override
			public Adapter caseSvgFeMerge(SvgFeMerge object) {
				return createSvgFeMergeAdapter();
			}
			@Override
			public Adapter caseSvgFeMergeNode(SvgFeMergeNode object) {
				return createSvgFeMergeNodeAdapter();
			}
			@Override
			public Adapter caseSvgFeMorphology(SvgFeMorphology object) {
				return createSvgFeMorphologyAdapter();
			}
			@Override
			public Adapter caseSvgFeOffset(SvgFeOffset object) {
				return createSvgFeOffsetAdapter();
			}
			@Override
			public Adapter caseSvgFeSpecularLighting(SvgFeSpecularLighting object) {
				return createSvgFeSpecularLightingAdapter();
			}
			@Override
			public Adapter caseSvgFeTile(SvgFeTile object) {
				return createSvgFeTileAdapter();
			}
			@Override
			public Adapter caseSvgFeTurbulence(SvgFeTurbulence object) {
				return createSvgFeTurbulenceAdapter();
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
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.ContentElement <em>Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.ContentElement
	 * @generated
	 */
	public Adapter createContentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.ContainerElement <em>Container Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.ContainerElement
	 * @generated
	 */
	public Adapter createContainerElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.StructuralElement <em>Structural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.StructuralElement
	 * @generated
	 */
	public Adapter createStructuralElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgElement
	 * @generated
	 */
	public Adapter createSvgElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.DescriptiveElement <em>Descriptive Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.DescriptiveElement
	 * @generated
	 */
	public Adapter createDescriptiveElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.GraphicsElement <em>Graphics Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.GraphicsElement
	 * @generated
	 */
	public Adapter createGraphicsElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.GraphicsReferencingElement <em>Graphics Referencing Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.GraphicsReferencingElement
	 * @generated
	 */
	public Adapter createGraphicsReferencingElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.ShapeElement <em>Shape Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.ShapeElement
	 * @generated
	 */
	public Adapter createShapeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.BasicShapeElement <em>Basic Shape Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.BasicShapeElement
	 * @generated
	 */
	public Adapter createBasicShapeElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.TextContentElement <em>Text Content Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.TextContentElement
	 * @generated
	 */
	public Adapter createTextContentElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.TextContentChildElement <em>Text Content Child Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.TextContentChildElement
	 * @generated
	 */
	public Adapter createTextContentChildElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.GradientElement <em>Gradient Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.GradientElement
	 * @generated
	 */
	public Adapter createGradientElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.LightSourceElement <em>Light Source Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.LightSourceElement
	 * @generated
	 */
	public Adapter createLightSourceElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.FilterPrimitiveElement <em>Filter Primitive Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.FilterPrimitiveElement
	 * @generated
	 */
	public Adapter createFilterPrimitiveElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.____ENUMS____ <em>ENUMS </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.____ENUMS____
	 * @generated
	 */
	public Adapter create____ENUMS____Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.____DATATYPES____ <em>DATATYPES </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.____DATATYPES____
	 * @generated
	 */
	public Adapter create____DATATYPES____Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.____ATTRIBUTES____ <em>ATTRIBUTES </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.____ATTRIBUTES____
	 * @generated
	 */
	public Adapter create____ATTRIBUTES____Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.ConditionalProcessingAttributes <em>Conditional Processing Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.ConditionalProcessingAttributes
	 * @generated
	 */
	public Adapter createConditionalProcessingAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.CoreAttributes <em>Core Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.CoreAttributes
	 * @generated
	 */
	public Adapter createCoreAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.DocumentEventAttributes <em>Document Event Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.DocumentEventAttributes
	 * @generated
	 */
	public Adapter createDocumentEventAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.GraphicalEventAttributes <em>Graphical Event Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.GraphicalEventAttributes
	 * @generated
	 */
	public Adapter createGraphicalEventAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.PresentationAttributes <em>Presentation Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.PresentationAttributes
	 * @generated
	 */
	public Adapter createPresentationAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.XLinkAttributes <em>XLink Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.XLinkAttributes
	 * @generated
	 */
	public Adapter createXLinkAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.FilterPrimitiveAttributes <em>Filter Primitive Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.FilterPrimitiveAttributes
	 * @generated
	 */
	public Adapter createFilterPrimitiveAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.____ELEMENTES____ <em>ELEMENTES </em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.____ELEMENTES____
	 * @generated
	 */
	public Adapter create____ELEMENTES____Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgSvgElement <em>Svg Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgSvgElement
	 * @generated
	 */
	public Adapter createSvgSvgElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgGElement <em>GElement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgGElement
	 * @generated
	 */
	public Adapter createSvgGElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgDefsElement <em>Defs Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgDefsElement
	 * @generated
	 */
	public Adapter createSvgDefsElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgDescElement <em>Desc Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgDescElement
	 * @generated
	 */
	public Adapter createSvgDescElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgTitleElement <em>Title Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgTitleElement
	 * @generated
	 */
	public Adapter createSvgTitleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgSymbolElement <em>Symbol Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgSymbolElement
	 * @generated
	 */
	public Adapter createSvgSymbolElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgUseElement <em>Use Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgUseElement
	 * @generated
	 */
	public Adapter createSvgUseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgImageElement <em>Image Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgImageElement
	 * @generated
	 */
	public Adapter createSvgImageElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgSwitchElement <em>Switch Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgSwitchElement
	 * @generated
	 */
	public Adapter createSvgSwitchElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgPathElement <em>Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPathElement
	 * @generated
	 */
	public Adapter createSvgPathElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgRectElement <em>Rect Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgRectElement
	 * @generated
	 */
	public Adapter createSvgRectElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgCircleElement <em>Circle Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgCircleElement
	 * @generated
	 */
	public Adapter createSvgCircleElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgEllipseElement <em>Ellipse Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgEllipseElement
	 * @generated
	 */
	public Adapter createSvgEllipseElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgLineElement <em>Line Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgLineElement
	 * @generated
	 */
	public Adapter createSvgLineElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgPolylineElement <em>Polyline Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPolylineElement
	 * @generated
	 */
	public Adapter createSvgPolylineElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgPolygonElement <em>Polygon Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPolygonElement
	 * @generated
	 */
	public Adapter createSvgPolygonElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgTextElement <em>Text Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgTextElement
	 * @generated
	 */
	public Adapter createSvgTextElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgTspanElement <em>Tspan Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgTspanElement
	 * @generated
	 */
	public Adapter createSvgTspanElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgTrefElement <em>Tref Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgTrefElement
	 * @generated
	 */
	public Adapter createSvgTrefElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgTextPathElement <em>Text Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgTextPathElement
	 * @generated
	 */
	public Adapter createSvgTextPathElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgAltGlyphElement <em>Alt Glyph Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgAltGlyphElement
	 * @generated
	 */
	public Adapter createSvgAltGlyphElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgAltGlyphDefElement <em>Alt Glyph Def Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgAltGlyphDefElement
	 * @generated
	 */
	public Adapter createSvgAltGlyphDefElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgAltGlyphItemElement <em>Alt Glyph Item Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgAltGlyphItemElement
	 * @generated
	 */
	public Adapter createSvgAltGlyphItemElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgAltGlyphRefElement <em>Alt Glyph Ref Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgAltGlyphRefElement
	 * @generated
	 */
	public Adapter createSvgAltGlyphRefElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgMarkerElement <em>Marker Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgMarkerElement
	 * @generated
	 */
	public Adapter createSvgMarkerElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgColorProfileElement <em>Color Profile Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgColorProfileElement
	 * @generated
	 */
	public Adapter createSvgColorProfileElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgLinearGradientElement <em>Linear Gradient Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgLinearGradientElement
	 * @generated
	 */
	public Adapter createSvgLinearGradientElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgRadialGradientElement <em>Radial Gradient Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgRadialGradientElement
	 * @generated
	 */
	public Adapter createSvgRadialGradientElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgGradientStopElement <em>Gradient Stop Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgGradientStopElement
	 * @generated
	 */
	public Adapter createSvgGradientStopElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgPatternElement <em>Pattern Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPatternElement
	 * @generated
	 */
	public Adapter createSvgPatternElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgClipPathElement <em>Clip Path Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgClipPathElement
	 * @generated
	 */
	public Adapter createSvgClipPathElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgMaskElement <em>Mask Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgMaskElement
	 * @generated
	 */
	public Adapter createSvgMaskElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFilterElement <em>Filter Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFilterElement
	 * @generated
	 */
	public Adapter createSvgFilterElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeDistantLight <em>Fe Distant Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeDistantLight
	 * @generated
	 */
	public Adapter createSvgFeDistantLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFePointLight <em>Fe Point Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFePointLight
	 * @generated
	 */
	public Adapter createSvgFePointLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeSpotLight <em>Fe Spot Light</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeSpotLight
	 * @generated
	 */
	public Adapter createSvgFeSpotLightAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeBlend <em>Fe Blend</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeBlend
	 * @generated
	 */
	public Adapter createSvgFeBlendAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeColorMatrix <em>Fe Color Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeColorMatrix
	 * @generated
	 */
	public Adapter createSvgFeColorMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeComponentTransfer <em>Fe Component Transfer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeComponentTransfer
	 * @generated
	 */
	public Adapter createSvgFeComponentTransferAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeFuncR <em>Fe Func R</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeFuncR
	 * @generated
	 */
	public Adapter createSvgFeFuncRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeFuncG <em>Fe Func G</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeFuncG
	 * @generated
	 */
	public Adapter createSvgFeFuncGAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeFuncB <em>Fe Func B</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeFuncB
	 * @generated
	 */
	public Adapter createSvgFeFuncBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeFuncA <em>Fe Func A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeFuncA
	 * @generated
	 */
	public Adapter createSvgFeFuncAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeComposite <em>Fe Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeComposite
	 * @generated
	 */
	public Adapter createSvgFeCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrix <em>Fe Convolve Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeConvolveMatrix
	 * @generated
	 */
	public Adapter createSvgFeConvolveMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeDiffuseLighting <em>Fe Diffuse Lighting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeDiffuseLighting
	 * @generated
	 */
	public Adapter createSvgFeDiffuseLightingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeDisplacementMap <em>Fe Displacement Map</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeDisplacementMap
	 * @generated
	 */
	public Adapter createSvgFeDisplacementMapAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeFlood <em>Fe Flood</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeFlood
	 * @generated
	 */
	public Adapter createSvgFeFloodAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeGaussianBlur <em>Fe Gaussian Blur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeGaussianBlur
	 * @generated
	 */
	public Adapter createSvgFeGaussianBlurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeImage <em>Fe Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeImage
	 * @generated
	 */
	public Adapter createSvgFeImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeMerge <em>Fe Merge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeMerge
	 * @generated
	 */
	public Adapter createSvgFeMergeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeMergeNode <em>Fe Merge Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeMergeNode
	 * @generated
	 */
	public Adapter createSvgFeMergeNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeMorphology <em>Fe Morphology</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeMorphology
	 * @generated
	 */
	public Adapter createSvgFeMorphologyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeOffset <em>Fe Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeOffset
	 * @generated
	 */
	public Adapter createSvgFeOffsetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeSpecularLighting <em>Fe Specular Lighting</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeSpecularLighting
	 * @generated
	 */
	public Adapter createSvgFeSpecularLightingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeTile <em>Fe Tile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeTile
	 * @generated
	 */
	public Adapter createSvgFeTileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeTurbulence <em>Fe Turbulence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgFeTurbulence
	 * @generated
	 */
	public Adapter createSvgFeTurbulenceAdapter() {
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

} //SvgAdapterFactory
