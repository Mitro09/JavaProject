package esercizioInterfaccia;

public class MoltiplicaInterfacciaRunner {

	public static void main(String[] args) {

		MoltiplicaNumeri mNum = new MoltiplicaNumeri();
		mNum.moltiplica(4);
		MoltiplicaStringhe mStr = new MoltiplicaStringhe();
		mStr.moltiplica("po");
		MoltiplicaMesi mDate = new MoltiplicaMesi();
		mDate.moltiplica("27/06/1994");
		Studente s1 = new Studente(200,"mario");
		Studente s2 = new Studente(300,"paolo");
		s1.moltiplica(s1);
		s1.moltiplica(s2);
		
	}

}
