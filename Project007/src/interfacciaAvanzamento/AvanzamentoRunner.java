package interfacciaAvanzamento;

public class AvanzamentoRunner {

	public static void main(String[] args) {

		AvanzamentoInteri avi = new AvanzamentoInteri();
		avi.nextN(5);
		AvanzamentoGiorni avg = new AvanzamentoGiorni();
		avg.nextN("27/07/1994");
		
		OggettoString os1 = new OggettoString();
		os1.inizio = 15;
		
		for (int i=1; i<=100; i++) {
			int s1 = (int) (Math.random()*77)+48;
			int s2 = (int) (Math.random()*77)+48;
			int s3 = (int) (Math.random()*77)+48;
			int s4 = (int) (Math.random()*77)+48;
			int s5 = (int) (Math.random()*77)+48;
			
			String sn = Character.toString((char)s1);
			sn += Character.toString((char)s2);
			sn += Character.toString((char)s3);
			sn += Character.toString((char)s4);
			sn += Character.toString((char)s5);
			
			os1.elementi.add(sn);
		}
		
		System.out.println(os1);
		AvanzmentoStringhe avs = new AvanzmentoStringhe();
		avs.nextN(os1);
		System.out.println("***PROVA***");
		System.out.println(os1.elementi.get(os1.inizio+1));
		System.out.println(os1.elementi.get(os1.inizio+10));
		
	}

}
