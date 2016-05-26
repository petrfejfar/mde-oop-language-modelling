/**
 */
package behaviouralProgramMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviouralProgramMM.Function#getName <em>Name</em>}</li>
 *   <li>{@link behaviouralProgramMM.Function#getFunctionBody <em>Function Body</em>}</li>
 * </ul>
 *
 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getFunction()
 * @model
 * @generated
 */
public interface Function extends EObject {
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
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getFunction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link behaviouralProgramMM.Function#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Function Body</b></em>' containment reference list.
	 * The list contents are of type {@link behaviouralProgramMM.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Body</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Body</em>' containment reference list.
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getFunction_FunctionBody()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getFunctionBody();

} // Function
