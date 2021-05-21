package it.formarete.designpatterns.mvc.god;

import java.util.ArrayList;
import java.util.List;

import it.formarete.designpatterns.mvc.Model;
import it.formarete.designpatterns.mvc.View;
import it.formarete.designpatterns.observer.Observer;

public class GodModel implements Model {

	private String attribute;
	
	private List<Observer> observers;
	
	
	public GodModel() {
		observers = new ArrayList<Observer>();
	}
	
	@Override
	public String getAttribute() {
		// TODO Auto-generated method stub
		return attribute;
	}

	@Override
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	
	
	public void notifyObservers(String message) {
		//ora facciamo ciclo for e richiamiamo update per notificare a uttti gli abbonati la disponibilita
		
		for (Observer observer : observers) {
			observer.update(message);
		}
	}

	public void registerObserver(View view) {
		
	}

}
