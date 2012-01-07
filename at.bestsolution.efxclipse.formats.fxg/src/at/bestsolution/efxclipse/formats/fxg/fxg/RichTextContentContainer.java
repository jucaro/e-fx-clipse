/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rich Text Content Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContentContainer#get_children <em>children</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRichTextContentContainer()
 * @model
 * @generated
 */
public interface RichTextContentContainer extends RichTextContent {
	/**
	 * Returns the value of the '<em><b>children</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.formats.fxg.fxg.RichTextContent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>children</em>' containment reference list.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRichTextContentContainer__children()
	 * @model containment="true"
	 * @generated
	 */
	EList<RichTextContent> get_children();

} // RichTextContentContainer
