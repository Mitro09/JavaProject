
public class PaccoCelere1 extends Pacco {

	PaccoCelere1(double peso) {
		super(peso);
		this.costo = calcoloCostoSpedizione();
	}

	public double calcoloCostoSpedizione() {
		double prezzo;
		if (this.peso > 10) {
			prezzo = 14.90;
		} else {
			prezzo = 9.90;
		}
		return prezzo;
	}

}
