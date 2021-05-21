package it.formarete.designpatterns.mvc;

import it.formarete.designpatterns.observer.Observer;

public class View implements Observer {

	private final static String TEMPLATE = "<h1>Hello ${variable}!</h1>";
	
	//il view visualizza i dati contenuti nel model e si occupa dell'interazione con utenti e agenti;
	
	private String variable;
	//variabile è il nuovo messaggio che io notifico 
	
	public View() {
		variable = "nobody";
	}
	
	public void update(String variable) {
		this.variable = variable;
	}
	
	public String render() {
		return TEMPLATE.replace("${variable}", variable);
		// con questo metodo, sto richiamando sul template il metodo replace, che rimpiazza in ogni occorenza ove indicato la varibaile che viene passata
	}
	//la vista è una classe che sa manetenre un pezzo di stato , che quando gli chiediamo di fare render eproduce una stringa che si aggiorna
}
