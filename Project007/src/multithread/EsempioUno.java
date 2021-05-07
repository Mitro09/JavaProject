package multithread;

public class EsempioUno {

	public static void main(String[] args) {

		//TASK 1
		System.out.println("Processo 1 iniziato");
		for(int i=100; i<=199; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nprocesso 1 finito");
		
		//TASK 2
		System.out.println("Processo 2 iniziato");
		for(int i=200; i<=299; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nprocesso 2 finito");
		
		//TASK 3
		System.out.println("Processo 3 iniziato");
		for(int i=300; i<=399; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nprocesso 3 finito");
		
	}

}
