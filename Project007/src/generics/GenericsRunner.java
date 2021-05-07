package generics;

import java.util.ArrayList;

public class GenericsRunner {
	
	public static void aggiungiStringa(ArrayList<String> al, String...s) {
		for(String string : s) {
			al.add(string);
		}
	}
	
	public static void aggiungiIntero(ArrayList<Integer> al, int...i) {
		for(int intero : i) {
			al.add(intero);
		}
	}
	
	public static <T> void aggiungi(ArrayList<T> al, T...t) {
		for(T val : t) {
			al.add(val);
		}
	}

	public static void main(String[] args) {
		
		ArrayList<String> s1 = new ArrayList<String>();
		aggiungiStringa(s1, "bbb","ccc","ddd");
		System.out.println(s1);
		
		ArrayList<Integer> i1 = new ArrayList<Integer>();
		aggiungiIntero(i1, 0,10,100,500,1000);
		System.out.println(i1);
		
		aggiungi(i1, 2000,5000,10000);
		System.out.println(i1);
		
		
		ArrayGeneric<String> ag1 = new ArrayGeneric<String>();
		ArrayGeneric<Integer> ag2 = new ArrayGeneric<Integer>();
		
		ag1.aggiungiN("a","b","c");
		ag2.aggiungiN(1,2,3,4,5,6,7,8,9);
		System.out.println(ag2);
		
		
		Studente st1 = new Studente(1,"aa","bb");
		Studente st2 = new Studente(2,"cc","dd");
		Studente st3 = new Studente(3,"ee","ff");
		
		ArrayGeneric<Studente> ag3 = new ArrayGeneric<Studente>();
		ag3.aggiungiN(st1,st2,st3);
		System.out.println(ag3);
		
		
	

	}

}
