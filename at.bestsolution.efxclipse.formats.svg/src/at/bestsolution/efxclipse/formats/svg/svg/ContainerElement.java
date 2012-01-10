/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.svg.svg;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.ContainerElement#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getContainerElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ContainerElement<T extends SvgElement> extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link T}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getContainerElement_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<T> getChildren();

} // ContainerElement
