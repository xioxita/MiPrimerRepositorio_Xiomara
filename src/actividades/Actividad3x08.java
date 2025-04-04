package actividades;

import java.util.Scanner;

public class Actividad3x08 {

	public static void main(String[] args) {
		// Declarar variables
			double numeroA, numeroB, numeroC, minimo, maximo;
			
			// Se declara e inicializa el teclado
			Scanner teclado = new Scanner(System.in);
			
			// Se pide por pantalla el numero real
			System.out.print("¿Número Real A? ");
			numeroA = teclado.nextDouble();
			
			System.out.print("¿Número Real B? ");
			numeroB = teclado.nextDouble();
			
			System.out.print("¿Número Real C? ");
			numeroC = teclado.nextDouble();
			
			// Mínimo
			if (numeroA < numeroB && numeroA < numeroC) {
				minimo = numeroA;
			} else if (numeroB < numeroA && numeroB < numeroC) {
				minimo = numeroB;
			} else {
				minimo = numeroC;
			}
			
			System.out.println ("Mínimo: " + minimo);
			
			// Máximo
			if (numeroA > numeroB && numeroA > numeroC) {
				maximo = numeroA;
			} else if (numeroB > numeroA && numeroB > numeroC) {
				maximo = numeroB;
			} else {
				maximo = numeroC;
			}
			
			System.out.println ("Máximo: " + maximo);
			
			teclado.close();
	}

}
