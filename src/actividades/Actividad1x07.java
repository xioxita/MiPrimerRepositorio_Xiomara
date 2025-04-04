package actividades;

/*
 * Se ide al usuario el radioy altura de un cilíndro,
 * luego se calcula el volumen y saca por pantalla el
 * resultado con tres dígitos decimales
 */

import java.util.Scanner;

public class Actividad1x07 {

	public static void main(String[] args) {

		// Declarar variables
		double radio, altura, volumen;
		final double PI = 3.141592;
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
		
		/////////////////////////////////////////
		
		// Sacar por pantalla Escribe el radio
		System.out.print("Escribe el radio del cilíndro en metros: ");
		radio = teclado.nextDouble();
		
		// Sacar por pantalla Escribe la altura
		System.out.print("Escribe la altura del cilíndro en metros: ");
		altura = teclado.nextDouble();
		
		// Realizar operación
		volumen = PI * radio * radio * altura;
		
		// Sacar por pantalla resultado
		System.out.printf("Volumen del cilíndro:  %.3f" , volumen);
		
		teclado.close();
	}
	

}
