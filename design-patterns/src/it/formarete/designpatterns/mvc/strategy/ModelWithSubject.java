package it.formarete.designpatterns.mvc.strategy;

import it.formarete.designpatterns.observer.Observer;
import it.formarete.designpatterns.observer.Subject;

public class ModelWithSubject {

	public ModelWithSubject(Observer observer, String message) {
		Subject subject;
		subject = new Subject();
		subject.registerObserver(observer);
		subject.notifyObservers(message);
		}
}

//qui avrei dovuto estendere i model (sa fare il mdoel) e usa il subject come attributo di istanza
//e nel metodo set attribute