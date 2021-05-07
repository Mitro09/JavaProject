package classiAstratte;

public class RicetteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Risotto riso1 = new Risotto("Risotto alla milanese");
		Pasta pasta1 = new Pasta("Pasta sugo e pecorino");
		
		Ricetta[] ricette = {riso1,pasta1};
		
		for (Ricetta tmp:ricette) {
			tmp.esecuzioneRicetta();
		}

	}

}
