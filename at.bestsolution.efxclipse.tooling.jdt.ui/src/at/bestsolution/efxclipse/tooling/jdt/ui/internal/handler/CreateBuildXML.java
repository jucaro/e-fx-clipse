package at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CreateBuildXML {
	public File run(Map<String,Object> properties) {
		AntTemplate template = new AntTemplate();
		String out = template.generateAnt(properties);
		
		File f = new File((String) properties.get("jfx.build.stagingdir"));
		if( !f.exists() ) {
			f.mkdirs();
		}
		
		FileWriter outFile = null;
		try {
			File buildFile = new File(f,"build.xml");
			outFile = new FileWriter(buildFile);
			outFile.write(out);
			outFile.close();
			outFile = null;
			return buildFile;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if( outFile != null ) {
				try {
					outFile.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
//		System.err.println(out);
	}
	
	public static void main(String[] args) {
		Map<String,Object> properties = new HashMap<String, Object>();
		properties.put("projectName","TestExport");
		properties.put("appVendor", "BestSolution.at");
		properties.put("appTitle","Test Java FX application");
		properties.put("appVersion","1.0");
		
		properties.put("jfxSdk", "C:/Program Files (x86)/Oracle/JavaFX 2.0 SDK");
		properties.put("applicationClass", "at.bestsolution.TextExport");
		properties.put("appletWith", 600);
		properties.put("appletHeight", 600);
		
		Set<String> projectRefSourceDirs = new HashSet<String>();
		projectRefSourceDirs.add("RefProject/src");
		properties.put("projectRefSourceDirs",projectRefSourceDirs);
		
		Set<String> externalLibs = new HashSet<String>();
		externalLibs.add("lib.jar");
		properties.put("externalLibs",externalLibs);
		
		Set<String> projectDirs = new HashSet<String>();
		projectDirs.add("src");
		properties.put("projectSourceDirs",projectDirs);
		
		CreateBuildXML b = new CreateBuildXML();
		b.run(properties);
	}
}
