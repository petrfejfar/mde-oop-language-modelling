/**
 */
package structuralProgramMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link structuralProgramMM.Program#getClasses <em>Classes</em>}</li>
 *   <li>{@link structuralProgramMM.Program#getMainMethod <em>Main Method</em>}</li>
 * </ul>
 *
 * @see structuralProgramMM.StructuralProgramMMPackage#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link structuralProgramMM.Class}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see structuralProgramMM.StructuralProgramMMPackage#getProgram_Classes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<structuralProgramMM.Class> getClasses();

	/**
	 * Returns the value of the '<em><b>Main Method</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Main Method</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Method</em>' reference.
	 * @see #setMainMethod(Method)
	 * @see structuralProgramMM.StructuralProgramMMPackage#getProgram_MainMethod()
	 * @model required="true"
	 * @generated
	 */
	Method getMainMethod();

	/**
	 * Sets the value of the '{@link structuralProgramMM.Program#getMainMethod <em>Main Method</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Method</em>' reference.
	 * @see #getMainMethod()
	 * @generated
	 */
	void setMainMethod(Method value);

} // Program
