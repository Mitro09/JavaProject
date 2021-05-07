package proveadcazzum;

import java.security.SecureRandom;

public class ProvaEsplosionePC {

	public static void main(String[] args) {

		String caratteri = "abcdefghijklmnopqrstuvzxyz";
		int lunghezza = 5;
		StringBuilder sb = new StringBuilder(lunghezza);
		long cicli=0;
		do {
			SecureRandom sr = new SecureRandom();
			for(int i=0; i<lunghezza; i++) {
				int randomInt = sr.nextInt(caratteri.length());
				char randomChar = caratteri.charAt(randomInt);
				sb.append(randomChar);
				cicli++;
			}
		}while (sb.toString() != "inter" && cicli <= 5000000);
		if(cicli == 5000000) {
			System.out.println("ERROR");
		}
		else{
			System.out.println(sb.toString()+" in "+cicli+" cicli");
		}
	}

}
