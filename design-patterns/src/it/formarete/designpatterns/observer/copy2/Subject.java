package it.formarete.designpatterns.observer.copy2;

import java.util.ArrayList;
import java.util.List;

public class Subject {
 
	private List<Observer> observers;
	
	public Subject() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer observer) {
		observers.add(observer);
		//in codice si dice sempre che è la rivista ad aggiungere l'utente
	}
	
	public void notifyObservers(String message) {
		//ora facciamo ciclo for e richiamiamo update per notificare a uttti gli abbonati la disponibilita
		
		for (Observer observer : observers) {
			observer.update(message);
		}
	}
	
	//SUBJECT AZIENDA CHE OFFRE IL SERVIZIO
}
