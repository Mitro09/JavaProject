package esercizioKcal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScrivereAlPc extends Attività {

	private double resultCalcolo;

	@Override
	public void calcoloConsumo(double peso) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Per quanto tempo hai usato il PC: ");
		try {
			double hour = sc.nextDouble();
			double result = 2 * peso * hour;
			result = Math.round(result * 100);
			this.resultCalcolo = result / 100;
		} catch (InputMismatchException e) {
			System.out.println("Valore Errato! Questa attività non sarà conteggiata");
		}

	}

	public double getResultCalcolo() {
		return this.resultCalcolo;
	}

	@Override
	public String toString() {
		return "UsarePC -> [Consumo: " + resultCalcolo + " Kcal ]";
	}

}
