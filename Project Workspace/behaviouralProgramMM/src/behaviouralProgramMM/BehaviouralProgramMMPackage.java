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
	 * The meta object id for the '{@link behaviouralProgramMM.impl.ExpressionImpl <em>Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.ExpressionImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getExpression()
	 * @generated
	 */
	int EXPRESSION = 7;

	/**
	 * The number of structural features of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPRESSION_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Func Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__FUNC_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL__ARGUMENTS = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;


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
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETURN__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

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
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RAISE_EXCEPTION__EXPRESSION = STATEMENT_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link behaviouralProgramMM.impl.ReadLineImpl <em>Read Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.ReadLineImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getReadLine()
	 * @generated
	 */
	int READ_LINE = 12;

	/**
	 * The number of structural features of the '<em>Read Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.BinaryOperatorImpl <em>Binary Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.BinaryOperatorImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getBinaryOperator()
	 * @generated
	 */
	int BINARY_OPERATOR = 22;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR__LEFT_SIDE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR__RIGHT_SIDE = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_OPERATOR_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.ArithmeticInfixOperatorImpl <em>Arithmetic Infix Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.ArithmeticInfixOperatorImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getArithmeticInfixOperator()
	 * @generated
	 */
	int ARITHMETIC_INFIX_OPERATOR = 13;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_INFIX_OPERATOR__LEFT_SIDE = BINARY_OPERATOR__LEFT_SIDE;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_INFIX_OPERATOR__RIGHT_SIDE = BINARY_OPERATOR__RIGHT_SIDE;

	/**
	 * The number of structural features of the '<em>Arithmetic Infix Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_INFIX_OPERATOR_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Arithmetic Infix Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARITHMETIC_INFIX_OPERATOR_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.PlusImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 14;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__LEFT_SIDE = ARITHMETIC_INFIX_OPERATOR__LEFT_SIDE;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__RIGHT_SIDE = ARITHMETIC_INFIX_OPERATOR__RIGHT_SIDE;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = ARITHMETIC_INFIX_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATION_COUNT = ARITHMETIC_INFIX_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.FunctionCallStatementImpl <em>Function Call Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.FunctionCallStatementImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getFunctionCallStatement()
	 * @generated
	 */
	int FUNCTION_CALL_STATEMENT = 15;

	/**
	 * The feature id for the '<em><b>Func Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT__FUNC_NAME = STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT__ARGUMENTS = STATEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function Call Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT_FEATURE_COUNT = STATEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function Call Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_CALL_STATEMENT_OPERATION_COUNT = STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.ReadLineStatementImpl <em>Read Line Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.ReadLineStatementImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getReadLineStatement()
	 * @generated
	 */
	int READ_LINE_STATEMENT = 16;

	/**
	 * The feature id for the '<em><b>Func Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINE_STATEMENT__FUNC_NAME = FUNCTION_CALL_STATEMENT__FUNC_NAME;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINE_STATEMENT__ARGUMENTS = FUNCTION_CALL_STATEMENT__ARGUMENTS;

	/**
	 * The number of structural features of the '<em>Read Line Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINE_STATEMENT_FEATURE_COUNT = FUNCTION_CALL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Read Line Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_LINE_STATEMENT_OPERATION_COUNT = FUNCTION_CALL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.WriteLineStatementImpl <em>Write Line Statement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.WriteLineStatementImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getWriteLineStatement()
	 * @generated
	 */
	int WRITE_LINE_STATEMENT = 17;

	/**
	 * The feature id for the '<em><b>Func Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINE_STATEMENT__FUNC_NAME = FUNCTION_CALL_STATEMENT__FUNC_NAME;

	/**
	 * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINE_STATEMENT__ARGUMENTS = FUNCTION_CALL_STATEMENT__ARGUMENTS;

	/**
	 * The number of structural features of the '<em>Write Line Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINE_STATEMENT_FEATURE_COUNT = FUNCTION_CALL_STATEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Write Line Statement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WRITE_LINE_STATEMENT_OPERATION_COUNT = FUNCTION_CALL_STATEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.ComparsionOperatorImpl <em>Comparsion Operator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.ComparsionOperatorImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getComparsionOperator()
	 * @generated
	 */
	int COMPARSION_OPERATOR = 18;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARSION_OPERATOR__LEFT_SIDE = BINARY_OPERATOR__LEFT_SIDE;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARSION_OPERATOR__RIGHT_SIDE = BINARY_OPERATOR__RIGHT_SIDE;

	/**
	 * The number of structural features of the '<em>Comparsion Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARSION_OPERATOR_FEATURE_COUNT = BINARY_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Comparsion Operator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPARSION_OPERATOR_OPERATION_COUNT = BINARY_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.EqualsImpl <em>Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.EqualsImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getEquals()
	 * @generated
	 */
	int EQUALS = 19;

	/**
	 * The feature id for the '<em><b>Left Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__LEFT_SIDE = COMPARSION_OPERATOR__LEFT_SIDE;

	/**
	 * The feature id for the '<em><b>Right Side</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__RIGHT_SIDE = COMPARSION_OPERATOR__RIGHT_SIDE;

	/**
	 * The number of structural features of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FEATURE_COUNT = COMPARSION_OPERATOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATION_COUNT = COMPARSION_OPERATOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.VariableImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 20;

	/**
	 * The feature id for the '<em><b>Var Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VAR_NAME = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link behaviouralProgramMM.impl.LiteralImpl <em>Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see behaviouralProgramMM.impl.LiteralImpl
	 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getLiteral()
	 * @generated
	 */
	int LITERAL = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL__VALUE = EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_OPERATION_COUNT = EXPRESSION_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the containment reference '{@link behaviouralProgramMM.Return#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see behaviouralProgramMM.Return#getExpression()
	 * @see #getReturn()
	 * @generated
	 */
	EReference getReturn_Expression();

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
	 * Returns the meta object for the containment reference '{@link behaviouralProgramMM.RaiseException#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see behaviouralProgramMM.RaiseException#getExpression()
	 * @see #getRaiseException()
	 * @generated
	 */
	EReference getRaiseException_Expression();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.ReadLine <em>Read Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Line</em>'.
	 * @see behaviouralProgramMM.ReadLine
	 * @generated
	 */
	EClass getReadLine();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.ArithmeticInfixOperator <em>Arithmetic Infix Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arithmetic Infix Operator</em>'.
	 * @see behaviouralProgramMM.ArithmeticInfixOperator
	 * @generated
	 */
	EClass getArithmeticInfixOperator();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see behaviouralProgramMM.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.FunctionCallStatement <em>Function Call Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Call Statement</em>'.
	 * @see behaviouralProgramMM.FunctionCallStatement
	 * @generated
	 */
	EClass getFunctionCallStatement();

	/**
	 * Returns the meta object for the attribute '{@link behaviouralProgramMM.FunctionCallStatement#getFuncName <em>Func Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Func Name</em>'.
	 * @see behaviouralProgramMM.FunctionCallStatement#getFuncName()
	 * @see #getFunctionCallStatement()
	 * @generated
	 */
	EAttribute getFunctionCallStatement_FuncName();

	/**
	 * Returns the meta object for the containment reference list '{@link behaviouralProgramMM.FunctionCallStatement#getArguments <em>Arguments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arguments</em>'.
	 * @see behaviouralProgramMM.FunctionCallStatement#getArguments()
	 * @see #getFunctionCallStatement()
	 * @generated
	 */
	EReference getFunctionCallStatement_Arguments();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.ReadLineStatement <em>Read Line Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Line Statement</em>'.
	 * @see behaviouralProgramMM.ReadLineStatement
	 * @generated
	 */
	EClass getReadLineStatement();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.WriteLineStatement <em>Write Line Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Write Line Statement</em>'.
	 * @see behaviouralProgramMM.WriteLineStatement
	 * @generated
	 */
	EClass getWriteLineStatement();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.ComparsionOperator <em>Comparsion Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comparsion Operator</em>'.
	 * @see behaviouralProgramMM.ComparsionOperator
	 * @generated
	 */
	EClass getComparsionOperator();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals</em>'.
	 * @see behaviouralProgramMM.Equals
	 * @generated
	 */
	EClass getEquals();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see behaviouralProgramMM.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link behaviouralProgramMM.Variable#getVarName <em>Var Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Name</em>'.
	 * @see behaviouralProgramMM.Variable#getVarName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_VarName();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.Literal <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal</em>'.
	 * @see behaviouralProgramMM.Literal
	 * @generated
	 */
	EClass getLiteral();

	/**
	 * Returns the meta object for the attribute '{@link behaviouralProgramMM.Literal#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see behaviouralProgramMM.Literal#getValue()
	 * @see #getLiteral()
	 * @generated
	 */
	EAttribute getLiteral_Value();

	/**
	 * Returns the meta object for class '{@link behaviouralProgramMM.BinaryOperator <em>Binary Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Operator</em>'.
	 * @see behaviouralProgramMM.BinaryOperator
	 * @generated
	 */
	EClass getBinaryOperator();

	/**
	 * Returns the meta object for the containment reference '{@link behaviouralProgramMM.BinaryOperator#getLeftSide <em>Left Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Side</em>'.
	 * @see behaviouralProgramMM.BinaryOperator#getLeftSide()
	 * @see #getBinaryOperator()
	 * @generated
	 */
	EReference getBinaryOperator_LeftSide();

	/**
	 * Returns the meta object for the containment reference '{@link behaviouralProgramMM.BinaryOperator#getRightSide <em>Right Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Side</em>'.
	 * @see behaviouralProgramMM.BinaryOperator#getRightSide()
	 * @see #getBinaryOperator()
	 * @generated
	 */
	EReference getBinaryOperator_RightSide();

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
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETURN__EXPRESSION = eINSTANCE.getReturn_Expression();

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
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RAISE_EXCEPTION__EXPRESSION = eINSTANCE.getRaiseException_Expression();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.ReadLineImpl <em>Read Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.ReadLineImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getReadLine()
		 * @generated
		 */
		EClass READ_LINE = eINSTANCE.getReadLine();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.ArithmeticInfixOperatorImpl <em>Arithmetic Infix Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.ArithmeticInfixOperatorImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getArithmeticInfixOperator()
		 * @generated
		 */
		EClass ARITHMETIC_INFIX_OPERATOR = eINSTANCE.getArithmeticInfixOperator();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.PlusImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.FunctionCallStatementImpl <em>Function Call Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.FunctionCallStatementImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getFunctionCallStatement()
		 * @generated
		 */
		EClass FUNCTION_CALL_STATEMENT = eINSTANCE.getFunctionCallStatement();

		/**
		 * The meta object literal for the '<em><b>Func Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_CALL_STATEMENT__FUNC_NAME = eINSTANCE.getFunctionCallStatement_FuncName();

		/**
		 * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_CALL_STATEMENT__ARGUMENTS = eINSTANCE.getFunctionCallStatement_Arguments();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.ReadLineStatementImpl <em>Read Line Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.ReadLineStatementImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getReadLineStatement()
		 * @generated
		 */
		EClass READ_LINE_STATEMENT = eINSTANCE.getReadLineStatement();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.WriteLineStatementImpl <em>Write Line Statement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.WriteLineStatementImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getWriteLineStatement()
		 * @generated
		 */
		EClass WRITE_LINE_STATEMENT = eINSTANCE.getWriteLineStatement();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.ComparsionOperatorImpl <em>Comparsion Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.ComparsionOperatorImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getComparsionOperator()
		 * @generated
		 */
		EClass COMPARSION_OPERATOR = eINSTANCE.getComparsionOperator();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.EqualsImpl <em>Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.EqualsImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getEquals()
		 * @generated
		 */
		EClass EQUALS = eINSTANCE.getEquals();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.VariableImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Var Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VAR_NAME = eINSTANCE.getVariable_VarName();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.LiteralImpl <em>Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.LiteralImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getLiteral()
		 * @generated
		 */
		EClass LITERAL = eINSTANCE.getLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL__VALUE = eINSTANCE.getLiteral_Value();

		/**
		 * The meta object literal for the '{@link behaviouralProgramMM.impl.BinaryOperatorImpl <em>Binary Operator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see behaviouralProgramMM.impl.BinaryOperatorImpl
		 * @see behaviouralProgramMM.impl.BehaviouralProgramMMPackageImpl#getBinaryOperator()
		 * @generated
		 */
		EClass BINARY_OPERATOR = eINSTANCE.getBinaryOperator();

		/**
		 * The meta object literal for the '<em><b>Left Side</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATOR__LEFT_SIDE = eINSTANCE.getBinaryOperator_LeftSide();

		/**
		 * The meta object literal for the '<em><b>Right Side</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_OPERATOR__RIGHT_SIDE = eINSTANCE.getBinaryOperator_RightSide();

	}

} //BehaviouralProgramMMPackage
