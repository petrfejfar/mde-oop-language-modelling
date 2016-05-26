/**
 */
package behaviouralProgramMM.impl;

import behaviouralProgramMM.BehaviouralProgramMMPackage;
import behaviouralProgramMM.ConditionalBranch;
import behaviouralProgramMM.Expression;
import behaviouralProgramMM.Statement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Branch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviouralProgramMM.impl.ConditionalBranchImpl#getIfstatements <em>Ifstatements</em>}</li>
 *   <li>{@link behaviouralProgramMM.impl.ConditionalBranchImpl#getElsestatements <em>Elsestatements</em>}</li>
 *   <li>{@link behaviouralProgramMM.impl.ConditionalBranchImpl#getIfexpression <em>Ifexpression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalBranchImpl extends StatementImpl implements ConditionalBranch {
	/**
	 * The cached value of the '{@link #getIfstatements() <em>Ifstatements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfstatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> ifstatements;

	/**
	 * The cached value of the '{@link #getElsestatements() <em>Elsestatements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElsestatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> elsestatements;

	/**
	 * The cached value of the '{@link #getIfexpression() <em>Ifexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIfexpression()
	 * @generated
	 * @ordered
	 */
	protected Expression ifexpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalBranchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviouralProgramMMPackage.Literals.CONDITIONAL_BRANCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getIfstatements() {
		if (ifstatements == null) {
			ifstatements = new EObjectContainmentEList<Statement>(Statement.class, this, BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__IFSTATEMENTS);
		}
		return ifstatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getElsestatements() {
		if (elsestatements == null) {
			elsestatements = new EObjectContainmentEList<Statement>(Statement.class, this, BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__ELSESTATEMENTS);
		}
		return elsestatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIfexpression() {
		return ifexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIfexpression(Expression newIfexpression, NotificationChain msgs) {
		Expression oldIfexpression = ifexpression;
		ifexpression = newIfexpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__IFEXPRESSION, oldIfexpression, newIfexpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIfexpression(Expression newIfexpression) {
		if (newIfexpression != ifexpression) {
			NotificationChain msgs = null;
			if (ifexpression != null)
				msgs = ((InternalEObject)ifexpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__IFEXPRESSION, null, msgs);
			if (newIfexpression != null)
				msgs = ((InternalEObject)newIfexpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__IFEXPRESSION, null, msgs);
			msgs = basicSetIfexpression(newIfexpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__IFEXPRESSION, newIfexpression, newIfexpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__IFSTATEMENTS:
				return ((InternalEList<?>)getIfstatements()).basicRemove(otherEnd, msgs);
			case BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__ELSESTATEMENTS:
				return ((InternalEList<?>)getElsestatements()).basicRemove(otherEnd, msgs);
			case BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__IFEXPRESSION:
				return basicSetIfexpression(null, msgs);
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
			case BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__IFSTATEMENTS:
				return getIfstatements();
			case BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__ELSESTATEMENTS:
				return getElsestatements();
			case BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__IFEXPRESSION:
				return getIfexpression();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__IFSTATEMENTS:
				getIfstatements().clear();
				getIfstatements().addAll((Collection<? extends Statement>)newValue);
				return;
			case BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__ELSESTATEMENTS:
				getElsestatements().clear();
				getElsestatements().addAll((Collection<? extends Statement>)newValue);
				return;
			case BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__IFEXPRESSION:
				setIfexpression((Expression)newValue);
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
			case BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__IFSTATEMENTS:
				getIfstatements().clear();
				return;
			case BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__ELSESTATEMENTS:
				getElsestatements().clear();
				return;
			case BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__IFEXPRESSION:
				setIfexpression((Expression)null);
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
			case BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__IFSTATEMENTS:
				return ifstatements != null && !ifstatements.isEmpty();
			case BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__ELSESTATEMENTS:
				return elsestatements != null && !elsestatements.isEmpty();
			case BehaviouralProgramMMPackage.CONDITIONAL_BRANCH__IFEXPRESSION:
				return ifexpression != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalBranchImpl
