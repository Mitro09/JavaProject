package figure2;

public class Rettangolo extends Figura {

	private Punto angoloBassoSx;
	private Punto angoloAltoDx;
	int base;
	int altezza;
	
	public Rettangolo() 
	{
		this(new Punto(), new Punto());
	}
	
	public Rettangolo(Punto Bs , int base , int altezza) 
	{
		angoloBassoSx=Bs;
		this.base=base;
		this.altezza=altezza;
	}
	
	public Rettangolo(Punto Bs , Punto Ad) 
	{
		this(Bs , Ad.getX()-Bs.getX() , Ad.getY()-Bs.getY());
		angoloAltoDx=Ad;
		
	}
	
	public double perimetro () 
	{
		return (base+altezza)*2;
	}
	
	public double area () 
	{
		return base*altezza;
	}


	
	@Override
	public String toString() {
		return "Rettangolo [angoloBassoSx=" + angoloBassoSx + ", angoloAltoDx=" + angoloAltoDx + ", base=" + base
				+ ", altezza=" + altezza + "]";
	}
	
	
}
