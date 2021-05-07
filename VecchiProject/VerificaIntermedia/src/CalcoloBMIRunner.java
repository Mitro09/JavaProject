
public class CalcoloBMIRunner {
	
	public static void EseguiCalcoloBMI(Persona p) {
		if(p.getSesso().equalsIgnoreCase("m")) {
			Uomo uomo1 = new Uomo(p);
			uomo1.verificaBMI();
		}
		else if(p.getSesso().equalsIgnoreCase("f")) {
			Donna donna1 = new Donna(p);
			donna1.verificaBMI();
		}
		else {
			System.out.println("ERROR\n");
			System.out.println("**********************\n");
		}
	}

	public static void main(String[] args) {
		
		Persona pers1 = new Persona();
		pers1.chiediDati();
		//pers1.inserisciDataNascita();
		System.out.println(pers1);
		EseguiCalcoloBMI(pers1);
		pers1.calcoloGrassoCorporeo();
		System.out.println("\n\n");
		
		Persona pers2 = new Persona();
		pers2.chiediDati();
		System.out.println(pers2);
		EseguiCalcoloBMI(pers2);
		pers2.calcoloGrassoCorporeo();
		
		
	}

}
