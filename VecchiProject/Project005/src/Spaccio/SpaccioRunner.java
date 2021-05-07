package Spaccio;

import java.time.LocalDate;

public class SpaccioRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Articolo art1 = new Articolo ("Sole piatti",2.49);
		Articolo art2 = new Articolo ("PROMO - Rotoloni regina",3.45);
		ArticoloAlimentare artAl1 = new ArticoloAlimentare("Prosciutto",4.30);
		ArticoloAlimentare artAl2 = new ArticoloAlimentare("Pasta fresca",4.10);
		ArticoloAlimentare artAl3 = new ArticoloAlimentare("Mozzarella",2.75);
		Articolo art3 = new Articolo("Sacchi neri",1.99);
		
		artAl1.setDataScadenza(LocalDate.of(2021, 05, 05));
		artAl2.setDataScadenza(LocalDate.of(2021, 04, 05));
		artAl3.setDataScadenza(LocalDate.of(2021, 04, 01));
		
		System.out.println(artAl1);
		
		
		Cassa cassa1 = new Cassa();
		
		cassa1.aggiungiNArticoli(art1,art2,art3,artAl1,artAl2,artAl3);
		
		System.out.println(cassa1);
		System.out.println("IMPORTO TOTALE: "+cassa1.conto2());
		


	}

}
