package ejercicio1;
import java.util.Scanner;

public class bicicleta {
	Scanner in = new Scanner(System.in);

	private int velocidad;
	private int plato;
	private int pinion;
	
	//CONSTRUCTOR
	bicicleta (int velocidad, int plato, int pinion) {
		this.velocidad= velocidad;
		this.plato = plato;
		this.pinion = pinion;
	}
	
	//COMPORTAMIENTO
	public int acelerar() {
		velocidad = velocidad*2;
		return velocidad;
	}
	public int frenar() {
		velocidad = velocidad/2;
		return velocidad;
	}
	public int cambiarplato(int plato) {
		System.out.println("Selecciona el plato deseado entre 1, 2, 3.");
		int num = in.nextInt();
		plato = num;
		System.out.print("El plato seleccionado es ");return plato;
	}
	public int cambiarpinion(int pinion) {
		System.out.println("Selecciona el piñon deseado entre 1 y 6");
		int num = in.nextInt();
		pinion = num;
		System.out.print("El plato seleccionado es ");return pinion;
	}

	public int platoypinionpordefecto() {
		plato = 1;
		pinion = 1;
		System.out.println("Ahora el plato y piñon de ambas bicicletas estan por defecto, en concreto");
			return pinion;
	}
	
}
