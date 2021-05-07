package generics;

import java.util.ArrayList;

public class ArrayGeneric<T> {

	ArrayList<T> miaLista = new ArrayList<T>();
	
	public void aggiungi(T t) {
		miaLista.add(t);
	}
	
	public void aggiungiN(T...t) {
		for(T t2 : t) {
			miaLista.add(t2);
		}
	}

	@Override
	public String toString() {
		return "ArrayGeneric --> "+miaLista;
	}
	
	
	
}
