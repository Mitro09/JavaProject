package Spaccio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Cassa {
	
	private ArrayList<Articolo> elencoArticoli = new ArrayList<Articolo>();
	
	public void aggiungiArticoli(Articolo art) {
		elencoArticoli.add(art);
	}
	
	public void aggiungiNArticoli(Articolo...art) {
		for(Articolo articolo: art) {
			elencoArticoli.add(articolo);
		}
	}
	public double conto() {
		double tot = 0;
		for(Articolo art: elencoArticoli){
			tot += art.getPrezzo();
		}
		return tot;
	}
		
	public double conto2() {
		double tot = 0;
		String s;
		for (Articolo art: elencoArticoli) {
			s = art.getDescrizione().toUpperCase();
			if (s.startsWith("PROMO")) {
				tot += art.getPrezzo()*.85;
			}
			else if (art.getDataScadenza() != null) {
				LocalDate oggi = LocalDate.now();
				if(ChronoUnit.DAYS.between(oggi, art.getDataScadenza())<15) {
					tot += art.getPrezzo()*.85;
				}
				else {
					tot += art.getPrezzo();
				}
			}
			else {
				tot += art.getPrezzo();
			}
		}
		return tot;
	}

	@Override
	public String toString() {
		String s = "***ELEMENTI IN CASSA***\n";
		for(Articolo art: elencoArticoli) {
			s +=art+"\n";
		}
		return s;
	}

}
