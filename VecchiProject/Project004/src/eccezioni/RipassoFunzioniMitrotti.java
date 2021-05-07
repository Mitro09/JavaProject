package eccezioni;

import java.util.Scanner;

public class RipassoFunzioniMitrotti {
	
	static void calcoloQuadrato(int n) {
		System.out.println("Il quadrato di "+n+" è: "+n*n);
	}
	
	static void calcoloCubo(int n) {
		System.out.println("Il cubo di "+n+" è: "+n*n*n);
	}
	
	static long fattoriale(int n) {
		if(n==1) {
			return 1;
		}
		return n*fattoriale(n-1);
	}
	
	static void stampaFattoriale(int n) {
		System.out.println("Il fattoriale di "+n+" è:"+fattoriale(n));
	}
	
	static long fibonacci(int n) {
		if(n==0) {
			return 0;
		}
		else if(n==1) {
			return 1;
		}
		else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
	}
	
	static void stampaFibonacci(int n) {
		System.out.println("Il numero di fibonacci di "+n+" è: "+fibonacci(n));
	}
	
	static void inverso(int n) {
		double inv = Math.pow(n, -1);
		inv = Math.round(inv*100);
		inv /= 100;
		System.out.println("Il numero inverso di "+n+" è: "+inv);
	}

	public static void main(String[] args) {
		
		System.out.println("*******INIZIO********");
		System.out.print("Prego inserire un numero intero: ");
		Scanner sc = new Scanner(System.in);
		try {
			int numero = sc.nextInt();
			calcoloQuadrato(numero);
			calcoloCubo(numero);
			stampaFattoriale(numero);
			stampaFibonacci(numero);
			inverso(numero);
		}
		catch(Exception e) {
			System.out.println("ERRORE: numero non valido");
		}
		
		System.out.println("*******FINE*********");
		sc = null;

	}

}
