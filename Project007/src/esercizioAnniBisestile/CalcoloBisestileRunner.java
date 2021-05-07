package esercizioAnniBisestile;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcoloBisestileRunner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// Scanner scInt = new Scanner(System.in);
		String continua;
		int anno_val;
		try {
			do {
				do {
					System.out.println("Vuoi calcolare se un anno è bisestile?  S/N");
					continua = sc.next();
					if (!continua.equalsIgnoreCase("s") && !continua.equalsIgnoreCase("n")) {
						System.out.println("CAZZO FAI METTI S O N");
					}
				} while (!continua.equalsIgnoreCase("s") && !continua.equalsIgnoreCase("n"));
				if (continua.equalsIgnoreCase("s")) {
					do {
						System.out.println("Inserisci un anno per favore: ");
						anno_val = sc.nextInt();
						if (anno_val > 0) {
							Anno anno = new Anno(anno_val);
							System.out.println(anno);
						} else {
							System.out.println("Data Errata! Correggi");
						}
					} while (anno_val < 0);
				}

			} while (continua.equalsIgnoreCase("s"));
		} catch (InputMismatchException e) {
			System.out.println("Data Errata! Il programma sarà terminato!");
		}
		System.out.println("\nProgramma Finito!");
		sc.close();
		// scInt.close();

	}

}
