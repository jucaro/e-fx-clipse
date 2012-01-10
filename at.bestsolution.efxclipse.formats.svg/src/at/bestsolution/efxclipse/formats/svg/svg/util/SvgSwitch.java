/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.svg.svg.util;

import at.bestsolution.efxclipse.formats.svg.svg.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage
 * @generated
 */
public class SvgSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SvgPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SvgSwitch() {
		if (modelPackage == null) {
			modelPackage = SvgPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T1 doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SvgPackage.CONTENT_ELEMENT: {
				ContentElement<?> contentElement = (ContentElement<?>)theEObject;
				T1 result = caseContentElement(contentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.CONTAINER_ELEMENT: {
				ContainerElement<?> containerElement = (ContainerElement<?>)theEObject;
				T1 result = caseContainerElement(containerElement);
				if (result == null) result = caseContentElement(containerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.STRUCTURAL_ELEMENT: {
				StructuralElement structuralElement = (StructuralElement)theEObject;
				T1 result = caseStructuralElement(structuralElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_ELEMENT: {
				SvgElement svgElement = (SvgElement)theEObject;
				T1 result = caseSvgElement(svgElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.DESCRIPTIVE_ELEMENT: {
				DescriptiveElement descriptiveElement = (DescriptiveElement)theEObject;
				T1 result = caseDescriptiveElement(descriptiveElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.GRAPHICS_ELEMENT: {
				GraphicsElement graphicsElement = (GraphicsElement)theEObject;
				T1 result = caseGraphicsElement(graphicsElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.GRAPHICS_REFERENCING_ELEMENT: {
				GraphicsReferencingElement graphicsReferencingElement = (GraphicsReferencingElement)theEObject;
				T1 result = caseGraphicsReferencingElement(graphicsReferencingElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SHAPE_ELEMENT: {
				ShapeElement shapeElement = (ShapeElement)theEObject;
				T1 result = caseShapeElement(shapeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.BASIC_SHAPE_ELEMENT: {
				BasicShapeElement basicShapeElement = (BasicShapeElement)theEObject;
				T1 result = caseBasicShapeElement(basicShapeElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.TEXT_CONTENT_ELEMENT: {
				TextContentElement textContentElement = (TextContentElement)theEObject;
				T1 result = caseTextContentElement(textContentElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.TEXT_CONTENT_CHILD_ELEMENT: {
				TextContentChildElement textContentChildElement = (TextContentChildElement)theEObject;
				T1 result = caseTextContentChildElement(textContentChildElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.GRADIENT_ELEMENT: {
				GradientElement gradientElement = (GradientElement)theEObject;
				T1 result = caseGradientElement(gradientElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.LIGHT_SOURCE_ELEMENT: {
				LightSourceElement lightSourceElement = (LightSourceElement)theEObject;
				T1 result = caseLightSourceElement(lightSourceElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.FILTER_PRIMITIVE_ELEMENT: {
				FilterPrimitiveElement filterPrimitiveElement = (FilterPrimitiveElement)theEObject;
				T1 result = caseFilterPrimitiveElement(filterPrimitiveElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage._ENUMS_: {
				____ENUMS____ ____ENUMS____ = (____ENUMS____)theEObject;
				T1 result = case____ENUMS____(____ENUMS____);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage._DATATYPES_: {
				____DATATYPES____ ____DATATYPES____ = (____DATATYPES____)theEObject;
				T1 result = case____DATATYPES____(____DATATYPES____);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage._ATTRIBUTES_: {
				____ATTRIBUTES____ ____ATTRIBUTES____ = (____ATTRIBUTES____)theEObject;
				T1 result = case____ATTRIBUTES____(____ATTRIBUTES____);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.CONDITIONAL_PROCESSING_ATTRIBUTES: {
				ConditionalProcessingAttributes conditionalProcessingAttributes = (ConditionalProcessingAttributes)theEObject;
				T1 result = caseConditionalProcessingAttributes(conditionalProcessingAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.CORE_ATTRIBUTES: {
				CoreAttributes coreAttributes = (CoreAttributes)theEObject;
				T1 result = caseCoreAttributes(coreAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.DOCUMENT_EVENT_ATTRIBUTES: {
				DocumentEventAttributes documentEventAttributes = (DocumentEventAttributes)theEObject;
				T1 result = caseDocumentEventAttributes(documentEventAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.GRAPHICAL_EVENT_ATTRIBUTES: {
				GraphicalEventAttributes graphicalEventAttributes = (GraphicalEventAttributes)theEObject;
				T1 result = caseGraphicalEventAttributes(graphicalEventAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.PRESENTATION_ATTRIBUTES: {
				PresentationAttributes presentationAttributes = (PresentationAttributes)theEObject;
				T1 result = casePresentationAttributes(presentationAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.XLINK_ATTRIBUTES: {
				XLinkAttributes xLinkAttributes = (XLinkAttributes)theEObject;
				T1 result = caseXLinkAttributes(xLinkAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.FILTER_PRIMITIVE_ATTRIBUTES: {
				FilterPrimitiveAttributes filterPrimitiveAttributes = (FilterPrimitiveAttributes)theEObject;
				T1 result = caseFilterPrimitiveAttributes(filterPrimitiveAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage._ELEMENTES_: {
				____ELEMENTES____ ____ELEMENTES____ = (____ELEMENTES____)theEObject;
				T1 result = case____ELEMENTES____(____ELEMENTES____);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_SVG_ELEMENT: {
				SvgSvgElement svgSvgElement = (SvgSvgElement)theEObject;
				T1 result = caseSvgSvgElement(svgSvgElement);
				if (result == null) result = caseSvgElement(svgSvgElement);
				if (result == null) result = caseContainerElement(svgSvgElement);
				if (result == null) result = caseStructuralElement(svgSvgElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgSvgElement);
				if (result == null) result = caseCoreAttributes(svgSvgElement);
				if (result == null) result = caseDocumentEventAttributes(svgSvgElement);
				if (result == null) result = caseGraphicalEventAttributes(svgSvgElement);
				if (result == null) result = casePresentationAttributes(svgSvgElement);
				if (result == null) result = caseContentElement(svgSvgElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_GELEMENT: {
				SvgGElement svgGElement = (SvgGElement)theEObject;
				T1 result = caseSvgGElement(svgGElement);
				if (result == null) result = caseSvgElement(svgGElement);
				if (result == null) result = caseContainerElement(svgGElement);
				if (result == null) result = caseStructuralElement(svgGElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgGElement);
				if (result == null) result = caseCoreAttributes(svgGElement);
				if (result == null) result = caseGraphicalEventAttributes(svgGElement);
				if (result == null) result = casePresentationAttributes(svgGElement);
				if (result == null) result = caseContentElement(svgGElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_DEFS_ELEMENT: {
				SvgDefsElement svgDefsElement = (SvgDefsElement)theEObject;
				T1 result = caseSvgDefsElement(svgDefsElement);
				if (result == null) result = caseSvgElement(svgDefsElement);
				if (result == null) result = caseContainerElement(svgDefsElement);
				if (result == null) result = caseStructuralElement(svgDefsElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgDefsElement);
				if (result == null) result = caseCoreAttributes(svgDefsElement);
				if (result == null) result = caseGraphicalEventAttributes(svgDefsElement);
				if (result == null) result = casePresentationAttributes(svgDefsElement);
				if (result == null) result = caseContentElement(svgDefsElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_DESC_ELEMENT: {
				SvgDescElement svgDescElement = (SvgDescElement)theEObject;
				T1 result = caseSvgDescElement(svgDescElement);
				if (result == null) result = caseSvgElement(svgDescElement);
				if (result == null) result = caseDescriptiveElement(svgDescElement);
				if (result == null) result = caseCoreAttributes(svgDescElement);
				if (result == null) result = caseContentElement(svgDescElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_TITLE_ELEMENT: {
				SvgTitleElement svgTitleElement = (SvgTitleElement)theEObject;
				T1 result = caseSvgTitleElement(svgTitleElement);
				if (result == null) result = caseSvgElement(svgTitleElement);
				if (result == null) result = caseDescriptiveElement(svgTitleElement);
				if (result == null) result = caseCoreAttributes(svgTitleElement);
				if (result == null) result = caseContentElement(svgTitleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_SYMBOL_ELEMENT: {
				SvgSymbolElement svgSymbolElement = (SvgSymbolElement)theEObject;
				T1 result = caseSvgSymbolElement(svgSymbolElement);
				if (result == null) result = caseSvgElement(svgSymbolElement);
				if (result == null) result = caseContainerElement(svgSymbolElement);
				if (result == null) result = caseStructuralElement(svgSymbolElement);
				if (result == null) result = caseCoreAttributes(svgSymbolElement);
				if (result == null) result = caseGraphicalEventAttributes(svgSymbolElement);
				if (result == null) result = casePresentationAttributes(svgSymbolElement);
				if (result == null) result = caseContentElement(svgSymbolElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_USE_ELEMENT: {
				SvgUseElement svgUseElement = (SvgUseElement)theEObject;
				T1 result = caseSvgUseElement(svgUseElement);
				if (result == null) result = caseSvgElement(svgUseElement);
				if (result == null) result = caseGraphicsElement(svgUseElement);
				if (result == null) result = caseGraphicsReferencingElement(svgUseElement);
				if (result == null) result = caseStructuralElement(svgUseElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgUseElement);
				if (result == null) result = caseCoreAttributes(svgUseElement);
				if (result == null) result = caseGraphicalEventAttributes(svgUseElement);
				if (result == null) result = casePresentationAttributes(svgUseElement);
				if (result == null) result = caseXLinkAttributes(svgUseElement);
				if (result == null) result = caseContentElement(svgUseElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_IMAGE_ELEMENT: {
				SvgImageElement svgImageElement = (SvgImageElement)theEObject;
				T1 result = caseSvgImageElement(svgImageElement);
				if (result == null) result = caseSvgElement(svgImageElement);
				if (result == null) result = caseGraphicsElement(svgImageElement);
				if (result == null) result = caseGraphicsReferencingElement(svgImageElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgImageElement);
				if (result == null) result = caseCoreAttributes(svgImageElement);
				if (result == null) result = caseGraphicalEventAttributes(svgImageElement);
				if (result == null) result = casePresentationAttributes(svgImageElement);
				if (result == null) result = caseXLinkAttributes(svgImageElement);
				if (result == null) result = caseContentElement(svgImageElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_SWITCH_ELEMENT: {
				SvgSwitchElement svgSwitchElement = (SvgSwitchElement)theEObject;
				T1 result = caseSvgSwitchElement(svgSwitchElement);
				if (result == null) result = caseSvgElement(svgSwitchElement);
				if (result == null) result = caseContainerElement(svgSwitchElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgSwitchElement);
				if (result == null) result = caseCoreAttributes(svgSwitchElement);
				if (result == null) result = caseGraphicalEventAttributes(svgSwitchElement);
				if (result == null) result = casePresentationAttributes(svgSwitchElement);
				if (result == null) result = caseContentElement(svgSwitchElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_PATH_ELEMENT: {
				SvgPathElement svgPathElement = (SvgPathElement)theEObject;
				T1 result = caseSvgPathElement(svgPathElement);
				if (result == null) result = caseSvgElement(svgPathElement);
				if (result == null) result = caseGraphicsElement(svgPathElement);
				if (result == null) result = caseShapeElement(svgPathElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgPathElement);
				if (result == null) result = caseCoreAttributes(svgPathElement);
				if (result == null) result = caseGraphicalEventAttributes(svgPathElement);
				if (result == null) result = casePresentationAttributes(svgPathElement);
				if (result == null) result = caseContentElement(svgPathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_RECT_ELEMENT: {
				SvgRectElement svgRectElement = (SvgRectElement)theEObject;
				T1 result = caseSvgRectElement(svgRectElement);
				if (result == null) result = caseSvgElement(svgRectElement);
				if (result == null) result = caseBasicShapeElement(svgRectElement);
				if (result == null) result = caseGraphicsElement(svgRectElement);
				if (result == null) result = caseShapeElement(svgRectElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgRectElement);
				if (result == null) result = caseCoreAttributes(svgRectElement);
				if (result == null) result = caseGraphicalEventAttributes(svgRectElement);
				if (result == null) result = casePresentationAttributes(svgRectElement);
				if (result == null) result = caseContentElement(svgRectElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_CIRCLE_ELEMENT: {
				SvgCircleElement svgCircleElement = (SvgCircleElement)theEObject;
				T1 result = caseSvgCircleElement(svgCircleElement);
				if (result == null) result = caseSvgElement(svgCircleElement);
				if (result == null) result = caseBasicShapeElement(svgCircleElement);
				if (result == null) result = caseGraphicsElement(svgCircleElement);
				if (result == null) result = caseShapeElement(svgCircleElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgCircleElement);
				if (result == null) result = caseCoreAttributes(svgCircleElement);
				if (result == null) result = caseGraphicalEventAttributes(svgCircleElement);
				if (result == null) result = casePresentationAttributes(svgCircleElement);
				if (result == null) result = caseContentElement(svgCircleElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_ELLIPSE_ELEMENT: {
				SvgEllipseElement svgEllipseElement = (SvgEllipseElement)theEObject;
				T1 result = caseSvgEllipseElement(svgEllipseElement);
				if (result == null) result = caseSvgElement(svgEllipseElement);
				if (result == null) result = caseBasicShapeElement(svgEllipseElement);
				if (result == null) result = caseGraphicsElement(svgEllipseElement);
				if (result == null) result = caseShapeElement(svgEllipseElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgEllipseElement);
				if (result == null) result = caseCoreAttributes(svgEllipseElement);
				if (result == null) result = caseGraphicalEventAttributes(svgEllipseElement);
				if (result == null) result = casePresentationAttributes(svgEllipseElement);
				if (result == null) result = caseContentElement(svgEllipseElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_LINE_ELEMENT: {
				SvgLineElement svgLineElement = (SvgLineElement)theEObject;
				T1 result = caseSvgLineElement(svgLineElement);
				if (result == null) result = caseSvgElement(svgLineElement);
				if (result == null) result = caseBasicShapeElement(svgLineElement);
				if (result == null) result = caseGraphicsElement(svgLineElement);
				if (result == null) result = caseShapeElement(svgLineElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgLineElement);
				if (result == null) result = caseCoreAttributes(svgLineElement);
				if (result == null) result = caseGraphicalEventAttributes(svgLineElement);
				if (result == null) result = casePresentationAttributes(svgLineElement);
				if (result == null) result = caseContentElement(svgLineElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_POLYLINE_ELEMENT: {
				SvgPolylineElement svgPolylineElement = (SvgPolylineElement)theEObject;
				T1 result = caseSvgPolylineElement(svgPolylineElement);
				if (result == null) result = caseSvgElement(svgPolylineElement);
				if (result == null) result = caseBasicShapeElement(svgPolylineElement);
				if (result == null) result = caseGraphicsElement(svgPolylineElement);
				if (result == null) result = caseShapeElement(svgPolylineElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgPolylineElement);
				if (result == null) result = caseCoreAttributes(svgPolylineElement);
				if (result == null) result = caseGraphicalEventAttributes(svgPolylineElement);
				if (result == null) result = casePresentationAttributes(svgPolylineElement);
				if (result == null) result = caseContentElement(svgPolylineElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_POLYGON_ELEMENT: {
				SvgPolygonElement svgPolygonElement = (SvgPolygonElement)theEObject;
				T1 result = caseSvgPolygonElement(svgPolygonElement);
				if (result == null) result = caseSvgElement(svgPolygonElement);
				if (result == null) result = caseBasicShapeElement(svgPolygonElement);
				if (result == null) result = caseGraphicsElement(svgPolygonElement);
				if (result == null) result = caseShapeElement(svgPolygonElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgPolygonElement);
				if (result == null) result = caseCoreAttributes(svgPolygonElement);
				if (result == null) result = caseGraphicalEventAttributes(svgPolygonElement);
				if (result == null) result = casePresentationAttributes(svgPolygonElement);
				if (result == null) result = caseContentElement(svgPolygonElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_TEXT_ELEMENT: {
				SvgTextElement svgTextElement = (SvgTextElement)theEObject;
				T1 result = caseSvgTextElement(svgTextElement);
				if (result == null) result = caseSvgElement(svgTextElement);
				if (result == null) result = caseGraphicsElement(svgTextElement);
				if (result == null) result = caseTextContentElement(svgTextElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgTextElement);
				if (result == null) result = caseCoreAttributes(svgTextElement);
				if (result == null) result = caseGraphicalEventAttributes(svgTextElement);
				if (result == null) result = casePresentationAttributes(svgTextElement);
				if (result == null) result = caseContentElement(svgTextElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_TSPAN_ELEMENT: {
				SvgTspanElement svgTspanElement = (SvgTspanElement)theEObject;
				T1 result = caseSvgTspanElement(svgTspanElement);
				if (result == null) result = caseSvgElement(svgTspanElement);
				if (result == null) result = caseTextContentElement(svgTspanElement);
				if (result == null) result = caseTextContentChildElement(svgTspanElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgTspanElement);
				if (result == null) result = caseCoreAttributes(svgTspanElement);
				if (result == null) result = caseGraphicalEventAttributes(svgTspanElement);
				if (result == null) result = casePresentationAttributes(svgTspanElement);
				if (result == null) result = caseContentElement(svgTspanElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_TREF_ELEMENT: {
				SvgTrefElement svgTrefElement = (SvgTrefElement)theEObject;
				T1 result = caseSvgTrefElement(svgTrefElement);
				if (result == null) result = caseSvgElement(svgTrefElement);
				if (result == null) result = caseTextContentElement(svgTrefElement);
				if (result == null) result = caseTextContentChildElement(svgTrefElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgTrefElement);
				if (result == null) result = caseCoreAttributes(svgTrefElement);
				if (result == null) result = caseGraphicalEventAttributes(svgTrefElement);
				if (result == null) result = casePresentationAttributes(svgTrefElement);
				if (result == null) result = caseXLinkAttributes(svgTrefElement);
				if (result == null) result = caseContentElement(svgTrefElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_TEXT_PATH_ELEMENT: {
				SvgTextPathElement svgTextPathElement = (SvgTextPathElement)theEObject;
				T1 result = caseSvgTextPathElement(svgTextPathElement);
				if (result == null) result = caseSvgElement(svgTextPathElement);
				if (result == null) result = caseTextContentElement(svgTextPathElement);
				if (result == null) result = caseTextContentChildElement(svgTextPathElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgTextPathElement);
				if (result == null) result = caseCoreAttributes(svgTextPathElement);
				if (result == null) result = caseGraphicalEventAttributes(svgTextPathElement);
				if (result == null) result = casePresentationAttributes(svgTextPathElement);
				if (result == null) result = caseXLinkAttributes(svgTextPathElement);
				if (result == null) result = caseContentElement(svgTextPathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_ALT_GLYPH_ELEMENT: {
				SvgAltGlyphElement svgAltGlyphElement = (SvgAltGlyphElement)theEObject;
				T1 result = caseSvgAltGlyphElement(svgAltGlyphElement);
				if (result == null) result = caseSvgElement(svgAltGlyphElement);
				if (result == null) result = caseTextContentElement(svgAltGlyphElement);
				if (result == null) result = caseTextContentChildElement(svgAltGlyphElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgAltGlyphElement);
				if (result == null) result = caseCoreAttributes(svgAltGlyphElement);
				if (result == null) result = caseGraphicalEventAttributes(svgAltGlyphElement);
				if (result == null) result = casePresentationAttributes(svgAltGlyphElement);
				if (result == null) result = caseXLinkAttributes(svgAltGlyphElement);
				if (result == null) result = caseContentElement(svgAltGlyphElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_ALT_GLYPH_DEF_ELEMENT: {
				SvgAltGlyphDefElement svgAltGlyphDefElement = (SvgAltGlyphDefElement)theEObject;
				T1 result = caseSvgAltGlyphDefElement(svgAltGlyphDefElement);
				if (result == null) result = caseSvgElement(svgAltGlyphDefElement);
				if (result == null) result = caseCoreAttributes(svgAltGlyphDefElement);
				if (result == null) result = caseContentElement(svgAltGlyphDefElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_ALT_GLYPH_ITEM_ELEMENT: {
				SvgAltGlyphItemElement svgAltGlyphItemElement = (SvgAltGlyphItemElement)theEObject;
				T1 result = caseSvgAltGlyphItemElement(svgAltGlyphItemElement);
				if (result == null) result = caseSvgElement(svgAltGlyphItemElement);
				if (result == null) result = caseCoreAttributes(svgAltGlyphItemElement);
				if (result == null) result = caseContentElement(svgAltGlyphItemElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_ALT_GLYPH_REF_ELEMENT: {
				SvgAltGlyphRefElement svgAltGlyphRefElement = (SvgAltGlyphRefElement)theEObject;
				T1 result = caseSvgAltGlyphRefElement(svgAltGlyphRefElement);
				if (result == null) result = caseSvgElement(svgAltGlyphRefElement);
				if (result == null) result = caseCoreAttributes(svgAltGlyphRefElement);
				if (result == null) result = casePresentationAttributes(svgAltGlyphRefElement);
				if (result == null) result = caseXLinkAttributes(svgAltGlyphRefElement);
				if (result == null) result = caseContentElement(svgAltGlyphRefElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_MARKER_ELEMENT: {
				SvgMarkerElement svgMarkerElement = (SvgMarkerElement)theEObject;
				T1 result = caseSvgMarkerElement(svgMarkerElement);
				if (result == null) result = caseSvgElement(svgMarkerElement);
				if (result == null) result = caseCoreAttributes(svgMarkerElement);
				if (result == null) result = casePresentationAttributes(svgMarkerElement);
				if (result == null) result = caseContentElement(svgMarkerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_COLOR_PROFILE_ELEMENT: {
				SvgColorProfileElement svgColorProfileElement = (SvgColorProfileElement)theEObject;
				T1 result = caseSvgColorProfileElement(svgColorProfileElement);
				if (result == null) result = caseSvgElement(svgColorProfileElement);
				if (result == null) result = caseCoreAttributes(svgColorProfileElement);
				if (result == null) result = casePresentationAttributes(svgColorProfileElement);
				if (result == null) result = caseXLinkAttributes(svgColorProfileElement);
				if (result == null) result = caseContentElement(svgColorProfileElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_LINEAR_GRADIENT_ELEMENT: {
				SvgLinearGradientElement svgLinearGradientElement = (SvgLinearGradientElement)theEObject;
				T1 result = caseSvgLinearGradientElement(svgLinearGradientElement);
				if (result == null) result = caseSvgElement(svgLinearGradientElement);
				if (result == null) result = caseGradientElement(svgLinearGradientElement);
				if (result == null) result = caseCoreAttributes(svgLinearGradientElement);
				if (result == null) result = casePresentationAttributes(svgLinearGradientElement);
				if (result == null) result = caseXLinkAttributes(svgLinearGradientElement);
				if (result == null) result = caseContentElement(svgLinearGradientElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_RADIAL_GRADIENT_ELEMENT: {
				SvgRadialGradientElement svgRadialGradientElement = (SvgRadialGradientElement)theEObject;
				T1 result = caseSvgRadialGradientElement(svgRadialGradientElement);
				if (result == null) result = caseSvgElement(svgRadialGradientElement);
				if (result == null) result = caseGradientElement(svgRadialGradientElement);
				if (result == null) result = caseCoreAttributes(svgRadialGradientElement);
				if (result == null) result = casePresentationAttributes(svgRadialGradientElement);
				if (result == null) result = caseXLinkAttributes(svgRadialGradientElement);
				if (result == null) result = caseContentElement(svgRadialGradientElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_GRADIENT_STOP_ELEMENT: {
				SvgGradientStopElement svgGradientStopElement = (SvgGradientStopElement)theEObject;
				T1 result = caseSvgGradientStopElement(svgGradientStopElement);
				if (result == null) result = caseSvgElement(svgGradientStopElement);
				if (result == null) result = caseCoreAttributes(svgGradientStopElement);
				if (result == null) result = casePresentationAttributes(svgGradientStopElement);
				if (result == null) result = caseContentElement(svgGradientStopElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_PATTERN_ELEMENT: {
				SvgPatternElement svgPatternElement = (SvgPatternElement)theEObject;
				T1 result = caseSvgPatternElement(svgPatternElement);
				if (result == null) result = caseSvgElement(svgPatternElement);
				if (result == null) result = caseContainerElement(svgPatternElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgPatternElement);
				if (result == null) result = caseCoreAttributes(svgPatternElement);
				if (result == null) result = casePresentationAttributes(svgPatternElement);
				if (result == null) result = caseXLinkAttributes(svgPatternElement);
				if (result == null) result = caseContentElement(svgPatternElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_CLIP_PATH_ELEMENT: {
				SvgClipPathElement svgClipPathElement = (SvgClipPathElement)theEObject;
				T1 result = caseSvgClipPathElement(svgClipPathElement);
				if (result == null) result = caseSvgElement(svgClipPathElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgClipPathElement);
				if (result == null) result = caseCoreAttributes(svgClipPathElement);
				if (result == null) result = casePresentationAttributes(svgClipPathElement);
				if (result == null) result = caseContentElement(svgClipPathElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_MASK_ELEMENT: {
				SvgMaskElement svgMaskElement = (SvgMaskElement)theEObject;
				T1 result = caseSvgMaskElement(svgMaskElement);
				if (result == null) result = caseSvgElement(svgMaskElement);
				if (result == null) result = caseConditionalProcessingAttributes(svgMaskElement);
				if (result == null) result = caseCoreAttributes(svgMaskElement);
				if (result == null) result = casePresentationAttributes(svgMaskElement);
				if (result == null) result = caseContentElement(svgMaskElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FILTER_ELEMENT: {
				SvgFilterElement svgFilterElement = (SvgFilterElement)theEObject;
				T1 result = caseSvgFilterElement(svgFilterElement);
				if (result == null) result = caseSvgElement(svgFilterElement);
				if (result == null) result = caseCoreAttributes(svgFilterElement);
				if (result == null) result = casePresentationAttributes(svgFilterElement);
				if (result == null) result = caseXLinkAttributes(svgFilterElement);
				if (result == null) result = caseContentElement(svgFilterElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_DISTANT_LIGHT: {
				SvgFeDistantLight svgFeDistantLight = (SvgFeDistantLight)theEObject;
				T1 result = caseSvgFeDistantLight(svgFeDistantLight);
				if (result == null) result = caseSvgElement(svgFeDistantLight);
				if (result == null) result = caseCoreAttributes(svgFeDistantLight);
				if (result == null) result = caseContentElement(svgFeDistantLight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_POINT_LIGHT: {
				SvgFePointLight svgFePointLight = (SvgFePointLight)theEObject;
				T1 result = caseSvgFePointLight(svgFePointLight);
				if (result == null) result = caseSvgElement(svgFePointLight);
				if (result == null) result = caseCoreAttributes(svgFePointLight);
				if (result == null) result = caseLightSourceElement(svgFePointLight);
				if (result == null) result = caseContentElement(svgFePointLight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_SPOT_LIGHT: {
				SvgFeSpotLight svgFeSpotLight = (SvgFeSpotLight)theEObject;
				T1 result = caseSvgFeSpotLight(svgFeSpotLight);
				if (result == null) result = caseSvgElement(svgFeSpotLight);
				if (result == null) result = caseCoreAttributes(svgFeSpotLight);
				if (result == null) result = caseLightSourceElement(svgFeSpotLight);
				if (result == null) result = caseContentElement(svgFeSpotLight);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_BLEND: {
				SvgFeBlend svgFeBlend = (SvgFeBlend)theEObject;
				T1 result = caseSvgFeBlend(svgFeBlend);
				if (result == null) result = caseSvgElement(svgFeBlend);
				if (result == null) result = caseCoreAttributes(svgFeBlend);
				if (result == null) result = casePresentationAttributes(svgFeBlend);
				if (result == null) result = caseFilterPrimitiveAttributes(svgFeBlend);
				if (result == null) result = caseContentElement(svgFeBlend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_COLOR_MATRIX: {
				SvgFeColorMatrix svgFeColorMatrix = (SvgFeColorMatrix)theEObject;
				T1 result = caseSvgFeColorMatrix(svgFeColorMatrix);
				if (result == null) result = caseSvgElement(svgFeColorMatrix);
				if (result == null) result = caseCoreAttributes(svgFeColorMatrix);
				if (result == null) result = casePresentationAttributes(svgFeColorMatrix);
				if (result == null) result = caseFilterPrimitiveAttributes(svgFeColorMatrix);
				if (result == null) result = caseContentElement(svgFeColorMatrix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_COMPONENT_TRANSFER: {
				SvgFeComponentTransfer svgFeComponentTransfer = (SvgFeComponentTransfer)theEObject;
				T1 result = caseSvgFeComponentTransfer(svgFeComponentTransfer);
				if (result == null) result = caseSvgElement(svgFeComponentTransfer);
				if (result == null) result = caseCoreAttributes(svgFeComponentTransfer);
				if (result == null) result = casePresentationAttributes(svgFeComponentTransfer);
				if (result == null) result = caseFilterPrimitiveAttributes(svgFeComponentTransfer);
				if (result == null) result = caseContentElement(svgFeComponentTransfer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_FUNC_R: {
				SvgFeFuncR svgFeFuncR = (SvgFeFuncR)theEObject;
				T1 result = caseSvgFeFuncR(svgFeFuncR);
				if (result == null) result = caseSvgElement(svgFeFuncR);
				if (result == null) result = caseCoreAttributes(svgFeFuncR);
				if (result == null) result = casePresentationAttributes(svgFeFuncR);
				if (result == null) result = caseContentElement(svgFeFuncR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_FUNC_G: {
				SvgFeFuncG svgFeFuncG = (SvgFeFuncG)theEObject;
				T1 result = caseSvgFeFuncG(svgFeFuncG);
				if (result == null) result = caseSvgElement(svgFeFuncG);
				if (result == null) result = caseCoreAttributes(svgFeFuncG);
				if (result == null) result = casePresentationAttributes(svgFeFuncG);
				if (result == null) result = caseContentElement(svgFeFuncG);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_FUNC_B: {
				SvgFeFuncB svgFeFuncB = (SvgFeFuncB)theEObject;
				T1 result = caseSvgFeFuncB(svgFeFuncB);
				if (result == null) result = caseSvgElement(svgFeFuncB);
				if (result == null) result = caseCoreAttributes(svgFeFuncB);
				if (result == null) result = casePresentationAttributes(svgFeFuncB);
				if (result == null) result = caseContentElement(svgFeFuncB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_FUNC_A: {
				SvgFeFuncA svgFeFuncA = (SvgFeFuncA)theEObject;
				T1 result = caseSvgFeFuncA(svgFeFuncA);
				if (result == null) result = caseSvgElement(svgFeFuncA);
				if (result == null) result = caseCoreAttributes(svgFeFuncA);
				if (result == null) result = casePresentationAttributes(svgFeFuncA);
				if (result == null) result = caseContentElement(svgFeFuncA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_COMPOSITE: {
				SvgFeComposite svgFeComposite = (SvgFeComposite)theEObject;
				T1 result = caseSvgFeComposite(svgFeComposite);
				if (result == null) result = caseSvgElement(svgFeComposite);
				if (result == null) result = caseCoreAttributes(svgFeComposite);
				if (result == null) result = casePresentationAttributes(svgFeComposite);
				if (result == null) result = caseFilterPrimitiveAttributes(svgFeComposite);
				if (result == null) result = caseContentElement(svgFeComposite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_CONVOLVE_MATRIX: {
				SvgFeConvolveMatrix svgFeConvolveMatrix = (SvgFeConvolveMatrix)theEObject;
				T1 result = caseSvgFeConvolveMatrix(svgFeConvolveMatrix);
				if (result == null) result = caseSvgElement(svgFeConvolveMatrix);
				if (result == null) result = caseCoreAttributes(svgFeConvolveMatrix);
				if (result == null) result = casePresentationAttributes(svgFeConvolveMatrix);
				if (result == null) result = caseFilterPrimitiveAttributes(svgFeConvolveMatrix);
				if (result == null) result = caseContentElement(svgFeConvolveMatrix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_DIFFUSE_LIGHTING: {
				SvgFeDiffuseLighting svgFeDiffuseLighting = (SvgFeDiffuseLighting)theEObject;
				T1 result = caseSvgFeDiffuseLighting(svgFeDiffuseLighting);
				if (result == null) result = caseSvgElement(svgFeDiffuseLighting);
				if (result == null) result = caseCoreAttributes(svgFeDiffuseLighting);
				if (result == null) result = casePresentationAttributes(svgFeDiffuseLighting);
				if (result == null) result = caseFilterPrimitiveAttributes(svgFeDiffuseLighting);
				if (result == null) result = caseContentElement(svgFeDiffuseLighting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_DISPLACEMENT_MAP: {
				SvgFeDisplacementMap svgFeDisplacementMap = (SvgFeDisplacementMap)theEObject;
				T1 result = caseSvgFeDisplacementMap(svgFeDisplacementMap);
				if (result == null) result = caseSvgElement(svgFeDisplacementMap);
				if (result == null) result = caseCoreAttributes(svgFeDisplacementMap);
				if (result == null) result = casePresentationAttributes(svgFeDisplacementMap);
				if (result == null) result = caseFilterPrimitiveAttributes(svgFeDisplacementMap);
				if (result == null) result = caseContentElement(svgFeDisplacementMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_FLOOD: {
				SvgFeFlood svgFeFlood = (SvgFeFlood)theEObject;
				T1 result = caseSvgFeFlood(svgFeFlood);
				if (result == null) result = caseSvgElement(svgFeFlood);
				if (result == null) result = caseCoreAttributes(svgFeFlood);
				if (result == null) result = casePresentationAttributes(svgFeFlood);
				if (result == null) result = caseFilterPrimitiveAttributes(svgFeFlood);
				if (result == null) result = caseContentElement(svgFeFlood);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_GAUSSIAN_BLUR: {
				SvgFeGaussianBlur svgFeGaussianBlur = (SvgFeGaussianBlur)theEObject;
				T1 result = caseSvgFeGaussianBlur(svgFeGaussianBlur);
				if (result == null) result = caseSvgElement(svgFeGaussianBlur);
				if (result == null) result = caseCoreAttributes(svgFeGaussianBlur);
				if (result == null) result = casePresentationAttributes(svgFeGaussianBlur);
				if (result == null) result = caseFilterPrimitiveAttributes(svgFeGaussianBlur);
				if (result == null) result = caseContentElement(svgFeGaussianBlur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_IMAGE: {
				SvgFeImage svgFeImage = (SvgFeImage)theEObject;
				T1 result = caseSvgFeImage(svgFeImage);
				if (result == null) result = caseSvgElement(svgFeImage);
				if (result == null) result = caseCoreAttributes(svgFeImage);
				if (result == null) result = casePresentationAttributes(svgFeImage);
				if (result == null) result = caseFilterPrimitiveAttributes(svgFeImage);
				if (result == null) result = caseXLinkAttributes(svgFeImage);
				if (result == null) result = caseContentElement(svgFeImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_MERGE: {
				SvgFeMerge svgFeMerge = (SvgFeMerge)theEObject;
				T1 result = caseSvgFeMerge(svgFeMerge);
				if (result == null) result = caseSvgElement(svgFeMerge);
				if (result == null) result = caseCoreAttributes(svgFeMerge);
				if (result == null) result = casePresentationAttributes(svgFeMerge);
				if (result == null) result = caseFilterPrimitiveAttributes(svgFeMerge);
				if (result == null) result = caseContentElement(svgFeMerge);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_MERGE_NODE: {
				SvgFeMergeNode svgFeMergeNode = (SvgFeMergeNode)theEObject;
				T1 result = caseSvgFeMergeNode(svgFeMergeNode);
				if (result == null) result = caseSvgElement(svgFeMergeNode);
				if (result == null) result = caseCoreAttributes(svgFeMergeNode);
				if (result == null) result = caseContentElement(svgFeMergeNode);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_MORPHOLOGY: {
				SvgFeMorphology svgFeMorphology = (SvgFeMorphology)theEObject;
				T1 result = caseSvgFeMorphology(svgFeMorphology);
				if (result == null) result = caseSvgElement(svgFeMorphology);
				if (result == null) result = caseCoreAttributes(svgFeMorphology);
				if (result == null) result = casePresentationAttributes(svgFeMorphology);
				if (result == null) result = caseFilterPrimitiveAttributes(svgFeMorphology);
				if (result == null) result = caseContentElement(svgFeMorphology);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_OFFSET: {
				SvgFeOffset svgFeOffset = (SvgFeOffset)theEObject;
				T1 result = caseSvgFeOffset(svgFeOffset);
				if (result == null) result = caseSvgElement(svgFeOffset);
				if (result == null) result = caseCoreAttributes(svgFeOffset);
				if (result == null) result = casePresentationAttributes(svgFeOffset);
				if (result == null) result = caseFilterPrimitiveAttributes(svgFeOffset);
				if (result == null) result = caseContentElement(svgFeOffset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_SPECULAR_LIGHTING: {
				SvgFeSpecularLighting svgFeSpecularLighting = (SvgFeSpecularLighting)theEObject;
				T1 result = caseSvgFeSpecularLighting(svgFeSpecularLighting);
				if (result == null) result = caseSvgElement(svgFeSpecularLighting);
				if (result == null) result = caseCoreAttributes(svgFeSpecularLighting);
				if (result == null) result = casePresentationAttributes(svgFeSpecularLighting);
				if (result == null) result = caseFilterPrimitiveAttributes(svgFeSpecularLighting);
				if (result == null) result = caseContentElement(svgFeSpecularLighting);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_TILE: {
				SvgFeTile svgFeTile = (SvgFeTile)theEObject;
				T1 result = caseSvgFeTile(svgFeTile);
				if (result == null) result = caseSvgElement(svgFeTile);
				if (result == null) result = caseCoreAttributes(svgFeTile);
				if (result == null) result = casePresentationAttributes(svgFeTile);
				if (result == null) result = caseFilterPrimitiveAttributes(svgFeTile);
				if (result == null) result = caseContentElement(svgFeTile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SvgPackage.SVG_FE_TURBULENCE: {
				SvgFeTurbulence svgFeTurbulence = (SvgFeTurbulence)theEObject;
				T1 result = caseSvgFeTurbulence(svgFeTurbulence);
				if (result == null) result = caseSvgElement(svgFeTurbulence);
				if (result == null) result = caseCoreAttributes(svgFeTurbulence);
				if (result == null) result = casePresentationAttributes(svgFeTurbulence);
				if (result == null) result = caseFilterPrimitiveAttributes(svgFeTurbulence);
				if (result == null) result = caseContentElement(svgFeTurbulence);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends SvgElement> T1 caseContentElement(ContentElement<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public <T extends SvgElement> T1 caseContainerElement(ContainerElement<T> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Structural Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Structural Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStructuralElement(StructuralElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgElement(SvgElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descriptive Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descriptive Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDescriptiveElement(DescriptiveElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphics Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphics Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGraphicsElement(GraphicsElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphics Referencing Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphics Referencing Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGraphicsReferencingElement(GraphicsReferencingElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseShapeElement(ShapeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Shape Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Shape Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBasicShapeElement(BasicShapeElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Content Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Content Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTextContentElement(TextContentElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Content Child Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Content Child Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTextContentChildElement(TextContentChildElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gradient Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gradient Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGradientElement(GradientElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Light Source Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Light Source Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLightSourceElement(LightSourceElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Primitive Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Primitive Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFilterPrimitiveElement(FilterPrimitiveElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ENUMS </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ENUMS </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 case____ENUMS____(____ENUMS____ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DATATYPES </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DATATYPES </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 case____DATATYPES____(____DATATYPES____ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ATTRIBUTES </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ATTRIBUTES </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 case____ATTRIBUTES____(____ATTRIBUTES____ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Conditional Processing Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Conditional Processing Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseConditionalProcessingAttributes(ConditionalProcessingAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Core Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Core Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCoreAttributes(CoreAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Event Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Event Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDocumentEventAttributes(DocumentEventAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphical Event Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphical Event Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGraphicalEventAttributes(GraphicalEventAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Presentation Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Presentation Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePresentationAttributes(PresentationAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XLink Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XLink Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseXLinkAttributes(XLinkAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Primitive Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Primitive Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFilterPrimitiveAttributes(FilterPrimitiveAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ELEMENTES </em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ELEMENTES </em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 case____ELEMENTES____(____ELEMENTES____ object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Svg Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Svg Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgSvgElement(SvgSvgElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GElement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GElement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgGElement(SvgGElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Defs Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Defs Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgDefsElement(SvgDefsElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Desc Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Desc Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgDescElement(SvgDescElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgTitleElement(SvgTitleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Symbol Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Symbol Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgSymbolElement(SvgSymbolElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Use Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Use Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgUseElement(SvgUseElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Image Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Image Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgImageElement(SvgImageElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Switch Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Switch Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgSwitchElement(SvgSwitchElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgPathElement(SvgPathElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rect Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rect Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgRectElement(SvgRectElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circle Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circle Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgCircleElement(SvgCircleElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ellipse Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ellipse Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgEllipseElement(SvgEllipseElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgLineElement(SvgLineElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polyline Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polyline Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgPolylineElement(SvgPolylineElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Polygon Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Polygon Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgPolygonElement(SvgPolygonElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgTextElement(SvgTextElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tspan Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tspan Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgTspanElement(SvgTspanElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tref Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tref Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgTrefElement(SvgTrefElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Text Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Text Path Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgTextPathElement(SvgTextPathElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alt Glyph Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alt Glyph Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgAltGlyphElement(SvgAltGlyphElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alt Glyph Def Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alt Glyph Def Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgAltGlyphDefElement(SvgAltGlyphDefElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alt Glyph Item Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alt Glyph Item Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgAltGlyphItemElement(SvgAltGlyphItemElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Alt Glyph Ref Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Alt Glyph Ref Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgAltGlyphRefElement(SvgAltGlyphRefElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marker Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marker Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgMarkerElement(SvgMarkerElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Profile Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Profile Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgColorProfileElement(SvgColorProfileElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Gradient Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Gradient Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgLinearGradientElement(SvgLinearGradientElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radial Gradient Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radial Gradient Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgRadialGradientElement(SvgRadialGradientElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gradient Stop Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gradient Stop Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgGradientStopElement(SvgGradientStopElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pattern Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgPatternElement(SvgPatternElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clip Path Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clip Path Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgClipPathElement(SvgClipPathElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mask Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mask Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgMaskElement(SvgMaskElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFilterElement(SvgFilterElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Distant Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Distant Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeDistantLight(SvgFeDistantLight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Point Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Point Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFePointLight(SvgFePointLight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Spot Light</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Spot Light</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeSpotLight(SvgFeSpotLight object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Blend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Blend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeBlend(SvgFeBlend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Color Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Color Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeColorMatrix(SvgFeColorMatrix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Component Transfer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Component Transfer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeComponentTransfer(SvgFeComponentTransfer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Func R</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Func R</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeFuncR(SvgFeFuncR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Func G</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Func G</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeFuncG(SvgFeFuncG object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Func B</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Func B</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeFuncB(SvgFeFuncB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Func A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Func A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeFuncA(SvgFeFuncA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeComposite(SvgFeComposite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Convolve Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Convolve Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeConvolveMatrix(SvgFeConvolveMatrix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Diffuse Lighting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Diffuse Lighting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeDiffuseLighting(SvgFeDiffuseLighting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Displacement Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Displacement Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeDisplacementMap(SvgFeDisplacementMap object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Flood</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Flood</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeFlood(SvgFeFlood object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Gaussian Blur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Gaussian Blur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeGaussianBlur(SvgFeGaussianBlur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeImage(SvgFeImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Merge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Merge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeMerge(SvgFeMerge object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Merge Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Merge Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeMergeNode(SvgFeMergeNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Morphology</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Morphology</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeMorphology(SvgFeMorphology object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Offset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Offset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeOffset(SvgFeOffset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Specular Lighting</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Specular Lighting</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeSpecularLighting(SvgFeSpecularLighting object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Tile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Tile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeTile(SvgFeTile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fe Turbulence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fe Turbulence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSvgFeTurbulence(SvgFeTurbulence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T1 defaultCase(EObject object) {
		return null;
	}

} //SvgSwitch
