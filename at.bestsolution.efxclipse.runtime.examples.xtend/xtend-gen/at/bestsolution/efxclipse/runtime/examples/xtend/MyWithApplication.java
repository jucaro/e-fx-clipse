package at.bestsolution.efxclipse.runtime.examples.xtend;

import java.io.PrintStream;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class MyWithApplication extends Application {
  private PrintStream out = System.out;
  
  public void start(final Stage primaryStage) throws Exception {
    HBox _hBox = new HBox();
    final Procedure1<HBox> _function = new Procedure1<HBox>() {
        public void apply(final HBox it) {
          ObservableList<Node> _children = it.getChildren();
          TextField _textField = new TextField();
          final Procedure1<TextField> _function = new Procedure1<TextField>() {
              public void apply(final TextField it) {
                it.setId("helloField");
              }
            };
          TextField _doubleArrow = ObjectExtensions.<TextField>operator_doubleArrow(_textField, _function);
          _children.add(_doubleArrow);
          ObservableList<Node> _children_1 = it.getChildren();
          Button _button = new Button();
          final Procedure1<Button> _function_1 = new Procedure1<Button>() {
              public void apply(final Button it) {
                it.setText("Say hello");
                final Procedure1<ActionEvent> _function = new Procedure1<ActionEvent>() {
                    public void apply(final ActionEvent it) {
                      Scene _scene = primaryStage.getScene();
                      Parent _root = _scene.getRoot();
                      Node _lookup = _root.lookup("#helloField");
                      final TextField f = ((TextField) _lookup);
                      String _text = f.getText();
                      MyWithApplication.this.out.println(_text);
                    }
                  };
                it.setOnAction(new EventHandler<ActionEvent>() {
                    public void handle(ActionEvent arg0) {
                      _function.apply(arg0);
                    }
                });
              }
            };
          Button _doubleArrow_1 = ObjectExtensions.<Button>operator_doubleArrow(_button, _function_1);
          _children_1.add(_doubleArrow_1);
        }
      };
    final HBox p = ObjectExtensions.<HBox>operator_doubleArrow(_hBox, _function);
    Scene _scene = new Scene(p);
    primaryStage.setScene(_scene);
    primaryStage.setWidth(300);
    primaryStage.show();
  }
  
  public static void main(final String[] args) {
    Application.launch(args);
  }
}
