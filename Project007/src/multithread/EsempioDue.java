package multithread;


//classe che estendono Thread o implementano Runnable

class Task1 extends Thread{
	public void run() {//sempre uguale
		
		System.out.println("Processo 1 iniziato");
		for(int i=100; i<=199; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nprocesso 1 finito");
		
	}
}

class Task2 implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Processo 2 iniziato");
		for(int i=200; i<=299; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nprocesso 2 finito");
		
	}
	
}

class Task3 implements Runnable{

	@Override
	public void run() {
		System.out.println("Processo 3 iniziato");
		for(int i=300; i<=399; i++) {
			System.out.print(i+" ");
		}
		System.out.println("\nprocesso 3 finito");
	}
	
}

public class EsempioDue {

	public static void main(String[] args) throws InterruptedException {

		//TASK 1
		Task1 t1 = new Task1();
		//t1.run(); //cosi non è multithread
		t1.setPriority(10);//default 5 - min 1 - max 10
		t1.start();
		
		//TASK 2
		Task2 t2 = new Task2();
		Thread t2thr = new Thread(t2);
		t2thr.start();
		Thread.sleep(10000);
		
		//TASK 3
		Task3 t3 = new Task3();
		Thread t3thr = new Thread(t3);
		t3thr.setPriority(1);
		t3thr.start();
		
		t2thr.join();
		
		System.out.println("\n\n\nProcesso principale terminato");
		
	}

}
