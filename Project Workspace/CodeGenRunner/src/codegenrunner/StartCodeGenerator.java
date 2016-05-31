package codegenrunner;

import java.io.BufferedWriter;
import java.nio.file.Paths;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Paths;

import org.eclipse.core.internal.resources.File;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import behaviouralProgramMM.Behaviour;
import behaviouralProgramMM.BehaviouralProgramMMPackage;
import programcodegenerator.codeGen.OOPModelToCodeTransformation;
import programcodegenerator.codeGen.OOPModelToCodeTransformationCPP;
import programcodegenerator.codeGen.OOPModelToCodeTransformationSuperClass;
import structuralProgramMM.Program;
import structuralProgramMM.StructuralProgramMMFactory;

public class StartCodeGenerator {
	public static String GenerateCode(String behaviourPath, String strucuturalPath, String OutputDir, OOPModelToCodeTransformationSuperClass TransformRunner)
	{
		IPath behavpath = new Path(behaviourPath);
		Behaviour behav = LoadBehaviour(behavpath);
		
		IPath structpath = new Path(strucuturalPath);
		Program prog = LoadProgram(structpath);
		String s = null;
		
		/* Set the transformation runner to default if not specified */
		if(TransformRunner == null)
		{
			TransformRunner = new OOPModelToCodeTransformation();
		}
		/* Check if transformation is ready to run */
		if (behav != null && prog != null)
			s = TransformRunner.runCodeGeneration(prog, behav);
		
		/* Print transformation result to file */
		if (s != null) {
			java.nio.file.Path path = java.nio.file.Paths.get(OutputDir, prog.getMainMethod().getClass_().getName().concat(TransformRunner.getFileEnding()));
			try {
				WriteToFile(s, path);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(s);
		}
		
		/*OOPModelToCodeTransformationCPP m2codeCPP = new OOPModelToCodeTransformationCPP();
		String t = null;
		if (behav != null && prog != null)
			t = m2codeCPP.genCode(prog, behav);

		if (t != null) {
			java.nio.file.Path path = java.nio.file.Paths.get(OutputDir, prog.getMainMethod().getClass_().getName().concat(".cpp"));
			try {
				WriteToFile(t, path);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println(t);
		}
		
		return s + t;*/
		return s;
	}

	static void WriteToFile(String text, java.nio.file.Path filePath) throws IOException
	{
		BufferedWriter output = null;
		try {
			java.io.File outfile = new java.io.File(filePath.toString());
			output = new BufferedWriter(new FileWriter(outfile));
			output.write(text);
			System.out.println(outfile.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (output != null) {
				output.close();
			}
		}
	}

	static Behaviour LoadBehaviour(IPath filePath) {
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
		URI fileURI = URI.createFileURI(filePath.makeAbsolute().toString());

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

	static Program LoadProgram(IPath filePath) {
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
		URI fileURI = URI.createFileURI(filePath.makeAbsolute().toString());

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
