package codegenrunner.wizardpages;

import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.jface.preference.DirectoryFieldEditor;
import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;

import codegenrunner.popup.handlers.CodeGeneratorHandler;

public class MyWizardPage extends WizardPage {

	private FileFieldEditor behavFile;
	private FileFieldEditor structFile;
	private DirectoryFieldEditor outDir;
	private Combo langChooser;
	public MyWizardPage(String pageName) {
		super(pageName);
		setTitle(pageName);
	}

	@Override
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.verticalSpacing = 10;
		behavFile = new FileFieldEditor("Behaviour File", "Choose Behaviour File", container);
		structFile = new FileFieldEditor("Structural File", "Choose Structural File", container);
		outDir = new DirectoryFieldEditor("OutDirectory", "Choose output Directory", container);
		langChooser = new Combo(container, SWT.READ_ONLY);
		
		langChooser.add("JAVA");
		langChooser.add("CPP");
		langChooser.select(0);
		setControl(container);
	}
	public String getBehaviourString()
	{
		return behavFile.getStringValue();
	}
	
	public String getStructureString()
	{
		return structFile.getStringValue();
	}
	
	public String getOutpathDir()
	{
		return outDir.getStringValue();
	}
	
	public String getLangChoice()
	{
		return langChooser.getText();
	}
}
