package esercizioParcoVeicoli;

public enum TipoAlimentazione {
	B(1.57),
	D(1.42),
	G(0.67);
	
	protected double prezzo;
	TipoAlimentazione(double prezzo) {
		this.prezzo = prezzo;
	}
	
}
