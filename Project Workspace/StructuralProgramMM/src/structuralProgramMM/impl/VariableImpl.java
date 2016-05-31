/**
 */
package structuralProgramMM.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import structuralProgramMM.AccessMod;
import structuralProgramMM.DataTypes;
import structuralProgramMM.StructuralProgramMMPackage;
import structuralProgramMM.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link structuralProgramMM.impl.VariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link structuralProgramMM.impl.VariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link structuralProgramMM.impl.VariableImpl#getAccesSpecifier <em>Acces Specifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableImpl extends MinimalEObjectImpl.Container implements Variable {
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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final DataTypes TYPE_EDEFAULT = DataTypes.INTEGER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DataTypes type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAccesSpecifier() <em>Acces Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesSpecifier()
	 * @generated
	 * @ordered
	 */
	protected static final AccessMod ACCES_SPECIFIER_EDEFAULT = AccessMod.PUBLIC;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructuralProgramMMPackage.Literals.VARIABLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralProgramMMPackage.VARIABLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypes getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DataTypes newType) {
		DataTypes oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralProgramMMPackage.VARIABLE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StructuralProgramMMPackage.VARIABLE__ACCES_SPECIFIER, oldAccesSpecifier, accesSpecifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructuralProgramMMPackage.VARIABLE__NAME:
				return getName();
			case StructuralProgramMMPackage.VARIABLE__TYPE:
				return getType();
			case StructuralProgramMMPackage.VARIABLE__ACCES_SPECIFIER:
				return getAccesSpecifier();
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
			case StructuralProgramMMPackage.VARIABLE__NAME:
				setName((String)newValue);
				return;
			case StructuralProgramMMPackage.VARIABLE__TYPE:
				setType((DataTypes)newValue);
				return;
			case StructuralProgramMMPackage.VARIABLE__ACCES_SPECIFIER:
				setAccesSpecifier((AccessMod)newValue);
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
			case StructuralProgramMMPackage.VARIABLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case StructuralProgramMMPackage.VARIABLE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case StructuralProgramMMPackage.VARIABLE__ACCES_SPECIFIER:
				setAccesSpecifier(ACCES_SPECIFIER_EDEFAULT);
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
			case StructuralProgramMMPackage.VARIABLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case StructuralProgramMMPackage.VARIABLE__TYPE:
				return type != TYPE_EDEFAULT;
			case StructuralProgramMMPackage.VARIABLE__ACCES_SPECIFIER:
				return accesSpecifier != ACCES_SPECIFIER_EDEFAULT;
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
		result.append(", Type: ");
		result.append(type);
		result.append(", AccesSpecifier: ");
		result.append(accesSpecifier);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
