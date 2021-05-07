
public class Destinatario {

	private static int id_destinatari = 100;
	private int id;
	private String nome;
	private String cognome;
	private String città;
	private String cap;

	Destinatario(String nome, String cognome, String città, String cap) {
		this.id = id_destinatari;
		this.nome = nome;
		this.cognome = cognome;
		this.città = città;
		this.cap = cap;
		id_destinatari++;
	}

	@Override
	public String toString() {
		return "Destinatario	[ ID: " + id + ", " + nome + " " + cognome + ", " + città + ", CAP: " + cap + " ]\n";
	}

}
