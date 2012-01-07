/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package at.bestsolution.efxclipse.formats.fxg.fxg.impl;

import at.bestsolution.efxclipse.formats.fxg.fxg.FxgPackage;
import at.bestsolution.efxclipse.formats.fxg.fxg.Matrix;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.MatrixImpl#getA <em>A</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.MatrixImpl#getB <em>B</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.MatrixImpl#getC <em>C</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.MatrixImpl#getD <em>D</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.MatrixImpl#getTx <em>Tx</em>}</li>
 *   <li>{@link at.bestsolution.efxclipse.formats.fxg.fxg.impl.MatrixImpl#getTy <em>Ty</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MatrixImpl extends EObjectImpl implements Matrix {
	/**
	 * The default value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected static final Double A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getA() <em>A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getA()
	 * @generated
	 * @ordered
	 */
	protected Double a = A_EDEFAULT;

	/**
	 * The default value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected static final Double B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getB() <em>B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getB()
	 * @generated
	 * @ordered
	 */
	protected Double b = B_EDEFAULT;

	/**
	 * The default value of the '{@link #getC() <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected static final Double C_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getC() <em>C</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getC()
	 * @generated
	 * @ordered
	 */
	protected Double c = C_EDEFAULT;

	/**
	 * The default value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected static final Double D_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getD() <em>D</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getD()
	 * @generated
	 * @ordered
	 */
	protected Double d = D_EDEFAULT;

	/**
	 * The default value of the '{@link #getTx() <em>Tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx()
	 * @generated
	 * @ordered
	 */
	protected static final Double TX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTx() <em>Tx</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTx()
	 * @generated
	 * @ordered
	 */
	protected Double tx = TX_EDEFAULT;

	/**
	 * The default value of the '{@link #getTy() <em>Ty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTy()
	 * @generated
	 * @ordered
	 */
	protected static final Double TY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTy() <em>Ty</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTy()
	 * @generated
	 * @ordered
	 */
	protected Double ty = TY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FxgPackage.Literals.MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getA() {
		return a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setA(Double newA) {
		Double oldA = a;
		a = newA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.MATRIX__A, oldA, a));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getB() {
		return b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setB(Double newB) {
		Double oldB = b;
		b = newB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.MATRIX__B, oldB, b));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getC() {
		return c;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setC(Double newC) {
		Double oldC = c;
		c = newC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.MATRIX__C, oldC, c));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getD() {
		return d;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setD(Double newD) {
		Double oldD = d;
		d = newD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.MATRIX__D, oldD, d));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTx() {
		return tx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTx(Double newTx) {
		Double oldTx = tx;
		tx = newTx;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.MATRIX__TX, oldTx, tx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getTy() {
		return ty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTy(Double newTy) {
		Double oldTy = ty;
		ty = newTy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxgPackage.MATRIX__TY, oldTy, ty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FxgPackage.MATRIX__A:
				return getA();
			case FxgPackage.MATRIX__B:
				return getB();
			case FxgPackage.MATRIX__C:
				return getC();
			case FxgPackage.MATRIX__D:
				return getD();
			case FxgPackage.MATRIX__TX:
				return getTx();
			case FxgPackage.MATRIX__TY:
				return getTy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FxgPackage.MATRIX__A:
				setA((Double)newValue);
				return;
			case FxgPackage.MATRIX__B:
				setB((Double)newValue);
				return;
			case FxgPackage.MATRIX__C:
				setC((Double)newValue);
				return;
			case FxgPackage.MATRIX__D:
				setD((Double)newValue);
				return;
			case FxgPackage.MATRIX__TX:
				setTx((Double)newValue);
				return;
			case FxgPackage.MATRIX__TY:
				setTy((Double)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case FxgPackage.MATRIX__A:
				setA(A_EDEFAULT);
				return;
			case FxgPackage.MATRIX__B:
				setB(B_EDEFAULT);
				return;
			case FxgPackage.MATRIX__C:
				setC(C_EDEFAULT);
				return;
			case FxgPackage.MATRIX__D:
				setD(D_EDEFAULT);
				return;
			case FxgPackage.MATRIX__TX:
				setTx(TX_EDEFAULT);
				return;
			case FxgPackage.MATRIX__TY:
				setTy(TY_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FxgPackage.MATRIX__A:
				return A_EDEFAULT == null ? a != null : !A_EDEFAULT.equals(a);
			case FxgPackage.MATRIX__B:
				return B_EDEFAULT == null ? b != null : !B_EDEFAULT.equals(b);
			case FxgPackage.MATRIX__C:
				return C_EDEFAULT == null ? c != null : !C_EDEFAULT.equals(c);
			case FxgPackage.MATRIX__D:
				return D_EDEFAULT == null ? d != null : !D_EDEFAULT.equals(d);
			case FxgPackage.MATRIX__TX:
				return TX_EDEFAULT == null ? tx != null : !TX_EDEFAULT.equals(tx);
			case FxgPackage.MATRIX__TY:
				return TY_EDEFAULT == null ? ty != null : !TY_EDEFAULT.equals(ty);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (a: ");
		result.append(a);
		result.append(", b: ");
		result.append(b);
		result.append(", c: ");
		result.append(c);
		result.append(", d: ");
		result.append(d);
		result.append(", tx: ");
		result.append(tx);
		result.append(", ty: ");
		result.append(ty);
		result.append(')');
		return result.toString();
	}

} //MatrixImpl
