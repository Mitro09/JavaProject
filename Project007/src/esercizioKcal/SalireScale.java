package esercizioKcal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SalireScale extends Attività{
	
	private double resultCalcolo;

	@Override
	public void calcoloConsumo(double peso) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Per quanti minuti sali le scale: ");
		try {
			double hour = sc.nextDouble();
			hour /= 60;
			double result = 15.80 * peso * hour;
			result = Math.round(result*100);
			this.resultCalcolo = result/100;
		}
		catch(InputMismatchException e) {
			System.out.println("Valore Errato! Questa attività non sarà conteggiata");
		}
	}

	@Override
	public String toString() {
		return "SalireScale -> [Consumo: "+resultCalcolo+" Kcal ]";
	}

	@Override
	public double getResultCalcolo() {
		return this.resultCalcolo;
	}

}
