package it.formarete.designpatterns.observer;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ObserverTest {

	@Test
	public void TestObserver() {
		//given
		Subject subject = new Subject();
		Observer observer = new ObserverImpl();
		subject.registerObserver(observer); //il soggetto, la rivista, aggiunge un abbonato. E non come nel mondo reale dove noi diciamo 
		//abbiamo creato observer e soggetto, e li abbiamo legati con il metodo (aggiunto osservatore al soggetto)
		
		//when
		//ei soggetto, ora notifica con un metodo tutti i tuoi abbonati
		subject.notifyObservers("Hello World");
		
		//then
		assertEquals("Hello World", ((ObserverImpl)observer).getMessage());
	}
}
