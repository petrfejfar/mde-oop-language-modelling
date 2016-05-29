/**
 */
package behaviouralProgramMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviouralProgramMM.Return#getReturnexpression <em>Returnexpression</em>}</li>
 * </ul>
 *
 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getReturn()
 * @model
 * @generated
 */
public interface Return extends Statement {
	/**
	 * Returns the value of the '<em><b>Returnexpression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Returnexpression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Returnexpression</em>' reference.
	 * @see #setReturnexpression(Expression)
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getReturn_Returnexpression()
	 * @model required="true"
	 * @generated
	 */
	Expression getReturnexpression();

	/**
	 * Sets the value of the '{@link behaviouralProgramMM.Return#getReturnexpression <em>Returnexpression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Returnexpression</em>' reference.
	 * @see #getReturnexpression()
	 * @generated
	 */
	void setReturnexpression(Expression value);

} // Return
