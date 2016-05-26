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

import structuralProgramMM.AccessMod;
import structuralProgramMM.DataTypes;
import structuralProgramMM.Method;
import structuralProgramMM.StructuralProgramMMPackage;
import structuralProgramMM.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structuralProgramMM.impl.MethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link structuralProgramMM.impl.MethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link structuralProgramMM.impl.MethodImpl#getAccesSpecifier <em>Acces Specifier</em>}</li>
 *   <li>{@link structuralProgramMM.impl.MethodImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link structuralProgramMM.impl.MethodImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodImpl extends MinimalEObjectImpl.Container implements Method {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final DataTypes RETURN_TYPE_EDEFAULT = DataTypes.INTEGER;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected DataTypes returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccesSpecifier() <em>Acces Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesSpecifier()
	 * @generated
	 * @ordered
	 */
	protected static final AccessMod ACCES_SPECIFIER_EDEFAULT = AccessMod.PRIVATE;

	/**
	 * The cached value of the '{@link #getAccesSpecifier() <em>Acces Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesSpecifier()
	 * @generated
	 * @ordered
	 */
	protected AccessMod accesSpecifier = ACCES_SPECIFIER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<Variable> variables;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected structuralProgramMM.Class class_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralProgramMMPackage.Literals.METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralProgramMMPackage.METHOD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypes getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(DataTypes newReturnType) {
		DataTypes oldReturnType = returnType;
		returnType = newReturnType == null ? RETURN_TYPE_EDEFAULT : newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralProgramMMPackage.METHOD__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessMod getAccesSpecifier() {
		return accesSpecifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccesSpecifier(AccessMod newAccesSpecifier) {
		AccessMod oldAccesSpecifier = accesSpecifier;
		accesSpecifier = newAccesSpecifier == null ? ACCES_SPECIFIER_EDEFAULT : newAccesSpecifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralProgramMMPackage.METHOD__ACCES_SPECIFIER, oldAccesSpecifier, accesSpecifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariables() {
		if (variables == null) {
			variables = new EObjectContainmentEList<Variable>(Variable.class, this, StructuralProgramMMPackage.METHOD__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public structuralProgramMM.Class getClass_() {
		if (class_ != null && class_.eIsProxy()) {
			InternalEObject oldClass = (InternalEObject)class_;
			class_ = (structuralProgramMM.Class)eResolveProxy(oldClass);
			if (class_ != oldClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructuralProgramMMPackage.METHOD__CLASS, oldClass, class_));
			}
		}
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public structuralProgramMM.Class basicGetClass() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(structuralProgramMM.Class newClass) {
		structuralProgramMM.Class oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralProgramMMPackage.METHOD__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructuralProgramMMPackage.METHOD__VARIABLES:
				return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
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
			case StructuralProgramMMPackage.METHOD__NAME:
				return getName();
			case StructuralProgramMMPackage.METHOD__RETURN_TYPE:
				return getReturnType();
			case StructuralProgramMMPackage.METHOD__ACCES_SPECIFIER:
				return getAccesSpecifier();
			case StructuralProgramMMPackage.METHOD__VARIABLES:
				return getVariables();
			case StructuralProgramMMPackage.METHOD__CLASS:
				if (resolve) return getClass_();
				return basicGetClass();
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
			case StructuralProgramMMPackage.METHOD__NAME:
				setName((String)newValue);
				return;
			case StructuralProgramMMPackage.METHOD__RETURN_TYPE:
				setReturnType((DataTypes)newValue);
				return;
			case StructuralProgramMMPackage.METHOD__ACCES_SPECIFIER:
				setAccesSpecifier((AccessMod)newValue);
				return;
			case StructuralProgramMMPackage.METHOD__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends Variable>)newValue);
				return;
			case StructuralProgramMMPackage.METHOD__CLASS:
				setClass((structuralProgramMM.Class)newValue);
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
			case StructuralProgramMMPackage.METHOD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructuralProgramMMPackage.METHOD__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case StructuralProgramMMPackage.METHOD__ACCES_SPECIFIER:
				setAccesSpecifier(ACCES_SPECIFIER_EDEFAULT);
				return;
			case StructuralProgramMMPackage.METHOD__VARIABLES:
				getVariables().clear();
				return;
			case StructuralProgramMMPackage.METHOD__CLASS:
				setClass((structuralProgramMM.Class)null);
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
			case StructuralProgramMMPackage.METHOD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructuralProgramMMPackage.METHOD__RETURN_TYPE:
				return returnType != RETURN_TYPE_EDEFAULT;
			case StructuralProgramMMPackage.METHOD__ACCES_SPECIFIER:
				return accesSpecifier != ACCES_SPECIFIER_EDEFAULT;
			case StructuralProgramMMPackage.METHOD__VARIABLES:
				return variables != null && !variables.isEmpty();
			case StructuralProgramMMPackage.METHOD__CLASS:
				return class_ != null;
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
		result.append(" (Name: ");
		result.append(name);
		result.append(", ReturnType: ");
		result.append(returnType);
		result.append(", AccesSpecifier: ");
		result.append(accesSpecifier);
		result.append(')');
		return result.toString();
	}

} //MethodImpl
