
public class ClienteFedele extends Cliente{
	
	private int codiceFedelta;
	private int sconto;
	
	public ClienteFedele(String nome) {
		super(nome+" xF");
	}

	public int getCodiceFedelta() {
		return codiceFedelta;
	}

	public void setCodiceFedelta(int codiceFedelta) {
		this.codiceFedelta = codiceFedelta;
	}

	public int getSconto() {
		return sconto;
	}

	public void setSconto(int sconto) {
		this.sconto = sconto;
	}
	
	

}
