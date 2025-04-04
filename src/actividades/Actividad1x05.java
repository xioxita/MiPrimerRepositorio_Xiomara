package actividades;

import java.util.Scanner;

/*
 * Programa que pide al usuario dos números reales, y los saca por
 * pantalla en distintas lineas de texto y diferente posiciones
 * de la coma decimal.
 */

public class Actividad1x05 {

	public static void main(String[] args) {
		
		// Declarar variables
		double numeroA, numeroB;
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
		
		//////////////////////////////////////////
		
		// Se pide el primer número real
		System.out.print("Escriba el primer número real: ");
		numeroA = teclado.nextDouble();
		
		// Se pide el segundo número real
		System.out.print("Escriba el segundo número real: ");
		numeroB = teclado.nextDouble();
		
		// Se saca por pantalla
		System.out.println("NÚMEROS CON 2 DÍGITOS DECIMALES:");
		System.out.printf("A = %.2f\nB = %.2f\n" , numeroA, numeroB);
		System.out.println("NÚMEROS CON 1 DÍGITO DECIMAL:");
		System.out.printf("A = %.1f\nB = %.1f\n" , numeroA, numeroB);
		System.out.println("NÚMEROS CON NINGÚN DÍGITO DECIMAL:");
		System.out.printf("A = %.0f\nB = %.0f\n" , numeroA, numeroB);
		
		teclado.close();
		
	}

}
