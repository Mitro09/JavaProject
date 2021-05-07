package eccezioni;

import java.util.Scanner;

public class EccezioniRunner2 {

    public static void main(String[] args) {

        int[] a= {1,2,3};
        int b=0;
        String s="";

        do {
            Scanner sc=new Scanner(System.in);
            System.out.print("Prego inserire un numero (# per terminare): ");
            s=sc.next();

            if(!s.equals("#")) {

                try {

                    b=Integer.parseInt(s);
                    System.out.println("Hai inserito il numero "+s);
                    sc=null;

                }catch (NumberFormatException e) {

                    System.out.println("Hai inserito un valore non valido (numeri o #).");
                }

            }


        }while(!s.equals("#"));


        System.out.println("Termine regolare del programma");
    }

}