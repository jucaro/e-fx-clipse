package at.bestsolution.efxclipse.runtime.example.photoedit.ui.control;

import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

public class TestListChange {
	public static void main(String[] args) {
		ObservableList<String> list = FXCollections.observableArrayList();
		list.addListener(new ListChangeListener<String>() {

			@Override
			public void onChanged(javafx.collections.ListChangeListener.Change<? extends String> c) {
				while( c.next() ) {
					System.err.println("Change");
					
					if( c.wasRemoved() ) {
						System.err.println("From: " + c.getFrom());
						System.err.println("To:" +  c.getTo());
						System.err.println("Removed-Size: " + c.getRemovedSize());
					}
					
					if( c.wasAdded() ) {
						System.err.println("From: " + c.getFrom());
						System.err.println("To:" +  c.getTo());
						System.err.println("Added-Size: " + c.getAddedSize());
					}
					
					
				}
			}
		});
		
		list.addAll("Hello World","Hello World1");
		System.err.println("============");
		list.setAll("Hello");
//		list.clear();
	}
}
