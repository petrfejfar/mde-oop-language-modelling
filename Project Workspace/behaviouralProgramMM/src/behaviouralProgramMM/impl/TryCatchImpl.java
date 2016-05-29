/**
 */
package behaviouralProgramMM.impl;

import behaviouralProgramMM.BehaviouralProgramMMPackage;
import behaviouralProgramMM.Statement;
import behaviouralProgramMM.TryCatch;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Try Catch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link behaviouralProgramMM.impl.TryCatchImpl#getCatch <em>Catch</em>}</li>
 *   <li>{@link behaviouralProgramMM.impl.TryCatchImpl#getTry <em>Try</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TryCatchImpl extends StatementImpl implements TryCatch {
	/**
	 * The cached value of the '{@link #getCatch() <em>Catch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCatch()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> catch_;

	/**
	 * The cached value of the '{@link #getTry() <em>Try</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTry()
	 * @generated
	 * @ordered
	 */
	protected EList<Statement> try_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TryCatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BehaviouralProgramMMPackage.Literals.TRY_CATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getCatch() {
		if (catch_ == null) {
			catch_ = new EObjectContainmentEList<Statement>(Statement.class, this, BehaviouralProgramMMPackage.TRY_CATCH__CATCH);
		}
		return catch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Statement> getTry() {
		if (try_ == null) {
			try_ = new EObjectContainmentEList<Statement>(Statement.class, this, BehaviouralProgramMMPackage.TRY_CATCH__TRY);
		}
		return try_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BehaviouralProgramMMPackage.TRY_CATCH__CATCH:
				return ((InternalEList<?>)getCatch()).basicRemove(otherEnd, msgs);
			case BehaviouralProgramMMPackage.TRY_CATCH__TRY:
				return ((InternalEList<?>)getTry()).basicRemove(otherEnd, msgs);
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
			case BehaviouralProgramMMPackage.TRY_CATCH__CATCH:
				return getCatch();
			case BehaviouralProgramMMPackage.TRY_CATCH__TRY:
				return getTry();
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
			case BehaviouralProgramMMPackage.TRY_CATCH__CATCH:
				getCatch().clear();
				getCatch().addAll((Collection<? extends Statement>)newValue);
				return;
			case BehaviouralProgramMMPackage.TRY_CATCH__TRY:
				getTry().clear();
				getTry().addAll((Collection<? extends Statement>)newValue);
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
			case BehaviouralProgramMMPackage.TRY_CATCH__CATCH:
				getCatch().clear();
				return;
			case BehaviouralProgramMMPackage.TRY_CATCH__TRY:
				getTry().clear();
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
			case BehaviouralProgramMMPackage.TRY_CATCH__CATCH:
				return catch_ != null && !catch_.isEmpty();
			case BehaviouralProgramMMPackage.TRY_CATCH__TRY:
				return try_ != null && !try_.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TryCatchImpl
