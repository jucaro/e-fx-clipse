package org.eclipse.swt.graphics;

import java.io.InputStream;

public class Image extends Resource implements Drawable {
	private javafx.scene.image.Image image;
	
	public Image(Device device, int width, int height) {
		
	}
	
	public Image (Device device, InputStream stream) {
		
	}
	
	public Image (Device device, String filename) {
		
	}
	
	public Image(Device device, Image srcImage, int flag) {
		
	}
	
	public Image(Device device, ImageData data) {
		
	}
	
	public Image(Device device, ImageData source, ImageData mask) {
		
	}
	
	public Image(Device device, Rectangle bounds) {
		
	}
	
	public javafx.scene.image.Image internal_getImage() {
		return image;
	}
	
//	public Color getBackground() {
//		
//	}
//	
//	public Rectangle getBounds() {
//		
//	}
//	
//	public ImageData getImageData() {
//		
//	}
//	
//	public void setBackground(Color color) {
//		
//	}

	@Override
	public boolean isDisposed() {
		return image == null;
	}

	@Override
	public void dispose() {
		image = null;
	}
}
