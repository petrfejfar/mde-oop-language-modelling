/**
 */
package behaviouralProgramMM.impl;

import behaviouralProgramMM.Behaviour;
import behaviouralProgramMM.BehaviouralProgramMMPackage;
import behaviouralProgramMM.Function;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behaviour</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviouralProgramMM.impl.BehaviourImpl#getFunctions <em>Functions</em>}</li>
 *   <li>{@link behaviouralProgramMM.impl.BehaviourImpl#getStartfunction <em>Startfunction</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BehaviourImpl extends MinimalEObjectImpl.Container implements Behaviour {
	/**
	 * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<Function> functions;

	/**
	 * The cached value of the '{@link #getStartfunction() <em>Startfunction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartfunction()
	 * @generated
	 * @ordered
	 */
	protected Function startfunction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviourImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviouralProgramMMPackage.Literals.BEHAVIOUR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Function> getFunctions() {
		if (functions == null) {
			functions = new EObjectContainmentEList<Function>(Function.class, this, BehaviouralProgramMMPackage.BEHAVIOUR__FUNCTIONS);
		}
		return functions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getStartfunction() {
		if (startfunction != null && startfunction.eIsProxy()) {
			InternalEObject oldStartfunction = (InternalEObject)startfunction;
			startfunction = (Function)eResolveProxy(oldStartfunction);
			if (startfunction != oldStartfunction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BehaviouralProgramMMPackage.BEHAVIOUR__STARTFUNCTION, oldStartfunction, startfunction));
			}
		}
		return startfunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetStartfunction() {
		return startfunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartfunction(Function newStartfunction) {
		Function oldStartfunction = startfunction;
		startfunction = newStartfunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BehaviouralProgramMMPackage.BEHAVIOUR__STARTFUNCTION, oldStartfunction, startfunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviouralProgramMMPackage.BEHAVIOUR__FUNCTIONS:
				return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
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
			case BehaviouralProgramMMPackage.BEHAVIOUR__FUNCTIONS:
				return getFunctions();
			case BehaviouralProgramMMPackage.BEHAVIOUR__STARTFUNCTION:
				if (resolve) return getStartfunction();
				return basicGetStartfunction();
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
			case BehaviouralProgramMMPackage.BEHAVIOUR__FUNCTIONS:
				getFunctions().clear();
				getFunctions().addAll((Collection<? extends Function>)newValue);
				return;
			case BehaviouralProgramMMPackage.BEHAVIOUR__STARTFUNCTION:
				setStartfunction((Function)newValue);
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
			case BehaviouralProgramMMPackage.BEHAVIOUR__FUNCTIONS:
				getFunctions().clear();
				return;
			case BehaviouralProgramMMPackage.BEHAVIOUR__STARTFUNCTION:
				setStartfunction((Function)null);
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
			case BehaviouralProgramMMPackage.BEHAVIOUR__FUNCTIONS:
				return functions != null && !functions.isEmpty();
			case BehaviouralProgramMMPackage.BEHAVIOUR__STARTFUNCTION:
				return startfunction != null;
		}
		return super.eIsSet(featureID);
	}

} //BehaviourImpl
