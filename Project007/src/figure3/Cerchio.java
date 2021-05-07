package figure3;

public class Cerchio extends Figura {

	
	private Punto origine;
	private int raggio;
	final double Pi=3.1415;
	
	public Cerchio(Punto or , int r) 
	{
		origine=or;
		raggio=r;
	}
	

	

	
	
	
	@Override
	public double perimetro() {
		
		double per= Math.round(raggio*Pi*2*100);
		return per/100;
	}

	@Override
	public double area() {
		double ar=Math.round(raggio*raggio*Pi*100);
		return ar/100;
	}







	@Override
	public String toString() {
		return "Cerchio [origine=" + origine + ", raggio=" + raggio + ", Pi=" + Pi + "]";
	}
	
	
	
	
	
	
	
	

}
