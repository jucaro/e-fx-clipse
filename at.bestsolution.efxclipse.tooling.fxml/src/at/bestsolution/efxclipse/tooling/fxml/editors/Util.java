package at.bestsolution.efxclipse.tooling.fxml.editors;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.wst.xml.core.internal.provisional.document.IDOMNode;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.ProcessingInstruction;

@SuppressWarnings("restriction")
public class Util {
	public static IJavaProject findProject(Document xmlDoc) {
		String baseLocation = ((IDOMNode) xmlDoc).getModel().getBaseLocation();
		IFile f = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(baseLocation));
		return JavaCore.create(f.getProject());
	}
	
	public static List<String> getImportedTypes(Document xmlDoc) {
		NodeList list = xmlDoc.getChildNodes();

		List<String> imports = new ArrayList<String>();
		for (int i = 0; i < list.getLength(); i++) {
			Node n = list.item(i);
			if (n.getNodeType() == Node.PROCESSING_INSTRUCTION_NODE) {
				String data = ((ProcessingInstruction) n).getData();
				if (data.endsWith("?")) {
					data = data.substring(0, data.length() - 1);
				}
				imports.add(data);
			}
		}
		return imports;
	}
	
	public static IType findType(String name, Document xmlDoc) {
		IJavaProject jpProject = findProject(xmlDoc);
		List<String> imports = getImportedTypes(xmlDoc);

		for (String i : imports) {
			if (i.endsWith("." + name)) {
				try {
					IType t = jpProject.findType(i);
					if (t != null) {
						return t;
					}
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		for (String i : imports) {
			if (i.endsWith("*")) {
				try {
					IType t = jpProject.findType(i.substring(0, i.length() - 1) + name);
					if (t != null) {
						return t;
					}
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}

		return null;
	}
}
