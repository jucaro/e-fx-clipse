package at.bestsolution.efxclipse.runtime.example.photoedit.resource.cdo;

import java.io.IOException;

import javax.inject.Inject;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.e4.core.services.events.IEventBroker;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOPostEventTransactionHandler;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.view.CDOAdapterPolicy;
import org.eclipse.emf.cdo.view.CDOInvalidationPolicy;
import org.eclipse.emf.cdo.view.CDOStaleReferencePolicy;
import org.eclipse.emf.cdo.view.CDOView;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.util.container.IPluginContainer;

import at.bestsolution.efxclipse.runtime.example.photoedit.core.EventTopics;
import at.bestsolution.efxclipse.runtime.example.photoedit.core.ResourceStore;
import at.bestsolution.efxclipse.runtime.example.photoedit.model.photoedit.PhotoEditApp;

@SuppressWarnings("restriction")
public class CDOStorageResource implements ResourceStore {

	@Inject
	IEventBroker eventBroker;
	
	private Resource resource;

	private IConnector connector;

	private String resourceName = "PhotoAppBusinessModel"; //$NON-NLS-1$
	private String host = "192.168.2.105"; //$NON-NLS-1$

	private CDOTransaction view;

	public CDOStorageResource() {
		host = System.getProperty("demoHost", "192.168.2.105"); //$NON-NLS-1$//$NON-NLS-2$
		System.err.println("CDO !!!!!!!!");
	}
	
	@Override
	public IStatus loadRoot(URI uri) {
		resource = getView().getResource(resourceName);
//		ResourceSet set = new ResourceSetImpl();
//		resource = set.getResource(uri, true);
		eventBroker.send(EventTopics.STORE_NEW_CONTENT, getPhotoEditApp());
		
		return Status.OK_STATUS;
	}

	public PhotoEditApp getPhotoEditApp() {
		if( resource == null ) {
			loadRoot(null);
		}
		if( resource != null ) {
			return (PhotoEditApp) resource.getContents().get(0);
		}
		return null;
	}
	
	@Override
	public IStatus save() {
		if (view instanceof CDOTransaction) {
			try {
				((CDOTransaction) view).commit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return Status.CANCEL_STATUS;
	}
	
	private CDOTransaction openTransaction(CDOSession session) {
		final CDOTransaction transaction = session.openTransaction();
		transaction.options().addChangeSubscriptionPolicy(CDOAdapterPolicy.ALL);
//		transaction.addTransactionHandler(new CDOPostEventTransactionHandler.Default() {
//			@Override
//			protected void modifiedObject(CDOTransaction tx, CDOObject object, Notification msg) {
//				try {
//					transaction.commit();
//				} catch (Exception e) {
//					System.out.println("Commit problem. Conflicts: " + transaction.getConflicts()); //$NON-NLS-1$
//					// e.printStackTrace();
//					transaction.rollback();
//				}
//			}
//		});
		return transaction;
	}
	
	private CDOView getView() {
		if( view != null ) {
			return view;
		}
		
		CDOSession session = openSession();
		view = openTransaction(session);
		
		CDOView.Options options = view.options();
		options.setStaleReferencePolicy(CDOStaleReferencePolicy.PROXY);
		options.setInvalidationPolicy(CDOInvalidationPolicy.RELAXED);
		return view;
	}
	
	private CDOSession openSession() {
		connector = (IConnector) IPluginContainer.INSTANCE.getElement(
				"org.eclipse.net4j.connectors", "tcp", host + ":2036"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$

		CDONet4jSessionConfiguration config = CDONet4jUtil.createNet4jSessionConfiguration();
		config.setConnector(connector);
		config.setRepositoryName("repo1"); //$NON-NLS-1$
		return config.openNet4jSession();
	}
}
