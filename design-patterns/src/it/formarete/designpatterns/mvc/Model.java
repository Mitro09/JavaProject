package it.formarete.designpatterns.mvc;

public interface Model {

	public String getAttribute(); //prendi dati
	
	public void setAttribute(String attribute); //restituisci dati
	
	//IL MODEL FORNISCE I METODI PER ACCEDER AI DATI UTILI ALL'APPLICAZIONE
	
	//due metodi get è quando voglio i dati che  ha model 
	//set è per dare a model i dati
}
