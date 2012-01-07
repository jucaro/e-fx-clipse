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
 * A representation of the model object '<em><b>Container Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerElement#get_children <em>children</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getContainerElement()
 * @model
 * @generated
 */
public interface ContainerElement<T extends FXGElement> extends FXGElement {
	/**
	 * Returns the value of the '<em><b>children</b></em>' containment reference list.
	 * The list contents are of type {@link T}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>children</em>' containment reference list.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getContainerElement__children()
	 * @model containment="true"
	 * @generated
	 */
	EList<T> get_children();

} // ContainerElement
