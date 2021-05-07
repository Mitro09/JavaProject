package eccezioni;

public class ErroreStringaVuota extends Exception {
	
	ErroreStringaVuota(){
		
	}
	
	public void ciao() {
		System.out.println("Ciao!");
	}
	
	public void stampa(String s) {
		System.out.println(s);
	}
	
	public void stampaErr(String s) throws ErroreStringaVuota{
		if (s != null) {
			System.out.println(s);
		}
		else {
			throw new ErroreStringaVuota();
		}
		
	}

}
