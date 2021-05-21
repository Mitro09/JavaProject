package it.formarete.designpatterns.mvc.decorator;

import java.util.ArrayList;
import java.util.List;

import it.formarete.designpatterns.mvc.Model;
import it.formarete.designpatterns.mvc.View;
import it.formarete.designpatterns.observer.Observer;

public class ObservableDecorator implements Model{
	
	//Quando noi vogliamo far passare i dati per questo decorator facciamo cose in piu
	private Model model; //come variabile ha quello che sta decorando per ricordarselo
	private List<Observer> observers; //tutta la gestione degli observer se la farà observable decorator

	public ObservableDecorator(Model model) {
		super();
		observers = new ArrayList<Observer>();
		this.model = model;
		
	}

	@Override
	public String getAttribute() {
		// TODO Auto-generated method stub
		return model.getAttribute();
	}

	@Override
	public void setAttribute(String attribute) {
		model.setAttribute(attribute);
		notifyObservers(model.getAttribute());
		
	}

	public void notifyObservers(String message) {
		//ora facciamo ciclo for e richiamiamo update per notificare a uttti gli abbonati la disponibilita
		
		for (Observer observer : observers) {
			observer.update(message);
		}
	}

	public void registerObserver(Observer observer) {
		observers.add(observer);
	}
}


//Java di suo ha delle classi che ci consentono di rispondere a delle richieste http