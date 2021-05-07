
public class Donna extends Persona{
	
	Donna(Persona p){
		this.setSesso(p.getSesso());
		this.setPeso(p.getPeso());
		this.setAltezza(p.getAltezzaInCm());
	}
	
	public void verificaBMI() {
		double bmi = super.calcolaBMI();
		if (bmi < 18.7) {
			System.out.println("BMI: "+bmi+"\nSottopeso");
		}
		else if(bmi < 23.8) {
			System.out.println("BMI: "+bmi+"\nPeso Ottimale");
		}
		else if(bmi < 28.6) {
			System.out.println("BMI: "+bmi+"\nSovrappeso");
		}
		else if(bmi < 35) {
			System.out.println("BMI: "+bmi+"\nObesità 1°Grado");
		}
		else if(bmi < 40) {
			System.out.println("BMI: "+bmi+"\nObesità di 2°Grado");
		}
		else {
			System.out.println("BMI: "+bmi+"\nObesità di Alto Grado");
		}
	}

}
