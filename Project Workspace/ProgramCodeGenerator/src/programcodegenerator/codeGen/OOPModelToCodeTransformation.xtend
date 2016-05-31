package programcodegenerator.codeGen

import behaviouralProgramMM.Behaviour
import structuralProgramMM.Program
import structuralProgramMM.Variable
import structuralProgramMM.Method
import org.eclipse.emf.common.util.EList
import behaviouralProgramMM.Function
import behaviouralProgramMM.Statement
import behaviouralProgramMM.FunctionCall
import behaviouralProgramMM.Expression
import behaviouralProgramMM.Assignment
import behaviouralProgramMM.ConditionalBranch
import behaviouralProgramMM.Loop
import behaviouralProgramMM.Instantiation
import behaviouralProgramMM.Return
import behaviouralProgramMM.TryCatch
import behaviouralProgramMM.RaiseException
import behaviouralProgramMM.Literal
import behaviouralProgramMM.ReadLine
import behaviouralProgramMM.FunctionCallStatement
import behaviouralProgramMM.BinaryOperator
import behaviouralProgramMM.Plus
import behaviouralProgramMM.Equals
import behaviouralProgramMM.WriteLineStatement
import behaviouralProgramMM.ReadLineStatement

public class OOPModelToCodeTransformation extends OOPModelToCodeTransformationSuperClass {
	
	override String genCode(Program prog, Behaviour behav)
	{
		fileEnding = ".java"
	'''
	«FOR c : prog.classes»
		«c.genCode»
		
	«ENDFOR»
	'''
	}
	def String genCode(structuralProgramMM.Class c)
	'''
	class «c.name»
	{
	    /* Generated class variables */
	    «FOR v : c.variables»
	    «v.genCode»;
	    «ENDFOR»
	    
	    /* Generated class methods */
	    «FOR m : c.methods»
	    «m.genCode»	
	    «ENDFOR»
	}
	'''
	
	def String genCode(Variable v)
	'''«v.type.toString» «v.name»'''
	
	def String genCode(Method m)
	{
		var s = 
		'''
		«IF m != program.mainMethod»
		«m.accesSpecifier.toString» «m.returnType.toString» «m.name»(«m.variables.getArgListString»)
		«ELSE»
		public static void main(String[] args)
		«ENDIF»'''
		s += '''		
		{
		'''
		var func = m.methodBehaviour
		s += 
		'''
		    «if (func != null) {
			'''«func.genCode»
			'''
			} else {
			'''//Could not find behaviour for method «m.class_.name».«m.name»'''
			}»
		}'''
		
		s
	}
	def String getArgListString(EList<Variable> vars)
	{
		var s = ""
		for(var i = 0; i < vars.size - 1; i++)
		{
			var v = vars.get(i)
			s += '''«v.type.toString» «v.name», '''
		}
		if(vars.size != 0)
			s += '''«vars.get(vars.size - 1).type.toString» «vars.get(vars.size - 1).name»'''
		s
	}
	
	def behaviouralProgramMM.Function getMethodBehaviour(Method m)
	{
		for(var i = 0; i < behaviour.functions.size; i++)
		{
			var currFunc = behaviour.functions.get(i)
			var FullMethodName = '''«m.class_.name».«m.name»'''
			if(currFunc.name == FullMethodName)
			{
				return currFunc
			}
		}
		null
	}
	
	def String genCode(Function func)
	'''
	«FOR stmt : func.functionBody»	
	«stmt.genCode»
	«ENDFOR»
	'''
	
	def String genCode(Statement stmt)
	'''	
	«IF stmt instanceof Loop»
	«(stmt as Loop).genCode»«ELSEIF stmt instanceof FunctionCallStatement»
	«(stmt as FunctionCallStatement).genCode»;«ELSEIF stmt instanceof Assignment»
	«(stmt as Assignment).genCode»;«ELSEIF stmt instanceof Instantiation»
	«(stmt as Instantiation).genCode»;«ELSEIF stmt instanceof ConditionalBranch»
	«(stmt as ConditionalBranch).genCode»«ELSEIF stmt instanceof Return»
	«(stmt as Return).genCode»«ELSEIF stmt instanceof TryCatch»
	«(stmt as TryCatch).genCode»«ELSEIF stmt instanceof RaiseException»
	«(stmt as RaiseException).genCode»«ENDIF»
	'''
	
	def String genCode(Expression stmt)
	'''	
	«IF stmt instanceof Literal»
	«(stmt as Literal).genCode»«ELSEIF stmt instanceof behaviouralProgramMM.Variable»
	«(stmt as behaviouralProgramMM.Variable).genCode»«ELSEIF stmt instanceof ReadLine»
	«(stmt as ReadLine).genCode»«ELSEIF stmt instanceof FunctionCall»
	«(stmt as FunctionCall).genCode»«ELSEIF stmt instanceof BinaryOperator»
	«(stmt as BinaryOperator).genCode»«ENDIF»'''
	
	def String genCode(Literal lit)
	'''«lit.value»'''
	
	def String genCode(behaviouralProgramMM.Variable vari)
	'''«vari.varName»'''
	
	def String genCode(ReadLine rl)
	'''new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in)).readLine()'''
	
	def String genCode(FunctionCall fnccl)
	'''«fnccl.funcName»(«fnccl.arguments.argList»)'''
	
	def String genCode(BinaryOperator binop)
	'''
	«IF binop instanceof Plus»
	(«binop.leftSide.genCode»+«binop.rightSide.genCode»)«ELSEIF binop instanceof Equals»
	(«binop.leftSide.genCode»==«binop.rightSide.genCode»)«ENDIF»'''
	
	
	def String genCode(Loop loop)
	'''
	while («loop.loopexpression.genCode»)
	{
	    «FOR s : loop.loopstatements»
	    «s.genCode»
	    «ENDFOR»
	}
	'''
	def String genCode(FunctionCallStatement funcCall)
	'''
	«IF funcCall instanceof WriteLineStatement»
	java.lang.System.out.println(«funcCall.arguments.argList»)«ELSEIF funcCall instanceof ReadLineStatement»
	new java.io.BufferedReader(new java.io.InputStreamReader(java.lang.System.in)).readLine()«ELSE»
	«funcCall.funcName»(«funcCall.arguments.argList»)«ENDIF»'''
	
	def String genCode(Assignment assign)
	'''«assign.variableName» = «assign.assignexpression.genCode»'''
	
	def String genCode(ConditionalBranch branch)
	'''
	if(«branch.ifexpression.genCode»)
	{
	    «FOR s : branch.ifstatements»
	    «s.genCode»
	    «ENDFOR»
	}
	«IF branch.elsestatements.size > 0»
	else
	{
	    «FOR s : branch.elsestatements»
	    «s.genCode»
	    «ENDFOR»
	}
	«ENDIF»
	'''
	def String genCode(Return ret)
	'''
	return «ret.expression.genCode»;
	'''
	def String genCode(TryCatch trycatch)
	'''
	try {
	    «FOR s : trycatch.^try»
	    «s.genCode»
	    «ENDFOR»
	} catch(Throwable e)
	{
	    «FOR s : trycatch.^catch»
	    «s.genCode»
	    «ENDFOR»
	}
	'''
	def String genCode(RaiseException raise)
	'''
	throw «raise.expression.genCode»;
	'''
	
	def String genCode(Instantiation instantiation)
	{
		var s = '''«instantiation.varType» «instantiation.varName»'''
		if(instantiation.initiationExpression != null)
		{
			s += ''' = «instantiation.initiationExpression.genCode»'''
		}
		s
	}
	def String getArgList(EList<Expression> exprs)
	{
		var s = ""
		for(var i = 0; i < exprs.size - 1; i++)
		{
			s += exprs.get(i).genCode + ", "
		}
		if(exprs.size > 0)
		s += exprs.get(exprs.size-1).genCode
		s
	}
}