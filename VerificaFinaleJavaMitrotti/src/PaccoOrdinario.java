
public class PaccoOrdinario extends Pacco {

	PaccoOrdinario(double peso) {
		super(peso);
		this.costo = calcoloCostoSpedizione();
	}

	public double calcoloCostoSpedizione() {
		double prezzo;
		if (this.peso > 10) {
			prezzo = 9.90;
		} else {
			prezzo = 5.90;
		}
		return prezzo;
	}

}
