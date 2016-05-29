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

public class OOPModelToCodeTransformation {
	Behaviour behaviour
	Program program
	def String genCode(Program prog, Behaviour behav)
	{
		program = prog
		behaviour = behav
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
	«(stmt as Loop).genCode»
	«ELSEIF stmt instanceof FunctionCall»
	«(stmt as FunctionCall).genCode»;
	«ELSEIF stmt instanceof Assignment»
	«(stmt as Assignment).genCode»;
	«ELSEIF stmt instanceof Instantiation»
	«(stmt as Instantiation).genCode»;
	«ELSEIF stmt instanceof ConditionalBranch»
	«(stmt as ConditionalBranch).genCode»
	«ENDIF»
	'''
	
	def String genCode(Loop loop)
	'''
	while («loop.loopexpression.expressionString»)
	{
	    «FOR s : loop.loopstatements»
	    «s.genCode»
	    «ENDFOR»
	}
	'''
	def String genCode(FunctionCall funcCall)
	'''«funcCall.funcName»(«funcCall.arguments.getArgList»)'''
	
	def String genCode(Assignment assign)
	'''«assign.variableName» = «assign.assignexpression.expressionString»'''
	
	def String genCode(ConditionalBranch branch)
	'''
	if(«branch.ifexpression.expressionString»)
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
	
	def String genCode(Instantiation instantiation)
	{
		var s = '''«instantiation.varType» «instantiation.varName»'''
		if(instantiation.initiationExpression != null)
		{
			s += ''' = «instantiation.initiationExpression.expressionString»'''
		}
		s
	}
	def String getArgList(EList<Expression> exprs)
	{
		var s = ""
		for(var i = 0; i < exprs.size - 1; i++)
		{
			s += exprs.get(i).expressionString + ", "
		}
		if(exprs.size > 0)
		s += exprs.get(exprs.size-1).expressionString
		s
	}
}