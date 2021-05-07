package esercizioParcoVeicoli;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ParcoVeicoliRunner {
	
	private static double totaleSpesa;
	private static double totaleKm;
	
	private static void aggiungiVeicoli(ArrayList<Veicolo> al, Veicolo...v) {
		for(Veicolo veicolo : v) {
			al.add(veicolo);
		}
	}
	
	private static String calcoloTot(ArrayList<Veicolo> al) {
		totaleSpesa = 0;
		for(Veicolo v : al) {
			totaleSpesa += v.spesa;
		}
		String pattern = "###,###.###";
		DecimalFormat dm = new DecimalFormat(pattern);
		String totFormat = dm.format(totaleSpesa);
		return totFormat;
	}
	
	private static String calcoloKmTot(ArrayList<Veicolo> al) {
		totaleKm = 0;
		for(Veicolo v : al) {
			totaleKm += v.percorrenza;
		}
		String pattern = "###,###";
		DecimalFormat dm = new DecimalFormat(pattern);
		String kmTotFormat = dm.format(totaleKm);
		return kmTotFormat;
	}
	
	private static double calcoloMedia() {
		double media = totaleSpesa/totaleKm;
		media = Math.round(media*100);
		return media/100;
	}

	public static void main(String[] args) {
		
		ArrayList<Veicolo> parcoVeicoli = new ArrayList<Veicolo>();
		
		Veicolo th = new Autocarro("VOLVO","TH",TipoAlimentazione.D,150000,4);
		Veicolo Transit = new Furgone("FORD","Transit",TipoAlimentazione.D,135000,7.6);
		Veicolo Panda = new Automobile("FIAT","Panda",TipoAlimentazione.B,15000,14);
		Veicolo Duster = new Automobile("DACIA","Duster",TipoAlimentazione.G,22000,11.5);
		
		aggiungiVeicoli(parcoVeicoli,th,Transit,Panda,Duster);
		
		System.out.println("**************************************");
		System.out.println("*************RIEPILOGO****************");
		System.out.println("**************************************\n");
		
		for (int i=0; i<parcoVeicoli.size(); i++) {
			System.out.println(parcoVeicoli.get(i));
		}
		
		System.out.println("Spesa totale del parco veicoli: "+calcoloTot(parcoVeicoli)+"€");
		System.out.println("Totale Km dei veicoli del parco: "+calcoloKmTot(parcoVeicoli)+"Km");
		System.out.println("Costo chilometrico medio: "+calcoloMedia()+"€");
		
		

	}

}
