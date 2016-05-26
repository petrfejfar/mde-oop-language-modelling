/**
 */
package behaviouralProgramMM.impl;

import behaviouralProgramMM.BehaviouralProgramMMPackage;
import behaviouralProgramMM.Expression;
import behaviouralProgramMM.Loop;
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
 * An implementation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviouralProgramMM.impl.LoopImpl#getLoopstatements <em>Loopstatements</em>}</li>
 *   <li>{@link behaviouralProgramMM.impl.LoopImpl#getLoopexpression <em>Loopexpression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LoopImpl extends StatementImpl implements Loop {
	/**
	 * The cached value of the '{@link #getLoopstatements() <em>Loopstatements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopstatements()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> loopstatements;

	/**
	 * The cached value of the '{@link #getLoopexpression() <em>Loopexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopexpression()
	 * @generated
	 * @ordered
	 */
	protected Expression loopexpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviouralProgramMMPackage.Literals.LOOP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getLoopstatements() {
		if (loopstatements == null) {
			loopstatements = new EObjectContainmentEList<Statement>(Statement.class, this, BehaviouralProgramMMPackage.LOOP__LOOPSTATEMENTS);
		}
		return loopstatements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLoopexpression() {
		return loopexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoopexpression(Expression newLoopexpression, NotificationChain msgs) {
		Expression oldLoopexpression = loopexpression;
		loopexpression = newLoopexpression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BehaviouralProgramMMPackage.LOOP__LOOPEXPRESSION, oldLoopexpression, newLoopexpression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopexpression(Expression newLoopexpression) {
		if (newLoopexpression != loopexpression) {
			NotificationChain msgs = null;
			if (loopexpression != null)
				msgs = ((InternalEObject)loopexpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BehaviouralProgramMMPackage.LOOP__LOOPEXPRESSION, null, msgs);
			if (newLoopexpression != null)
				msgs = ((InternalEObject)newLoopexpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BehaviouralProgramMMPackage.LOOP__LOOPEXPRESSION, null, msgs);
			msgs = basicSetLoopexpression(newLoopexpression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviouralProgramMMPackage.LOOP__LOOPEXPRESSION, newLoopexpression, newLoopexpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviouralProgramMMPackage.LOOP__LOOPSTATEMENTS:
				return ((InternalEList<?>)getLoopstatements()).basicRemove(otherEnd, msgs);
			case BehaviouralProgramMMPackage.LOOP__LOOPEXPRESSION:
				return basicSetLoopexpression(null, msgs);
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
			case BehaviouralProgramMMPackage.LOOP__LOOPSTATEMENTS:
				return getLoopstatements();
			case BehaviouralProgramMMPackage.LOOP__LOOPEXPRESSION:
				return getLoopexpression();
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
			case BehaviouralProgramMMPackage.LOOP__LOOPSTATEMENTS:
				getLoopstatements().clear();
				getLoopstatements().addAll((Collection<? extends Statement>)newValue);
				return;
			case BehaviouralProgramMMPackage.LOOP__LOOPEXPRESSION:
				setLoopexpression((Expression)newValue);
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
			case BehaviouralProgramMMPackage.LOOP__LOOPSTATEMENTS:
				getLoopstatements().clear();
				return;
			case BehaviouralProgramMMPackage.LOOP__LOOPEXPRESSION:
				setLoopexpression((Expression)null);
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
			case BehaviouralProgramMMPackage.LOOP__LOOPSTATEMENTS:
				return loopstatements != null && !loopstatements.isEmpty();
			case BehaviouralProgramMMPackage.LOOP__LOOPEXPRESSION:
				return loopexpression != null;
		}
		return super.eIsSet(featureID);
	}

} //LoopImpl
