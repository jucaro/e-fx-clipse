/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.svgpath.svgPath.util;

import at.bestsolution.efxclipse.tooling.svgpath.svgPath.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see at.bestsolution.efxclipse.tooling.svgpath.svgPath.SvgPathPackage
 * @generated
 */
public class SvgPathSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SvgPathPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SvgPathSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = SvgPathPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case SvgPathPackage.SVG_PATH:
      {
        svg_path svg_path = (svg_path)theEObject;
        T result = casesvg_path(svg_path);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUPS:
      {
        moveto_drawto_command_groups moveto_drawto_command_groups = (moveto_drawto_command_groups)theEObject;
        T result = casemoveto_drawto_command_groups(moveto_drawto_command_groups);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.MOVETO_DRAWTO_COMMAND_GROUP:
      {
        moveto_drawto_command_group moveto_drawto_command_group = (moveto_drawto_command_group)theEObject;
        T result = casemoveto_drawto_command_group(moveto_drawto_command_group);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.MOVETO:
      {
        moveto moveto = (moveto)theEObject;
        T result = casemoveto(moveto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.LINETO_ARGUMENT_SEQUENCE:
      {
        lineto_argument_sequence lineto_argument_sequence = (lineto_argument_sequence)theEObject;
        T result = caselineto_argument_sequence(lineto_argument_sequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.DRAWTO_COMMANDS:
      {
        drawto_commands drawto_commands = (drawto_commands)theEObject;
        T result = casedrawto_commands(drawto_commands);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.DRAWTO_COMMAND:
      {
        drawto_command drawto_command = (drawto_command)theEObject;
        T result = casedrawto_command(drawto_command);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.CLOSEPATH:
      {
        closepath closepath = (closepath)theEObject;
        T result = caseclosepath(closepath);
        if (result == null) result = casedrawto_command(closepath);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.LINETO:
      {
        lineto lineto = (lineto)theEObject;
        T result = caselineto(lineto);
        if (result == null) result = casedrawto_command(lineto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.HORIZONTAL_LINETO:
      {
        horizontal_lineto horizontal_lineto = (horizontal_lineto)theEObject;
        T result = casehorizontal_lineto(horizontal_lineto);
        if (result == null) result = casedrawto_command(horizontal_lineto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.HORIZONTAL_LINETO_ARGUMENT_SEQUENCE:
      {
        horizontal_lineto_argument_sequence horizontal_lineto_argument_sequence = (horizontal_lineto_argument_sequence)theEObject;
        T result = casehorizontal_lineto_argument_sequence(horizontal_lineto_argument_sequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.VERTICAL_LINETO:
      {
        vertical_lineto vertical_lineto = (vertical_lineto)theEObject;
        T result = casevertical_lineto(vertical_lineto);
        if (result == null) result = casedrawto_command(vertical_lineto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.VERTICAL_LINETO_ARGUMENT_SEQUENCE:
      {
        vertical_lineto_argument_sequence vertical_lineto_argument_sequence = (vertical_lineto_argument_sequence)theEObject;
        T result = casevertical_lineto_argument_sequence(vertical_lineto_argument_sequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.CURVETO:
      {
        curveto curveto = (curveto)theEObject;
        T result = casecurveto(curveto);
        if (result == null) result = casedrawto_command(curveto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.CURVETO_ARGUMENT_SEQUENCE:
      {
        curveto_argument_sequence curveto_argument_sequence = (curveto_argument_sequence)theEObject;
        T result = casecurveto_argument_sequence(curveto_argument_sequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.CURVETO_ARGUMENT:
      {
        curveto_argument curveto_argument = (curveto_argument)theEObject;
        T result = casecurveto_argument(curveto_argument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.SMOOTH_CURVETO:
      {
        smooth_curveto smooth_curveto = (smooth_curveto)theEObject;
        T result = casesmooth_curveto(smooth_curveto);
        if (result == null) result = casedrawto_command(smooth_curveto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.SMOOTH_CURVETO_ARGUMENT_SEQUENCE:
      {
        smooth_curveto_argument_sequence smooth_curveto_argument_sequence = (smooth_curveto_argument_sequence)theEObject;
        T result = casesmooth_curveto_argument_sequence(smooth_curveto_argument_sequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.SMOOTH_CURVETO_ARGUMENT:
      {
        smooth_curveto_argument smooth_curveto_argument = (smooth_curveto_argument)theEObject;
        T result = casesmooth_curveto_argument(smooth_curveto_argument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.QUADRATIC_BEZIER_CURVETO:
      {
        quadratic_bezier_curveto quadratic_bezier_curveto = (quadratic_bezier_curveto)theEObject;
        T result = casequadratic_bezier_curveto(quadratic_bezier_curveto);
        if (result == null) result = casedrawto_command(quadratic_bezier_curveto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE:
      {
        quadratic_bezier_curveto_argument_sequence quadratic_bezier_curveto_argument_sequence = (quadratic_bezier_curveto_argument_sequence)theEObject;
        T result = casequadratic_bezier_curveto_argument_sequence(quadratic_bezier_curveto_argument_sequence);
        if (result == null) result = casequadratic_bezier_curveto(quadratic_bezier_curveto_argument_sequence);
        if (result == null) result = casedrawto_command(quadratic_bezier_curveto_argument_sequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.QUADRATIC_BEZIER_CURVETO_ARGUMENT:
      {
        quadratic_bezier_curveto_argument quadratic_bezier_curveto_argument = (quadratic_bezier_curveto_argument)theEObject;
        T result = casequadratic_bezier_curveto_argument(quadratic_bezier_curveto_argument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.SMOOTH_QUADRATIC_BEZIER_CURVETO:
      {
        smooth_quadratic_bezier_curveto smooth_quadratic_bezier_curveto = (smooth_quadratic_bezier_curveto)theEObject;
        T result = casesmooth_quadratic_bezier_curveto(smooth_quadratic_bezier_curveto);
        if (result == null) result = casedrawto_command(smooth_quadratic_bezier_curveto);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.SMOOTH_QUADRATIC_BEZIER_CURVETO_ARGUMENT_SEQUENCE:
      {
        smooth_quadratic_bezier_curveto_argument_sequence smooth_quadratic_bezier_curveto_argument_sequence = (smooth_quadratic_bezier_curveto_argument_sequence)theEObject;
        T result = casesmooth_quadratic_bezier_curveto_argument_sequence(smooth_quadratic_bezier_curveto_argument_sequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.ELLIPTICAL_ARC:
      {
        elliptical_arc elliptical_arc = (elliptical_arc)theEObject;
        T result = caseelliptical_arc(elliptical_arc);
        if (result == null) result = casedrawto_command(elliptical_arc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT_SEQUENCE:
      {
        elliptical_arc_argument_sequence elliptical_arc_argument_sequence = (elliptical_arc_argument_sequence)theEObject;
        T result = caseelliptical_arc_argument_sequence(elliptical_arc_argument_sequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.ELLIPTICAL_ARC_ARGUMENT:
      {
        elliptical_arc_argument elliptical_arc_argument = (elliptical_arc_argument)theEObject;
        T result = caseelliptical_arc_argument(elliptical_arc_argument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.COORDINATE_PAIR:
      {
        coordinate_pair coordinate_pair = (coordinate_pair)theEObject;
        T result = casecoordinate_pair(coordinate_pair);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.COORDINATE:
      {
        coordinate coordinate = (coordinate)theEObject;
        T result = casecoordinate(coordinate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.NUMBER:
      {
        number number = (number)theEObject;
        T result = casenumber(number);
        if (result == null) result = casecoordinate(number);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.NONNEGATIVE_NUMBER:
      {
        nonnegative_number nonnegative_number = (nonnegative_number)theEObject;
        T result = casenonnegative_number(nonnegative_number);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.EXPONENT:
      {
        exponent exponent = (exponent)theEObject;
        T result = caseexponent(exponent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case SvgPathPackage.DIGIT_SEQUENCE:
      {
        digit_sequence digit_sequence = (digit_sequence)theEObject;
        T result = casedigit_sequence(digit_sequence);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>svg path</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>svg path</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesvg_path(svg_path object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>moveto drawto command groups</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>moveto drawto command groups</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemoveto_drawto_command_groups(moveto_drawto_command_groups object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>moveto drawto command group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>moveto drawto command group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemoveto_drawto_command_group(moveto_drawto_command_group object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>moveto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>moveto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casemoveto(moveto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>lineto argument sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>lineto argument sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselineto_argument_sequence(lineto_argument_sequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>drawto commands</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>drawto commands</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedrawto_commands(drawto_commands object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>drawto command</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>drawto command</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedrawto_command(drawto_command object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>closepath</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>closepath</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseclosepath(closepath object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>lineto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>lineto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caselineto(lineto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>horizontal lineto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>horizontal lineto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casehorizontal_lineto(horizontal_lineto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>horizontal lineto argument sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>horizontal lineto argument sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casehorizontal_lineto_argument_sequence(horizontal_lineto_argument_sequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>vertical lineto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>vertical lineto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevertical_lineto(vertical_lineto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>vertical lineto argument sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>vertical lineto argument sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casevertical_lineto_argument_sequence(vertical_lineto_argument_sequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>curveto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>curveto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecurveto(curveto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>curveto argument sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>curveto argument sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecurveto_argument_sequence(curveto_argument_sequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>curveto argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>curveto argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecurveto_argument(curveto_argument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>smooth curveto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>smooth curveto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesmooth_curveto(smooth_curveto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>smooth curveto argument sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>smooth curveto argument sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesmooth_curveto_argument_sequence(smooth_curveto_argument_sequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>smooth curveto argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>smooth curveto argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesmooth_curveto_argument(smooth_curveto_argument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>quadratic bezier curveto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>quadratic bezier curveto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casequadratic_bezier_curveto(quadratic_bezier_curveto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>quadratic bezier curveto argument sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>quadratic bezier curveto argument sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casequadratic_bezier_curveto_argument_sequence(quadratic_bezier_curveto_argument_sequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>quadratic bezier curveto argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>quadratic bezier curveto argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casequadratic_bezier_curveto_argument(quadratic_bezier_curveto_argument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>smooth quadratic bezier curveto</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>smooth quadratic bezier curveto</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesmooth_quadratic_bezier_curveto(smooth_quadratic_bezier_curveto object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>smooth quadratic bezier curveto argument sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>smooth quadratic bezier curveto argument sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casesmooth_quadratic_bezier_curveto_argument_sequence(smooth_quadratic_bezier_curveto_argument_sequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>elliptical arc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>elliptical arc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseelliptical_arc(elliptical_arc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>elliptical arc argument sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>elliptical arc argument sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseelliptical_arc_argument_sequence(elliptical_arc_argument_sequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>elliptical arc argument</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>elliptical arc argument</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseelliptical_arc_argument(elliptical_arc_argument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>coordinate pair</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>coordinate pair</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecoordinate_pair(coordinate_pair object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>coordinate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>coordinate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casecoordinate(coordinate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenumber(number object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>nonnegative number</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>nonnegative number</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casenonnegative_number(nonnegative_number object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>exponent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>exponent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseexponent(exponent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>digit sequence</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>digit sequence</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casedigit_sequence(digit_sequence object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //SvgPathSwitch
