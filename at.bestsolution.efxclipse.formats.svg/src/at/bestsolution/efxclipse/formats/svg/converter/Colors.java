package at.bestsolution.efxclipse.formats.svg.converter;

public enum Colors {
	WHITE("#ffffff"),
	BLACK("#000000");
	
	public final String hexvalue;
	public final double red;
	public final double green;
	public final double blue;
	
	private Colors(String hex) {
		hexvalue = hex;
		red = hexRed(hex);
		green = hexGreen(hex);
		blue = hexBlue(hex);
	}
	
	public static double hexRed(String color) {
		if( color.length() == 4 ) {
			return Integer.valueOf(color.substring(1,2) + color.substring(1,2),16) / 255.0;
		}
		return Integer.valueOf(color.substring(1,3),16) / 255.0;
	}
	
	public static double hexGreen(String color) {
		if( color.length() == 4 ) {
			return Integer.valueOf(color.substring(2,3) + color.substring(2,3),16) / 255.0;
		}
		return Integer.valueOf(color.substring(3,5),16) / 255.0;
	}
	
	public static double hexBlue(String color) {
		if( color.length() == 4 ) {
			return Integer.valueOf(color.substring(3,4) + color.substring(3,4),16) / 255.0;
		}
		return Integer.valueOf(color.substring(5,7),16) / 255.0;
	}
	
	public static Colors findColorByHex(String hex) {
		for( Colors c : values() ) {
			if( c.hexvalue.equals(hex) ) {
				return c;
			}
		}
		return null;
	}
	
	public static Colors findColorByName(String name) {
		for( Colors c : values() ) {
			if( c.name().toUpperCase().equals(name.toUpperCase()) ) {
				return c;
			}
		}
		return null;
	}
}
