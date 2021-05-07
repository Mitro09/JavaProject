import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class DataRunner {
	
	
	public static String dataIta(LocalDate data) {
		String[] data2 = data.toString().split("-");
		return (data2[2]+"-"+data2[1]+"-"+data2[0]);
	}

	public static void main(String[] args) {
		
		LocalDate adesso = LocalDate.now();
		System.out.println("Data odierna: "+adesso);
		
		LocalDate dataParticolare = LocalDate.of(2001, 8, 15);
		System.out.println("Data impostata: "+dataParticolare);
		
		LocalDate unMeseFa = adesso.minusMonths(1);
		System.out.println("Un mese fa: "+unMeseFa);
		
		int differenzaGiorni = (int)ChronoUnit.DAYS.between(dataParticolare, unMeseFa);
		System.out.println("Differenza giorni: "+differenzaGiorni);
		
		LocalDate miaNascita = LocalDate.of(1994, 6, 27);
		System.out.println("Giorni vissuti: "+ChronoUnit.DAYS.between(miaNascita, adesso));
		
		
		/*String dataOggi = adesso.toString();
		String[] dd = dataOggi.split("-");*/
		System.out.println("Oggi: "+dataIta(adesso));
		
		
		System.out.println("Inserire una data (GG/MM/AAAA)");
		Scanner sc = new Scanner(System.in);
		String d = sc.next();
		String[] d2 = d.split("/");
		LocalDate d3 = LocalDate.of(Integer.parseInt(d2[2]), Integer.parseInt(d2[1]), Integer.parseInt(d2[0]));
		System.out.println("Data inserita: "+d3);
	
	}

}
