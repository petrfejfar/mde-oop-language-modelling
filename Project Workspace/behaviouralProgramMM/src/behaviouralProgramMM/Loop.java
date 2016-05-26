/**
 */
package behaviouralProgramMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviouralProgramMM.Loop#getLoopstatements <em>Loopstatements</em>}</li>
 *   <li>{@link behaviouralProgramMM.Loop#getLoopexpression <em>Loopexpression</em>}</li>
 * </ul>
 *
 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getLoop()
 * @model
 * @generated
 */
public interface Loop extends Statement {
	/**
	 * Returns the value of the '<em><b>Loopstatements</b></em>' containment reference list.
	 * The list contents are of type {@link behaviouralProgramMM.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loopstatements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loopstatements</em>' containment reference list.
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getLoop_Loopstatements()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getLoopstatements();

	/**
	 * Returns the value of the '<em><b>Loopexpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loopexpression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loopexpression</em>' containment reference.
	 * @see #setLoopexpression(Expression)
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getLoop_Loopexpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLoopexpression();

	/**
	 * Sets the value of the '{@link behaviouralProgramMM.Loop#getLoopexpression <em>Loopexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loopexpression</em>' containment reference.
	 * @see #getLoopexpression()
	 * @generated
	 */
	void setLoopexpression(Expression value);

} // Loop
