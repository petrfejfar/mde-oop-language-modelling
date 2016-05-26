/**
 */
package behaviouralProgramMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Branch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviouralProgramMM.ConditionalBranch#getIfstatements <em>Ifstatements</em>}</li>
 *   <li>{@link behaviouralProgramMM.ConditionalBranch#getElsestatements <em>Elsestatements</em>}</li>
 *   <li>{@link behaviouralProgramMM.ConditionalBranch#getIfexpression <em>Ifexpression</em>}</li>
 * </ul>
 *
 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getConditionalBranch()
 * @model
 * @generated
 */
public interface ConditionalBranch extends Statement {
	/**
	 * Returns the value of the '<em><b>Ifstatements</b></em>' containment reference list.
	 * The list contents are of type {@link behaviouralProgramMM.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifstatements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifstatements</em>' containment reference list.
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getConditionalBranch_Ifstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getIfstatements();

	/**
	 * Returns the value of the '<em><b>Elsestatements</b></em>' containment reference list.
	 * The list contents are of type {@link behaviouralProgramMM.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elsestatements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elsestatements</em>' containment reference list.
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getConditionalBranch_Elsestatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getElsestatements();

	/**
	 * Returns the value of the '<em><b>Ifexpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ifexpression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ifexpression</em>' containment reference.
	 * @see #setIfexpression(Expression)
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getConditionalBranch_Ifexpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getIfexpression();

	/**
	 * Sets the value of the '{@link behaviouralProgramMM.ConditionalBranch#getIfexpression <em>Ifexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ifexpression</em>' containment reference.
	 * @see #getIfexpression()
	 * @generated
	 */
	void setIfexpression(Expression value);

} // ConditionalBranch
