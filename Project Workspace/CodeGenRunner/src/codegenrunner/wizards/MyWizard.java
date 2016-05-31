package codegenrunner.wizards;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;

import behaviouralProgramMM.Behaviour;
import codegenrunner.wizardpages.MyWizardPage;
import programcodegenerator.codeGen.OOPModelToCodeTransformation;
import programcodegenerator.codeGen.OOPModelToCodeTransformationCPP;
import programcodegenerator.codeGen.OOPModelToCodeTransformationSuperClass;
import structuralProgramMM.Program;

public class MyWizard extends Wizard {
	
	protected WizardPage p1;
	
	public MyWizard()
	{
		super();
		setNeedsProgressMonitor(true);
	}
	@Override
	public void addPages()
	{
		p1 = new MyWizardPage("My Code Generator");
		addPage(p1);
	}

	@Override
	public boolean performFinish() {
		MyWizardPage _p1 = (MyWizardPage)p1;
		OOPModelToCodeTransformationSuperClass runner = null;
		switch (_p1.getLangChoice()) {
		case "JAVA":
			runner = new OOPModelToCodeTransformation();
			break;
		case "CPP":
			runner = new OOPModelToCodeTransformationCPP();
			break;
		default:
			break;
		}
		String s = codegenrunner.StartCodeGenerator.GenerateCode(
					(_p1).getBehaviourString(), 
					(_p1).getStructureString(), 
					(_p1).getOutpathDir(), runner);
	  
		return !s.equalsIgnoreCase("");
	}

}
