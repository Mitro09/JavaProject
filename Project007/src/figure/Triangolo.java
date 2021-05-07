package figure;

public class Triangolo {

	private Punto v1;
	private Punto v2;
	private Punto v3;
	
	
	public Triangolo (Punto a , Punto b , Punto c) 
	{
		v1=a;
		v2=b;
		v3=c;
	}
	
	public double perimetro() 
	{
		Segmento lato1 = new Segmento(v1,v2);
		Segmento lato2 = new Segmento(v2,v3);
		Segmento lato3 = new Segmento(v3,v1);
		
		return lato1.lunghezzaSegmento() + lato2.lunghezzaSegmento() + lato3.lunghezzaSegmento();
	}
	
	public double area() 
	{
		Segmento lato1 = new Segmento(v1,v2);
		Segmento lato2 = new Segmento(v2,v3);
		Segmento lato3 = new Segmento(v3,v1);
		
		double p=this.perimetro()/2;
		double area =Math.sqrt(p*((p-lato1.lunghezzaSegmento())*(p-lato2.lunghezzaSegmento())*(p*lato3.lunghezzaSegmento())));
		area=Math.round(area*100);
		return area/100;
	}


	@Override
	public String toString() {
		return "Triangolo [v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
	}
	
	
	
	
	
}
