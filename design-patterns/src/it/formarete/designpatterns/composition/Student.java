package it.formarete.designpatterns.composition;



public class Student {

	//vorrei che a seconda dello studente lui faccia o non faccia i compiti, e posso fare cio facendogli delegare l'azioone dei compiti al 
	//TYPE dello studente, quindi creo variabile di classse Type
	//quando dobbiamo gestire alternative basate sui tipi, non usiamogli if ma....
	//usiamo il principio di soluzione e delega: creiamo tante classe quanit sono i modi diversi di fare i compiti
	//e lo studente delegherà ad esse come farà i compiti
	
	//private Strategy strategy;
	
	public void doHomework() {
		System.out.println("2 + 2 = 4");
	}

}
