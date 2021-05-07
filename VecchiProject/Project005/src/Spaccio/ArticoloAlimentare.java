package Spaccio;

import java.time.LocalDate;

public class ArticoloAlimentare extends Articolo {
	
	private LocalDate dataScadenza;

	ArticoloAlimentare(String descrizione, double prezzo) {
		super(descrizione, prezzo);
	}

	public LocalDate getDataScadenza() {
		return dataScadenza;
	}

	public void setDataScadenza(LocalDate dataScadenza) {
		this.dataScadenza = dataScadenza;
	}

	@Override
	public String toString() {
		String s = super.toString();
		//s += " dataScadenza=" + dataScadenza + "]";
		return s;
	}
	
	

}
