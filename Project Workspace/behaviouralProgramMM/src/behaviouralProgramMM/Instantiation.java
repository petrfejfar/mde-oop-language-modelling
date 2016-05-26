/**
 */
package behaviouralProgramMM;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instantiation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviouralProgramMM.Instantiation#getVarName <em>Var Name</em>}</li>
 *   <li>{@link behaviouralProgramMM.Instantiation#getVarType <em>Var Type</em>}</li>
 *   <li>{@link behaviouralProgramMM.Instantiation#getInitiationExpression <em>Initiation Expression</em>}</li>
 * </ul>
 *
 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getInstantiation()
 * @model
 * @generated
 */
public interface Instantiation extends Statement {
	/**
	 * Returns the value of the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Name</em>' attribute.
	 * @see #setVarName(String)
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getInstantiation_VarName()
	 * @model
	 * @generated
	 */
	String getVarName();

	/**
	 * Sets the value of the '{@link behaviouralProgramMM.Instantiation#getVarName <em>Var Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Name</em>' attribute.
	 * @see #getVarName()
	 * @generated
	 */
	void setVarName(String value);

	/**
	 * Returns the value of the '<em><b>Var Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Type</em>' attribute.
	 * @see #setVarType(String)
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getInstantiation_VarType()
	 * @model
	 * @generated
	 */
	String getVarType();

	/**
	 * Sets the value of the '{@link behaviouralProgramMM.Instantiation#getVarType <em>Var Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Type</em>' attribute.
	 * @see #getVarType()
	 * @generated
	 */
	void setVarType(String value);

	/**
	 * Returns the value of the '<em><b>Initiation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiation Expression</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiation Expression</em>' containment reference.
	 * @see #setInitiationExpression(Expression)
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getInstantiation_InitiationExpression()
	 * @model containment="true"
	 * @generated
	 */
	Expression getInitiationExpression();

	/**
	 * Sets the value of the '{@link behaviouralProgramMM.Instantiation#getInitiationExpression <em>Initiation Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiation Expression</em>' containment reference.
	 * @see #getInitiationExpression()
	 * @generated
	 */
	void setInitiationExpression(Expression value);

} // Instantiation
