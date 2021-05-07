package esercizioKcal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcoloConsumoRunner {
	
	private static double tot=0;

	public static void aggiungiAttività(ArrayList<Attività> al, Attività... at) {
		for (Attività ats : at) {
			if (ats.getResultCalcolo() != 0)
				al.add(ats);
		}
	}
	
	public static double totalKcal(ArrayList<Attività> at) {
		for(Attività ats: at) {
			tot += ats.getResultCalcolo();
		}
		return tot;
	}

	public static void main(String[] args) {
		
		int error;
		int errorCount=0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Prego inserisci il tuo peso in Kg: ");
			double peso;
			error=0;
			
			try {
				peso = sc.nextDouble();
				Dormire at1 = new Dormire();
				SalireScale at2 = new SalireScale();
				ScrivereAlPc at3 = new ScrivereAlPc();
				at1.calcoloConsumo(peso);
				at2.calcoloConsumo(peso);
				at3.calcoloConsumo(peso);
				ArrayList<Attività> listaAttività = new ArrayList<Attività>();
				aggiungiAttività(listaAttività, at1, at2, at3);
				System.out.println("\n********************************");
				System.out.println("************ATTIVITA************");
				System.out.println("********************************");
				for (int i = 0; i < listaAttività.size(); i++) {
					System.out.println(listaAttività.get(i));
				}
				System.out.println("Totale Kcal giornaliero: "+totalKcal(listaAttività)+" Kcal");
			} catch (InputMismatchException e) {
				if(errorCount < 5) {
					System.out.println("Valore Errato! Riprova\n");
				}
				else if(errorCount<6) {
					System.out.println("Ma allora sei stupido\n");
				}
				else if(errorCount<7){
					System.out.println("OK...sei un down");
				}
				else if(errorCount<8) {
					System.out.println("Sei peggio di un down: un ebreo");
				}
				else if(errorCount<9) {
					System.out.println("Ok vaffanculo");
				}
				else {
					System.out.println("PORCA MADONNA TROIA");
				}
				error = 1;
				errorCount++;
			}
		} while (error != 0);

	}

}
