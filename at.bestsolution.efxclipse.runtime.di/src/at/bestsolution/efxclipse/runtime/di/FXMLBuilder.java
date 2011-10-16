package at.bestsolution.efxclipse.runtime.di;

import java.io.IOException;
import java.util.ResourceBundle;

import javafx.util.BuilderFactory;

public interface FXMLBuilder<N> {
	FXMLBuilder<N> resourceBundle(ResourceBundle resourceBundle);
	FXMLBuilder<N> builderFactory(BuilderFactory builderFactory);
	N load() throws IOException;
}
