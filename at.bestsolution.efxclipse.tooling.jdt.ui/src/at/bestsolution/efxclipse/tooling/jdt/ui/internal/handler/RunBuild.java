package at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RunBuild {
	public void run(Map<String, Object> properties) {
		AntTemplate template = new AntTemplate();
		String out = template.generateAnt(properties);
		System.err.println(out);
	}
	
	public static void main(String[] args) {
		Map<String, Object> properties = new HashMap<String, Object>();
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
		
		RunBuild b = new RunBuild();
		b.run(properties);
	}
}
