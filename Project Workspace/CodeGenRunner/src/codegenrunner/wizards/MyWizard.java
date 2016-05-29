package codegenrunner.wizards;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;

import codegenrunner.wizardpages.MyWizardPage;

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
		String s = codegenrunner.StartCodeGenerator.GenerateCode(
					(_p1).getBehaviourString(), 
					(_p1).getStructureString(), 
					(_p1).getOutpathDir());
	  
		return !s.equalsIgnoreCase("");
	}

}
