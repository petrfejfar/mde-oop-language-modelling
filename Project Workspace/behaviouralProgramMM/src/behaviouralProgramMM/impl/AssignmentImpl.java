/**
 */
package behaviouralProgramMM.impl;

import behaviouralProgramMM.Assignment;
import behaviouralProgramMM.BehaviouralProgramMMPackage;
import behaviouralProgramMM.Expression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviouralProgramMM.impl.AssignmentImpl#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link behaviouralProgramMM.impl.AssignmentImpl#getAssignexpression <em>Assignexpression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssignmentImpl extends StatementImpl implements Assignment {
	/**
	 * The default value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected static final String VARIABLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVariableName() <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableName()
	 * @generated
	 * @ordered
	 */
	protected String variableName = VARIABLE_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAssignexpression() <em>Assignexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignexpression()
	 * @generated
	 * @ordered
	 */
	protected Expression assignexpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssignmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviouralProgramMMPackage.Literals.ASSIGNMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVariableName() {
		return variableName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableName(String newVariableName) {
		String oldVariableName = variableName;
		variableName = newVariableName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviouralProgramMMPackage.ASSIGNMENT__VARIABLE_NAME, oldVariableName, variableName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getAssignexpression() {
		return assignexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignexpression(Expression newAssignexpression, NotificationChain msgs) {
		Expression oldAssignexpression = assignexpression;
		assignexpression = newAssignexpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviouralProgramMMPackage.ASSIGNMENT__ASSIGNEXPRESSION, oldAssignexpression, newAssignexpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignexpression(Expression newAssignexpression) {
		if (newAssignexpression != assignexpression) {
			NotificationChain msgs = null;
			if (assignexpression != null)
				msgs = ((InternalEObject)assignexpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviouralProgramMMPackage.ASSIGNMENT__ASSIGNEXPRESSION, null, msgs);
			if (newAssignexpression != null)
				msgs = ((InternalEObject)newAssignexpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviouralProgramMMPackage.ASSIGNMENT__ASSIGNEXPRESSION, null, msgs);
			msgs = basicSetAssignexpression(newAssignexpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviouralProgramMMPackage.ASSIGNMENT__ASSIGNEXPRESSION, newAssignexpression, newAssignexpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviouralProgramMMPackage.ASSIGNMENT__ASSIGNEXPRESSION:
				return basicSetAssignexpression(null, msgs);
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
			case BehaviouralProgramMMPackage.ASSIGNMENT__VARIABLE_NAME:
				return getVariableName();
			case BehaviouralProgramMMPackage.ASSIGNMENT__ASSIGNEXPRESSION:
				return getAssignexpression();
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
			case BehaviouralProgramMMPackage.ASSIGNMENT__VARIABLE_NAME:
				setVariableName((String)newValue);
				return;
			case BehaviouralProgramMMPackage.ASSIGNMENT__ASSIGNEXPRESSION:
				setAssignexpression((Expression)newValue);
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
			case BehaviouralProgramMMPackage.ASSIGNMENT__VARIABLE_NAME:
				setVariableName(VARIABLE_NAME_EDEFAULT);
				return;
			case BehaviouralProgramMMPackage.ASSIGNMENT__ASSIGNEXPRESSION:
				setAssignexpression((Expression)null);
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
			case BehaviouralProgramMMPackage.ASSIGNMENT__VARIABLE_NAME:
				return VARIABLE_NAME_EDEFAULT == null ? variableName != null : !VARIABLE_NAME_EDEFAULT.equals(variableName);
			case BehaviouralProgramMMPackage.ASSIGNMENT__ASSIGNEXPRESSION:
				return assignexpression != null;
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
		result.append(" (VariableName: ");
		result.append(variableName);
		result.append(')');
		return result.toString();
	}

} //AssignmentImpl
