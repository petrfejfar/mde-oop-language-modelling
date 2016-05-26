/**
 */
package behaviouralProgramMM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behaviour</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviouralProgramMM.Behaviour#getFunctions <em>Functions</em>}</li>
 *   <li>{@link behaviouralProgramMM.Behaviour#getStartfunction <em>Startfunction</em>}</li>
 * </ul>
 *
 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getBehaviour()
 * @model
 * @generated
 */
public interface Behaviour extends EObject {
	/**
	 * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
	 * The list contents are of type {@link behaviouralProgramMM.Function}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Functions</em>' containment reference list.
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getBehaviour_Functions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Function> getFunctions();

	/**
	 * Returns the value of the '<em><b>Startfunction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Startfunction</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startfunction</em>' reference.
	 * @see #setStartfunction(Function)
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getBehaviour_Startfunction()
	 * @model required="true"
	 * @generated
	 */
	Function getStartfunction();

	/**
	 * Sets the value of the '{@link behaviouralProgramMM.Behaviour#getStartfunction <em>Startfunction</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Startfunction</em>' reference.
	 * @see #getStartfunction()
	 * @generated
	 */
	void setStartfunction(Function value);

} // Behaviour
