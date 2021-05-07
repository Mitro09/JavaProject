
public class ClienteRunner {

	public static void main(String[] args) {
		
		Cliente cli1 = new Cliente("Mario D.");
		Indirizzo ind1 = new Indirizzo("via Roma 6","Torino",10010,"TO");
		
		cli1.setIndirizzo_principale(ind1);
		
		cli1.setIndirizzo_secondario(new Indirizzo("via Torino 3","Settimo t.se",10036,"TO"));
		System.out.println(cli1);

		Cliente cli2 = new Cliente("Gianni Po");
		Cliente cli3 = new Cliente("Fabrizio Giunta");
		cli3.setIndirizzo_principale(new Indirizzo("po","po",90,"po"));
		System.out.println(cli2);
		System.out.println(cli3);
		
		//Cliente.setUltima_lavorazione(150);
		cli1.setUltima_lavorazione(45);
		cli2.setUltima_lavorazione(49);
		
		System.out.println(Cliente.getUltima_lavorazione());
		
		ClienteFedele cliF1 = new ClienteFedele("Mauro B.");
		
		System.out.println(cliF1);
		
		Cliente cli5 = new Cliente("pat",new Indirizzo("via po","terni",12345,"SI"));
		System.out.println(cli5);

	}

}
