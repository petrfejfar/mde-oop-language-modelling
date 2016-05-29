package codegenrunner.popup.handlers;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

import behaviouralProgramMM.Behaviour;
import behaviouralProgramMM.BehaviouralProgramMMPackage;
import codegenrunner.wizards.MyWizard;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import programcodegenerator.codeGen.*;
import structuralProgramMM.Program;
import structuralProgramMM.StructuralProgramMMFactory;

public class CodeGeneratorHandler extends AbstractHandler {

	private final String BEHAVIOURFILEEXTENSION = "behaviouralprogrammm";
	private final String STRUCTURALFILEEXTENSION = "structuralprogrammm";

	// Some error checking
	boolean NoUserErrors(Object[] selections) throws Exception {
		if (selections.length != 2) {
			throw new Exception("Please, select only one behaviour file and one structural file");
		}
		for (Object e : selections) {
			if (!(e instanceof IFile)) {
				throw new Exception("Something selected that is not a file!");
			}
		}

		return true;

	}

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {

		IWorkbench wb = PlatformUI.getWorkbench(); 
		IWorkbenchWindow win = wb.getActiveWorkbenchWindow(); 
		WizardDialog wDia = new WizardDialog(win.getShell(), new MyWizard());
		wDia.open();
		/*ISelection selection = HandlerUtil.getCurrentSelection(event);
		if (selection instanceof IStructuredSelection) {
			Object[] elements = ((IStructuredSelection) selection).toArray();

			try {
				if (NoUserErrors(elements)) {
					IFile behaviourModelInstanceFile = null;
					IFile structureModelInstance = null;
					for (Object e : elements) {
						IPath tempPath = ((IFile) e).getFullPath();
						if (tempPath.getFileExtension().equalsIgnoreCase(BEHAVIOURFILEEXTENSION)) {
							behaviourModelInstanceFile = (IFile) e;
							continue;
						} else if (tempPath.getFileExtension().equalsIgnoreCase(STRUCTURALFILEEXTENSION)) {
							structureModelInstance = (IFile) e;
							continue;
						} else {
							throw new Exception("Invalid file types selected");
						}
					}
					Behaviour b = LoadBehaviour(behaviourModelInstanceFile);
					structuralProgramMM.Program prog = LoadProgram(structureModelInstance);
					OOPModelToCodeTransformation m2code = new OOPModelToCodeTransformation();
					String s = null;
					if (b != null && prog != null)
						s = m2code.genCode(prog, b);

					if (s != null) {
						// TODO: output string to file
						Path path = Paths.get(prog.getMainMethod().getClass_().getName().concat(".java"));
						BufferedWriter output = null;
						try {
							File outfile = new File(path.toString());
							output = new BufferedWriter(new FileWriter(outfile));
							output.write(s);
							System.out.println(outfile.getAbsolutePath());
						} catch (IOException e) {
							e.printStackTrace();
						} finally {
							if (output != null) {
								output.close();
							}
						}
						System.out.println(s);
					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		return null;
	}


	static Behaviour LoadBehaviour(IFile file) {
		/*
		 * http://rtsys.informatik.uni-kiel.de/confluence/pages/viewpage.action?
		 * pageId=10751683
		 */
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package -- only needed for stand-alone!
		// You find the correct name of the package in the generated model code
		BehaviouralProgramMMPackage behaviourPackage = BehaviouralProgramMMPackage.eINSTANCE;

		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(file.getRawLocation().makeAbsolute().toString());

		// Demand load the resource for this file, here the actual loading is
		// done.
		Resource resource = resourceSet.getResource(fileURI, true);

		// get model elements from the resource
		// note: get(0) might be dangerous. why?
		EObject myModelObject = resource.getContents().get(0);

		// Do something with the model
		if (myModelObject instanceof Behaviour) {
			return (Behaviour) myModelObject;
		}
		return null;
	}

	static Program LoadProgram(IFile file) {
		/*
		 * http://rtsys.informatik.uni-kiel.de/confluence/pages/viewpage.action?
		 * pageId=10751683
		 */
		// Create a resource set.
		ResourceSet resourceSet = new ResourceSetImpl();

		// Register the default resource factory -- only needed for stand-alone!
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
				.put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());

		// Register the package -- only needed for stand-alone!
		// You find the correct name of the package in the generated model code
		StructuralProgramMMFactory structuralPackage = StructuralProgramMMFactory.eINSTANCE;

		// Get the URI of the model file.
		URI fileURI = URI.createFileURI(file.getRawLocation().makeAbsolute().toString());

		// Demand load the resource for this file, here the actual loading is
		// done.
		Resource resource = resourceSet.getResource(fileURI, true);

		// get model elements from the resource
		// note: get(0) might be dangerous. why?
		EObject myModelObject = resource.getContents().get(0);

		// Do something with the model
		if (myModelObject instanceof Program) {
			return (Program) myModelObject;
		}
		return null;
	}
}
