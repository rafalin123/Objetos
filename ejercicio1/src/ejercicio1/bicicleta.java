package ejercicio1;

public class bicicleta {

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
	public void cambiarplato(int plato) {}
	public void cambiarpinion(int pinion) {}

}
