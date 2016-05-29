/**
 */
package behaviouralProgramMM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Try Catch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link behaviouralProgramMM.TryCatch#getCatch <em>Catch</em>}</li>
 *   <li>{@link behaviouralProgramMM.TryCatch#getTry <em>Try</em>}</li>
 * </ul>
 *
 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getTryCatch()
 * @model
 * @generated
 */
public interface TryCatch extends Statement {
	/**
	 * Returns the value of the '<em><b>Catch</b></em>' containment reference list.
	 * The list contents are of type {@link behaviouralProgramMM.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Catch</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Catch</em>' containment reference list.
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getTryCatch_Catch()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getCatch();

	/**
	 * Returns the value of the '<em><b>Try</b></em>' containment reference list.
	 * The list contents are of type {@link behaviouralProgramMM.Statement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Try</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Try</em>' containment reference list.
	 * @see behaviouralProgramMM.BehaviouralProgramMMPackage#getTryCatch_Try()
	 * @model containment="true"
	 * @generated
	 */
	EList<Statement> getTry();

} // TryCatch
