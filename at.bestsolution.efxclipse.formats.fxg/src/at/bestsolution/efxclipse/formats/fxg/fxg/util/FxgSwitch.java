/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg.util;

import at.bestsolution.efxclipse.formats.fxg.fxg.*;

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
 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage
 * @generated
 */
public class FxgSwitch<T1> extends Switch<T1> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FxgPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxgSwitch() {
		if (modelPackage == null) {
			modelPackage = FxgPackage.eINSTANCE;
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
			case FxgPackage.GRAPHIC: {
				Graphic graphic = (Graphic)theEObject;
				T1 result = caseGraphic(graphic);
				if (result == null) result = caseContainerElement(graphic);
				if (result == null) result = caseFXGElement(graphic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.LIBRARY: {
				Library library = (Library)theEObject;
				T1 result = caseLibrary(library);
				if (result == null) result = caseContainerElement(library);
				if (result == null) result = caseFXGElement(library);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.PRIVATE: {
				Private private_ = (Private)theEObject;
				T1 result = casePrivate(private_);
				if (result == null) result = caseFXGElement(private_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.DEFINITION: {
				Definition definition = (Definition)theEObject;
				T1 result = caseDefinition(definition);
				if (result == null) result = caseContainerElement(definition);
				if (result == null) result = caseFXGElement(definition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.GROUP: {
				Group group = (Group)theEObject;
				T1 result = caseGroup(group);
				if (result == null) result = caseContainerElement(group);
				if (result == null) result = caseFXGElement(group);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.TRANSFORM: {
				Transform transform = (Transform)theEObject;
				T1 result = caseTransform(transform);
				if (result == null) result = caseFXGElement(transform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.PLACE_OBJECT: {
				PlaceObject placeObject = (PlaceObject)theEObject;
				T1 result = casePlaceObject(placeObject);
				if (result == null) result = caseFXGElement(placeObject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.MATRIX: {
				Matrix matrix = (Matrix)theEObject;
				T1 result = caseMatrix(matrix);
				if (result == null) result = caseFXGElement(matrix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.PATH: {
				Path path = (Path)theEObject;
				T1 result = casePath(path);
				if (result == null) result = caseFXGElement(path);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.SHAPE: {
				Shape shape = (Shape)theEObject;
				T1 result = caseShape(shape);
				if (result == null) result = caseFXGElement(shape);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.RECT: {
				Rect rect = (Rect)theEObject;
				T1 result = caseRect(rect);
				if (result == null) result = caseShape(rect);
				if (result == null) result = caseFXGElement(rect);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.ELLIPSE: {
				Ellipse ellipse = (Ellipse)theEObject;
				T1 result = caseEllipse(ellipse);
				if (result == null) result = caseShape(ellipse);
				if (result == null) result = caseFXGElement(ellipse);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.LINE: {
				Line line = (Line)theEObject;
				T1 result = caseLine(line);
				if (result == null) result = caseShape(line);
				if (result == null) result = caseFXGElement(line);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.RICH_TEXT: {
				RichText richText = (RichText)theEObject;
				T1 result = caseRichText(richText);
				if (result == null) result = caseFXGElement(richText);
				if (result == null) result = caseParagraphAttributes(richText);
				if (result == null) result = caseContainerAttributes(richText);
				if (result == null) result = caseCharacterAttributes(richText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.RICH_TEXT_CONTENT: {
				RichTextContent richTextContent = (RichTextContent)theEObject;
				T1 result = caseRichTextContent(richTextContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.RICH_TEXT_CONTENT_CONTAINER: {
				RichTextContentContainer richTextContentContainer = (RichTextContentContainer)theEObject;
				T1 result = caseRichTextContentContainer(richTextContentContainer);
				if (result == null) result = caseRichTextContent(richTextContentContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.PARAGRAPH_ATTRIBUTES: {
				ParagraphAttributes paragraphAttributes = (ParagraphAttributes)theEObject;
				T1 result = caseParagraphAttributes(paragraphAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.CONTAINER_ATTRIBUTES: {
				ContainerAttributes containerAttributes = (ContainerAttributes)theEObject;
				T1 result = caseContainerAttributes(containerAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.CHARACTER_ATTRIBUTES: {
				CharacterAttributes characterAttributes = (CharacterAttributes)theEObject;
				T1 result = caseCharacterAttributes(characterAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.RAWTEXT: {
				rawtext rawtext = (rawtext)theEObject;
				T1 result = caserawtext(rawtext);
				if (result == null) result = caseRichTextContent(rawtext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.DIV: {
				div div = (div)theEObject;
				T1 result = casediv(div);
				if (result == null) result = caseRichTextContentContainer(div);
				if (result == null) result = caseRichTextContent(div);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.P: {
				p p = (p)theEObject;
				T1 result = casep(p);
				if (result == null) result = caseRichTextContentContainer(p);
				if (result == null) result = caseParagraphAttributes(p);
				if (result == null) result = caseRichTextContent(p);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.TCY: {
				tcy tcy = (tcy)theEObject;
				T1 result = casetcy(tcy);
				if (result == null) result = caseRichTextContentContainer(tcy);
				if (result == null) result = caseRichTextContent(tcy);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.A: {
				a a = (a)theEObject;
				T1 result = casea(a);
				if (result == null) result = caseRichTextContentContainer(a);
				if (result == null) result = caseRichTextContent(a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.IMG: {
				img img = (img)theEObject;
				T1 result = caseimg(img);
				if (result == null) result = caseRichTextContent(img);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.SPAN: {
				span span = (span)theEObject;
				T1 result = casespan(span);
				if (result == null) result = caseRichTextContentContainer(span);
				if (result == null) result = caseRichTextContent(span);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.BR: {
				br br = (br)theEObject;
				T1 result = casebr(br);
				if (result == null) result = caseRichTextContent(br);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.TAB: {
				tab tab = (tab)theEObject;
				T1 result = casetab(tab);
				if (result == null) result = caseRichTextContent(tab);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.LINK_NORMAL_FORMAT: {
				linkNormalFormat linkNormalFormat = (linkNormalFormat)theEObject;
				T1 result = caselinkNormalFormat(linkNormalFormat);
				if (result == null) result = caseRichTextContent(linkNormalFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.LINK_HOVER_FORMAT: {
				linkHoverFormat linkHoverFormat = (linkHoverFormat)theEObject;
				T1 result = caselinkHoverFormat(linkHoverFormat);
				if (result == null) result = caseRichTextContent(linkHoverFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.LINK_ACTIVE_FORMAT: {
				linkActiveFormat linkActiveFormat = (linkActiveFormat)theEObject;
				T1 result = caselinkActiveFormat(linkActiveFormat);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.BITMAP_IMAGE: {
				BitmapImage bitmapImage = (BitmapImage)theEObject;
				T1 result = caseBitmapImage(bitmapImage);
				if (result == null) result = caseFXGElement(bitmapImage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.FILL: {
				Fill fill = (Fill)theEObject;
				T1 result = caseFill(fill);
				if (result == null) result = caseFXGElement(fill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.SOLID_COLOR: {
				SolidColor solidColor = (SolidColor)theEObject;
				T1 result = caseSolidColor(solidColor);
				if (result == null) result = caseFill(solidColor);
				if (result == null) result = caseFXGElement(solidColor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.LINEAR_GRADIENT: {
				LinearGradient linearGradient = (LinearGradient)theEObject;
				T1 result = caseLinearGradient(linearGradient);
				if (result == null) result = caseFill(linearGradient);
				if (result == null) result = caseContainerElement(linearGradient);
				if (result == null) result = caseFXGElement(linearGradient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.RADIAL_GRADIENT: {
				RadialGradient radialGradient = (RadialGradient)theEObject;
				T1 result = caseRadialGradient(radialGradient);
				if (result == null) result = caseFill(radialGradient);
				if (result == null) result = caseContainerElement(radialGradient);
				if (result == null) result = caseFXGElement(radialGradient);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.BITMAP_FILL: {
				BitmapFill bitmapFill = (BitmapFill)theEObject;
				T1 result = caseBitmapFill(bitmapFill);
				if (result == null) result = caseFill(bitmapFill);
				if (result == null) result = caseFXGElement(bitmapFill);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.STROKE: {
				Stroke stroke = (Stroke)theEObject;
				T1 result = caseStroke(stroke);
				if (result == null) result = caseFXGElement(stroke);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.SOLID_COLOR_STROKE: {
				SolidColorStroke solidColorStroke = (SolidColorStroke)theEObject;
				T1 result = caseSolidColorStroke(solidColorStroke);
				if (result == null) result = caseStroke(solidColorStroke);
				if (result == null) result = caseFXGElement(solidColorStroke);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.LINEAR_GRADIENT_STROKE: {
				LinearGradientStroke linearGradientStroke = (LinearGradientStroke)theEObject;
				T1 result = caseLinearGradientStroke(linearGradientStroke);
				if (result == null) result = caseStroke(linearGradientStroke);
				if (result == null) result = caseContainerElement(linearGradientStroke);
				if (result == null) result = caseFXGElement(linearGradientStroke);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.RADIAL_GRADIENT_STROKE: {
				RadialGradientStroke radialGradientStroke = (RadialGradientStroke)theEObject;
				T1 result = caseRadialGradientStroke(radialGradientStroke);
				if (result == null) result = caseStroke(radialGradientStroke);
				if (result == null) result = caseContainerElement(radialGradientStroke);
				if (result == null) result = caseFXGElement(radialGradientStroke);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.GRADIENT_ENTRY: {
				GradientEntry gradientEntry = (GradientEntry)theEObject;
				T1 result = caseGradientEntry(gradientEntry);
				if (result == null) result = caseFXGElement(gradientEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.COLOR_TRANSFORM: {
				ColorTransform colorTransform = (ColorTransform)theEObject;
				T1 result = caseColorTransform(colorTransform);
				if (result == null) result = caseFXGElement(colorTransform);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.FILTER: {
				Filter filter = (Filter)theEObject;
				T1 result = caseFilter(filter);
				if (result == null) result = caseFXGElement(filter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.BLUR_FILTER: {
				BlurFilter blurFilter = (BlurFilter)theEObject;
				T1 result = caseBlurFilter(blurFilter);
				if (result == null) result = caseFilter(blurFilter);
				if (result == null) result = caseFXGElement(blurFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.DROP_SHADOW_FILTER: {
				DropShadowFilter dropShadowFilter = (DropShadowFilter)theEObject;
				T1 result = caseDropShadowFilter(dropShadowFilter);
				if (result == null) result = caseFilter(dropShadowFilter);
				if (result == null) result = caseFXGElement(dropShadowFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.BEVEL_FILTER: {
				BevelFilter bevelFilter = (BevelFilter)theEObject;
				T1 result = caseBevelFilter(bevelFilter);
				if (result == null) result = caseFilter(bevelFilter);
				if (result == null) result = caseFXGElement(bevelFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.GRADIENT_GLOW_FILTER: {
				GradientGlowFilter gradientGlowFilter = (GradientGlowFilter)theEObject;
				T1 result = caseGradientGlowFilter(gradientGlowFilter);
				if (result == null) result = caseFilter(gradientGlowFilter);
				if (result == null) result = caseContainerElement(gradientGlowFilter);
				if (result == null) result = caseFXGElement(gradientGlowFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.GRADIENT_BEVEL_FILTER: {
				GradientBevelFilter gradientBevelFilter = (GradientBevelFilter)theEObject;
				T1 result = caseGradientBevelFilter(gradientBevelFilter);
				if (result == null) result = caseFilter(gradientBevelFilter);
				if (result == null) result = caseContainerElement(gradientBevelFilter);
				if (result == null) result = caseFXGElement(gradientBevelFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.COLOR_MATRIX_FILTER: {
				ColorMatrixFilter colorMatrixFilter = (ColorMatrixFilter)theEObject;
				T1 result = caseColorMatrixFilter(colorMatrixFilter);
				if (result == null) result = caseFilter(colorMatrixFilter);
				if (result == null) result = caseFXGElement(colorMatrixFilter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.FXG_ELEMENT: {
				FXGElement fxgElement = (FXGElement)theEObject;
				T1 result = caseFXGElement(fxgElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FxgPackage.CONTAINER_ELEMENT: {
				ContainerElement<?> containerElement = (ContainerElement<?>)theEObject;
				T1 result = caseContainerElement(containerElement);
				if (result == null) result = caseFXGElement(containerElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Graphic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Graphic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGraphic(Graphic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Library</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Library</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLibrary(Library object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePrivate(Private object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDefinition(Definition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGroup(Group object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseTransform(Transform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Place Object</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Place Object</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePlaceObject(PlaceObject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Matrix</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Matrix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseMatrix(Matrix object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casePath(Path object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseShape(Shape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rect</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rect</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRect(Rect object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ellipse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ellipse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseEllipse(Ellipse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLine(Line object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRichText(RichText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich Text Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich Text Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRichTextContent(RichTextContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rich Text Content Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rich Text Content Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRichTextContentContainer(RichTextContentContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paragraph Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paragraph Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseParagraphAttributes(ParagraphAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Container Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Container Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseContainerAttributes(ContainerAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Character Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Character Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseCharacterAttributes(CharacterAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>rawtext</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>rawtext</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caserawtext(rawtext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>div</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>div</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casediv(div object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>p</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>p</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casep(p object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tcy</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tcy</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casetcy(tcy object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casea(a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>img</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>img</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseimg(img object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>span</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>span</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casespan(span object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>br</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>br</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casebr(br object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>tab</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>tab</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 casetab(tab object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>link Normal Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>link Normal Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caselinkNormalFormat(linkNormalFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>link Hover Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>link Hover Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caselinkHoverFormat(linkHoverFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>link Active Format</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>link Active Format</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caselinkActiveFormat(linkActiveFormat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bitmap Image</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bitmap Image</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBitmapImage(BitmapImage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFill(Fill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solid Color</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solid Color</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSolidColor(SolidColor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Gradient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Gradient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLinearGradient(LinearGradient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radial Gradient</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radial Gradient</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRadialGradient(RadialGradient object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bitmap Fill</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bitmap Fill</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBitmapFill(BitmapFill object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stroke</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stroke</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseStroke(Stroke object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Solid Color Stroke</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Solid Color Stroke</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseSolidColorStroke(SolidColorStroke object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Linear Gradient Stroke</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Linear Gradient Stroke</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseLinearGradientStroke(LinearGradientStroke object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Radial Gradient Stroke</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Radial Gradient Stroke</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseRadialGradientStroke(RadialGradientStroke object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gradient Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gradient Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGradientEntry(GradientEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Transform</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Transform</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseColorTransform(ColorTransform object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFilter(Filter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Blur Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Blur Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBlurFilter(BlurFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drop Shadow Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drop Shadow Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseDropShadowFilter(DropShadowFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bevel Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bevel Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseBevelFilter(BevelFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gradient Glow Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gradient Glow Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGradientGlowFilter(GradientGlowFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Gradient Bevel Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Gradient Bevel Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseGradientBevelFilter(GradientBevelFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Color Matrix Filter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Color Matrix Filter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseColorMatrixFilter(ColorMatrixFilter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FXG Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FXG Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T1 caseFXGElement(FXGElement object) {
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
	public <T extends FXGElement> T1 caseContainerElement(ContainerElement<T> object) {
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

} //FxgSwitch
