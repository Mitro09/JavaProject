import java.util.InputMismatchException;
import java.util.Scanner;

public class Rettangolo {
	
	private int altezza;
	private int base;
	private String nome;
	
	Rettangolo(){
		this.nome="noname";
		this.base=0;
		this.altezza=0;
	}
	
	Rettangolo(String _name, int _base, int _altezza){
		this.setNome(_name);
		this.setBase(_base);
		this.setAltezza(_altezza);
	}
	
	Rettangolo(String _name, int _lato){
		this.setNome(_name);
		this.setBase(_lato);
		this.setAltezza(_lato);
	}
	
	Rettangolo(String _name){
		this.setNome(_name);
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Rettangolo [altezza=" + altezza + ", base=" + base + ", nome=" + nome + "]";
	}
	

	public void costruisciRettangolo() {
		System.out.println("Inserire il nome: ");
		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		setNome(nome);
		try {
			System.out.println("Inserire base: ");
			int base = sc.nextInt();
			setBase(base);
			System.out.println("Inserire altezza: ");
			int altezza = sc.nextInt();
			setAltezza(altezza);
		}
		catch(InputMismatchException e) {
			System.out.println("ERROR: Tipo di dato inserito errato");
		}
		catch(Exception e) {
			System.out.println("ERROR");
		}
		
		sc = null;
	}
	
	public void disegna() {
		for(int i=0;i<altezza;i++) {
			for(int j=0;j<base;j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		
	}
	
	public int calcolaArea() {
		return base*altezza;
	}
	
	public int calcolaPerimetro() {
		return (base+altezza)*2;
	}

}

