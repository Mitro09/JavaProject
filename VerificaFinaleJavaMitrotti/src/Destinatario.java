
public class Destinatario {

	private static int id_destinatari = 100;
	private int id;
	private String nome;
	private String cognome;
	private String citt�;
	private String cap;

	Destinatario(String nome, String cognome, String citt�, String cap) {
		this.id = id_destinatari;
		this.nome = nome;
		this.cognome = cognome;
		this.citt� = citt�;
		this.cap = cap;
		id_destinatari++;
	}

	@Override
	public String toString() {
		return "Destinatario	[ ID: " + id + ", " + nome + " " + cognome + ", " + citt� + ", CAP: " + cap + " ]\n";
	}

}
