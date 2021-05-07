
public class Cliente {
	
	private static int idCliente;
	private static int ultima_lavorazione;

	
	private int id;
	private String nome;
	private Indirizzo indirizzo_principale;
	private Indirizzo indirizzo_secondario;
	
	public Cliente(String nome) {
		super();
		this.id = idCliente;
		idCliente++;
		this.setNome(nome);
	}

	public Cliente(String nome, Indirizzo indirizzo_principale) {
		super();
		this.id = idCliente;
		idCliente++;
		this.setNome(nome);
		this.setIndirizzo_principale(indirizzo_principale);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Indirizzo getIndirizzo_principale() {
		return indirizzo_principale;
	}

	public void setIndirizzo_principale(Indirizzo indirizzo_principale) {
		this.indirizzo_principale = indirizzo_principale;
	}

	public Indirizzo getIndirizzo_secondario() {
		return indirizzo_secondario;
	}

	public void setIndirizzo_secondario(Indirizzo indirizzo_secondario) {
		this.indirizzo_secondario = indirizzo_secondario;
	}

	public static int getUltima_lavorazione() {
		return ultima_lavorazione;
	}

	public static void setUltima_lavorazione(int ultima_lavorazione) {
		Cliente.ultima_lavorazione = ultima_lavorazione;
	}

	@Override
	public String toString() {
		/*return "Cliente [id=" + id + ", nome=" + nome + ", indirizzo_principale=" + indirizzo_principale
				+ ", indirizzo_secondario=" + indirizzo_secondario + "]";*/
		String stringa="Cliente: ID = "+id+"  Nome = "+nome;
		if (indirizzo_principale != null) {
			stringa += "\nIndirizzo Principale: "+indirizzo_principale;
		}
		if (indirizzo_secondario != null) {
			stringa += "\nIndirizzo Secondario: "+indirizzo_secondario;
		}
		stringa += "\n---------------------------------------------------";
		return stringa;
	}
	
	

}
