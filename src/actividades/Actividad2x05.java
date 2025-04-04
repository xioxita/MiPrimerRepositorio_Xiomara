package actividades;

import java.util.Scanner;

public class Actividad2x05 {

	public static void main(String[] args) {
		// Declarar variables
		double numeroA, numeroB, numeroC;
		boolean mayorA, mayorB;
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
		
		// Se pide por pantalla el numero real
		System.out.print("Escribe el primer número real: ");
		numeroA = teclado.nextDouble();
		
		System.out.print("Escribe el segundo número real, distinto al otro: ");
		numeroB = teclado.nextDouble();
		
		System.out.print("Escribe el tercer número real, distinto a los otros: ");
		numeroC = teclado.nextDouble();
		
		mayorA = (numeroA > numeroB) && (numeroA > numeroC);
		mayorB = (numeroB > numeroA) && (numeroB > numeroC);
		
		if (mayorA) {
			System.out.print("El número real " + numeroA + " es mayor.");
		} else if (mayorB) {
			System.out.print("El número real " + numeroB + " es mayor.");
		} else {
			System.out.print("El número real " + numeroC + " es mayor.");
		}
		
		teclado.close();
	}

}
