/**
 */
package behaviouralProgramMM.impl;

import behaviouralProgramMM.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BehaviouralProgramMMFactoryImpl extends EFactoryImpl implements BehaviouralProgramMMFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BehaviouralProgramMMFactory init() {
		try {
			BehaviouralProgramMMFactory theBehaviouralProgramMMFactory = (BehaviouralProgramMMFactory)EPackage.Registry.INSTANCE.getEFactory(BehaviouralProgramMMPackage.eNS_URI);
			if (theBehaviouralProgramMMFactory != null) {
				return theBehaviouralProgramMMFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BehaviouralProgramMMFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviouralProgramMMFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case BehaviouralProgramMMPackage.BEHAVIOUR: return createBehaviour();
			case BehaviouralProgramMMPackage.FUNCTION: return createFunction();
			case BehaviouralProgramMMPackage.ASSIGNMENT: return createAssignment();
			case BehaviouralProgramMMPackage.CONDITIONAL_BRANCH: return createConditionalBranch();
			case BehaviouralProgramMMPackage.LOOP: return createLoop();
			case BehaviouralProgramMMPackage.FUNCTION_CALL: return createFunctionCall();
			case BehaviouralProgramMMPackage.INSTANTIATION: return createInstantiation();
			case BehaviouralProgramMMPackage.RETURN: return createReturn();
			case BehaviouralProgramMMPackage.TRY_CATCH: return createTryCatch();
			case BehaviouralProgramMMPackage.RAISE_EXCEPTION: return createRaiseException();
			case BehaviouralProgramMMPackage.READ_LINE: return createReadLine();
			case BehaviouralProgramMMPackage.PLUS: return createPlus();
			case BehaviouralProgramMMPackage.FUNCTION_CALL_STATEMENT: return createFunctionCallStatement();
			case BehaviouralProgramMMPackage.READ_LINE_STATEMENT: return createReadLineStatement();
			case BehaviouralProgramMMPackage.WRITE_LINE_STATEMENT: return createWriteLineStatement();
			case BehaviouralProgramMMPackage.EQUALS: return createEquals();
			case BehaviouralProgramMMPackage.VARIABLE: return createVariable();
			case BehaviouralProgramMMPackage.LITERAL: return createLiteral();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behaviour createBehaviour() {
		BehaviourImpl behaviour = new BehaviourImpl();
		return behaviour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assignment createAssignment() {
		AssignmentImpl assignment = new AssignmentImpl();
		return assignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionalBranch createConditionalBranch() {
		ConditionalBranchImpl conditionalBranch = new ConditionalBranchImpl();
		return conditionalBranch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Loop createLoop() {
		LoopImpl loop = new LoopImpl();
		return loop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCall createFunctionCall() {
		FunctionCallImpl functionCall = new FunctionCallImpl();
		return functionCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instantiation createInstantiation() {
		InstantiationImpl instantiation = new InstantiationImpl();
		return instantiation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Return createReturn() {
		ReturnImpl return_ = new ReturnImpl();
		return return_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TryCatch createTryCatch() {
		TryCatchImpl tryCatch = new TryCatchImpl();
		return tryCatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RaiseException createRaiseException() {
		RaiseExceptionImpl raiseException = new RaiseExceptionImpl();
		return raiseException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLine createReadLine() {
		ReadLineImpl readLine = new ReadLineImpl();
		return readLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionCallStatement createFunctionCallStatement() {
		FunctionCallStatementImpl functionCallStatement = new FunctionCallStatementImpl();
		return functionCallStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadLineStatement createReadLineStatement() {
		ReadLineStatementImpl readLineStatement = new ReadLineStatementImpl();
		return readLineStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteLineStatement createWriteLineStatement() {
		WriteLineStatementImpl writeLineStatement = new WriteLineStatementImpl();
		return writeLineStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equals createEquals() {
		EqualsImpl equals = new EqualsImpl();
		return equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Literal createLiteral() {
		LiteralImpl literal = new LiteralImpl();
		return literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviouralProgramMMPackage getBehaviouralProgramMMPackage() {
		return (BehaviouralProgramMMPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BehaviouralProgramMMPackage getPackage() {
		return BehaviouralProgramMMPackage.eINSTANCE;
	}

} //BehaviouralProgramMMFactoryImpl
