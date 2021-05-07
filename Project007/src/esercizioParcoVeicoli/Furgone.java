package esercizioParcoVeicoli;

public class Furgone extends Veicolo {
 
	
	Furgone(String marca, String modello, TipoAlimentazione alimentazione, int percorrenza, double consumoMedio) {
		super(marca, modello, alimentazione, percorrenza, consumoMedio);
		this.tipoVeicolo = "Furgone";
		// TODO Auto-generated constructor stub
	}

}