package proveenum;

public class EnumRunner {

	static enum stagioni{
		primavera,
		estate,
		autunno,
		inverno;
	}
	
	enum aliquote_iva{
		al4(4),
		al10(10),
		al22(22),
		al(35);
		
		private int value;
		private aliquote_iva(int value) {
			this.value=value;
		}
	}
	
	public static void main(String[] args) {
		
		stagioni oggi = stagioni.primavera;
		
		switch (oggi) {
		case primavera:
			System.out.println("data compresa tra 21/03 e 20/06");
			break;
			
		case estate:
			System.out.println("data compresa tra 21/06 e 20/09");
			break;
			
		case autunno:
			System.out.println("data compresa tra 21/09 e 20/12");
			break;
			
		case inverno:
			System.out.println("data compresa tra 21/12 e 20/03");
			break;
			
		default:
			System.out.println("SUCA!");
			break;
		}
		
		
		UtenteEnum ue1 = new UtenteEnum("mariolino");
		System.out.println(ue1);
		ue1.attivazioneUtente();
		System.out.println(ue1);
		ue1.disattivazioneUtente();
		System.out.println(ue1);
		ue1.verificaUtente();
		
		aliquote_iva iva_22 = aliquote_iva.al22;
		System.out.println(iva_22.value);
		double prezzo = 10.5;
		System.out.println("prezzo originale: "+prezzo);
		System.out.println("IVA: "+prezzo*aliquote_iva.al22.value/100);
		System.out.println("prezzo con IVA: "+(prezzo+(prezzo*aliquote_iva.al22.value/100)));
		System.out.println("IVA applicata: "+iva_22.value+"%");
		
	}

}
