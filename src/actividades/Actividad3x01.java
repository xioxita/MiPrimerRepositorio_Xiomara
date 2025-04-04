package actividades;

import java.util.Scanner;

/*
 * El programa pide al usuario el número de un año para saber si es bisiesto o no, 
 * si el año es menor a 1583 sacará mensaje de error, y si es mayor a 1583 verifica
 * si cumple las condiciones para ser bisiesto y sacará por pantalla el resultado.
 */

public class Actividad3x01 {

	public static void main(String[] args) {
		// Declarar variables
		int año;
		boolean bisiesto;
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
		
		// Se pide el año
		System.out.print("¿Año? ");
		año = teclado.nextInt();
		

		if (año < 1583) {
			System.out.print("El año debe ser mayor o igual que 1583.");
		} else {
			bisiesto = (año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0);
			if (bisiesto) {
				System.out.print("El año " + año + " es bisiesto");
			} else {
				System.out.print("El año " + año + " no es bisiesto");
			}
		}
		
		teclado.close();
		}

		
}
