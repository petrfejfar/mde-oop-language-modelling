/**
 */
package behaviouralProgramMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Raise Exception</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviouralProgramMM.RaiseException#getException <em>Exception</em>}</li>
 * </ul>
 *
 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getRaiseException()
 * @model
 * @generated
 */
public interface RaiseException extends Statement {
	/**
	 * Returns the value of the '<em><b>Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' reference.
	 * @see #setException(Expression)
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getRaiseException_Exception()
	 * @model required="true"
	 * @generated
	 */
	Expression getException();

	/**
	 * Sets the value of the '{@link behaviouralProgramMM.RaiseException#getException <em>Exception</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(Expression value);

} // RaiseException
