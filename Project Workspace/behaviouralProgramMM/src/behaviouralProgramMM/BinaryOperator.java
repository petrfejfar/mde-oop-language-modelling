/**
 */
package behaviouralProgramMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Operator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviouralProgramMM.BinaryOperator#getLeftSide <em>Left Side</em>}</li>
 *   <li>{@link behaviouralProgramMM.BinaryOperator#getRightSide <em>Right Side</em>}</li>
 * </ul>
 *
 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getBinaryOperator()
 * @model abstract="true"
 * @generated
 */
public interface BinaryOperator extends Expression {
	/**
	 * Returns the value of the '<em><b>Left Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Side</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Side</em>' containment reference.
	 * @see #setLeftSide(Expression)
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getBinaryOperator_LeftSide()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getLeftSide();

	/**
	 * Sets the value of the '{@link behaviouralProgramMM.BinaryOperator#getLeftSide <em>Left Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Side</em>' containment reference.
	 * @see #getLeftSide()
	 * @generated
	 */
	void setLeftSide(Expression value);

	/**
	 * Returns the value of the '<em><b>Right Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Side</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Side</em>' containment reference.
	 * @see #setRightSide(Expression)
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getBinaryOperator_RightSide()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRightSide();

	/**
	 * Sets the value of the '{@link behaviouralProgramMM.BinaryOperator#getRightSide <em>Right Side</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Side</em>' containment reference.
	 * @see #getRightSide()
	 * @generated
	 */
	void setRightSide(Expression value);

} // BinaryOperator
