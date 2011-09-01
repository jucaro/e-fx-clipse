package at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler;

import java.io.File;

public class SetupDirectory {
	public File originalPath;
	public File relativePath;
	
	public SetupDirectory(File originalPath, File relativePath) {
		this.originalPath = originalPath;
		this.relativePath = relativePath;
	}
}
