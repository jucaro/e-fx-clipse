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
 * A representation of the model object '<em><b>Rect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getWidth <em>Width</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getHeight <em>Height</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getRadiusX <em>Radius X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getRadiusY <em>Radius Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTopLeftRadiusX <em>Top Left Radius X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTopLeftRadiusY <em>Top Left Radius Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTopRightRadiusX <em>Top Right Radius X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTopRightRadiusY <em>Top Right Radius Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBottomLeftRadiusX <em>Bottom Left Radius X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBottomLeftRadiusY <em>Bottom Left Radius Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBottomRightRadiusX <em>Bottom Right Radius X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBottomRightRadiusY <em>Bottom Right Radius Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getX <em>X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getY <em>Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getRotation <em>Rotation</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getScaleX <em>Scale X</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getScaleY <em>Scale Y</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBlendMode <em>Blend Mode</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getVisible <em>Visible</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTransform <em>Transform</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getFilters <em>Filters</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getFill <em>Fill</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getStroke <em>Stroke</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getMask <em>Mask</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect()
 * @model
 * @generated
 */
public interface Rect extends Shape {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_Width()
	 * @model dataType="at.bestsolution.efxclipse.formats.fxg.fxg.Length"
	 * @generated
	 */
	String getWidth();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(String value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_Height()
	 * @model dataType="at.bestsolution.efxclipse.formats.fxg.fxg.Length"
	 * @generated
	 */
	String getHeight();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(String value);

	/**
	 * Returns the value of the '<em><b>Radius X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius X</em>' attribute.
	 * @see #setRadiusX(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_RadiusX()
	 * @model dataType="at.bestsolution.efxclipse.formats.fxg.fxg.Length"
	 * @generated
	 */
	String getRadiusX();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getRadiusX <em>Radius X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius X</em>' attribute.
	 * @see #getRadiusX()
	 * @generated
	 */
	void setRadiusX(String value);

	/**
	 * Returns the value of the '<em><b>Radius Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius Y</em>' attribute.
	 * @see #setRadiusY(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_RadiusY()
	 * @model dataType="at.bestsolution.efxclipse.formats.fxg.fxg.Length"
	 * @generated
	 */
	String getRadiusY();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getRadiusY <em>Radius Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius Y</em>' attribute.
	 * @see #getRadiusY()
	 * @generated
	 */
	void setRadiusY(String value);

	/**
	 * Returns the value of the '<em><b>Top Left Radius X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Left Radius X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Left Radius X</em>' attribute.
	 * @see #setTopLeftRadiusX(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_TopLeftRadiusX()
	 * @model dataType="at.bestsolution.efxclipse.formats.fxg.fxg.Length"
	 * @generated
	 */
	String getTopLeftRadiusX();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTopLeftRadiusX <em>Top Left Radius X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Left Radius X</em>' attribute.
	 * @see #getTopLeftRadiusX()
	 * @generated
	 */
	void setTopLeftRadiusX(String value);

	/**
	 * Returns the value of the '<em><b>Top Left Radius Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Left Radius Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Left Radius Y</em>' attribute.
	 * @see #setTopLeftRadiusY(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_TopLeftRadiusY()
	 * @model dataType="at.bestsolution.efxclipse.formats.fxg.fxg.Length"
	 * @generated
	 */
	String getTopLeftRadiusY();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTopLeftRadiusY <em>Top Left Radius Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Left Radius Y</em>' attribute.
	 * @see #getTopLeftRadiusY()
	 * @generated
	 */
	void setTopLeftRadiusY(String value);

	/**
	 * Returns the value of the '<em><b>Top Right Radius X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Right Radius X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Right Radius X</em>' attribute.
	 * @see #setTopRightRadiusX(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_TopRightRadiusX()
	 * @model dataType="at.bestsolution.efxclipse.formats.fxg.fxg.Length"
	 * @generated
	 */
	String getTopRightRadiusX();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTopRightRadiusX <em>Top Right Radius X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Right Radius X</em>' attribute.
	 * @see #getTopRightRadiusX()
	 * @generated
	 */
	void setTopRightRadiusX(String value);

	/**
	 * Returns the value of the '<em><b>Top Right Radius Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Top Right Radius Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Top Right Radius Y</em>' attribute.
	 * @see #setTopRightRadiusY(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_TopRightRadiusY()
	 * @model dataType="at.bestsolution.efxclipse.formats.fxg.fxg.Length"
	 * @generated
	 */
	String getTopRightRadiusY();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTopRightRadiusY <em>Top Right Radius Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Top Right Radius Y</em>' attribute.
	 * @see #getTopRightRadiusY()
	 * @generated
	 */
	void setTopRightRadiusY(String value);

	/**
	 * Returns the value of the '<em><b>Bottom Left Radius X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom Left Radius X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Left Radius X</em>' attribute.
	 * @see #setBottomLeftRadiusX(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_BottomLeftRadiusX()
	 * @model dataType="at.bestsolution.efxclipse.formats.fxg.fxg.Length"
	 * @generated
	 */
	String getBottomLeftRadiusX();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBottomLeftRadiusX <em>Bottom Left Radius X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Left Radius X</em>' attribute.
	 * @see #getBottomLeftRadiusX()
	 * @generated
	 */
	void setBottomLeftRadiusX(String value);

	/**
	 * Returns the value of the '<em><b>Bottom Left Radius Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom Left Radius Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Left Radius Y</em>' attribute.
	 * @see #setBottomLeftRadiusY(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_BottomLeftRadiusY()
	 * @model dataType="at.bestsolution.efxclipse.formats.fxg.fxg.Length"
	 * @generated
	 */
	String getBottomLeftRadiusY();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBottomLeftRadiusY <em>Bottom Left Radius Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Left Radius Y</em>' attribute.
	 * @see #getBottomLeftRadiusY()
	 * @generated
	 */
	void setBottomLeftRadiusY(String value);

	/**
	 * Returns the value of the '<em><b>Bottom Right Radius X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom Right Radius X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Right Radius X</em>' attribute.
	 * @see #setBottomRightRadiusX(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_BottomRightRadiusX()
	 * @model dataType="at.bestsolution.efxclipse.formats.fxg.fxg.Length"
	 * @generated
	 */
	String getBottomRightRadiusX();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBottomRightRadiusX <em>Bottom Right Radius X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Right Radius X</em>' attribute.
	 * @see #getBottomRightRadiusX()
	 * @generated
	 */
	void setBottomRightRadiusX(String value);

	/**
	 * Returns the value of the '<em><b>Bottom Right Radius Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom Right Radius Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom Right Radius Y</em>' attribute.
	 * @see #setBottomRightRadiusY(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_BottomRightRadiusY()
	 * @model dataType="at.bestsolution.efxclipse.formats.fxg.fxg.Length"
	 * @generated
	 */
	String getBottomRightRadiusY();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBottomRightRadiusY <em>Bottom Right Radius Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom Right Radius Y</em>' attribute.
	 * @see #getBottomRightRadiusY()
	 * @generated
	 */
	void setBottomRightRadiusY(String value);

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
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_X()
	 * @model
	 * @generated
	 */
	Double getX();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getX <em>X</em>}' attribute.
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
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_Y()
	 * @model
	 * @generated
	 */
	Double getY();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getY <em>Y</em>}' attribute.
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
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_Rotation()
	 * @model dataType="at.bestsolution.efxclipse.formats.fxg.fxg.Angle"
	 * @generated
	 */
	Double getRotation();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getRotation <em>Rotation</em>}' attribute.
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
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_ScaleX()
	 * @model
	 * @generated
	 */
	Double getScaleX();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getScaleX <em>Scale X</em>}' attribute.
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
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_ScaleY()
	 * @model
	 * @generated
	 */
	Double getScaleY();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getScaleY <em>Scale Y</em>}' attribute.
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
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_BlendMode()
	 * @model
	 * @generated
	 */
	BlendMode getBlendMode();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getBlendMode <em>Blend Mode</em>}' attribute.
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
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_Visible()
	 * @model
	 * @generated
	 */
	Boolean getVisible();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getVisible <em>Visible</em>}' attribute.
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
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_Alpha()
	 * @model default="1"
	 * @generated
	 */
	Double getAlpha();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getAlpha <em>Alpha</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' attribute.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(Double value);

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
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_Transform()
	 * @model containment="true"
	 * @generated
	 */
	Transform getTransform();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getTransform <em>Transform</em>}' containment reference.
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
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_Filters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Filter> getFilters();

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
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_Fill()
	 * @model containment="true"
	 * @generated
	 */
	Fill getFill();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getFill <em>Fill</em>}' containment reference.
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
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_Stroke()
	 * @model containment="true"
	 * @generated
	 */
	Stroke getStroke();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getStroke <em>Stroke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stroke</em>' containment reference.
	 * @see #getStroke()
	 * @generated
	 */
	void setStroke(Stroke value);

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
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getRect_Mask()
	 * @model containment="true"
	 * @generated
	 */
	Group getMask();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.Rect#getMask <em>Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mask</em>' containment reference.
	 * @see #getMask()
	 * @generated
	 */
	void setMask(Group value);

} // Rect
