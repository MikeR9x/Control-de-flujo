
//Programa de Miguel Angel Reyes Contreras ID:178139

public class Circulo {
	public int radio;
	public double circunferencia;
	public double area;
	
	
	public Circulo() {
		this(178139);
	}
	
	 public Circulo(int ID) {
		radio = ID;
	}
	
	
	public double calcularArea(){
		return area = Math.PI*(Math.pow(radio, 2));
	}
	
	public double calcularCircunferencia() {
		return circunferencia = 2*Math.PI*radio;
	}
	
	public int cambiarRadio(int radio) {
		return this.radio = radio;
	}
	 
}
