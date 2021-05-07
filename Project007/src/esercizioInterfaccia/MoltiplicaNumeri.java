package esercizioInterfaccia;

public class MoltiplicaNumeri implements Moltiplica{

	@Override
	public void moltiplica(Object o) {
		
		int num = (int) o;
		System.out.println(num*valore);
		
	}

}
