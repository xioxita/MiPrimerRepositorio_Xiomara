package ejemplos;

import java.util.Scanner;

/*
 * Este programa va a pedir al usuario el radio de un circulo
 * y luego saca por pantalla el resultado del area.
 */

public class AreaCirculo {

	public static void main(String[] args) {
		
		// Declarar variables
		double radio;
		double area;
		final double PI = 3.141592;
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
		
		//////////////////////////////////////////
		
		// Sacar por pantalla Escribe el radio
		System.out.println("Escribe el radio del círculo en cm: ");
		// Para pedir un double por teclado nextDouble
		radio = teclado.nextDouble();
		
		// Se realiza la operación
		area = PI * radio * radio; 
		
		// Se saca por pantalla el area
		System.out.println("El área del círculo es: " + area + "cm cuadrados.");
		
		teclado.close(); 
	}

}
