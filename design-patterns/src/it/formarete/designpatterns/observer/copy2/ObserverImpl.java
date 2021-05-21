package it.formarete.designpatterns.observer.copy2;

public class ObserverImpl implements Observer {

	private String message;
	
	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		//sa aggiornarsi a partire da un messaggio che gli viene inviato
		//vogliamo che si salvi il messaggio come attributo d'istanza, quindi creo variabile di classe
		this.message = message;
	}
	
		public String getMessage() {
			return message;
		}
	}


