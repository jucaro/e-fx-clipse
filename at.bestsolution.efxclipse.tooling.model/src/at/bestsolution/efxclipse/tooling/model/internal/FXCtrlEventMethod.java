package at.bestsolution.efxclipse.tooling.model.internal;

import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.osgi.service.log.LogService;

import at.bestsolution.efxclipse.tooling.model.FXPlugin;
import at.bestsolution.efxclipse.tooling.model.IFXCtrlEventMethod;
import at.bestsolution.efxclipse.tooling.model.Visibility;
import at.bestsolution.efxclipse.tooling.model.internal.utils.Util;

public class FXCtrlEventMethod implements IFXCtrlEventMethod {
	private FXCtrlClass clazz;
	private IMethod method;
	private String erasedFQNType;
	
	public FXCtrlEventMethod(FXCtrlClass clazz, IMethod method, String erasedFQNType) {
		this.clazz = clazz;
		this.method = method;
		this.erasedFQNType = erasedFQNType;
	}
	
	@Override
	public IJavaElement getJavaElement() {
		return method;
	}
	
	@Override
	public String getName() {
		return method.getElementName();
	}
	
	@Override
	public boolean hasArgument() {
		return erasedFQNType != null;
	}
	
	public IType getArgumentType() {
		try {
			return clazz.getJavaProject().findType(erasedFQNType);
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public Visibility getVisibility() {
		try {
			int flags = method.getFlags();
			
			if( Flags.isPublic(flags) ) {
				return Visibility.PUBLIC;
			} else if( Flags.isPackageDefault(flags) ) {
				return Visibility.PACKAGE;
			} else if( Flags.isProtected(flags) ) {
				return Visibility.PROTECTED;
			} else {
				return Visibility.PRIVATE;
			}
		} catch(JavaModelException e ) {
			FXPlugin.getLogger().log(LogService.LOG_ERROR, "Unable to retrieve visibility for method '"+method+"'", e);
		}
		
		return Visibility.PRIVATE;
	}
	
	public static boolean isEventMethod(IJavaProject jp, String erasedFQNType) throws JavaModelException {
		String checkType = erasedFQNType;
		
		do {
			if ("javafx.event.Event".equals(checkType)) {
				return true;
			}

			IType t = jp.findType(checkType);
			checkType = t.getSuperclassName();

			if (checkType != null) {
				checkType = Util.getFQNType(t, checkType);
			}
		} while(checkType != null);
		
		return false;
	}
}
