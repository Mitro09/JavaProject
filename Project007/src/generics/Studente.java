package generics;

public class Studente {
	
	private int id;
	private String nome;
	private String cognome;
	
	Studente(int id,String nome,String cognome){
		this.id=id;
		this.nome=nome;
		this.cognome=cognome;
	}

	@Override
	public String toString() {
		return "\nStudente "+id+" "+nome+" "+cognome;
	}

}
