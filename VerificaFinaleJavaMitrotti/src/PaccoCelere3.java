
public class PaccoCelere3 extends Pacco {

	PaccoCelere3(double peso) {
		super(peso);
		this.costo = calcoloCostoSpedizione();
	}

	public double calcoloCostoSpedizione() {
		double prezzo;
		if (this.peso > 10) {
			prezzo = 12.90;
		} else {
			prezzo = 7.90;
		}
		return prezzo;
	}

}
