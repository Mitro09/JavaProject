package calcolatrice;

import java.util.ArrayList;
import java.util.Scanner;

public class CalcolatriceRunner {
	
	public static ArrayList<Numero> listanumeri = new ArrayList<Numero>();

	public static void inserisciNumeri() {
		String s = "";
		System.out.println("***Inserimento Valori***");
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Inserisci valori  (# per terminare)");
			
			s = sc.next();
			
			if(!s.equals("#")) {
				try {
					int n = Integer.parseInt(s);
					listanumeri.add(new Numero(n));
				}
				catch(NumberFormatException e) {
					System.out.println("ERROR: Inserisci solo numeri");
				}
				catch(Exception e) {
					System.out.println("Errore non definito");
				}
			}
			
		} while(!s.equals("#"));
	}
	
	public static void leggiNumeri() {
		System.out.println("***Valori Inseriri***");
		for(Numero numero: listanumeri) {
			System.out.println(numero);
		}
	}
	
	public static void operazioniConNumeri() {
		String n1="";
		String n2="";
		String op;
		int i1=0;
		int i2=0;
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Prego scegliere primo numero(id)");
			n1 = sc.next();
			System.out.print("Prego scegliere secondo numero(id)");
			n2 = sc.next();
			for (Numero numero : listanumeri) {
				if(numero.getIdnumero() == Integer.parseInt(n1)) {
					i1 = numero.getValore();
				}
				if(numero.getIdnumero() == Integer.parseInt(n2)) {
					i2 = numero.getValore();
				}
			}
		}
		catch(NumberFormatException e) {
			System.out.println("ERROR: Inserisci solo numeri");
		}
		catch(Exception e) {
			System.out.println("Errore non definito");
		}
		System.out.print("Prego scegliere operatore matematico");
		op = sc.next();
		
		switch(op) {
		
		case "+":
			System.out.println(i1+i2);
		break;
		
		case "-":
			System.out.println(i1-i2);
		break;
		
		case "*":
			System.out.println(i1*i2);
		break;
		
		case "/":
			if(i2==0) {
				System.out.println("ERROR: divisione per zero");
			}
			else{
				System.out.println(i1/i2);
			}
		break;
		
		case "^":
			System.out.println(i1^i2);
		break;
		
		default :
			System.out.println("Operatore indicato errato");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		String s;
		do {
			
			System.out.println("***Elenco delle opzioni disponibili***");
			System.out.println("I: Inseririmento valori");
			System.out.println("L: Lista numeri memorizzati");
			System.out.println("O: Operazioni");
			System.out.println("#: Uscita");
			System.out.println("Prego inserire un'opzione: ");
			
			Scanner sc = new Scanner(System.in);
			s = sc.next().toUpperCase();
			
			if(!s.equals("#")) {
				switch(s) {
				case "I":
					inserisciNumeri();
				break;
				
				
				case "L":
					leggiNumeri();
				break;
				
				
				case "O":
					operazioniConNumeri();
				break;
				
				
				default :
					System.out.println("Comando non riconosciuto");
				
				}
			}

		} while(!s.equals("#"));
		
		/*inserisciNumeri();
		leggiNumeri();
		operazioniConNumeri();*/
		

	}

}
