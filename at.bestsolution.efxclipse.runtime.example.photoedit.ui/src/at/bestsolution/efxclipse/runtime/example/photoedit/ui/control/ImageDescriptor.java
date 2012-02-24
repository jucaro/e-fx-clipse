package at.bestsolution.efxclipse.runtime.example.photoedit.ui.control;

import java.io.InputStream;

import javafx.scene.image.Image;

public abstract class ImageDescriptor {
	public interface InputStreamProvider {
		public InputStream getStream();
	}
	
	private Image image;
	
	public Image getImage() {
		if( image == null ) {
			image = doCreateImage();
		}
		
		return image;
	}
	
	protected abstract Image doCreateImage();
	
	public static ImageDescriptor fromUrl(final String url) {
		return new ImageDescriptor() {
			
			@Override
			protected Image doCreateImage() {
				return new Image(url);
			}
		};
	}
	
	public static ImageDescriptor fromUrl(final String url, final boolean backgroundLoading) {
		return new ImageDescriptor() {
			
			@Override
			protected Image doCreateImage() {
				return new Image(url, backgroundLoading);
			}
		};
	}
	
	public static ImageDescriptor fromUrl(final String url, final double requestedWidth, final double requestedHeight, final boolean preserviceRatio, final boolean smooth) {
		return new ImageDescriptor() {
			
			@Override
			protected Image doCreateImage() {
				return new Image(url,requestedWidth,requestedHeight,preserviceRatio,smooth);
			}
		};
	}
	
	public static ImageDescriptor fromUrl(final String url, final double requestedWidth, final double requestedHeight, final boolean preserviceRatio, final boolean smooth, final boolean backgroundLoading) {
		return new ImageDescriptor() {
			
			@Override
			protected Image doCreateImage() {
				return new Image(url,requestedWidth,requestedHeight,preserviceRatio,smooth,backgroundLoading);
			}
		};
	}
	
	public static ImageDescriptor fromInputStream(final InputStream stream) {
		return new ImageDescriptor() {
			
			@Override
			protected Image doCreateImage() {
				return new Image(stream);
			}
		};
	}
	
	public static ImageDescriptor fromInputStream(final InputStream stream, final double requestedWidth, final double requestedHeight, final boolean preserviceRatio, final boolean smooth) {
		return new ImageDescriptor() {
			
			@Override
			protected Image doCreateImage() {
				return new Image(stream,requestedWidth,requestedHeight,preserviceRatio,smooth);
			}
		};
	}
	
	public static ImageDescriptor fromInputStreamProvider(final InputStreamProvider provider) {
		return new ImageDescriptor() {
			
			@Override
			protected Image doCreateImage() {
				return new Image(provider.getStream());
			}
		};
	}
	
	public static ImageDescriptor fromInputStreamProvider(final InputStreamProvider provider, final double requestedWidth, final double requestedHeight, final boolean preserviceRatio, final boolean smooth) {
		return new ImageDescriptor() {
			
			@Override
			protected Image doCreateImage() {
				return new Image(provider.getStream(),requestedWidth,requestedHeight,preserviceRatio,smooth);
			}
		};
	}
}