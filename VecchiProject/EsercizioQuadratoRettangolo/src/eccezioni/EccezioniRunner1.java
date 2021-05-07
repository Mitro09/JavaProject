package eccezioni;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EccezioniRunner1 {

	public static void main(String[] args) {
		
		int[]a = {1,2,3};
		
		
		String s;
		
		int b=0;
		
		do {
			
			//System.out.println(a[1]);
			//System.out.println(a[3]);
			Scanner sc = new Scanner(System.in);
			System.out.println("inserire numero, (* per chiudere)");
			s = sc.next();
				
			if(!s.equals("*")) {
				try {
					b = Integer.parseInt(s);
					System.out.println("Hai inserito il numero "+b);
					sc = null;
					
				}
				catch (NumberFormatException e) {
					System.out.println("Sono ammessi solo numeri e il carattere \"*\"");
				}
				catch(InputMismatchException e) {
					System.out.println("ERROR: valore non valido");
				}
				
				catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Si è verificato un errore nell' array");
				}
				catch (Exception e) {
					System.out.println("ERROR");
				}

					
			}
			else {
				b = -1;
			}
				
			
			
			
			
			/*finally {
				sc.close();
				System.out.println("questa istruzione deve essere eseguita sempre");
			}*/
			
		} while(b != -1);
		
		System.out.println("termine regolare");


	}

}
