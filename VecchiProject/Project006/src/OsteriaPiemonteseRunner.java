
public class OsteriaPiemonteseRunner {

	public static void main(String[] args) {
		
		PiattoPiemontese piatto1 = new PiattoPiemontese("Agnolotti",12.5);
		PiattoPiemontese piatto2 = new PiattoPiemontese("bagna_caoda",18.5);
		PiattoPiemontese piatto3 = new PiattoPiemontese("bonet",5.00);
		PiattoPiemontese piatto4 = new PiattoPiemontese("bollito_misto",20.5);
		piatto1.aggiungiIngredienti("carne","pasta","ripieno");
		piatto2.aggiungiIngredienti("aglio","olio","acciughe","verdura");
		//piatto1.parlamiDelPiatto();

		MenuPiemontese menu1 = new MenuPiemontese();
		
		menu1.aggiungiPiatto(piatto1,piatto2,piatto3,piatto4);
		
		System.out.println(menu1);
		
		Conto conto1= new Conto();
		conto1.aggiungiPortataAlConto(piatto1,piatto4);
		
		Conto conto2= new Conto();
		conto2.aggiungiPortataAlConto(piatto2,piatto3);
		
		System.out.println(conto1);
		
	}

}
