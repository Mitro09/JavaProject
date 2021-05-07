import java.util.ArrayList;

public class Frazione {
	
	private int denominatore;
	private int numeratore;
	
	
	Frazione(int num,int den){
		this.numeratore = num;
		this.denominatore = den;
		this.semplificaFrazione();
	}
	
	Frazione(int num){
		this.numeratore = num;
		this.denominatore = 1;
	}
	
	Frazione(String fraz){
		if (fraz.contains("/")) {
			String frazSlash[] = fraz.split("/");
			this.numeratore = Integer.parseInt(frazSlash[0]);
			this.denominatore = Integer.parseInt(frazSlash[1]);
			
		}
		else if(fraz.contains("-")) {
			String frazTrat[] = fraz.split("-");
			this.numeratore = Integer.parseInt(frazTrat[0]);
			this.denominatore = Integer.parseInt(frazTrat[1]);
		}
		else if(fraz.contains("\\")) {
			String frazBackSlash[] = fraz.split("\\\\");
			this.numeratore = Integer.parseInt(frazBackSlash[0]);
			this.denominatore = Integer.parseInt(frazBackSlash[1]);
		}
		this.semplificaFrazione();
	}
	
	
	public void sommaFrazioni(Frazione fraz) {
		this.numeratore = (this.numeratore*fraz.denominatore) + (this.denominatore*fraz.numeratore);
		this.denominatore = (this.denominatore*fraz.denominatore);
		
		this.semplificaFrazione();
		
	}
	
	public void semplificaFrazione() {
		int mcd = 1;
		ArrayList<Integer> divisoriNum = new ArrayList<Integer>();
		ArrayList<Integer> divisoriDen = new ArrayList<Integer>();
		
		for (int i=1; i<=this.numeratore; i++) {
			if(this.numeratore % i == 0) {
				divisoriNum.add(i);
			}
		}
		
		for (int i=1; i<=this.denominatore; i++) {
			if(this.denominatore % i == 0) {
				divisoriDen.add(i);
			}
		}
		
		if(this.numeratore <= this.denominatore) {
			for(int temp: divisoriNum) {
				if(divisoriDen.contains(temp)) {
					mcd = temp;
				}
			}
		}
		this.numeratore /= mcd;
		this.denominatore /= mcd;
	}

	@Override
	public String toString() {
		return ""+this.numeratore+"/"+this.denominatore+"";
	}

}
