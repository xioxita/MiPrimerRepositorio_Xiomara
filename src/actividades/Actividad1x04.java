package actividades;

import java.util.Scanner;

/*
 * Se le pide al usuario dos números reales,
 * luego se realizan operaciones de suma, resta
 * multiplicación y división, y saca por pantalla
 * el resultado de las operaciones
 */

public class Actividad1x04 {

	public static void main(String[] args) {
		
		// Declarar variables
		double numeroA, numeroB;
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
		
		/////////////////////////////////////////
		
		// Se pide el primer número real
		System.out.print("Escriba el primer número real: ");
		numeroA = teclado.nextDouble();
		
		// Se pide el segundo número real
		System.out.print("Escriba el segundo número real: ");
		numeroB = teclado.nextDouble();
		
		// Se saca por pantalla el resultado
		System.out.printf("%.1f + %.1f = %.1f\n" , numeroA, numeroB, (numeroA + numeroB));
		System.out.printf("%.1f - %.1f = %.1f\n" , numeroA, numeroB, (numeroA - numeroB));
		System.out.printf("%.1f * %.1f = %.1f\n" , numeroA, numeroB, (numeroA * numeroB));
		System.out.printf("%.1f / %.1f = %.1f\n" , numeroA, numeroB, (numeroA / numeroB));
		
		teclado.close();
		
	}

}
