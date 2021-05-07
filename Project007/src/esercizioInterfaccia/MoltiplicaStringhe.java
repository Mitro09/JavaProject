package esercizioInterfaccia;

public class MoltiplicaStringhe implements Moltiplica {

	@Override
	public void moltiplica(Object o) {
		 String s = "";
		 for(int i=0;i<valore;i++) {
			 s += (String)o;
		 }
		 System.out.println(s);
	}

}
