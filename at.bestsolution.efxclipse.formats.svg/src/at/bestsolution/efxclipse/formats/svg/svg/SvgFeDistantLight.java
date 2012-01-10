/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.svg.svg;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fe Distant Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeDistantLight#getAzimuth <em>Azimuth</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeDistantLight#getElevation <em>Elevation</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeDistantLight()
 * @model
 * @generated
 */
public interface SvgFeDistantLight extends SvgElement, CoreAttributes {
	/**
	 * Returns the value of the '<em><b>Azimuth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azimuth</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azimuth</em>' attribute.
	 * @see #setAzimuth(Double)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeDistantLight_Azimuth()
	 * @model dataType="at.bestsolution.efxclipse.formats.svg.svg.Number"
	 * @generated
	 */
	Double getAzimuth();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeDistantLight#getAzimuth <em>Azimuth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azimuth</em>' attribute.
	 * @see #getAzimuth()
	 * @generated
	 */
	void setAzimuth(Double value);

	/**
	 * Returns the value of the '<em><b>Elevation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elevation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elevation</em>' attribute.
	 * @see #setElevation(Double)
	 * @see at.bestsolution.efxclipse.formats.svg.svg.SvgPackage#getSvgFeDistantLight_Elevation()
	 * @model dataType="at.bestsolution.efxclipse.formats.svg.svg.Number"
	 * @generated
	 */
	Double getElevation();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.svg.svg.SvgFeDistantLight#getElevation <em>Elevation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elevation</em>' attribute.
	 * @see #getElevation()
	 * @generated
	 */
	void setElevation(Double value);

} // SvgFeDistantLight
