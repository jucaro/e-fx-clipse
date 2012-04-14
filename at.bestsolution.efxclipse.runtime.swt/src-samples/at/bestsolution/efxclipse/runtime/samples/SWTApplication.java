package at.bestsolution.efxclipse.runtime.samples;

import javafx.application.Application;
import javafx.stage.Stage;

public abstract class SWTApplication extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		run();
	}

	public abstract void run();

	public void spinEventLoop() {

	}
}
