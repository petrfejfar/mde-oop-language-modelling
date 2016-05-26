/**
 */
package structuralProgramMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structuralProgramMM.Method#getName <em>Name</em>}</li>
 *   <li>{@link structuralProgramMM.Method#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link structuralProgramMM.Method#getAccesSpecifier <em>Acces Specifier</em>}</li>
 *   <li>{@link structuralProgramMM.Method#getVariables <em>Variables</em>}</li>
 *   <li>{@link structuralProgramMM.Method#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @see structuralProgramMM.StructuralProgramMMPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see structuralProgramMM.StructuralProgramMMPackage#getMethod_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link structuralProgramMM.Method#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' attribute.
	 * The literals are from the enumeration {@link structuralProgramMM.DataTypes}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Return Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' attribute.
	 * @see structuralProgramMM.DataTypes
	 * @see #setReturnType(DataTypes)
	 * @see structuralProgramMM.StructuralProgramMMPackage#getMethod_ReturnType()
	 * @model
	 * @generated
	 */
	DataTypes getReturnType();

	/**
	 * Sets the value of the '{@link structuralProgramMM.Method#getReturnType <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' attribute.
	 * @see structuralProgramMM.DataTypes
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(DataTypes value);

	/**
	 * Returns the value of the '<em><b>Acces Specifier</b></em>' attribute.
	 * The literals are from the enumeration {@link structuralProgramMM.AccessMod}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Acces Specifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Acces Specifier</em>' attribute.
	 * @see structuralProgramMM.AccessMod
	 * @see #setAccesSpecifier(AccessMod)
	 * @see structuralProgramMM.StructuralProgramMMPackage#getMethod_AccesSpecifier()
	 * @model
	 * @generated
	 */
	AccessMod getAccesSpecifier();

	/**
	 * Sets the value of the '{@link structuralProgramMM.Method#getAccesSpecifier <em>Acces Specifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Acces Specifier</em>' attribute.
	 * @see structuralProgramMM.AccessMod
	 * @see #getAccesSpecifier()
	 * @generated
	 */
	void setAccesSpecifier(AccessMod value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link structuralProgramMM.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see structuralProgramMM.StructuralProgramMMPackage#getMethod_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<Variable> getVariables();

	/**
	 * Returns the value of the '<em><b>Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' reference.
	 * @see #setClass(structuralProgramMM.Class)
	 * @see structuralProgramMM.StructuralProgramMMPackage#getMethod_Class()
	 * @model required="true"
	 * @generated
	 */
	structuralProgramMM.Class getClass_();

	/**
	 * Sets the value of the '{@link structuralProgramMM.Method#getClass_ <em>Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' reference.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(structuralProgramMM.Class value);

} // Method
