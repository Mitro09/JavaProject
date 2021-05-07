import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Persona {
	
	private String sesso;
	private double peso;
	private double altezza;  
	private LocalDate dataNascita;
	
	public void chiediDati() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Sei un maschio(M) o femmina(F)");
		this.sesso = sc.next().toUpperCase();
		try {
			System.out.println("Indica il tuo peso(Kg)");
			this.peso = sc.nextDouble();
			System.out.println("Indica la tua altezza(cm)");
			this.altezza = sc.nextDouble();
		}
		catch(NumberFormatException e) {
			System.out.println("ERROR: Inserimento Sbagliato");
		}
		catch(Exception e) {
			System.out.println("Errore non definito");
		}
		this.dataNascita = inserisciDataNascita();
		sc = null;
	}

	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltezzaInCm() {
		return altezza;
	}
	
	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}
	
	public double getAltezzaInMetri() {
		double AltM = this.getAltezzaInCm()/100;
		return AltM;
	}
	
	public String getSesso() {
		return sesso;
	}
	
	public void setSesso(String sesso) {
		this.sesso = sesso;
	}
	
	public double calcolaBMI() {
		double bmi = this.getPeso()/(Math.pow(this.getAltezzaInMetri(), 2));
		return bmi;
	}
	
	public static LocalDate inserisciDataNascita() {
		System.out.println("Inserire una data (GG/MM/AAAA)");
		Scanner sc = new Scanner(System.in);
		String d = sc.next();
		String[] d2 = d.split("/");
		LocalDate d3 = LocalDate.of(Integer.parseInt(d2[2]), Integer.parseInt(d2[1]), Integer.parseInt(d2[0]));
		return d3;
		
	}
	
	public LocalDate getDataNascita() {
		return this.dataNascita;
	}
	
	public double calcoloEta() {
		LocalDate today = LocalDate.now();
		return ChronoUnit.YEARS.between(this.getDataNascita(), today);
	}
	
	public void calcoloGrassoCorporeo() {
		double bmi=this.calcolaBMI();
		double eta=this.calcoloEta();
		double sesso;
		if(this.getSesso().equalsIgnoreCase("m")) {
			sesso=1;
		}
		else {
			sesso=0;
		}
			
		double deuremberg = (1.29*bmi)+(0.20*eta)-(11.4*sesso)-8;
		double gallagher = (1.46+bmi)+(0.14*eta)-(11.6*sesso)-10;
		System.out.println("Formula di Deuremberg - Totale grasso corporeo: "+deuremberg+"%");
		System.out.println("Formula di Gallagher - Totale grasso corporeo: "+gallagher+"%");
		
	}
	
	public static String dataIta(LocalDate data) {
		String[] data2 = data.toString().split("-");
		return (data2[2]+"/"+data2[1]+"/"+data2[0]);
	}

	@Override
	public String toString() {
		String s ="***************";
		s += "\n****PERSONA****";
		s += "\n***************";
		s += "\nsesso: " + sesso + " \npeso: " + peso + "Kg \naltezza: " + altezza + "cm \nData Nascita: " + dataIta(dataNascita) + "\nAnni: " + (int)this.calcoloEta();
		return s;
	}

}
