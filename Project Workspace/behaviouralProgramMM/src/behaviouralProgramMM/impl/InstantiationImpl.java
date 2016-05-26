/**
 */
package behaviouralProgramMM.impl;

import behaviouralProgramMM.BehaviouralProgramMMPackage;
import behaviouralProgramMM.Expression;
import behaviouralProgramMM.Instantiation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instantiation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviouralProgramMM.impl.InstantiationImpl#getVarName <em>Var Name</em>}</li>
 *   <li>{@link behaviouralProgramMM.impl.InstantiationImpl#getVarType <em>Var Type</em>}</li>
 *   <li>{@link behaviouralProgramMM.impl.InstantiationImpl#getInitiationExpression <em>Initiation Expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InstantiationImpl extends StatementImpl implements Instantiation {
	/**
	 * The default value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarName() <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarName()
	 * @generated
	 * @ordered
	 */
	protected String varName = VAR_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarType() <em>Var Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarType()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarType() <em>Var Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarType()
	 * @generated
	 * @ordered
	 */
	protected String varType = VAR_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInitiationExpression() <em>Initiation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiationExpression()
	 * @generated
	 * @ordered
	 */
	protected Expression initiationExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantiationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviouralProgramMMPackage.Literals.INSTANTIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVarName() {
		return varName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarName(String newVarName) {
		String oldVarName = varName;
		varName = newVarName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviouralProgramMMPackage.INSTANTIATION__VAR_NAME, oldVarName, varName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVarType() {
		return varType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarType(String newVarType) {
		String oldVarType = varType;
		varType = newVarType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviouralProgramMMPackage.INSTANTIATION__VAR_TYPE, oldVarType, varType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitiationExpression() {
		return initiationExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitiationExpression(Expression newInitiationExpression, NotificationChain msgs) {
		Expression oldInitiationExpression = initiationExpression;
		initiationExpression = newInitiationExpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviouralProgramMMPackage.INSTANTIATION__INITIATION_EXPRESSION, oldInitiationExpression, newInitiationExpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiationExpression(Expression newInitiationExpression) {
		if (newInitiationExpression != initiationExpression) {
			NotificationChain msgs = null;
			if (initiationExpression != null)
				msgs = ((InternalEObject)initiationExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviouralProgramMMPackage.INSTANTIATION__INITIATION_EXPRESSION, null, msgs);
			if (newInitiationExpression != null)
				msgs = ((InternalEObject)newInitiationExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviouralProgramMMPackage.INSTANTIATION__INITIATION_EXPRESSION, null, msgs);
			msgs = basicSetInitiationExpression(newInitiationExpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviouralProgramMMPackage.INSTANTIATION__INITIATION_EXPRESSION, newInitiationExpression, newInitiationExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviouralProgramMMPackage.INSTANTIATION__INITIATION_EXPRESSION:
				return basicSetInitiationExpression(null, msgs);
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
			case BehaviouralProgramMMPackage.INSTANTIATION__VAR_NAME:
				return getVarName();
			case BehaviouralProgramMMPackage.INSTANTIATION__VAR_TYPE:
				return getVarType();
			case BehaviouralProgramMMPackage.INSTANTIATION__INITIATION_EXPRESSION:
				return getInitiationExpression();
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
			case BehaviouralProgramMMPackage.INSTANTIATION__VAR_NAME:
				setVarName((String)newValue);
				return;
			case BehaviouralProgramMMPackage.INSTANTIATION__VAR_TYPE:
				setVarType((String)newValue);
				return;
			case BehaviouralProgramMMPackage.INSTANTIATION__INITIATION_EXPRESSION:
				setInitiationExpression((Expression)newValue);
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
			case BehaviouralProgramMMPackage.INSTANTIATION__VAR_NAME:
				setVarName(VAR_NAME_EDEFAULT);
				return;
			case BehaviouralProgramMMPackage.INSTANTIATION__VAR_TYPE:
				setVarType(VAR_TYPE_EDEFAULT);
				return;
			case BehaviouralProgramMMPackage.INSTANTIATION__INITIATION_EXPRESSION:
				setInitiationExpression((Expression)null);
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
			case BehaviouralProgramMMPackage.INSTANTIATION__VAR_NAME:
				return VAR_NAME_EDEFAULT == null ? varName != null : !VAR_NAME_EDEFAULT.equals(varName);
			case BehaviouralProgramMMPackage.INSTANTIATION__VAR_TYPE:
				return VAR_TYPE_EDEFAULT == null ? varType != null : !VAR_TYPE_EDEFAULT.equals(varType);
			case BehaviouralProgramMMPackage.INSTANTIATION__INITIATION_EXPRESSION:
				return initiationExpression != null;
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
		result.append(" (VarName: ");
		result.append(varName);
		result.append(", VarType: ");
		result.append(varType);
		result.append(')');
		return result.toString();
	}

} //InstantiationImpl
