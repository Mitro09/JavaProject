package esercizioParcoVeicoli;

import java.text.DecimalFormat;

public class Veicolo {
	
	private static int idveicoli=1;
	protected int Idveicolo;
	protected String tipoVeicolo;
	protected String marca;
	protected String modello;
	protected TipoAlimentazione alimentazione;
	protected double percorrenza;
	protected double consumoMedio;
	protected double spesa;
	
	Veicolo(String marca, String modello, TipoAlimentazione alimentazione, int percorrenza, double consumoMedio){
		this.Idveicolo = idveicoli;
		this.marca = marca;
		this.modello = modello;
		this.alimentazione = alimentazione;
		this.percorrenza = percorrenza;
		this.consumoMedio = consumoMedio;
		idveicoli++;
	}
	

	public String calcoloSpesa() {
		String pattern = "###,###.###";
		DecimalFormat dm = new DecimalFormat(pattern);
		double spesa = this.percorrenza / this.consumoMedio * this.alimentazione.prezzo;
		this.spesa = spesa;
		String spesaFormat = dm.format(spesa);
		return spesaFormat;
	}
	
	
	@Override
	public String toString() {
		String s = "VEICOLO: "+Idveicolo+"\n";
		s += tipoVeicolo+": [marca=" + marca + ", modello=" + modello + ", alimentazione=" + alimentazione
				+ ", percorrenza=" + percorrenza + ", consumoMedio=" + consumoMedio + "]\n";
		s += "La spesa media di questo veicolo è di: "+calcoloSpesa()+"€\n";
		return s;
	}
	

}
