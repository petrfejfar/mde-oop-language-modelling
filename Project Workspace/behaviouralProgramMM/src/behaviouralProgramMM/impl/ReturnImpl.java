/**
 */
package behaviouralProgramMM.impl;

import behaviouralProgramMM.BehaviouralProgramMMPackage;
import behaviouralProgramMM.Expression;
import behaviouralProgramMM.Return;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviouralProgramMM.impl.ReturnImpl#getReturnexpression <em>Returnexpression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnImpl extends StatementImpl implements Return {
	/**
	 * The cached value of the '{@link #getReturnexpression() <em>Returnexpression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnexpression()
	 * @generated
	 * @ordered
	 */
	protected Expression returnexpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviouralProgramMMPackage.Literals.RETURN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getReturnexpression() {
		if (returnexpression != null && returnexpression.eIsProxy()) {
			InternalEObject oldReturnexpression = (InternalEObject)returnexpression;
			returnexpression = (Expression)eResolveProxy(oldReturnexpression);
			if (returnexpression != oldReturnexpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviouralProgramMMPackage.RETURN__RETURNEXPRESSION, oldReturnexpression, returnexpression));
			}
		}
		return returnexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetReturnexpression() {
		return returnexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnexpression(Expression newReturnexpression) {
		Expression oldReturnexpression = returnexpression;
		returnexpression = newReturnexpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviouralProgramMMPackage.RETURN__RETURNEXPRESSION, oldReturnexpression, returnexpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviouralProgramMMPackage.RETURN__RETURNEXPRESSION:
				if (resolve) return getReturnexpression();
				return basicGetReturnexpression();
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
			case BehaviouralProgramMMPackage.RETURN__RETURNEXPRESSION:
				setReturnexpression((Expression)newValue);
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
			case BehaviouralProgramMMPackage.RETURN__RETURNEXPRESSION:
				setReturnexpression((Expression)null);
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
			case BehaviouralProgramMMPackage.RETURN__RETURNEXPRESSION:
				return returnexpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ReturnImpl
