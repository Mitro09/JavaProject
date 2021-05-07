package Spaccio;

import java.time.LocalDate;

public class Articolo {

	private static int idArticoli;
	
	private int idArticolo;
	private String descrizione;
	private double prezzo;
	
	Articolo(String descrizione, double prezzo) {
		super();
		this.setDescrizione(descrizione);
		this.setPrezzo(prezzo);
		idArticolo = idArticoli;
		idArticoli++;			
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public LocalDate getDataScadenza() {
		return null;
	}
	
	@Override
	public String toString() {
		return "Articolo [idArticolo=" + idArticolo + ", descrizione=" + descrizione + ", prezzo=" + prezzo+", data scadenza="+getDataScadenza()+"]";
	}
	
	
	
	
}
