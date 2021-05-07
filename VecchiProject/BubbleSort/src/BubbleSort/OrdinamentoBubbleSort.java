package BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;


public class OrdinamentoBubbleSort {
	
	
	public static void BubbleSortI(int[] vettore){
	
		int i, j, tmp;
		for ( i = 1; i < vettore.length; i++)
		{
			 for ( j = vettore.length-1; i <= j; j--)
			{
				if (vettore[j-1] > vettore[j])
				{
					tmp = vettore[j-1];
					vettore[j-1] = vettore[j];
					vettore[j] = tmp;
				}
			}
		}
	}
	
	public static void BubbleSortStr(String[] vettore){
		
		int i, j; 
		String tmp;
		for ( i=1; i < vettore.length; i++)
		{
			 for ( j = vettore.length-1; i <= j; j--)
			{
				if (vettore[j-1].compareTo(vettore[j]) > 0)
				{
					tmp = vettore[j-1];
					vettore[j-1] = vettore[j];
					vettore[j] = tmp;
				}
			}
		}
	}
	
	public static void BubbleSortArrInt(ArrayList<Integer> vettore){
		
		//2, 34 , 5 , 18
		int i, j, tmp;
		for ( i = 1; i < vettore.size(); i++)
		{
			 for ( j = vettore.size()-1; i <= j; j--)
			{
				if (vettore.get(j-1) > vettore.get(j))
				{
					tmp = vettore.get(j-1);
					vettore.set(j-1, vettore.get(j));
					vettore.set(j, tmp);
				}
			}
		}
	}
	
public static void BubbleSortArrStr(ArrayList<String> vettore){
		
		int i, j; 
		String tmp;
		for ( i = 1; i < vettore.size(); i++)
		{
			 for ( j = vettore.size()-1; i <= j; j--)
			{
				if (vettore.get(j-1).compareTo(vettore.get(j)) > 0)
				{
					tmp = vettore.get(j-1);
					vettore.set(j-1, vettore.get(j));
					vettore.set(j, tmp);
				}
			}
		}
	}

/*public static void BubbleSortArrStud (ArrayList<String> vettore) {
	
	//SONO IN DOWN NON RIESCO PROPRIO A VISUALIZZARE IL DA FARSI 
	int i, j, valore; 
	String tmp;
	for ( i = 1; i < vettore.size(); i++)
	{
		 for ( j = vettore.size()-1; i <= j; j--)
		{
			if (j >= 0 && vettore.get(j).compareTo(vettore.get(j)) > 0)
			{
				tmp = vettore.get(j-1);
				vettore.set(j-1, vettore.get(j));
				vettore.set(j, tmp);
			}
		}
	}
}



static void insertSortStudente (ArrayList<Studente> al) {
	int i, j, valore;
	Studente s1;
	for (i=1; i < al.size(); i++) {
		valore = al.get(i).getId();
		s1 = al.get(i);
		j = i-1;
		//elemento j del vettore maggiore di valore
		while(j >= 0 && al.get(j).getId()> valore) {
			//vettore.set(j+1, vettore.get(j));
			al.set(j+1, al.get(j));
			j = j --;
		}
		al.set(j+1, s1);
	}*/


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] vettore1 = {1, 34, 56, 12, 9 , 20};
		String [] vettore2 = {"Giovanni", "Ernesto", "Giacomo", "Riccardo"};
		
		System.out.println(Arrays.toString(vettore1));
		System.out.println(Arrays.toString(vettore2));
		
		BubbleSortI(vettore1);
		System.out.println(Arrays.toString(vettore1));
		
		BubbleSortStr(vettore2);
		System.out.println(Arrays.toString(vettore2));
		
		ArrayList al1 = new ArrayList();
		ArrayList al2 = new ArrayList();
		
		al1.add(2);
		al1.add(34);
		al1.add(5);
		al1.add(18);
		
		//avrei potuto creare metodo per caricare più valori nell'array con ciclo for?
		
		al2.add("Giorgio");
		al2.add("Davide");
		al2.add("Totuccio");
		al2.add("Klark");
		
		
		BubbleSortArrInt(al1);
		System.out.println(al1);
		
		BubbleSortArrStr(al2);
		System.out.println(al2);
		
		
	
		
	}

}
