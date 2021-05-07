package esercizioInterfaccia;

import java.time.LocalDate;

public class MoltiplicaMesi implements Moltiplica {

	@Override
	public void moltiplica(Object o) {
		String s = (String)o;
		String s2[] = s.split("/");
		LocalDate data = LocalDate.of(Integer.parseInt(s2[2]), Integer.parseInt(s2[1]), Integer.parseInt(s2[0]));
		for(int i=1; i<=valore; i++) {
			System.out.println(dataIta(data.plusMonths(i)));
		}
	}

	
	public static String dataIta(LocalDate data) {
		String [] s = data.toString().split("-");
		String s2 = s[2]+"/"+s[1]+"/"+s[0];
		return s2;
	}
	
}
