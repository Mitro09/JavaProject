
public class FrazioneRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frazione fraz1 = new Frazione(2,3);
		System.out.println("F1 = "+fraz1);
		
		Frazione fraz2 = new Frazione(5);
		System.out.println("F2 = "+fraz2);
		
		Frazione fraz3 = new Frazione("2/4");
		System.out.println("F3 = "+fraz3);
		
		fraz1.sommaFrazioni(fraz3);
		System.out.println("F1 = F1 + F3 = "+fraz1);
		
		Frazione fraz4 = new Frazione("5\\2");
		System.out.println("F4 = "+fraz4);
		
		/*Frazione fraz5 = new Frazione(14,12);
		System.out.println(fraz5);*/
		

	}

}

