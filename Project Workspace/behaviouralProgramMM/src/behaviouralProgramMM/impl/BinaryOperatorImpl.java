/**
 */
package behaviouralProgramMM.impl;

import behaviouralProgramMM.BehaviouralProgramMMPackage;
import behaviouralProgramMM.BinaryOperator;
import behaviouralProgramMM.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binary Operator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviouralProgramMM.impl.BinaryOperatorImpl#getLeftSide <em>Left Side</em>}</li>
 *   <li>{@link behaviouralProgramMM.impl.BinaryOperatorImpl#getRightSide <em>Right Side</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BinaryOperatorImpl extends ExpressionImpl implements BinaryOperator {
	/**
	 * The cached value of the '{@link #getLeftSide() <em>Left Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeftSide()
	 * @generated
	 * @ordered
	 */
	protected Expression leftSide;

	/**
	 * The cached value of the '{@link #getRightSide() <em>Right Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRightSide()
	 * @generated
	 * @ordered
	 */
	protected Expression rightSide;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BinaryOperatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviouralProgramMMPackage.Literals.BINARY_OPERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLeftSide() {
		return leftSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeftSide(Expression newLeftSide, NotificationChain msgs) {
		Expression oldLeftSide = leftSide;
		leftSide = newLeftSide;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviouralProgramMMPackage.BINARY_OPERATOR__LEFT_SIDE, oldLeftSide, newLeftSide);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeftSide(Expression newLeftSide) {
		if (newLeftSide != leftSide) {
			NotificationChain msgs = null;
			if (leftSide != null)
				msgs = ((InternalEObject)leftSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviouralProgramMMPackage.BINARY_OPERATOR__LEFT_SIDE, null, msgs);
			if (newLeftSide != null)
				msgs = ((InternalEObject)newLeftSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviouralProgramMMPackage.BINARY_OPERATOR__LEFT_SIDE, null, msgs);
			msgs = basicSetLeftSide(newLeftSide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviouralProgramMMPackage.BINARY_OPERATOR__LEFT_SIDE, newLeftSide, newLeftSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getRightSide() {
		return rightSide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRightSide(Expression newRightSide, NotificationChain msgs) {
		Expression oldRightSide = rightSide;
		rightSide = newRightSide;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviouralProgramMMPackage.BINARY_OPERATOR__RIGHT_SIDE, oldRightSide, newRightSide);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRightSide(Expression newRightSide) {
		if (newRightSide != rightSide) {
			NotificationChain msgs = null;
			if (rightSide != null)
				msgs = ((InternalEObject)rightSide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviouralProgramMMPackage.BINARY_OPERATOR__RIGHT_SIDE, null, msgs);
			if (newRightSide != null)
				msgs = ((InternalEObject)newRightSide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviouralProgramMMPackage.BINARY_OPERATOR__RIGHT_SIDE, null, msgs);
			msgs = basicSetRightSide(newRightSide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviouralProgramMMPackage.BINARY_OPERATOR__RIGHT_SIDE, newRightSide, newRightSide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviouralProgramMMPackage.BINARY_OPERATOR__LEFT_SIDE:
				return basicSetLeftSide(null, msgs);
			case BehaviouralProgramMMPackage.BINARY_OPERATOR__RIGHT_SIDE:
				return basicSetRightSide(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BehaviouralProgramMMPackage.BINARY_OPERATOR__LEFT_SIDE:
				return getLeftSide();
			case BehaviouralProgramMMPackage.BINARY_OPERATOR__RIGHT_SIDE:
				return getRightSide();
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
			case BehaviouralProgramMMPackage.BINARY_OPERATOR__LEFT_SIDE:
				setLeftSide((Expression)newValue);
				return;
			case BehaviouralProgramMMPackage.BINARY_OPERATOR__RIGHT_SIDE:
				setRightSide((Expression)newValue);
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
			case BehaviouralProgramMMPackage.BINARY_OPERATOR__LEFT_SIDE:
				setLeftSide((Expression)null);
				return;
			case BehaviouralProgramMMPackage.BINARY_OPERATOR__RIGHT_SIDE:
				setRightSide((Expression)null);
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
			case BehaviouralProgramMMPackage.BINARY_OPERATOR__LEFT_SIDE:
				return leftSide != null;
			case BehaviouralProgramMMPackage.BINARY_OPERATOR__RIGHT_SIDE:
				return rightSide != null;
		}
		return super.eIsSet(featureID);
	}

} //BinaryOperatorImpl
