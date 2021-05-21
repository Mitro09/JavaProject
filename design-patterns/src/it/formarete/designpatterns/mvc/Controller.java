package it.formarete.designpatterns.mvc;

public class Controller {

	private Model model;
	
	public void setModel(Model model) {
		this.model = model; 
	} //qual è il model con cui sto lavorando? lo defiisce qua
	
	public void handleInput(String input) {
		model.setAttribute(input);
	} //qui controller dice a model di salvarsi un attribute un dato in ingresso
	
	//il controller riceve i comandi dell'utente (in genere attraverso il view) e li attua modificando lo stato degli altri due componenti.
}
