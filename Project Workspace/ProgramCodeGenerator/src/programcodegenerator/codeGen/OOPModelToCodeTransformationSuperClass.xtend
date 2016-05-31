package programcodegenerator.codeGen

import behaviouralProgramMM.Behaviour
import structuralProgramMM.Program

public abstract class OOPModelToCodeTransformationSuperClass {
	protected Behaviour behaviour
	protected Program program
	protected String fileEnding;
	def String runCodeGeneration(Program prog, Behaviour behav)
	{
		behaviour = behav
		program = prog
		genCode(prog, behav)
	}
	def abstract String genCode(Program prog, Behaviour behav)
	
	def public String getFileEnding()
	{
		fileEnding
	}
}