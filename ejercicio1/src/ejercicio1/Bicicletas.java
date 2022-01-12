package ejercicio1;
import java.util.Scanner;
public class Bicicletas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		bicicleta mibicicleta = new bicicleta(20,2,4);
		bicicleta tubicicleta = new bicicleta(15,1,5);
		
		System.out.println("ELIGE ENTRE LAS SIGUENTES OPCIONES: (1)Acelerar las dos bicicletas, (2)Frenar las dos bicicletas, (3)Cambiar el plato y cambiar el piñon, (4)Valores por defecto para plato y piñon.");
		int num = in.nextInt();
		switch (num) 
		{
		case 1:
			System.out.print("La velocidad de mi bici despues de acelerar es: ");System.out.println(mibicicleta.acelerar());
			System.out.print("La velocidad de tu bici despues de acelerar es: ");System.out.println(tubicicleta.acelerar());
		case 2:
			System.out.print("La velocidad de mi bici despues de frenar es: ");System.out.println(mibicicleta.frenar());
			System.out.print("La velocidad de tu bici despues de frenar es: ");System.out.println(tubicicleta.frenar());
		case 3:
			System.out.println("De que bicicleta deseas cambiar el plato: 1)Mi bicibleta 2)Tu bicicleta");
			int num1 = in.nextInt();
			if (num1 == 1) {
				System.out.println(mibicicleta.cambiarplato(num));
				System.out.println(mibicicleta.cambiarpinion(num));
			}else {
				System.out.println(tubicicleta.cambiarplato(num));
				System.out.println(tubicicleta.cambiarpinion(num));
			}
		case 4:
			System.out.println(mibicicleta.platoypinionpordefecto());
		}
		
		
		

	
	}
}
