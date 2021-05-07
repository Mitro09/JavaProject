package classiAstratte;

public class Risotto extends Ricetta {

	public Risotto(String nome) {
		super(nome);
	}

	@Override
	public void recuperaIngredienti() {
		System.out.println("- Riso, soffritto, brodo");
		
	}

	@Override
	public void preparaIngredienti() {
		System.out.println("- Preparo soffritto, metto riso, sfumo con brodo");

	}

	@Override
	public void cucina() {
		System.out.println("- Cuocere a fuoco medio per 20 min");

	}

	@Override
	public void impiatta() {
		System.out.println("- Impiattare con abbondante parmigiano");

	}

}
