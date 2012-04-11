package at.bestsolution.efxclipse.runtime.examples.xtend;

import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class ReflectionHelper {
	public static <T> T createInstance(Class<T> cl, List<Class<?>> types, List<? extends Object> params) throws IllegalArgumentException, SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
		return cl.getConstructor(types.toArray(new Class[0])).newInstance(params.toArray());
	}
}
