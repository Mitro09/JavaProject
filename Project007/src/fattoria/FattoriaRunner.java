package fattoria;

public class FattoriaRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animale isidoro = new Gatto("isidoro");
		Animale fido = new Cane("fido");
		Animale sansone = new Cane("sansone");
		Animale ortensia = new Mucca("ortensia");
		Animale gennarino = new Animale("gennarino");
		Animale ciccina = new Gallina("ciccina");
		
		Animale[] fattoria = {isidoro,fido,sansone,ortensia,gennarino,ciccina};
		System.out.println("Le voci della fattoria");
		for(Animale animale : fattoria) {
			animale.verso();
			animale.verso2();
		}

	}

}
