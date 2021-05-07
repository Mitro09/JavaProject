package interfacciaAvanzamento;

import java.util.ArrayList;

public class AvanzmentoStringhe implements Avanzamento {

	@Override
	public void nextN(Object o) {
		
		OggettoString os = (OggettoString) o;
		
		ArrayList<String> el2 = os.elementi;
		int iniziale = os.inizio;
		
		for(int i=1; i<=step; i++) {
			if(el2.size()>iniziale+i) {
				System.out.println(el2.get(iniziale+i));
			}
		}
	}

}
