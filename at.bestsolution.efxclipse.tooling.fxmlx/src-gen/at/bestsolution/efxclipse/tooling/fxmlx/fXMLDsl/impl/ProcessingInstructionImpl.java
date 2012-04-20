/**
 */
package at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl;

import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.FXMLDslPackage;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.ProcessingInstruction;
import at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.QualifiedNameWithWildCard;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Processing Instruction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.ProcessingInstructionImpl#getType <em>Type</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.tooling.fxmlx.fXMLDsl.impl.ProcessingInstructionImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProcessingInstructionImpl extends MinimalEObjectImpl.Container implements ProcessingInstruction
{
  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected QualifiedNameWithWildCard importedNamespace;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProcessingInstructionImpl()
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
    return FXMLDslPackage.Literals.PROCESSING_INSTRUCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXMLDslPackage.PROCESSING_INSTRUCTION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedNameWithWildCard getImportedNamespace()
  {
    return importedNamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetImportedNamespace(QualifiedNameWithWildCard newImportedNamespace, NotificationChain msgs)
  {
    QualifiedNameWithWildCard oldImportedNamespace = importedNamespace;
    importedNamespace = newImportedNamespace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FXMLDslPackage.PROCESSING_INSTRUCTION__IMPORTED_NAMESPACE, oldImportedNamespace, newImportedNamespace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setImportedNamespace(QualifiedNameWithWildCard newImportedNamespace)
  {
    if (newImportedNamespace != importedNamespace)
    {
      NotificationChain msgs = null;
      if (importedNamespace != null)
        msgs = ((InternalEObject)importedNamespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FXMLDslPackage.PROCESSING_INSTRUCTION__IMPORTED_NAMESPACE, null, msgs);
      if (newImportedNamespace != null)
        msgs = ((InternalEObject)newImportedNamespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FXMLDslPackage.PROCESSING_INSTRUCTION__IMPORTED_NAMESPACE, null, msgs);
      msgs = basicSetImportedNamespace(newImportedNamespace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FXMLDslPackage.PROCESSING_INSTRUCTION__IMPORTED_NAMESPACE, newImportedNamespace, newImportedNamespace));
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
      case FXMLDslPackage.PROCESSING_INSTRUCTION__IMPORTED_NAMESPACE:
        return basicSetImportedNamespace(null, msgs);
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
      case FXMLDslPackage.PROCESSING_INSTRUCTION__TYPE:
        return getType();
      case FXMLDslPackage.PROCESSING_INSTRUCTION__IMPORTED_NAMESPACE:
        return getImportedNamespace();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FXMLDslPackage.PROCESSING_INSTRUCTION__TYPE:
        setType((String)newValue);
        return;
      case FXMLDslPackage.PROCESSING_INSTRUCTION__IMPORTED_NAMESPACE:
        setImportedNamespace((QualifiedNameWithWildCard)newValue);
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
      case FXMLDslPackage.PROCESSING_INSTRUCTION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case FXMLDslPackage.PROCESSING_INSTRUCTION__IMPORTED_NAMESPACE:
        setImportedNamespace((QualifiedNameWithWildCard)null);
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
      case FXMLDslPackage.PROCESSING_INSTRUCTION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case FXMLDslPackage.PROCESSING_INSTRUCTION__IMPORTED_NAMESPACE:
        return importedNamespace != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //ProcessingInstructionImpl
