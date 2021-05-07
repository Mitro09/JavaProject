package esercizioInterfaccia;

public class Studente implements Moltiplica{
	
	private String nome;
	private int id;
	
	Studente(int id, String nome){
		this.setId(id);
		this.nome=nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public void moltiplica(Object o) {
		Studente stud = (Studente)o;
		if(stud.equals(this)) {
			int id = getId()*valore;
			setId(id);	
			System.out.println(stud);
		}
		else {
			System.out.println("Oggetto e parametro devono coincidere");
		}
		
		
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", id=" + id + "]";
	}

}
