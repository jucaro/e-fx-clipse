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
 * A representation of the literals of the enumeration '<em><b>Typographic Case</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getTypographicCase()
 * @model
 * @generated
 */
public enum TypographicCase implements Enumerator {
	/**
	 * The '<em><b>Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(0, "default", "default"),

	/**
	 * The '<em><b>Caps To Small Caps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPS_TO_SMALL_CAPS_VALUE
	 * @generated
	 * @ordered
	 */
	CAPS_TO_SMALL_CAPS(1, "capsToSmallCaps", "capsToSmallCaps"),

	/**
	 * The '<em><b>Uppercase</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UPPERCASE_VALUE
	 * @generated
	 * @ordered
	 */
	UPPERCASE(2, "uppercase", "uppercase"),

	/**
	 * The '<em><b>Lowercase</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWERCASE_VALUE
	 * @generated
	 * @ordered
	 */
	LOWERCASE(3, "lowercase", "lowercase"),

	/**
	 * The '<em><b>Lowercase To Small Caps</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOWERCASE_TO_SMALL_CAPS_VALUE
	 * @generated
	 * @ordered
	 */
	LOWERCASE_TO_SMALL_CAPS(4, "lowercaseToSmallCaps", "lowercaseToSmallCaps");

	/**
	 * The '<em><b>Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model name="default"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>Caps To Small Caps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Caps To Small Caps</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAPS_TO_SMALL_CAPS
	 * @model name="capsToSmallCaps"
	 * @generated
	 * @ordered
	 */
	public static final int CAPS_TO_SMALL_CAPS_VALUE = 1;

	/**
	 * The '<em><b>Uppercase</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Uppercase</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UPPERCASE
	 * @model name="uppercase"
	 * @generated
	 * @ordered
	 */
	public static final int UPPERCASE_VALUE = 2;

	/**
	 * The '<em><b>Lowercase</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lowercase</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWERCASE
	 * @model name="lowercase"
	 * @generated
	 * @ordered
	 */
	public static final int LOWERCASE_VALUE = 3;

	/**
	 * The '<em><b>Lowercase To Small Caps</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lowercase To Small Caps</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOWERCASE_TO_SMALL_CAPS
	 * @model name="lowercaseToSmallCaps"
	 * @generated
	 * @ordered
	 */
	public static final int LOWERCASE_TO_SMALL_CAPS_VALUE = 4;

	/**
	 * An array of all the '<em><b>Typographic Case</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TypographicCase[] VALUES_ARRAY =
		new TypographicCase[] {
			DEFAULT,
			CAPS_TO_SMALL_CAPS,
			UPPERCASE,
			LOWERCASE,
			LOWERCASE_TO_SMALL_CAPS,
		};

	/**
	 * A public read-only list of all the '<em><b>Typographic Case</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TypographicCase> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Typographic Case</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypographicCase get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypographicCase result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Typographic Case</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypographicCase getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TypographicCase result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Typographic Case</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TypographicCase get(int value) {
		switch (value) {
			case DEFAULT_VALUE: return DEFAULT;
			case CAPS_TO_SMALL_CAPS_VALUE: return CAPS_TO_SMALL_CAPS;
			case UPPERCASE_VALUE: return UPPERCASE;
			case LOWERCASE_VALUE: return LOWERCASE;
			case LOWERCASE_TO_SMALL_CAPS_VALUE: return LOWERCASE_TO_SMALL_CAPS;
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
	private TypographicCase(int value, String name, String literal) {
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
	
} //TypographicCase
