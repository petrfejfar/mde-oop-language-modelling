/**
 */
package structuralProgramMM.impl;

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

import structuralProgramMM.Method;
import structuralProgramMM.Program;
import structuralProgramMM.StructuralProgramMMPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structuralProgramMM.impl.ProgramImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link structuralProgramMM.impl.ProgramImpl#getMainMethod <em>Main Method</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<structuralProgramMM.Class> classes;

	/**
	 * The cached value of the '{@link #getMainMethod() <em>Main Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMainMethod()
	 * @generated
	 * @ordered
	 */
	protected Method mainMethod;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralProgramMMPackage.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<structuralProgramMM.Class> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentEList<structuralProgramMM.Class>(structuralProgramMM.Class.class, this, StructuralProgramMMPackage.PROGRAM__CLASSES);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method getMainMethod() {
		if (mainMethod != null && mainMethod.eIsProxy()) {
			InternalEObject oldMainMethod = (InternalEObject)mainMethod;
			mainMethod = (Method)eResolveProxy(oldMainMethod);
			if (mainMethod != oldMainMethod) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuralProgramMMPackage.PROGRAM__MAIN_METHOD, oldMainMethod, mainMethod));
			}
		}
		return mainMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Method basicGetMainMethod() {
		return mainMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainMethod(Method newMainMethod) {
		Method oldMainMethod = mainMethod;
		mainMethod = newMainMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralProgramMMPackage.PROGRAM__MAIN_METHOD, oldMainMethod, mainMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuralProgramMMPackage.PROGRAM__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
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
			case StructuralProgramMMPackage.PROGRAM__CLASSES:
				return getClasses();
			case StructuralProgramMMPackage.PROGRAM__MAIN_METHOD:
				if (resolve) return getMainMethod();
				return basicGetMainMethod();
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
			case StructuralProgramMMPackage.PROGRAM__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends structuralProgramMM.Class>)newValue);
				return;
			case StructuralProgramMMPackage.PROGRAM__MAIN_METHOD:
				setMainMethod((Method)newValue);
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
			case StructuralProgramMMPackage.PROGRAM__CLASSES:
				getClasses().clear();
				return;
			case StructuralProgramMMPackage.PROGRAM__MAIN_METHOD:
				setMainMethod((Method)null);
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
			case StructuralProgramMMPackage.PROGRAM__CLASSES:
				return classes != null && !classes.isEmpty();
			case StructuralProgramMMPackage.PROGRAM__MAIN_METHOD:
				return mainMethod != null;
		}
		return super.eIsSet(featureID);
	}

} //ProgramImpl
