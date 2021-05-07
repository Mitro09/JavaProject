
public class Pacco {

	protected static int id_pacchi = 1;
	protected int id;
	protected double peso;
	protected double costo;

	Pacco(double peso) {
		this.id = id_pacchi;
		this.peso = peso;
		this.costo = calcoloCostoSpedizione();
		id_pacchi++;
	}

	private double calcoloCostoSpedizione() {
		return 0;
	}

	@Override
	public String toString() {
		return this.getClass().getName() + "	[ ID: " + id + ", Peso: " + peso + "Kg, Costo di Spedizione: " + costo
				+ "€ ]\n";
	}

}
