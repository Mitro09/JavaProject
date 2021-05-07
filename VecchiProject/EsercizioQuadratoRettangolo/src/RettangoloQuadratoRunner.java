import java.util.Scanner;

public class RettangoloQuadratoRunner {

	public static void main(String[] args) {
		
		Rettangolo ret1 = new Rettangolo("A",5,3);
		
		ret1.disegna();
		
		System.out.println("Il perimetro del rettangolo "+ret1.getNome()+" è: "+ret1.calcolaPerimetro());
		System.out.println("L' area del rettangolo "+ret1.getNome()+" è: "+ret1.calcolaArea());
		System.out.println("**********************\n");

		
		Rettangolo ret2 = new Rettangolo();
		
		ret2.costruisciRettangolo();
		System.out.println(ret2);
		ret2.disegna();
		System.out.println("**********************\n");
		String a;
		do {
			System.out.println("Indicare se è un rettangolo(R) o un quadrato(Q)");
			Scanner sc = new Scanner(System.in);
			a = sc.next();
			if (a.equalsIgnoreCase("R")) {
				Rettangolo ret3 = new Rettangolo();
				ret3.costruisciRettangolo();
				ret3.disegna();
				System.out.println("Perimetro: "+ret3.calcolaPerimetro());
				System.out.println("Area: "+ret3.calcolaArea());
				sc = null;

			}
			else if (a.equalsIgnoreCase("Q")) {
				Quadrato quad1 = new Quadrato();
				quad1.costruisciQuadrato();
				quad1.disegna();
				System.out.println("Perimetro: "+quad1.calcolaPerimetro());
				System.out.println("Area: "+quad1.calcolaArea());
				sc = null;

			}
			else {
				System.out.println("Hai sbagliato a cliccare");
				System.out.println("Hai digitato: "+a+"");
				System.out.println("**********************\n");

			}
			sc = null;
		} while(!a.equalsIgnoreCase("Q") && !a.equalsIgnoreCase("R"));		
		
	}
}
	


