package figure2;

public class FigureRunner {

	public static void main(String[] args) {
		
		Punto p1 = new Punto(2,5);
		Punto p2 = new Punto(-2,4);
		Punto p3 = new Punto();
		Punto p4 = new Punto(1,10);
		
		Segmento s1 = new Segmento(p1 , p2);
		Segmento s2 = new Segmento(p4);
		Segmento s3 = new Segmento(new Punto(1,2) , new Punto(3,4));
		Segmento s4 = new Segmento();
		
		
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
		
		System.out.println(p1.trovaQuadrante());
		System.out.println(p2.trovaQuadrante());
		System.out.println(p3.trovaQuadrante());
		
		
		System.out.println(s1 + "; Lunghezza del segmento= " + s1.lunghezzaSegmento());
		System.out.println(s2 + "; Lunghezza del segmento= " + s2.lunghezzaSegmento());
		System.out.println(s3 + "; Lunghezza del segmento= " + s3.lunghezzaSegmento());
		System.out.println(s4 + "; Lunghezza del segmento= " + s4.lunghezzaSegmento());
		
		
		Figura t1= new Triangolo(p1,p2,p3);
		Figura t2= new Triangolo(new Punto(0,4),new Punto(5,2),new Punto(3,-1));
		
		System.out.println(t1);
		System.out.println("Perimetro= " + t1.perimetro());
		System.out.println("Area= " + t1.area());
		System.out.println(t2);
		System.out.println("Perimetro= " + t2.perimetro());
		System.out.println("Area= " + t2.area());
		
		
		Figura r1 = new Rettangolo(new Punto(),4,3);
		Figura r2 = new Rettangolo(new Punto(1,1) , new Punto(3,2));
		
		System.out.println("Dati rettangolo r1: " + r1);
		System.out.println("Perimetro r1 : " + r1.perimetro());
		System.out.println("Area r1 : " + r1.area());
		
		System.out.println("Dati rettangolo r2: " + r2);
		System.out.println("Perimetro r2 : " + r2.perimetro());
		System.out.println("Area r2 : " + r2.area());
		
		
		Figura q1 = new Quadrato(new Punto(2,1) , 5);
		System.out.println("Dati quadrato q1: " + q1);
		System.out.println("Perimetro q1 : " + q1.perimetro());
		System.out.println("Area q1 : " + q1.area());
		
		Figura[] figure = {t1 ,t2 ,r1,r2,q1};
		
		double areaTotale=0;
		
		for (Figura figura : figure) {
			areaTotale+=figura.area();
		}
		
		System.out.println("L'area Totale figure è : " + areaTotale);
		

	}

}
