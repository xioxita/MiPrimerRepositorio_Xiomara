package actividades;

import java.util.Scanner;

public class Actividad2x07 {

	public static void main(String[] args) {
		// Declarar variables
		double coeficienteA, coeficienteB, coeficienteC, discriminante, solucion1, solucion2;
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
		
		// Se pide por pantalla el numero real
		System.out.print("¿Coeficiente A? ");
		coeficienteA = teclado.nextDouble();
		
		System.out.print("¿Coeficiente B? ");
		coeficienteB = teclado.nextDouble();
		
		System.out.print("¿Coeficiente C? ");
		coeficienteC = teclado.nextDouble();
		
		/////////////////////////////////////////
		
		// Se realizan operaciones y saca por pantalla las soluciones
		// según sea positivo, negativo o neutro.
		discriminante = (coeficienteB * coeficienteB) - (4.0 * coeficienteA * coeficienteC);
		
		if (discriminante >= 0) {
			solucion1 = (-coeficienteB + Math.sqrt(discriminante)) / (2 * coeficienteA);
			solucion2 = (-coeficienteB - Math.sqrt(discriminante)) / (2 * coeficienteA);
				if (solucion1 == solucion2) {
					System.out.println("La ecuación tiene una única solución real:");
					System.out.print("X = " + solucion1);
				} else {
					System.out.println("La ecuación tiene dos soluciones reales:");
					System.out.print("X1 = " + solucion1 + "\nX2 = " + solucion2);
				}
		} else {
			System.out.println("La ecuación no tiene ninguna solución real");
		}
		
		teclado.close();
	}
}
