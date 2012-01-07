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
 * A representation of the literals of the enumeration '<em><b>Blend Mode</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage#getBlendMode()
 * @model
 * @generated
 */
public enum BlendMode implements Enumerator {
	/**
	 * The '<em><b>NOT SET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NOT_SET_VALUE
	 * @generated
	 * @ordered
	 */
	NOT_SET(0, "NOT_SET", "NOT_SET"), /**
	 * The '<em><b>Add</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADD_VALUE
	 * @generated
	 * @ordered
	 */
	ADD(1, "add", "add"),

	/**
	 * The '<em><b>Alpha</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALPHA_VALUE
	 * @generated
	 * @ordered
	 */
	ALPHA(2, "alpha", "alpha"),

	/**
	 * The '<em><b>Darken</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DARKEN_VALUE
	 * @generated
	 * @ordered
	 */
	DARKEN(3, "darken", "darken"),

	/**
	 * The '<em><b>Difference</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIFFERENCE_VALUE
	 * @generated
	 * @ordered
	 */
	DIFFERENCE(4, "difference", "difference"),

	/**
	 * The '<em><b>Erase</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERASE_VALUE
	 * @generated
	 * @ordered
	 */
	ERASE(5, "erase", "erase"),

	/**
	 * The '<em><b>Hardlight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARDLIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	HARDLIGHT(6, "hardlight", "hardlight"),

	/**
	 * The '<em><b>Invert</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INVERT_VALUE
	 * @generated
	 * @ordered
	 */
	INVERT(7, "invert", "invert"),

	/**
	 * The '<em><b>Layer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAYER_VALUE
	 * @generated
	 * @ordered
	 */
	LAYER(8, "layer", "layer"),

	/**
	 * The '<em><b>Lighten</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIGHTEN_VALUE
	 * @generated
	 * @ordered
	 */
	LIGHTEN(9, "lighten", "lighten"),

	/**
	 * The '<em><b>Multiply</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLY_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLY(10, "multiply", "multiply"),

	/**
	 * The '<em><b>Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(11, "normal", "normal"),

	/**
	 * The '<em><b>Overlay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OVERLAY_VALUE
	 * @generated
	 * @ordered
	 */
	OVERLAY(12, "overlay", "overlay"),

	/**
	 * The '<em><b>Screen</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCREEN_VALUE
	 * @generated
	 * @ordered
	 */
	SCREEN(13, "screen", "screen"),

	/**
	 * The '<em><b>Shader</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHADER_VALUE
	 * @generated
	 * @ordered
	 */
	SHADER(14, "shader", "shader"),

	/**
	 * The '<em><b>Subtract</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	SUBTRACT(15, "subtract", "subtract");

	/**
	 * The '<em><b>NOT SET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NOT SET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NOT_SET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NOT_SET_VALUE = 0;

	/**
	 * The '<em><b>Add</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ADD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADD
	 * @model name="add"
	 * @generated
	 * @ordered
	 */
	public static final int ADD_VALUE = 1;

	/**
	 * The '<em><b>Alpha</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALPHA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALPHA
	 * @model name="alpha"
	 * @generated
	 * @ordered
	 */
	public static final int ALPHA_VALUE = 2;

	/**
	 * The '<em><b>Darken</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DARKEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DARKEN
	 * @model name="darken"
	 * @generated
	 * @ordered
	 */
	public static final int DARKEN_VALUE = 3;

	/**
	 * The '<em><b>Difference</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIFFERENCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIFFERENCE
	 * @model name="difference"
	 * @generated
	 * @ordered
	 */
	public static final int DIFFERENCE_VALUE = 4;

	/**
	 * The '<em><b>Erase</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERASE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERASE
	 * @model name="erase"
	 * @generated
	 * @ordered
	 */
	public static final int ERASE_VALUE = 5;

	/**
	 * The '<em><b>Hardlight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HARDLIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HARDLIGHT
	 * @model name="hardlight"
	 * @generated
	 * @ordered
	 */
	public static final int HARDLIGHT_VALUE = 6;

	/**
	 * The '<em><b>Invert</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INVERT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INVERT
	 * @model name="invert"
	 * @generated
	 * @ordered
	 */
	public static final int INVERT_VALUE = 7;

	/**
	 * The '<em><b>Layer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LAYER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAYER
	 * @model name="layer"
	 * @generated
	 * @ordered
	 */
	public static final int LAYER_VALUE = 8;

	/**
	 * The '<em><b>Lighten</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LIGHTEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIGHTEN
	 * @model name="lighten"
	 * @generated
	 * @ordered
	 */
	public static final int LIGHTEN_VALUE = 9;

	/**
	 * The '<em><b>Multiply</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTIPLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLY
	 * @model name="multiply"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLY_VALUE = 10;

	/**
	 * The '<em><b>Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @model name="normal"
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 11;

	/**
	 * The '<em><b>Overlay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OVERLAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OVERLAY
	 * @model name="overlay"
	 * @generated
	 * @ordered
	 */
	public static final int OVERLAY_VALUE = 12;

	/**
	 * The '<em><b>Screen</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCREEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCREEN
	 * @model name="screen"
	 * @generated
	 * @ordered
	 */
	public static final int SCREEN_VALUE = 13;

	/**
	 * The '<em><b>Shader</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHADER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHADER
	 * @model name="shader"
	 * @generated
	 * @ordered
	 */
	public static final int SHADER_VALUE = 14;

	/**
	 * The '<em><b>Subtract</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUBTRACT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBTRACT
	 * @model name="subtract"
	 * @generated
	 * @ordered
	 */
	public static final int SUBTRACT_VALUE = 15;

	/**
	 * An array of all the '<em><b>Blend Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BlendMode[] VALUES_ARRAY =
		new BlendMode[] {
			NOT_SET,
			ADD,
			ALPHA,
			DARKEN,
			DIFFERENCE,
			ERASE,
			HARDLIGHT,
			INVERT,
			LAYER,
			LIGHTEN,
			MULTIPLY,
			NORMAL,
			OVERLAY,
			SCREEN,
			SHADER,
			SUBTRACT,
		};

	/**
	 * A public read-only list of all the '<em><b>Blend Mode</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BlendMode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Blend Mode</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BlendMode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BlendMode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Blend Mode</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BlendMode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BlendMode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Blend Mode</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BlendMode get(int value) {
		switch (value) {
			case NOT_SET_VALUE: return NOT_SET;
			case ADD_VALUE: return ADD;
			case ALPHA_VALUE: return ALPHA;
			case DARKEN_VALUE: return DARKEN;
			case DIFFERENCE_VALUE: return DIFFERENCE;
			case ERASE_VALUE: return ERASE;
			case HARDLIGHT_VALUE: return HARDLIGHT;
			case INVERT_VALUE: return INVERT;
			case LAYER_VALUE: return LAYER;
			case LIGHTEN_VALUE: return LIGHTEN;
			case MULTIPLY_VALUE: return MULTIPLY;
			case NORMAL_VALUE: return NORMAL;
			case OVERLAY_VALUE: return OVERLAY;
			case SCREEN_VALUE: return SCREEN;
			case SHADER_VALUE: return SHADER;
			case SUBTRACT_VALUE: return SUBTRACT;
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
	private BlendMode(int value, String name, String literal) {
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
	
} //BlendMode
