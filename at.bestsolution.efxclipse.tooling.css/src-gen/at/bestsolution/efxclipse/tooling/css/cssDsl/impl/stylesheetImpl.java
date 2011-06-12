/**
 * <copyright>
 * </copyright>
 *

 */
package at.bestsolution.efxclipse.tooling.css.cssDsl.impl;

import at.bestsolution.efxclipse.tooling.css.cssDsl.CssDslPackage;
import at.bestsolution.efxclipse.tooling.css.cssDsl.media;
import at.bestsolution.efxclipse.tooling.css.cssDsl.ruleset;
import at.bestsolution.efxclipse.tooling.css.cssDsl.stylesheet;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>stylesheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.stylesheetImpl#getRuleset <em>Ruleset</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.css.cssDsl.impl.stylesheetImpl#getMedia <em>Media</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class stylesheetImpl extends MinimalEObjectImpl.Container implements stylesheet
{
  /**
   * The cached value of the '{@link #getRuleset() <em>Ruleset</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRuleset()
   * @generated
   * @ordered
   */
  protected EList<ruleset> ruleset;

  /**
   * The cached value of the '{@link #getMedia() <em>Media</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedia()
   * @generated
   * @ordered
   */
  protected EList<media> media;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected stylesheetImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return CssDslPackage.Literals.STYLESHEET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ruleset> getRuleset()
  {
    if (ruleset == null)
    {
      ruleset = new EObjectContainmentEList<ruleset>(ruleset.class, this, CssDslPackage.STYLESHEET__RULESET);
    }
    return ruleset;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<media> getMedia()
  {
    if (media == null)
    {
      media = new EObjectContainmentEList<media>(media.class, this, CssDslPackage.STYLESHEET__MEDIA);
    }
    return media;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case CssDslPackage.STYLESHEET__RULESET:
        return ((InternalEList<?>)getRuleset()).basicRemove(otherEnd, msgs);
      case CssDslPackage.STYLESHEET__MEDIA:
        return ((InternalEList<?>)getMedia()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case CssDslPackage.STYLESHEET__RULESET:
        return getRuleset();
      case CssDslPackage.STYLESHEET__MEDIA:
        return getMedia();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case CssDslPackage.STYLESHEET__RULESET:
        getRuleset().clear();
        getRuleset().addAll((Collection<? extends ruleset>)newValue);
        return;
      case CssDslPackage.STYLESHEET__MEDIA:
        getMedia().clear();
        getMedia().addAll((Collection<? extends media>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case CssDslPackage.STYLESHEET__RULESET:
        getRuleset().clear();
        return;
      case CssDslPackage.STYLESHEET__MEDIA:
        getMedia().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case CssDslPackage.STYLESHEET__RULESET:
        return ruleset != null && !ruleset.isEmpty();
      case CssDslPackage.STYLESHEET__MEDIA:
        return media != null && !media.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //stylesheetImpl
