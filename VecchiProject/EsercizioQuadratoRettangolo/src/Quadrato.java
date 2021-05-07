import java.util.InputMismatchException;
import java.util.Scanner;

public class Quadrato extends Rettangolo{
	
	Quadrato(){
		super("noname",0,0);
	}
	
	Quadrato(String nome, int lato){
		super(nome,lato,lato);
	}
	
	public void costruisciQuadrato() {
		System.out.println("Inserire il nome: ");
		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		setNome(nome);
		try {
			System.out.println("Inserire lato: ");
			int lato = sc.nextInt();
			setBase(lato);
			setAltezza(lato);
		}
		catch(InputMismatchException e) {
			System.out.println("ERROR: tipo di dato errato");
		}
		catch(Exception e) {
			System.out.println("ERROR");
		}
		sc = null;
	}

}
