package classiAstratte;

public class Pasta extends Ricetta{

	public Pasta(String nome) {
		super(nome);
	}

	@Override
	public void recuperaIngredienti() {
		System.out.println("- Pasta, sugo");
	}

	@Override
	public void preparaIngredienti() {
		System.out.println("- Preparo il sugo, cuocio la pasta");
		
	}

	@Override
	public void cucina() {
		System.out.println("- Cottura a fuoco medio per 10 min");
		
	}

	@Override
	public void impiatta() {
		System.out.println("- Impiatto con parmigiano");
		
	}

}
