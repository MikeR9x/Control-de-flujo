import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			while(true) {
				System.out.println("Ingresa la figura que quieres hacer 1: circulo 2: cuadrado o 3:salir");
				int respuesta = Integer.parseInt(scan.next());
				switch(respuesta) {
				case 1:
					Cuadrado c = new Cuadrado(); 
					System.out.println("Ingresa la longitud del Cuadrado");
					c.cambiarLongitud(scan.nextInt());
					System.out.println("La longitud es: " + c.longitud);
					System.out.println("Ingrese la operación que desea calcular:");
					System.out.println("1: diagonal");
					System.out.println("2: area");
					System.out.println("3: perimetro");
					int operacion = Integer.parseInt(scan.next());
					switch(operacion) {
					case 1:
						System.out.println("La diagonar es: " + c.calcularDiagonal());
						break;
					case 2:
						System.out.println("El area es: " + c.calcularArea());
						break;
					case 3:
						System.out.println("El perimetro es: " + c.calcularPerimetro());
						break;
					default:
						System.out.println("Número invalido, ingresa nuevamente la operación deseada");
					}
					break;
				case 2:
					Circulo z = new Circulo();
					System.out.println("Ingresa el radio del Circulo");
					z.cambiarRadio(scan.nextInt());
					System.out.println("El radio es: " + z.radio);
					System.out.println("Que desea calcular:");
					System.out.println("1: circunferencia");
					System.out.println("2: area");
					int condicion = Integer.parseInt(scan.next());
					switch(condicion) {
					case 1:
						System.out.println("La circunferencia es: " + z.calcularCircunferencia());
						break;
					case 2:
						System.out.println("El area es: " + z.calcularArea());
						break;
					default:
						System.out.println("Número invalido, ingresa nuevamente la operación deseada");
					}
					break;
				case 3:
					System.out.println("Exiting...");
					System.exit(0);
					break;
				default:
					System.out.println("Número invalido, ingresa nuevamente la figura deseada");
					break;
				}
			}
		}
	}
}
