package proveenum;

public class UtenteEnum {
	
	private String nomeutente;
	private tipoUtente stato_attivazione;
	
	enum tipoUtente{
		in_attesa,
		attivo,
		inattivo,
		cancellato;
	}
	
	
	public UtenteEnum (String s) {
		this.nomeutente = s;
		this.stato_attivazione = tipoUtente.in_attesa;
	}
	
	public void attivazioneUtente() {
		this.stato_attivazione = tipoUtente.attivo;
	}

	public void disattivazioneUtente() {
		this.stato_attivazione = tipoUtente.inattivo;
	}
	
	public void cancellaUtente() {
		this.stato_attivazione = tipoUtente.cancellato;
	}

	
	public void verificaUtente() {
		switch (this.stato_attivazione) {
		case in_attesa:
			System.out.println("Utente in attesa");
			break;
			
		case attivo:
			System.out.println("Utente attivo");
			break;
			
		case inattivo:
			System.out.println("Utente inattivo");
			break;
			
		case cancellato:
			System.out.println("Utente cancellato");
			break;
			
		default:
			System.out.println("SUCA!");
			break;
		}
	}
	@Override
	public String toString() {
		return "[nomeutente: " + nomeutente + ", stato_attivazione: " + stato_attivazione + "]";
	}
}
