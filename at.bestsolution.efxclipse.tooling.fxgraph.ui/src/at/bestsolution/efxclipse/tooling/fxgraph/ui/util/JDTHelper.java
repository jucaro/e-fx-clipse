package at.bestsolution.efxclipse.tooling.fxgraph.ui.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;
import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;

import at.bestsolution.efxclipse.tooling.fxgraph.ui.contentassist.FXGraphProposalProvider;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.internal.FXGraphActivator;

public class JDTHelper {
	private static final String FIELD_KEY = FXGraphProposalProvider.class
			.getName() + ".FIELD";
	private static final String EVENT_KEY = FXGraphProposalProvider.class
			.getName() + ".EVENT";
	private static final String LIST_KEY = FXGraphProposalProvider.class
			.getName() + ".LIST";
	private static final String MAP_KEY = FXGraphProposalProvider.class
			.getName() + ".MAP";

	private Map<String, TypeData> typeCache = new HashMap<String, TypeData>();
	
	static {
		JFaceResources.getImageRegistry().put(
				FIELD_KEY,
				FXGraphActivator.imageDescriptorFromPlugin(
						"at.bestsolution.efxclipse.tooling.fxgraph.ui",
						"/icons/field_public_obj.gif"));
		JFaceResources.getImageRegistry().put(
				EVENT_KEY,
				FXGraphActivator.imageDescriptorFromPlugin(
						"at.bestsolution.efxclipse.tooling.fxgraph.ui",
						"/icons/correction_change.gif"));
		JFaceResources.getImageRegistry().put(
				LIST_KEY,
				FXGraphActivator.imageDescriptorFromPlugin(
						"at.bestsolution.efxclipse.tooling.fxgraph.ui",
						"/icons/class_hi.gif"));
		JFaceResources.getImageRegistry().put(
				MAP_KEY,
				FXGraphActivator.imageDescriptorFromPlugin(
						"at.bestsolution.efxclipse.tooling.fxgraph.ui",
						"/icons/types.gif"));
	}
	
	public static class TypeData {
		public SortedSet<Property> properties = new TreeSet<Property>();
	}
	
	public static abstract class Property implements Comparable<Property> {
		public final String name;
		public final String owner;
		public final IMethod method;

		public Property(IMethod method, String name, String owner) {
			this.method = method;
			this.name = name;
			this.owner = owner;
		}

		public abstract StyledString getDescription();

		public abstract Image getIcon();

		public abstract List<Proposal> getProposals();

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Property other = (Property) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}

		@Override
		public int compareTo(Property arg0) {
			return name.compareTo(arg0.name);
		}
	}
	
	public static class Proposal {
		public final String value;
		public final StyledString description;
		public final Image icon;

		public Proposal(String value) {
			this(value, null, null);
		}

		public Proposal(String value, StyledString description, Image icon) {
			this.value = value;
			this.description = description;
			this.icon = icon;
		}
	}
	
	public static abstract class SingleValueProperty extends Property {
		private String returnType;

		public SingleValueProperty(IMethod method, String name, String owner,
				String returnType) {
			super(method, name, owner);
			this.returnType = returnType;
		}

		public Image getIcon() {
			return JFaceResources.getImage(FIELD_KEY);
		}

		public StyledString getDescription() {
			StyledString description = new StyledString(name + " : "
					+ returnType);
			description.append(" - " + owner, StyledString.QUALIFIER_STYLER);
			return description;
		}
	}

	public static abstract class PrimitivValueProperty extends SingleValueProperty {

		public PrimitivValueProperty(IMethod method, String name, String owner,
				String returnType) {
			super(method, name, owner, returnType);
		}

	}

	public static class FloatingValueProperty extends PrimitivValueProperty {
		private static final List<Proposal> PROPOSALS = new ArrayList<Proposal>();

		static {
			PROPOSALS.add(new Proposal("1.0"));
		}

		public FloatingValueProperty(IMethod method, String name, String owner,
				String returnType) {
			super(method, name, owner, returnType);
		}

		@Override
		public List<Proposal> getProposals() {
			return PROPOSALS;
		}
	}

	public static class IntegerValueProperty extends PrimitivValueProperty {
		private static final List<Proposal> PROPOSALS = new ArrayList<Proposal>();

		static {
			PROPOSALS.add(new Proposal("1"));
		}

		public IntegerValueProperty(IMethod method, String name, String owner,
				String returnType) {
			super(method, name, owner, returnType);
		}

		@Override
		public List<Proposal> getProposals() {
			return PROPOSALS;
		}
	}

	public static class BooleanValueProperty extends PrimitivValueProperty {
		private static final List<Proposal> PROPOSALS = new ArrayList<Proposal>();

		static {
			PROPOSALS.add(new Proposal("true"));
			PROPOSALS.add(new Proposal("false"));
		}

		public BooleanValueProperty(IMethod method, String name, String owner,
				String returnType) {
			super(method, name, owner, returnType);
		}

		@Override
		public List<Proposal> getProposals() {
			return PROPOSALS;
		}
	}

	public static class StringValueProperty extends PrimitivValueProperty {
		private static final List<Proposal> PROPOSALS = new ArrayList<Proposal>();

		static {
			PROPOSALS.add(new Proposal("\"value\""));
		}

		public StringValueProperty(IMethod method, String name, String owner,
				String returnType) {
			super(method, name, owner, returnType);
		}

		@Override
		public List<Proposal> getProposals() {
			return PROPOSALS;
		}
	}

	public static class ElementValueProperty extends SingleValueProperty {

		public ElementValueProperty(IMethod method, String name, String owner,
				String returnType) {
			super(method, name, owner, returnType);
		}

		@Override
		public List<Proposal> getProposals() {
			return Collections.emptyList();
		}
	}

	public static class EventValueProperty extends Property {
		final String eventType;

		public EventValueProperty(IMethod method, String name, String owner,
				String eventType) {
			super(method, name, owner);
			this.eventType = eventType;
		}

		@Override
		public StyledString getDescription() {
			StyledString description = new StyledString(name + "("
					+ eventType.substring(eventType.lastIndexOf('.') + 1) + ")");
			description.append(" - " + owner, StyledString.QUALIFIER_STYLER);
			return description;
		}

		@Override
		public Image getIcon() {
			return JFaceResources.getImage(EVENT_KEY);
		}

		@Override
		public List<Proposal> getProposals() {
			return Collections.emptyList();
		}
	}

	public static abstract class MultiValueProperty extends Property {

		public MultiValueProperty(IMethod method, String name, String owner) {
			super(method, name, owner);
		}
	}

	public static class ListValueProperty extends MultiValueProperty {
		String elementType;

		public ListValueProperty(IMethod method, String name, String owner,
				String elementType) {
			super(method, name, owner);
			this.elementType = elementType;
		}

		@Override
		public StyledString getDescription() {
			StyledString description = new StyledString(name + " : ["
					+ elementType + "]");
			description.append(" - " + owner, StyledString.QUALIFIER_STYLER);
			return description;
		}

		@Override
		public Image getIcon() {
			return JFaceResources.getImage(LIST_KEY);
		}

		@Override
		public List<Proposal> getProposals() {
			return Collections.singletonList(new Proposal("[]"));
		}
	}

	public static class MapValueProperty extends MultiValueProperty {

		public MapValueProperty(IMethod method, String name, String owner) {
			super(method, name, owner);
		}

		@Override
		public StyledString getDescription() {
			StyledString description = new StyledString(name + " : {}");
			description.append(" - " + owner, StyledString.QUALIFIER_STYLER);
			return description;
		}

		@Override
		public Image getIcon() {
			return JFaceResources.getImage(MAP_KEY);
		}

		@Override
		public List<Proposal> getProposals() {
			return Collections.singletonList(new Proposal("{}"));
		}
	}
	
	public TypeData getTypeData(IJavaProject jproject, IType jdtType) {
		if( jdtType == null ) {
			return null;
		}
		
		TypeData data = typeCache.get(jdtType.getFullyQualifiedName());
		if (data == null) {
			try {
				List<IMethod> allMethods = new ArrayList<IMethod>();
				allMethods.addAll(Arrays.asList(jdtType.getMethods()));

				while (jdtType != null && jdtType.getSuperclassName() != null) {
					jdtType = jproject.findType(jdtType.getSuperclassName());
					if (jdtType != null) {
						allMethods.addAll(Arrays.asList(jdtType.getMethods()));
					}
				}
				data = createData(allMethods, jproject);
				typeCache.put(jdtType.getFullyQualifiedName(), data);
			} catch (JavaModelException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return data;
	}

	private TypeData createData(List<IMethod> allMethods, IJavaProject jproject)
			throws JavaModelException {
		TypeData d = new TypeData();
		for (IMethod m : allMethods) {
			if (!Flags.isPublic(m.getFlags())) {
				continue;
			}

			if (m.getElementName().startsWith("impl_")) {
				continue;
			}

			if (m.getElementName().startsWith("get")) {
				String returnSignature = Signature.toString(m.getReturnType());
				if (returnSignature
						.startsWith("javafx.event.EventHandler<? super ")
						|| returnSignature
								.startsWith("javafx.event.EventHandler<")) {
					String eventType;
					if (returnSignature
							.startsWith("javafx.event.EventHandler<? super ")) {
						eventType = returnSignature.substring(
								"javafx.event.EventHandler<? super ".length(),
								returnSignature.length() - 1);
					} else {
						eventType = returnSignature.substring(
								"javafx.event.EventHandler<".length(),
								returnSignature.length() - 1);
					}

					EventValueProperty p = new EventValueProperty(m,
							extractAttributename(m.getElementName()), m
									.getParent().getElementName(), eventType);
					d.properties.add(p);

				} else {
					String propName = extractAttributename(m.getElementName());
					String ownerName = m.getParent().getElementName();
					boolean isReadonly = isReadonlySetter(propName, allMethods);

					if ("double".equals(returnSignature)
							|| "float".equals(returnSignature)) {
						if (!isReadonly) {
							FloatingValueProperty p = new FloatingValueProperty(
									m, propName, ownerName, returnSignature);
							d.properties.add(p);
						}
					} else if ("int".equals(returnSignature)
							|| "long".equals(returnSignature)
							|| "short".equals(returnSignature)
							|| "byte".equals(returnSignature)
							|| "char".equals(returnSignature)) {
						if (!isReadonly) {
							IntegerValueProperty p = new IntegerValueProperty(
									m, propName, ownerName, returnSignature);
							d.properties.add(p);
						}
					} else {
						IType type;
						if (returnSignature.indexOf('<') == -1) {
							type = jproject.findType(returnSignature);
						} else {
							type = jproject.findType(returnSignature.substring(
									0, returnSignature.indexOf('<')));
						}

						if (type == null) {
							System.err.println("Could not detect type for '"
									+ propName + "': " + returnSignature);
							continue;
						}

						boolean isLists = false;
						boolean isMap = false;
						if ("java.util.List".equals(type
								.getFullyQualifiedName())) {
							isLists = true;
						} else {
							for (String i : type.getSuperInterfaceNames()) {
								if (i.equals("java.util.List")) {
									isLists = true;
								}
							}
						}

						if (!isLists) {
							if ("java.util.Map".equals(type
									.getFullyQualifiedName())) {
								isMap = true;
							} else {
								for (String i : type.getSuperInterfaceNames()) {
									if (i.equals("java.util.Map")) {
										isMap = true;
									}
								}
							}
						}

						if (isLists) {
							String listType;
							if (returnSignature.indexOf('<') != -1) {
								listType = returnSignature.substring(
										returnSignature.indexOf('<') + 1,
										returnSignature.lastIndexOf('>'));
							} else {
								listType = "?";
							}

							if (!propName.endsWith("Unmodifiable")) {
								ListValueProperty p = new ListValueProperty(m,
										propName, ownerName, listType);
								d.properties.add(p);
							}
						} else if (isMap) {
							MapValueProperty p = new MapValueProperty(m,
									propName, ownerName);
							d.properties.add(p);
						} else if (type.getFullyQualifiedName().equals(
								"java.lang.String")) {
							if (!isReadonly) {
								StringValueProperty p = new StringValueProperty(
										m, propName, ownerName, returnSignature);
								d.properties.add(p);
							}
						} else {
							if (!isReadonly) {
								ElementValueProperty p = new ElementValueProperty(
										m, propName, ownerName, returnSignature);
								d.properties.add(p);
							}
						}
					}
				}
			} else if (m.getElementName().startsWith("is")
					&& "Z".equals(m.getReturnType())) {
				BooleanValueProperty p = new BooleanValueProperty(m,
						extractAttributename(m.getElementName()), m.getParent()
								.getElementName(), "boolean");
				d.properties.add(p);
			}
		}
		return d;
	}
	
	private boolean isReadonlySetter(String name, List<IMethod> methods)
			throws JavaModelException {
		for (IMethod m : methods) {
			if (!m.getElementName().startsWith("set")
					|| !Flags.isPublic(m.getFlags())) {
				continue;
			}

			if (name.equals(extractAttributename(m.getElementName()))) {
				return false;
			}
		}
		return true;
	}
	
	public static String extractAttributename(String name) {
		String rv = null;
		if (name.startsWith("get") || name.startsWith("set")) {
			rv = name.substring(3);
		} else if (name.startsWith("is")) {
			rv = name.substring(2);
		}

		if (rv != null) {
			rv = rv.substring(0, 1).toLowerCase() + rv.substring(1);
		}

		return rv;
	}
}
