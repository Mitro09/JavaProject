import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class AziendaConsegneRunner {

	private static <T> void aggiungiInLista(ArrayList<T> al, T... object) {
		for (T o : object) {
			al.add(o);
		}

	}

	private static void creaSpedizione(ArrayList<Spedizione> als, ArrayList<Pacco> alp, ArrayList<Destinatario> ald) {
		for (int i = 0; i < alp.size() && i < ald.size(); i++) {
			Spedizione sp = new Spedizione(alp.get(i), ald.get(i));
			als.add(sp);
		}

	}

	public static void main(String[] args) throws IOException {

		double tot = 0;
		String output = "";
		LocalDateTime ora_di_creazione = LocalDateTime.now();
		output += ora_di_creazione.getHour() + ":" + ora_di_creazione.getMinute() + "\n";
		output += "Mitrotti Patrick\n\n";

		Pacco pacco_celere1_1 = new PaccoCelere1(2.5);
		Pacco pacco_celere3 = new PaccoCelere3(12.8);
		Pacco pacco_ordinario = new PaccoOrdinario(10.5);
		Pacco pacco_celere1_2 = new PaccoCelere1(15);

		Destinatario d1 = new Destinatario("Andrea", "Rossi", "Torino", "10100");
		Destinatario d2 = new Destinatario("Mario", "Verdi", "Milano", "20100");
		Destinatario d3 = new Destinatario("Paola", "Neri", "Venezia", "30100");
		Destinatario d4 = new Destinatario("Luisa", "Bianchi", "Roma", "00195");

		ArrayList<Pacco> listaPacchi = new ArrayList<Pacco>();
		ArrayList<Destinatario> listaDestinatari = new ArrayList<Destinatario>();
		aggiungiInLista(listaPacchi, pacco_celere1_1, pacco_celere3, pacco_ordinario, pacco_celere1_2);
		aggiungiInLista(listaDestinatari, d1, d2, d3, d4);

		/*
		 * Spedizione sp1 = new Spedizione(listaPacchi.get(0),listaDestinatari.get(0));
		 * System.out.println(listaPacchi); System.out.println(pacco_celere1_1);
		 * System.out.println(pacco_celere3); System.out.println(pacco_ordinario);
		 * System.out.println(pacco_celere1_2); System.out.println(d1);
		 * System.out.println(d2); System.out.println(d3); System.out.println(d4);
		 */

		ArrayList<Spedizione> listaSpedizioni = new ArrayList<Spedizione>();
		creaSpedizione(listaSpedizioni, listaPacchi, listaDestinatari);
		// System.out.println(listaSpedizioni);
		for (Spedizione sp : listaSpedizioni) {
			System.out.println(sp);
			output += sp;
			tot += sp.getPrezzo();
		}
		System.out.println("\n\n*************************\nRECAP\n*************************\n");
		output += "\n\n*************************\nRECAP\n*************************\n";
		System.out.println("Totale guadagni da spezioni correnti: " + tot + "€");
		output += "Totale guadagni da spezioni correnti: " + tot + "€";

		FileWriter fw = new FileWriter("output.txt");
		fw.write(output);
		// System.out.println(output);
		fw.close();
	}

}
