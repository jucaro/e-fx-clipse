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
 * A representation of the literals of the enumeration '<em><b>Dominant Baseline</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getDominantBaseline()
 * @model
 * @generated
 */
public enum DominantBaseline implements Enumerator {
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
	 * The '<em><b>Roman</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROMAN_VALUE
	 * @generated
	 * @ordered
	 */
	ROMAN(1, "roman", "roman"),

	/**
	 * The '<em><b>Ascent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASCENT_VALUE
	 * @generated
	 * @ordered
	 */
	ASCENT(2, "ascent", "ascent"),

	/**
	 * The '<em><b>Descent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DESCENT_VALUE
	 * @generated
	 * @ordered
	 */
	DESCENT(3, "descent", "descent"),

	/**
	 * The '<em><b>Ideographic Top</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDEOGRAPHIC_TOP_VALUE
	 * @generated
	 * @ordered
	 */
	IDEOGRAPHIC_TOP(4, "ideographicTop", "ideographicTop"),

	/**
	 * The '<em><b>Ideographic Center</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDEOGRAPHIC_CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	IDEOGRAPHIC_CENTER(5, "ideographicCenter", "ideographicCenter"),

	/**
	 * The '<em><b>Ideographic Bottom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDEOGRAPHIC_BOTTOM_VALUE
	 * @generated
	 * @ordered
	 */
	IDEOGRAPHIC_BOTTOM(6, "ideographicBottom", "ideographicBottom");

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
	 * The '<em><b>Roman</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Roman</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROMAN
	 * @model name="roman"
	 * @generated
	 * @ordered
	 */
	public static final int ROMAN_VALUE = 1;

	/**
	 * The '<em><b>Ascent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ascent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASCENT
	 * @model name="ascent"
	 * @generated
	 * @ordered
	 */
	public static final int ASCENT_VALUE = 2;

	/**
	 * The '<em><b>Descent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Descent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DESCENT
	 * @model name="descent"
	 * @generated
	 * @ordered
	 */
	public static final int DESCENT_VALUE = 3;

	/**
	 * The '<em><b>Ideographic Top</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ideographic Top</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDEOGRAPHIC_TOP
	 * @model name="ideographicTop"
	 * @generated
	 * @ordered
	 */
	public static final int IDEOGRAPHIC_TOP_VALUE = 4;

	/**
	 * The '<em><b>Ideographic Center</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ideographic Center</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDEOGRAPHIC_CENTER
	 * @model name="ideographicCenter"
	 * @generated
	 * @ordered
	 */
	public static final int IDEOGRAPHIC_CENTER_VALUE = 5;

	/**
	 * The '<em><b>Ideographic Bottom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ideographic Bottom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDEOGRAPHIC_BOTTOM
	 * @model name="ideographicBottom"
	 * @generated
	 * @ordered
	 */
	public static final int IDEOGRAPHIC_BOTTOM_VALUE = 6;

	/**
	 * An array of all the '<em><b>Dominant Baseline</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DominantBaseline[] VALUES_ARRAY =
		new DominantBaseline[] {
			AUTO,
			ROMAN,
			ASCENT,
			DESCENT,
			IDEOGRAPHIC_TOP,
			IDEOGRAPHIC_CENTER,
			IDEOGRAPHIC_BOTTOM,
		};

	/**
	 * A public read-only list of all the '<em><b>Dominant Baseline</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DominantBaseline> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dominant Baseline</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DominantBaseline get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DominantBaseline result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dominant Baseline</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DominantBaseline getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DominantBaseline result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dominant Baseline</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DominantBaseline get(int value) {
		switch (value) {
			case AUTO_VALUE: return AUTO;
			case ROMAN_VALUE: return ROMAN;
			case ASCENT_VALUE: return ASCENT;
			case DESCENT_VALUE: return DESCENT;
			case IDEOGRAPHIC_TOP_VALUE: return IDEOGRAPHIC_TOP;
			case IDEOGRAPHIC_CENTER_VALUE: return IDEOGRAPHIC_CENTER;
			case IDEOGRAPHIC_BOTTOM_VALUE: return IDEOGRAPHIC_BOTTOM;
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
	private DominantBaseline(int value, String name, String literal) {
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
	
} //DominantBaseline
