package eserciziodadi;

import java.util.Scanner;



public class DadoRunner {
	
	public static double percentuali(double valoreDado, double lanci) {
		 double percentuali = valoreDado*100/(lanci);
		 percentuali = Math.round(percentuali*100);
		 return percentuali/100;
	}

	public static void main(String[] args) {

		Dado d6 = new Dado();
		Dado dado2 = new Dado();
		Scanner sc = new Scanner(System.in);
		String s;
		do {
			d6.lancio();
			dado2.lancio();
			do {
				System.out.println("\nFare un altro lancio?  S/N");
				s = sc.next();
			} while (!s.equalsIgnoreCase("s") && !s.equalsIgnoreCase("n"));
		} while (!s.equalsIgnoreCase("n"));
		
		System.out.println("\n\n**************RIEPILOGO GIOCATA************");
		System.out.println("*******************************************");
		System.out.println("Sono stati fatti: " + (Dado.n_lanci) + " lanci");
		System.out.println("Sono usciti: " + Dado.uno + " uno,         il "+percentuali(Dado.uno, Dado.n_lanci)+"% delle volte");
		System.out.println("Sono usciti: " + Dado.due + " due,         il "+percentuali(Dado.due,Dado.n_lanci)+"% delle volte");
		System.out.println("Sono usciti: " + Dado.tre + " tre,         il "+percentuali(Dado.tre,Dado.n_lanci)+"% delle volte");
		System.out.println("Sono usciti: " + Dado.quattro + " quattro,     il "+percentuali(Dado.quattro,Dado.n_lanci)+"% delle volte");
		System.out.println("Sono usciti: " + Dado.cinque + " cinque,      il "+percentuali(Dado.cinque,Dado.n_lanci)+"% delle volte");
		System.out.println("Sono usciti: " + Dado.sei + " sei,         il "+percentuali(Dado.sei,Dado.n_lanci)+"% delle volte");
		System.out.println("Sono usciti: " + Dado.sette+ " sette,       il "+percentuali(Dado.sette, Dado.n_lanci)+"% delle volte");
		System.out.println("Sono usciti: " + Dado.otto+ " otto,        il "+percentuali(Dado.otto, Dado.n_lanci)+"% delle volte");
		System.out.println("Sono usciti: " + Dado.nove+ " nove,        il "+percentuali(Dado.nove, Dado.n_lanci)+"% delle volte");
		System.out.println("Sono usciti: " + Dado.dieci+ " dieci,       il "+percentuali(Dado.dieci, Dado.n_lanci)+"% delle volte");
		System.out.println("Sono usciti: " + Dado.undici+ " undici,      il "+percentuali(Dado.undici, Dado.n_lanci)+"% delle volte");
		System.out.println("Sono usciti: " + Dado.dodici+ " dodici,      il "+percentuali(Dado.dodici, Dado.n_lanci)+"% delle volte");
		System.out.println("***************FINE RIEPILOGO***************");
		System.out.println("********************************************");
		
		System.out.println("\n\n**************RIEPILOGO GIOCATA SINGOLA************");
		System.out.println("Il dado1 ha eseguito "+d6.lanci+" lanci");
		System.out.println("Il dado2 ha eseguito "+dado2.lanci+" lanci");
		//System.out.println("Dado1: "+d6.tot_result[0]+" uno           Dado2: "+dado2.tot_result[0]+" uno");
		System.out.println("Dado1: "+d6.tot_result[0]+" due           Dado2: "+dado2.tot_result[0]+" due");
		System.out.println("Dado1: "+d6.tot_result[1]+" tre           Dado2: "+dado2.tot_result[1]+" tre");
		System.out.println("Dado1: "+d6.tot_result[2]+" quattro       Dado2: "+dado2.tot_result[2]+" quattro");
		System.out.println("Dado1: "+d6.tot_result[3]+" cinque        Dado2: "+dado2.tot_result[3]+" cinque");
		System.out.println("Dado1: "+d6.tot_result[4]+" sei           Dado2: "+dado2.tot_result[4]+" sei");
		System.out.println("Dado1: "+d6.tot_result[5]+" sette         Dado2: "+dado2.tot_result[5]+" sette");
		System.out.println("Dado1: "+d6.tot_result[6]+" otto          Dado2: "+dado2.tot_result[6]+" otto");
		System.out.println("Dado1: "+d6.tot_result[7]+" nove          Dado2: "+dado2.tot_result[7]+" nove");
		System.out.println("Dado1: "+d6.tot_result[8]+" dieci         Dado2: "+dado2.tot_result[8]+" dieci");
		System.out.println("Dado1: "+d6.tot_result[9]+" undici        Dado2: "+dado2.tot_result[9]+" undici");
		System.out.println("Dado1: "+d6.tot_result[10]+" dodici        Dado2: "+dado2.tot_result[10]+" dodici");
		System.out.println("***************FINE RIEPILOGO***************");
		System.out.println("********************************************");
		
		sc.close();
	}

}
