/**
 */
package behaviouralProgramMM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviouralProgramMM.Expression#getExpressionString <em>Expression String</em>}</li>
 * </ul>
 *
 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject {
	/**
	 * Returns the value of the '<em><b>Expression String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression String</em>' attribute.
	 * @see #setExpressionString(String)
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getExpression_ExpressionString()
	 * @model
	 * @generated
	 */
	String getExpressionString();

	/**
	 * Sets the value of the '{@link behaviouralProgramMM.Expression#getExpressionString <em>Expression String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression String</em>' attribute.
	 * @see #getExpressionString()
	 * @generated
	 */
	void setExpressionString(String value);

} // Expression
