package interfacciaAvanzamento;

public class AvanzamentoInteri implements Avanzamento {

	@Override
	public void nextN(Object o) {
		
		int a = (int)o;
		for(int i=1; i<=step; i++) {
			System.out.println(a+i);
		}
		
	}

}
