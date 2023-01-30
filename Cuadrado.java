
//Programa de Miguel Angel Reyes Contreras ID:178139

public class Cuadrado {
	public int longitud;
	public double diagonal;
	public int perimetro;
	public int area;
	
	public Cuadrado() {
		this(178139);
	}
	
	 public Cuadrado(int ID) {
		longitud = ID;
		
	}
	 
	public int calcularPerimetro(){
		return perimetro = longitud*4;
	}
	public int cambiarLongitud(int longitud) {
		return this.longitud = longitud;
	}
	
	public int calcularArea(){
		return area = longitud*longitud;
	}
	
	public double calcularDiagonal(){
		return diagonal = Math.sqrt(Math.pow(longitud, 2) + Math.pow(longitud, 2));
	}
	 
}
