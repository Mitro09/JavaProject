
public class Indirizzo extends Object {
	
	private String via;
	private String citta;
	private int cap;
	private String provincia;
	
	//generato con tasto dx mouse - source - generate constructor fields
	public Indirizzo(String via, String citta, int cap, String provincia) {
		super();
		this.via = via;
		this.citta = citta;
		this.cap = cap;
		this.provincia = provincia;
	
	}

	@Override
	public String toString() {
		return via + ", " + citta + ", " + cap + ", " + provincia;
	}

	
}