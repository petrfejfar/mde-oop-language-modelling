/**
 */
package behaviouralProgramMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviouralProgramMM.Assignment#getVariableName <em>Variable Name</em>}</li>
 *   <li>{@link behaviouralProgramMM.Assignment#getAssignexpression <em>Assignexpression</em>}</li>
 * </ul>
 *
 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getAssignment()
 * @model
 * @generated
 */
public interface Assignment extends Statement {
	/**
	 * Returns the value of the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Name</em>' attribute.
	 * @see #setVariableName(String)
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getAssignment_VariableName()
	 * @model
	 * @generated
	 */
	String getVariableName();

	/**
	 * Sets the value of the '{@link behaviouralProgramMM.Assignment#getVariableName <em>Variable Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Name</em>' attribute.
	 * @see #getVariableName()
	 * @generated
	 */
	void setVariableName(String value);

	/**
	 * Returns the value of the '<em><b>Assignexpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assignexpression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assignexpression</em>' containment reference.
	 * @see #setAssignexpression(Expression)
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getAssignment_Assignexpression()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getAssignexpression();

	/**
	 * Sets the value of the '{@link behaviouralProgramMM.Assignment#getAssignexpression <em>Assignexpression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assignexpression</em>' containment reference.
	 * @see #getAssignexpression()
	 * @generated
	 */
	void setAssignexpression(Expression value);

} // Assignment
