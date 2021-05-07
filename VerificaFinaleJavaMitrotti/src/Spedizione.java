
public class Spedizione {

	private static int num_spedizioni = 1;
	private Pacco pacco;
	private Destinatario destinatario;
	private int n_sped;

	Spedizione(Pacco p, Destinatario d) {
		this.pacco = p;
		this.destinatario = d;
		this.n_sped = num_spedizioni;
		num_spedizioni++;
	}

	public double getPrezzo() {
		double prezzo = this.pacco.costo;
		return prezzo;
	}

	@Override
	public String toString() {
		return "*************************\nSpedizione " + n_sped + " ************\n*************************\n" + pacco
				+ destinatario + "\n_________________________\n";
	}

}
