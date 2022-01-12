package ejercicio1;

public class Bicicletas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bicicleta mibicicleta = new bicicleta(20,2,4);
		bicicleta tubicicleta = new bicicleta(15,1,5);
		
		System.out.print("La velocidad de mi bici despues de acelerar es: ");System.out.println(mibicicleta.acelerar());
		System.out.print("La velocidad de tu bici despues de acelerar es: ");System.out.println(tubicicleta.acelerar());
		System.out.print("La velocidad de mi bici despues de frenar es: ");System.out.println(mibicicleta.frenar());
		System.out.print("La velocidad de tu bici despues de frenar es: ");System.out.println(mibicicleta.frenar());
}
}
