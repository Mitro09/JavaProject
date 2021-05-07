package mappe;

import java.util.HashMap;

public class MappeRunner {

	public static void main(String[] args) {
		HashMap<String, String> rubrica = new HashMap<String, String>();
		
		rubrica.put("Antonio", "245 3254635");
		rubrica.put("Paolo", "123 4455666");
		rubrica.put("Veronica", "343 2359007");
		rubrica.put("Paolo", "555 6677888");//sostituisce il valore della chiave esistente
		
		
		System.out.println(rubrica.entrySet());//entry set serve per stampare
		System.out.println(rubrica.get("Paolo"));
		System.out.println("Elenco chiavi: "+rubrica.keySet());
		System.out.println("Elenco valori: "+rubrica.values());
		
		
		HashMap<Integer, String> libri = new HashMap<Integer, String>();
		
		libri.put(1, "Bibbia");
		libri.put(3, "Promessi Sposi");
		libri.put(6, "Divina Commedia");
		libri.put(4, "Il nome della Rosa");
		
		System.out.println(libri.entrySet());
		System.out.println(libri.getOrDefault(5, "Non esiste"));
		
		
		
		HashMap<Integer, Integer> interiCasuali = new HashMap<Integer, Integer>();
		int cicli=0;
		int zeri=0;
		do {
			for (int i=1;i<=100;i++) {
				int casuale = (int)(Math.random()*20-10);
				interiCasuali.put(i, casuale);
			}
			
		
			zeri=0;
			for(int i=1;i<interiCasuali.size();i++) {
				
				if (interiCasuali.get(i) == 0) {
					zeri++;
				}
			}
			cicli++;
		}while(zeri<35 /*&& cicli<=5000000*/);
		//if(cicli<=5000000) {
			System.out.println(interiCasuali.entrySet());
			System.out.println("Sono stati generati: "+zeri+" zeri in "+cicli+" cicli");
		/*}
		else {
			System.out.println("ERROR: troppi cicli");
		}*/
				
	}

}
