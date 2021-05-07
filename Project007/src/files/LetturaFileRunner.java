package files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class LetturaFileRunner {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis1 = new FileInputStream("./src/files/elenco.txt");
		Scanner sc = new Scanner(fis1);
		ArrayList<String> righeFile = new ArrayList<String>();
		HashMap<String, String> righeFile2 = new HashMap<String, String>();
		int n_riga=1;
		while (sc.hasNextLine()) {
			String riga = sc.nextLine();
			righeFile.add(riga);
			righeFile2.put("Riga num "+n_riga, riga);
			n_riga++;
			//System.out.println(sc.nextLine());
		}
		System.out.println(righeFile);
		for(int i=1;i<=righeFile2.size();i++) {
			System.out.println(righeFile2.get("Riga num "+i));
		}

		
	}

}
