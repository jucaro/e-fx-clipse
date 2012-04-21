package at.bestsolution.efxclipse.tooling.model;

public interface IFXPrimitiveProperty extends IFXProperty {
	public enum Type {
		DOUBLE("double"),
		FLOAT("float"),
		LONG("long"),
		INTEGER("integer"),
		CHAR("char"),
		SHORT("short"),
		BYTE("byte"),
		BOOLEAN("boolean"),
		STRING("java.lang.String");
		
		private final String jvmType;
		
		private Type(String jvmType) {
			this.jvmType = jvmType;
		}
		
		public static Type parseType(String type) {
			for( Type t : values() ) {
				if( t.jvmType.equals(type) ) {
					return t;
				}
			}
			return null;
		}
	}
	
	public Type getType();
}
