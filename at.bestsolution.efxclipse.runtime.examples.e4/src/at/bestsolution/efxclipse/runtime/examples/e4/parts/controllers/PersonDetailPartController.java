package at.bestsolution.efxclipse.runtime.examples.e4.parts.controllers;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.util.Duration;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.beans.IBeanValueProperty;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.e4.core.di.annotations.Optional;

import at.bestsolution.efxclipse.runtime.databinding.IJFXBeanValueProperty;
import at.bestsolution.efxclipse.runtime.databinding.JFXBeanProperties;
import at.bestsolution.efxclipse.runtime.di.FXMLLoaderFactory;
import at.bestsolution.efxclipse.runtime.examples.e4.model.Person;

@SuppressWarnings("restriction")
public class PersonDetailPartController {
	private IObservableValue master = new WritableValue();
	
	@FXML
	TextField firstname;
	
	@FXML
	TextField lastname;
	
	@FXML
	TextField street;
	
	@FXML
	TextField zip;
	
	@FXML
	TextField city;

	private FadeTransition fadeOutTransition;

	private FadeTransition fadeInTransition;
	
	@PostConstruct
	void init(@Named(FXMLLoaderFactory.CONTEXT_KEY) GridPane rootPane) {
		IJFXBeanValueProperty uiProp = JFXBeanProperties.value("text");
		
		DataBindingContext ctx = new DataBindingContext();
		ctx.bindValue(uiProp.observe(firstname), BeanProperties.value("firstname").observeDetail(master));
		ctx.bindValue(uiProp.observe(lastname), BeanProperties.value("lastname").observeDetail(master));
		ctx.bindValue(uiProp.observe(street), BeanProperties.value("street").observeDetail(master));
		ctx.bindValue(uiProp.observe(zip), BeanProperties.value("zip").observeDetail(master));
		ctx.bindValue(uiProp.observe(city), BeanProperties.value("city").observeDetail(master));
		
		fadeOutTransition = new FadeTransition(Duration.millis(500), rootPane);
        fadeOutTransition.setFromValue(1.0f);
        fadeOutTransition.setToValue(0.0f);
        fadeOutTransition.setAutoReverse(true);
        
        fadeInTransition = new FadeTransition(Duration.millis(500), rootPane);
        fadeInTransition.setFromValue(0.0f);
        fadeInTransition.setToValue(1.0f);
        fadeInTransition.setAutoReverse(true);
	}
	
	@Inject
	public void setPerson(@Optional final Person person) {
		if( fadeOutTransition != null ) {
			fadeOutTransition.setOnFinished(new EventHandler<ActionEvent>() {
				
				public void handle(ActionEvent arg0) {
					master.setValue(person);
					fadeOutTransition.setOnFinished(null);
					fadeInTransition.playFromStart();
				}
			});
			
			fadeOutTransition.playFromStart();	
		}
	}
}
