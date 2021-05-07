package esercizioParcoVeicoli;

public class Automobile extends Veicolo {

	Automobile(String marca, String modello, TipoAlimentazione alimentazione, int percorrenza, double consumoMedio) {
		super(marca, modello, alimentazione, percorrenza, consumoMedio);
		this.tipoVeicolo = "Automobile";
		// TODO Auto-generated constructor stub
	}

}
