package at.bestsolution.efxclipse.tooling.fxgraph.ui.wizards;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;

import at.bestsolution.efxclipse.tooling.fxgraph.ui.internal.FXGraphActivator;
import at.bestsolution.efxclipse.tooling.fxgraph.ui.wizards.template.FXGraphElement;
import at.bestsolution.efxclipse.tooling.ui.wizards.AbstractJDTElementPage;

public class FXGraphWizardPage extends AbstractJDTElementPage<FXGraphElement> {

	protected FXGraphWizardPage(IPackageFragmentRoot froot, IPackageFragment fragment, IWorkspaceRoot fWorkspaceRoot) {
		super("fxgraph", "FXGraph File", "Create a new FXGraph File", froot, fragment, fWorkspaceRoot);
	}

	@Override
	protected ImageDescriptor getTitleAreaImage(Display display) {
		return FXGraphActivator.imageDescriptorFromPlugin(FXGraphActivator.AT_BESTSOLUTION_EFXCLIPSE_TOOLING_FXGRAPH_FXGRAPH, "/icons/title_banner.png");
	}
	
	@Override
	protected void createFields(Composite parent, DataBindingContext dbc) {
		{
			Label l = new Label(parent, SWT.NONE);
			l.setText("Root-Element");
			
			final ComboViewer viewer = new ComboViewer(parent);
			viewer.setLabelProvider(new LabelProvider() {
				@Override
				public String getText(Object element) {
					return ((IType)element).getElementName();
				}
			});
			viewer.setContentProvider(new ArrayContentProvider());
			viewer.setInput(getTypes());
			viewer.getControl().setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			
			Button button = new Button(parent, SWT.PUSH);
			button.setText("Browse ...");
			
			FXGraphElement element = getClazz();
			element.addPropertyChangeListener(new PropertyChangeListener() {
				
				@Override
				public void propertyChange(PropertyChangeEvent evt) {
					if( "fragmentRoot".equals(evt.getPropertyName()) ) {
						viewer.setInput(getTypes());
					}
				}
			});
			dbc.bindValue(ViewerProperties.singleSelection().observe(viewer), BeanProperties.value("rootElement").observe(getClazz()));
		}
	}
	
	private List<IType> getTypes() {
		List<IType> list = new ArrayList<IType>();
		
		if( getClazz().getFragmentRoot() != null ) {
			IJavaProject jp = getClazz().getFragmentRoot().getJavaProject();
			
			for(String s : new String[] {"AnchorPane", "BorderPane", "FlowPane", "GridPane", "HBox", "Region", "StackPane", "TilePane", "VBox"}) {
				try {
					IType t = jp.findType("javafx.scene.layout."+s);
					if( t != null ) {
						list.add(t);
					}
				} catch (JavaModelException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		return list;
	}

	@Override
	protected FXGraphElement createInstance() {
		return new FXGraphElement();
	}
	
	
//
//	public IPackageFragmentRoot froot;
//	public IPackageFragment pack;
//	public IWorkspaceRoot fWorkspaceRoot;
//	public String name;
//	public String rootElement;
//	
//	public FXGraphWizardPage(String pageName, String title, String description, IPackageFragmentRoot froot, IWorkspaceRoot fWorkspaceRoot) {
//		super(pageName);
//		
//		this.froot = froot;
//		this.fWorkspaceRoot = fWorkspaceRoot;
//		
//		setTitle(title);
//		setDescription(description);
//	}
//
//	@Override
//	public void createControl(Composite parent) {
//		parent = new Composite(parent, SWT.NULL);		
//		parent.setLayoutData(new GridData(GridData.FILL_BOTH));
//		parent.setLayout(new GridLayout(3, false));
//		
//		{
//			Label l = new Label(parent, SWT.NONE);
//			l.setText("Source folder");
//
//			final Text t = new Text(parent, SWT.BORDER);
//			t.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
//			t.setEditable(false);
//			
//			Button b = new Button(parent, SWT.PUSH);
//			b.setText("Browse ...");
//			b.addSelectionListener(new SelectionAdapter() {
//				@Override
//				public void widgetSelected(SelectionEvent e) {
//					IPackageFragmentRoot root = choosePackageRoot();
//					if( root != null ) {
//						froot = root;
//						t.setText(froot.getPath().makeRelative().toString());
//					}
//					validatePage();
//				}
//			});
//		}
//		
//		{
//			Label l = new Label(parent, SWT.NONE);
//			l.setText("Package");
//
//			final Text t = new Text(parent, SWT.BORDER);
//			t.setEditable(false);
//			t.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
//			
//			
//			Button b = new Button(parent, SWT.PUSH);
//			b.setText("Browse ...");
//			b.addSelectionListener(new SelectionAdapter() {
//				@Override
//				public void widgetSelected(SelectionEvent e) {
//					IPackageFragment fragment = choosePackage();
//					if( fragment != null ) {
//						pack = fragment;
//						t.setText(pack.getElementName());
//					}
//				}
//			});
//		}
//		
//		{
//			Label l = new Label(parent, SWT.NONE);
//			l.setText("Name");
//			
//			final Text t = new Text(parent, SWT.BORDER);
//			t.setEditable(true);
//			t.setLayoutData(new GridData(GridData.FILL,GridData.CENTER,true,false,2,1));
//			t.addModifyListener(new ModifyListener() {
//				
//				@Override
//				public void modifyText(ModifyEvent e) {
//					name = t.getText();
//					validatePage();
//				}
//			});
//		}
//		
//		{
//			Label l = new Label(parent, SWT.NONE);
//			l.setText("Root-Element");
//			
//			final Combo combo = new Combo(parent, SWT.READ_ONLY);
//			combo.setLayoutData(new GridData(GridData.FILL,GridData.CENTER,true,false,2,1));
//			combo.setItems(new String[] { "AnchorPane", "BorderPane", "FlowPane", "GridPane", "HBox", "Region", "StackPane", "TilePane", "VBox" });
//			combo.select(0);
//			combo.addSelectionListener(new SelectionAdapter() {
//				@Override
//				public void widgetSelected(SelectionEvent e) {
//					rootElement = combo.getText();
//				}
//			});
//			rootElement = combo.getText();
//			
//		}
//		
//		setControl(parent);
//		validatePage();
//	}
//	
//	private void validatePage() {
//		setPageComplete(froot != null && name != null && !name.isEmpty());
//	}
//	
//	private IPackageFragmentRoot choosePackageRoot() {
//		IJavaElement initElement = froot;
//		Class<?>[] acceptedClasses= new Class[] { IPackageFragmentRoot.class, IJavaProject.class };
//		TypedElementSelectionValidator validator= new TypedElementSelectionValidator(acceptedClasses, false) {
//			public boolean isSelectedValid(Object element) {
//				try {
//					if (element instanceof IJavaProject) {
//						IJavaProject jproject= (IJavaProject)element;
//						IPath path= jproject.getProject().getFullPath();
//						return (jproject.findPackageFragmentRoot(path) != null);
//					} else if (element instanceof IPackageFragmentRoot) {
//						return (((IPackageFragmentRoot)element).getKind() == IPackageFragmentRoot.K_SOURCE);
//					}
//					return true;
//				} catch (JavaModelException e) {
//					JavaPlugin.log(e.getStatus()); // just log, no UI in validation
//				}
//				return false;
//			}
//		};
//
//		acceptedClasses= new Class[] { IJavaModel.class, IPackageFragmentRoot.class, IJavaProject.class };
//		ViewerFilter filter= new TypedViewerFilter(acceptedClasses) {
//			public boolean select(Viewer viewer, Object parent, Object element) {
//				if (element instanceof IPackageFragmentRoot) {
//					try {
//						return (((IPackageFragmentRoot)element).getKind() == IPackageFragmentRoot.K_SOURCE);
//					} catch (JavaModelException e) {
//						JavaPlugin.log(e.getStatus()); // just log, no UI in validation
//						return false;
//					}
//				}
//				return super.select(viewer, parent, element);
//			}
//		};
//
//		StandardJavaElementContentProvider provider= new StandardJavaElementContentProvider();
//		ILabelProvider labelProvider= new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT);
//		ElementTreeSelectionDialog dialog= new ElementTreeSelectionDialog(getShell(), labelProvider, provider);
//		dialog.setValidator(validator);
//		dialog.setComparator(new JavaElementComparator());
//		dialog.setTitle(NewWizardMessages.NewContainerWizardPage_ChooseSourceContainerDialog_title);
//		dialog.setMessage(NewWizardMessages.NewContainerWizardPage_ChooseSourceContainerDialog_description);
//		dialog.addFilter(filter);
//		dialog.setInput(JavaCore.create(fWorkspaceRoot));
//		dialog.setInitialSelection(initElement);
//		dialog.setHelpAvailable(false);
//
//		if (dialog.open() == Window.OK) {
//			Object element= dialog.getFirstResult();
//			if (element instanceof IJavaProject) {
//				IJavaProject jproject= (IJavaProject)element;
//				return jproject.getPackageFragmentRoot(jproject.getProject());
//			} else if (element instanceof IPackageFragmentRoot) {
//				return (IPackageFragmentRoot)element;
//			}
//			return null;
//		}
//		return null;
//	}
//	
//	private IPackageFragment choosePackage() {
//		IJavaElement[] packages= null;
//		try {
//			if (froot != null && froot.exists()) {
//				packages= froot.getChildren();
//			}
//		} catch (JavaModelException e) {
//			e.printStackTrace();
//		}
//		if (packages == null) {
//			packages= new IJavaElement[0];
//		}
//
//		ElementListSelectionDialog dialog= new ElementListSelectionDialog(getShell(), new JavaElementLabelProvider(JavaElementLabelProvider.SHOW_DEFAULT));
//		dialog.setIgnoreCase(false);
//		dialog.setTitle("Choose Package");
//		dialog.setMessage("Choose a Package");
//		dialog.setEmptyListMessage("You need to select a package");
//		dialog.setElements(packages);
//		dialog.setHelpAvailable(false);
//
//		IPackageFragment pack= this.pack;
//		if (pack != null) {
//			dialog.setInitialSelections(new Object[] { pack });
//		}
//
//		if (dialog.open() == Window.OK) {
//			return (IPackageFragment) dialog.getFirstResult();
//		}
//		return null;
//	}

}
