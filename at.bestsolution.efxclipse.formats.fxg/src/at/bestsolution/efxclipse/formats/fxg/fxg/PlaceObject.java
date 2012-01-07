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
 * A representation of the model object '<em><b>Place Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject#getId <em>Id</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject#getTransform <em>Transform</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject#getFilters <em>Filters</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPlaceObject()
 * @model
 * @generated
 */
public interface PlaceObject extends FXGElement {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPlaceObject_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' containment reference.
	 * @see #setTransform(Transform)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPlaceObject_Transform()
	 * @model containment="true"
	 * @generated
	 */
	Transform getTransform();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject#getTransform <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' containment reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(Transform value);

	/**
	 * Returns the value of the '<em><b>Filters</b></em>' containment reference list.
	 * The list contents are of type {@link at.bestsolution.efxclipse.formats.fxg.fxg.Filter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filters</em>' containment reference list.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPlaceObject_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filter> getFilters();

	/**
	 * Returns the value of the '<em><b>Mask</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mask</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mask</em>' containment reference.
	 * @see #setMask(Group)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPlaceObject_Mask()
	 * @model containment="true"
	 * @generated
	 */
	Group getMask();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.PlaceObject#getMask <em>Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' containment reference.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(Group value);

} // PlaceObject
