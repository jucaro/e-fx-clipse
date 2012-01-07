/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getBlockProgression <em>Block Progression</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getPaddingLeft <em>Padding Left</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getPaddingRight <em>Padding Right</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getPaddingTop <em>Padding Top</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getPaddingBottom <em>Padding Bottom</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getColumnGap <em>Column Gap</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getColumnCount <em>Column Count</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getColumnWidth <em>Column Width</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getFirstBaselineOffset <em>First Baseline Offset</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getVerticalAlign <em>Vertical Align</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getLineBreak <em>Line Break</em>}</li>
 * </ul>
 * </p>
 *
 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getContainerAttributes()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ContainerAttributes extends EObject {
	/**
	 * Returns the value of the '<em><b>Block Progression</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.fxg.fxg.BlockProgression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block Progression</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Progression</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BlockProgression
	 * @see #setBlockProgression(BlockProgression)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getContainerAttributes_BlockProgression()
	 * @model
	 * @generated
	 */
	BlockProgression getBlockProgression();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getBlockProgression <em>Block Progression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Progression</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.BlockProgression
	 * @see #getBlockProgression()
	 * @generated
	 */
	void setBlockProgression(BlockProgression value);

	/**
	 * Returns the value of the '<em><b>Padding Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding Left</em>' attribute.
	 * @see #setPaddingLeft(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getContainerAttributes_PaddingLeft()
	 * @model
	 * @generated
	 */
	Double getPaddingLeft();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getPaddingLeft <em>Padding Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding Left</em>' attribute.
	 * @see #getPaddingLeft()
	 * @generated
	 */
	void setPaddingLeft(Double value);

	/**
	 * Returns the value of the '<em><b>Padding Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding Right</em>' attribute.
	 * @see #setPaddingRight(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getContainerAttributes_PaddingRight()
	 * @model
	 * @generated
	 */
	Double getPaddingRight();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getPaddingRight <em>Padding Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding Right</em>' attribute.
	 * @see #getPaddingRight()
	 * @generated
	 */
	void setPaddingRight(Double value);

	/**
	 * Returns the value of the '<em><b>Padding Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding Top</em>' attribute.
	 * @see #setPaddingTop(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getContainerAttributes_PaddingTop()
	 * @model
	 * @generated
	 */
	Double getPaddingTop();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getPaddingTop <em>Padding Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding Top</em>' attribute.
	 * @see #getPaddingTop()
	 * @generated
	 */
	void setPaddingTop(Double value);

	/**
	 * Returns the value of the '<em><b>Padding Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Padding Bottom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Padding Bottom</em>' attribute.
	 * @see #setPaddingBottom(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getContainerAttributes_PaddingBottom()
	 * @model
	 * @generated
	 */
	Double getPaddingBottom();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getPaddingBottom <em>Padding Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding Bottom</em>' attribute.
	 * @see #getPaddingBottom()
	 * @generated
	 */
	void setPaddingBottom(Double value);

	/**
	 * Returns the value of the '<em><b>Column Gap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Gap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Gap</em>' attribute.
	 * @see #setColumnGap(Double)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getContainerAttributes_ColumnGap()
	 * @model
	 * @generated
	 */
	Double getColumnGap();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getColumnGap <em>Column Gap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Gap</em>' attribute.
	 * @see #getColumnGap()
	 * @generated
	 */
	void setColumnGap(Double value);

	/**
	 * Returns the value of the '<em><b>Column Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Count</em>' attribute.
	 * @see #setColumnCount(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getContainerAttributes_ColumnCount()
	 * @model
	 * @generated
	 */
	String getColumnCount();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getColumnCount <em>Column Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Count</em>' attribute.
	 * @see #getColumnCount()
	 * @generated
	 */
	void setColumnCount(String value);

	/**
	 * Returns the value of the '<em><b>Column Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column Width</em>' attribute.
	 * @see #setColumnWidth(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getContainerAttributes_ColumnWidth()
	 * @model
	 * @generated
	 */
	String getColumnWidth();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getColumnWidth <em>Column Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column Width</em>' attribute.
	 * @see #getColumnWidth()
	 * @generated
	 */
	void setColumnWidth(String value);

	/**
	 * Returns the value of the '<em><b>First Baseline Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Baseline Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Baseline Offset</em>' attribute.
	 * @see #setFirstBaselineOffset(String)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getContainerAttributes_FirstBaselineOffset()
	 * @model
	 * @generated
	 */
	String getFirstBaselineOffset();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getFirstBaselineOffset <em>First Baseline Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Baseline Offset</em>' attribute.
	 * @see #getFirstBaselineOffset()
	 * @generated
	 */
	void setFirstBaselineOffset(String value);

	/**
	 * Returns the value of the '<em><b>Vertical Align</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.fxg.fxg.VerticalAlign}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Align</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.VerticalAlign
	 * @see #setVerticalAlign(VerticalAlign)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getContainerAttributes_VerticalAlign()
	 * @model
	 * @generated
	 */
	VerticalAlign getVerticalAlign();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getVerticalAlign <em>Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Align</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.VerticalAlign
	 * @see #getVerticalAlign()
	 * @generated
	 */
	void setVerticalAlign(VerticalAlign value);

	/**
	 * Returns the value of the '<em><b>Line Break</b></em>' attribute.
	 * The literals are from the enumeration {@link at.bestsolution.efxclipse.formats.fxg.fxg.LineBreak}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line Break</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Break</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LineBreak
	 * @see #setLineBreak(LineBreak)
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getContainerAttributes_LineBreak()
	 * @model
	 * @generated
	 */
	LineBreak getLineBreak();

	/**
	 * Sets the value of the '{@link at.bestsolution.efxclipse.formats.fxg.fxg.ContainerAttributes#getLineBreak <em>Line Break</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Break</em>' attribute.
	 * @see at.bestsolution.efxclipse.formats.fxg.fxg.LineBreak
	 * @see #getLineBreak()
	 * @generated
	 */
	void setLineBreak(LineBreak value);

} // ContainerAttributes
