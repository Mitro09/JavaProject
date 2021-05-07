package files;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class ScritturaFileRunner {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("output.txt");
		
		fw.write("uno");
		fw.write("\ndue");
		fw.write("\ntre");
		fw.write("\nCristoInfame");
		System.out.println("OK");
		fw.close();
		
		LocalDateTime ora_di_creazione = LocalDateTime.now();
		
		FileWriter fw2 =  new FileWriter("output2.txt");
		
		fw2.write("file creato il "+ora_di_creazione.getDayOfMonth()+"/"+ora_di_creazione.getMonthValue()+"/"+ora_di_creazione.getYear());
		fw2.write("\nalle ore "+ora_di_creazione.getHour()+":"+ora_di_creazione.getMinute());
		//System.out.println("OK2");
		
		fw2.close();
		
		FileWriter fw3 = new FileWriter("rngOutput.txt");
		for (int i=1; i<=50; i++) {
			String s1="";
			for(int j=1; j<=80; j++) {
				int i1 = (int)(Math.random()*77)+48;
				s1 += Character.toString((char)i1);
			}
			fw3.write(s1+"\n");
		}
		fw3.close();
		
		
	}

}
