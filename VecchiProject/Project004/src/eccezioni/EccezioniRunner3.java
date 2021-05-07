package eccezioni;

public class EccezioniRunner3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = null;
		System.out.println(s);
		ErroreStringaVuota e1 = new ErroreStringaVuota();
		
		e1.ciao();
		e1.stampa(s);
		try {
			e1.stampaErr(s);
		} catch (ErroreStringaVuota e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Errore stringa vuota");
		}

	}

}
