/**
 */
package behaviouralProgramMM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see behaviouralProgramMM.BehaviouralProgramMMFactory
 * @model kind="package"
 * @generated
 */
public interface BehaviouralProgramMMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "behaviouralProgramMM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/behaviouralProgramMM";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "behaviouralProgramMM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BehaviouralProgramMMPackage eINSTANCE = behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl.init();

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.BehaviourImpl <em>Behaviour</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.BehaviourImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getBehaviour()
	 * @generated
	 */
	int BEHAVIOUR = 0;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__FUNCTIONS = 0;

	/**
	 * The feature id for the '<em><b>Startfunction</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR__STARTFUNCTION = 1;

	/**
	 * The number of structural features of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Behaviour</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.FunctionImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Function Body</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__FUNCTION_BODY = 1;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.StatementImpl <em>Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.StatementImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getStatement()
	 * @generated
	 */
	int STATEMENT = 2;

	/**
	 * The number of structural features of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.AssignmentImpl <em>Assignment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.AssignmentImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getAssignment()
	 * @generated
	 */
	int ASSIGNMENT = 3;

	/**
	 * The feature id for the '<em><b>Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__VARIABLE_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Assignexpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT__ASSIGNEXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Assignment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSIGNMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.ConditionalBranchImpl <em>Conditional Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.ConditionalBranchImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getConditionalBranch()
	 * @generated
	 */
	int CONDITIONAL_BRANCH = 4;

	/**
	 * The feature id for the '<em><b>Ifstatements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BRANCH__IFSTATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Elsestatements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BRANCH__ELSESTATEMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Ifexpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BRANCH__IFEXPRESSION = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Conditional Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BRANCH_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Conditional Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITIONAL_BRANCH_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.LoopImpl <em>Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.LoopImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getLoop()
	 * @generated
	 */
	int LOOP = 5;

	/**
	 * The feature id for the '<em><b>Loopstatements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__LOOPSTATEMENTS = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Loopexpression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP__LOOPEXPRESSION = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.FunctionCallImpl <em>Function Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.FunctionCallImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getFunctionCall()
	 * @generated
	 */
	int FUNCTION_CALL = 6;

	/**
	 * The feature id for the '<em><b>Func Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__FUNC_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__ARGUMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.ExpressionImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 7;

	/**
	 * The feature id for the '<em><b>Expression String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION__EXPRESSION_STRING = 0;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.InstantiationImpl <em>Instantiation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.InstantiationImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getInstantiation()
	 * @generated
	 */
	int INSTANTIATION = 8;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION__VAR_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Var Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION__VAR_TYPE = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Initiation Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION__INITIATION_EXPRESSION = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Instantiation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANTIATION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.ReturnImpl <em>Return</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.ReturnImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getReturn()
	 * @generated
	 */
	int RETURN = 9;

	/**
	 * The feature id for the '<em><b>Returnexpression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__RETURNEXPRESSION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Return</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.TryCatchImpl <em>Try Catch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.TryCatchImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getTryCatch()
	 * @generated
	 */
	int TRY_CATCH = 10;

	/**
	 * The feature id for the '<em><b>Catch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_CATCH__CATCH = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Try</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_CATCH__TRY = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Try Catch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_CATCH_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Try Catch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRY_CATCH_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.RaiseExceptionImpl <em>Raise Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.RaiseExceptionImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getRaiseException()
	 * @generated
	 */
	int RAISE_EXCEPTION = 11;

	/**
	 * The feature id for the '<em><b>Exception</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION__EXCEPTION = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Raise Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Raise Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.Behaviour <em>Behaviour</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behaviour</em>'.
	 * @see behaviouralProgramMM.Behaviour
	 * @generated
	 */
	EClass getBehaviour();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviouralProgramMM.Behaviour#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see behaviouralProgramMM.Behaviour#getFunctions()
	 * @see #getBehaviour()
	 * @generated
	 */
	EReference getBehaviour_Functions();

	/**
	 * Returns the meta object for the reference '{@link behaviouralProgramMM.Behaviour#getStartfunction <em>Startfunction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Startfunction</em>'.
	 * @see behaviouralProgramMM.Behaviour#getStartfunction()
	 * @see #getBehaviour()
	 * @generated
	 */
	EReference getBehaviour_Startfunction();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see behaviouralProgramMM.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link behaviouralProgramMM.Function#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see behaviouralProgramMM.Function#getName()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviouralProgramMM.Function#getFunctionBody <em>Function Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Function Body</em>'.
	 * @see behaviouralProgramMM.Function#getFunctionBody()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_FunctionBody();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.Statement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statement</em>'.
	 * @see behaviouralProgramMM.Statement
	 * @generated
	 */
	EClass getStatement();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.Assignment <em>Assignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assignment</em>'.
	 * @see behaviouralProgramMM.Assignment
	 * @generated
	 */
	EClass getAssignment();

	/**
	 * Returns the meta object for the attribute '{@link behaviouralProgramMM.Assignment#getVariableName <em>Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Variable Name</em>'.
	 * @see behaviouralProgramMM.Assignment#getVariableName()
	 * @see #getAssignment()
	 * @generated
	 */
	EAttribute getAssignment_VariableName();

	/**
	 * Returns the meta object for the containment reference '{@link behaviouralProgramMM.Assignment#getAssignexpression <em>Assignexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assignexpression</em>'.
	 * @see behaviouralProgramMM.Assignment#getAssignexpression()
	 * @see #getAssignment()
	 * @generated
	 */
	EReference getAssignment_Assignexpression();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.ConditionalBranch <em>Conditional Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conditional Branch</em>'.
	 * @see behaviouralProgramMM.ConditionalBranch
	 * @generated
	 */
	EClass getConditionalBranch();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviouralProgramMM.ConditionalBranch#getIfstatements <em>Ifstatements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ifstatements</em>'.
	 * @see behaviouralProgramMM.ConditionalBranch#getIfstatements()
	 * @see #getConditionalBranch()
	 * @generated
	 */
	EReference getConditionalBranch_Ifstatements();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviouralProgramMM.ConditionalBranch#getElsestatements <em>Elsestatements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elsestatements</em>'.
	 * @see behaviouralProgramMM.ConditionalBranch#getElsestatements()
	 * @see #getConditionalBranch()
	 * @generated
	 */
	EReference getConditionalBranch_Elsestatements();

	/**
	 * Returns the meta object for the containment reference '{@link behaviouralProgramMM.ConditionalBranch#getIfexpression <em>Ifexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ifexpression</em>'.
	 * @see behaviouralProgramMM.ConditionalBranch#getIfexpression()
	 * @see #getConditionalBranch()
	 * @generated
	 */
	EReference getConditionalBranch_Ifexpression();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.Loop <em>Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop</em>'.
	 * @see behaviouralProgramMM.Loop
	 * @generated
	 */
	EClass getLoop();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviouralProgramMM.Loop#getLoopstatements <em>Loopstatements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Loopstatements</em>'.
	 * @see behaviouralProgramMM.Loop#getLoopstatements()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Loopstatements();

	/**
	 * Returns the meta object for the containment reference '{@link behaviouralProgramMM.Loop#getLoopexpression <em>Loopexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Loopexpression</em>'.
	 * @see behaviouralProgramMM.Loop#getLoopexpression()
	 * @see #getLoop()
	 * @generated
	 */
	EReference getLoop_Loopexpression();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.FunctionCall <em>Function Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call</em>'.
	 * @see behaviouralProgramMM.FunctionCall
	 * @generated
	 */
	EClass getFunctionCall();

	/**
	 * Returns the meta object for the attribute '{@link behaviouralProgramMM.FunctionCall#getFuncName <em>Func Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Func Name</em>'.
	 * @see behaviouralProgramMM.FunctionCall#getFuncName()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EAttribute getFunctionCall_FuncName();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviouralProgramMM.FunctionCall#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see behaviouralProgramMM.FunctionCall#getArguments()
	 * @see #getFunctionCall()
	 * @generated
	 */
	EReference getFunctionCall_Arguments();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.Expression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expression</em>'.
	 * @see behaviouralProgramMM.Expression
	 * @generated
	 */
	EClass getExpression();

	/**
	 * Returns the meta object for the attribute '{@link behaviouralProgramMM.Expression#getExpressionString <em>Expression String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression String</em>'.
	 * @see behaviouralProgramMM.Expression#getExpressionString()
	 * @see #getExpression()
	 * @generated
	 */
	EAttribute getExpression_ExpressionString();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.Instantiation <em>Instantiation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instantiation</em>'.
	 * @see behaviouralProgramMM.Instantiation
	 * @generated
	 */
	EClass getInstantiation();

	/**
	 * Returns the meta object for the attribute '{@link behaviouralProgramMM.Instantiation#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see behaviouralProgramMM.Instantiation#getVarName()
	 * @see #getInstantiation()
	 * @generated
	 */
	EAttribute getInstantiation_VarName();

	/**
	 * Returns the meta object for the attribute '{@link behaviouralProgramMM.Instantiation#getVarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Type</em>'.
	 * @see behaviouralProgramMM.Instantiation#getVarType()
	 * @see #getInstantiation()
	 * @generated
	 */
	EAttribute getInstantiation_VarType();

	/**
	 * Returns the meta object for the containment reference '{@link behaviouralProgramMM.Instantiation#getInitiationExpression <em>Initiation Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initiation Expression</em>'.
	 * @see behaviouralProgramMM.Instantiation#getInitiationExpression()
	 * @see #getInstantiation()
	 * @generated
	 */
	EReference getInstantiation_InitiationExpression();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.Return <em>Return</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Return</em>'.
	 * @see behaviouralProgramMM.Return
	 * @generated
	 */
	EClass getReturn();

	/**
	 * Returns the meta object for the reference '{@link behaviouralProgramMM.Return#getReturnexpression <em>Returnexpression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Returnexpression</em>'.
	 * @see behaviouralProgramMM.Return#getReturnexpression()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_Returnexpression();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.TryCatch <em>Try Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Try Catch</em>'.
	 * @see behaviouralProgramMM.TryCatch
	 * @generated
	 */
	EClass getTryCatch();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviouralProgramMM.TryCatch#getCatch <em>Catch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Catch</em>'.
	 * @see behaviouralProgramMM.TryCatch#getCatch()
	 * @see #getTryCatch()
	 * @generated
	 */
	EReference getTryCatch_Catch();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviouralProgramMM.TryCatch#getTry <em>Try</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Try</em>'.
	 * @see behaviouralProgramMM.TryCatch#getTry()
	 * @see #getTryCatch()
	 * @generated
	 */
	EReference getTryCatch_Try();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.RaiseException <em>Raise Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Raise Exception</em>'.
	 * @see behaviouralProgramMM.RaiseException
	 * @generated
	 */
	EClass getRaiseException();

	/**
	 * Returns the meta object for the reference '{@link behaviouralProgramMM.RaiseException#getException <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Exception</em>'.
	 * @see behaviouralProgramMM.RaiseException#getException()
	 * @see #getRaiseException()
	 * @generated
	 */
	EReference getRaiseException_Exception();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BehaviouralProgramMMFactory getBehaviouralProgramMMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.BehaviourImpl <em>Behaviour</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.BehaviourImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getBehaviour()
		 * @generated
		 */
		EClass BEHAVIOUR = eINSTANCE.getBehaviour();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR__FUNCTIONS = eINSTANCE.getBehaviour_Functions();

		/**
		 * The meta object literal for the '<em><b>Startfunction</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOUR__STARTFUNCTION = eINSTANCE.getBehaviour_Startfunction();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.FunctionImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Function Body</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__FUNCTION_BODY = eINSTANCE.getFunction_FunctionBody();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.StatementImpl <em>Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.StatementImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getStatement()
		 * @generated
		 */
		EClass STATEMENT = eINSTANCE.getStatement();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.AssignmentImpl <em>Assignment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.AssignmentImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getAssignment()
		 * @generated
		 */
		EClass ASSIGNMENT = eINSTANCE.getAssignment();

		/**
		 * The meta object literal for the '<em><b>Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSIGNMENT__VARIABLE_NAME = eINSTANCE.getAssignment_VariableName();

		/**
		 * The meta object literal for the '<em><b>Assignexpression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSIGNMENT__ASSIGNEXPRESSION = eINSTANCE.getAssignment_Assignexpression();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.ConditionalBranchImpl <em>Conditional Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.ConditionalBranchImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getConditionalBranch()
		 * @generated
		 */
		EClass CONDITIONAL_BRANCH = eINSTANCE.getConditionalBranch();

		/**
		 * The meta object literal for the '<em><b>Ifstatements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_BRANCH__IFSTATEMENTS = eINSTANCE.getConditionalBranch_Ifstatements();

		/**
		 * The meta object literal for the '<em><b>Elsestatements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_BRANCH__ELSESTATEMENTS = eINSTANCE.getConditionalBranch_Elsestatements();

		/**
		 * The meta object literal for the '<em><b>Ifexpression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITIONAL_BRANCH__IFEXPRESSION = eINSTANCE.getConditionalBranch_Ifexpression();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.LoopImpl <em>Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.LoopImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getLoop()
		 * @generated
		 */
		EClass LOOP = eINSTANCE.getLoop();

		/**
		 * The meta object literal for the '<em><b>Loopstatements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__LOOPSTATEMENTS = eINSTANCE.getLoop_Loopstatements();

		/**
		 * The meta object literal for the '<em><b>Loopexpression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOOP__LOOPEXPRESSION = eINSTANCE.getLoop_Loopexpression();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.FunctionCallImpl <em>Function Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.FunctionCallImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getFunctionCall()
		 * @generated
		 */
		EClass FUNCTION_CALL = eINSTANCE.getFunctionCall();

		/**
		 * The meta object literal for the '<em><b>Func Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_CALL__FUNC_NAME = eINSTANCE.getFunctionCall_FuncName();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL__ARGUMENTS = eINSTANCE.getFunctionCall_Arguments();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.ExpressionImpl <em>Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.ExpressionImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getExpression()
		 * @generated
		 */
		EClass EXPRESSION = eINSTANCE.getExpression();

		/**
		 * The meta object literal for the '<em><b>Expression String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPRESSION__EXPRESSION_STRING = eINSTANCE.getExpression_ExpressionString();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.InstantiationImpl <em>Instantiation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.InstantiationImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getInstantiation()
		 * @generated
		 */
		EClass INSTANTIATION = eINSTANCE.getInstantiation();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANTIATION__VAR_NAME = eINSTANCE.getInstantiation_VarName();

		/**
		 * The meta object literal for the '<em><b>Var Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTANTIATION__VAR_TYPE = eINSTANCE.getInstantiation_VarType();

		/**
		 * The meta object literal for the '<em><b>Initiation Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANTIATION__INITIATION_EXPRESSION = eINSTANCE.getInstantiation_InitiationExpression();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.ReturnImpl <em>Return</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.ReturnImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getReturn()
		 * @generated
		 */
		EClass RETURN = eINSTANCE.getReturn();

		/**
		 * The meta object literal for the '<em><b>Returnexpression</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__RETURNEXPRESSION = eINSTANCE.getReturn_Returnexpression();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.TryCatchImpl <em>Try Catch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.TryCatchImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getTryCatch()
		 * @generated
		 */
		EClass TRY_CATCH = eINSTANCE.getTryCatch();

		/**
		 * The meta object literal for the '<em><b>Catch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_CATCH__CATCH = eINSTANCE.getTryCatch_Catch();

		/**
		 * The meta object literal for the '<em><b>Try</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRY_CATCH__TRY = eINSTANCE.getTryCatch_Try();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.RaiseExceptionImpl <em>Raise Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.RaiseExceptionImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getRaiseException()
		 * @generated
		 */
		EClass RAISE_EXCEPTION = eINSTANCE.getRaiseException();

		/**
		 * The meta object literal for the '<em><b>Exception</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAISE_EXCEPTION__EXCEPTION = eINSTANCE.getRaiseException_Exception();

	}

} //BehaviouralProgramMMPackage
