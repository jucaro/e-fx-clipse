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
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getData <em>Data</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getX <em>X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getY <em>Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getRotation <em>Rotation</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getScaleX <em>Scale X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getScaleY <em>Scale Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getBlendMode <em>Blend Mode</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getVisible <em>Visible</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getWinding <em>Winding</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getFill <em>Fill</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getStroke <em>Stroke</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getFilters <em>Filters</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getTransform <em>Transform</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPath()
 * @model
 * @generated
 */
public interface Path extends FXGElement {
	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPath_Data()
	 * @model dataType="at.bestsolution.efxclipse.formats.fxg.fxg.PathData"
	 * @generated
	 */
	String getData();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(String value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPath_X()
	 * @model
	 * @generated
	 */
	Double getX();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(Double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPath_Y()
	 * @model
	 * @generated
	 */
	Double getY();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(Double value);

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute.
	 * @see #setRotation(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPath_Rotation()
	 * @model dataType="at.bestsolution.efxclipse.formats.fxg.fxg.Angle"
	 * @generated
	 */
	Double getRotation();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getRotation <em>Rotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation</em>' attribute.
	 * @see #getRotation()
	 * @generated
	 */
	void setRotation(Double value);

	/**
	 * Returns the value of the '<em><b>Scale X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale X</em>' attribute.
	 * @see #setScaleX(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPath_ScaleX()
	 * @model
	 * @generated
	 */
	Double getScaleX();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getScaleX <em>Scale X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale X</em>' attribute.
	 * @see #getScaleX()
	 * @generated
	 */
	void setScaleX(Double value);

	/**
	 * Returns the value of the '<em><b>Scale Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale Y</em>' attribute.
	 * @see #setScaleY(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPath_ScaleY()
	 * @model
	 * @generated
	 */
	Double getScaleY();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getScaleY <em>Scale Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scale Y</em>' attribute.
	 * @see #getScaleY()
	 * @generated
	 */
	void setScaleY(Double value);

	/**
	 * Returns the value of the '<em><b>Blend Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.fxg.fxg.BlendMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blend Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blend Mode</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BlendMode
	 * @see #setBlendMode(BlendMode)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPath_BlendMode()
	 * @model
	 * @generated
	 */
	BlendMode getBlendMode();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getBlendMode <em>Blend Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blend Mode</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BlendMode
	 * @see #getBlendMode()
	 * @generated
	 */
	void setBlendMode(BlendMode value);

	/**
	 * Returns the value of the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visible</em>' attribute.
	 * @see #setVisible(Boolean)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPath_Visible()
	 * @model
	 * @generated
	 */
	Boolean getVisible();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getVisible <em>Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visible</em>' attribute.
	 * @see #getVisible()
	 * @generated
	 */
	void setVisible(Boolean value);

	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' attribute.
	 * @see #setAlpha(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPath_Alpha()
	 * @model default="1"
	 * @generated
	 */
	Double getAlpha();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(Double value);

	/**
	 * Returns the value of the '<em><b>Winding</b></em>' attribute.
	 * The default value is <code>"Winding.NOT_SET"</code>.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.fxg.fxg.Winding}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Winding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winding</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Winding
	 * @see #setWinding(Winding)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPath_Winding()
	 * @model default="Winding.NOT_SET"
	 * @generated
	 */
	Winding getWinding();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getWinding <em>Winding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winding</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.Winding
	 * @see #getWinding()
	 * @generated
	 */
	void setWinding(Winding value);

	/**
	 * Returns the value of the '<em><b>Fill</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill</em>' containment reference.
	 * @see #setFill(Fill)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPath_Fill()
	 * @model containment="true"
	 * @generated
	 */
	Fill getFill();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getFill <em>Fill</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fill</em>' containment reference.
	 * @see #getFill()
	 * @generated
	 */
	void setFill(Fill value);

	/**
	 * Returns the value of the '<em><b>Stroke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stroke</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stroke</em>' containment reference.
	 * @see #setStroke(Stroke)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPath_Stroke()
	 * @model containment="true"
	 * @generated
	 */
	Stroke getStroke();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getStroke <em>Stroke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke</em>' containment reference.
	 * @see #getStroke()
	 * @generated
	 */
	void setStroke(Stroke value);

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
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPath_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filter> getFilters();

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
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPath_Transform()
	 * @model containment="true"
	 * @generated
	 */
	Transform getTransform();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getTransform <em>Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' containment reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(Transform value);

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
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getPath_Mask()
	 * @model containment="true"
	 * @generated
	 */
	Group getMask();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Path#getMask <em>Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' containment reference.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(Group value);

} // Path
