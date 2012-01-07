/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Justification Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getJustificationStyle()
 * @model
 * @generated
 */
public enum JustificationStyle implements Enumerator {
	/**
	 * The '<em><b>Auto</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO(0, "auto", "auto"),

	/**
	 * The '<em><b>Prioritize Least Adjustment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIORITIZE_LEAST_ADJUSTMENT_VALUE
	 * @generated
	 * @ordered
	 */
	PRIORITIZE_LEAST_ADJUSTMENT(1, "prioritizeLeastAdjustment", "prioritizeLeastAdjustment"),

	/**
	 * The '<em><b>Push In Kinsoku</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSH_IN_KINSOKU_VALUE
	 * @generated
	 * @ordered
	 */
	PUSH_IN_KINSOKU(2, "pushInKinsoku", "pushInKinsoku"),

	/**
	 * The '<em><b>Push Out Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSH_OUT_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	PUSH_OUT_ONLY(3, "pushOutOnly", "pushOutOnly");

	/**
	 * The '<em><b>Auto</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Auto</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTO
	 * @model name="auto"
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_VALUE = 0;

	/**
	 * The '<em><b>Prioritize Least Adjustment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prioritize Least Adjustment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIORITIZE_LEAST_ADJUSTMENT
	 * @model name="prioritizeLeastAdjustment"
	 * @generated
	 * @ordered
	 */
	public static final int PRIORITIZE_LEAST_ADJUSTMENT_VALUE = 1;

	/**
	 * The '<em><b>Push In Kinsoku</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Push In Kinsoku</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUSH_IN_KINSOKU
	 * @model name="pushInKinsoku"
	 * @generated
	 * @ordered
	 */
	public static final int PUSH_IN_KINSOKU_VALUE = 2;

	/**
	 * The '<em><b>Push Out Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Push Out Only</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUSH_OUT_ONLY
	 * @model name="pushOutOnly"
	 * @generated
	 * @ordered
	 */
	public static final int PUSH_OUT_ONLY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Justification Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final JustificationStyle[] VALUES_ARRAY =
		new JustificationStyle[] {
			AUTO,
			PRIORITIZE_LEAST_ADJUSTMENT,
			PUSH_IN_KINSOKU,
			PUSH_OUT_ONLY,
		};

	/**
	 * A public read-only list of all the '<em><b>Justification Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<JustificationStyle> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Justification Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JustificationStyle get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JustificationStyle result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Justification Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JustificationStyle getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			JustificationStyle result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Justification Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JustificationStyle get(int value) {
		switch (value) {
			case AUTO_VALUE: return AUTO;
			case PRIORITIZE_LEAST_ADJUSTMENT_VALUE: return PRIORITIZE_LEAST_ADJUSTMENT;
			case PUSH_IN_KINSOKU_VALUE: return PUSH_IN_KINSOKU;
			case PUSH_OUT_ONLY_VALUE: return PUSH_OUT_ONLY;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private JustificationStyle(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //JustificationStyle
