package at.bestsolution.efxclipse.tooling.jdt.ui.internal.handler;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

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
	}
}
