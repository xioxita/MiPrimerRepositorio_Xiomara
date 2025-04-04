package ejemplos;

import java.util.Scanner;

/*
 * Este programa le pide al usuario insertar
 * dos números y saca por pantalla si es mayor
 * o no.
 */

public class NumeroMayor {

	public static void main(String[] args) {
	
	// Se declara la variable
	int numero1, numero2;
	boolean resultado;
	
	// Se declara e inicializa el teclado
	Scanner teclado = new Scanner(System.in);
	
	//////////////////////////////////////////
	
	// Sacar por pantalla escribe un número
	System.out.println("Escriba un número: ");
	// Leer el número del usuario
	numero1 = teclado.nextInt();
	
	//////////////////////////////////////////
		
	// Sacar por pantalla escribe un número
	System.out.println("Escriba otro número: ");
	// Leer el número del usuario
	numero2 = teclado.nextInt();
	
	// Se resuelve la operación
	resultado = numero1 > numero2;
	
	// Sacar por pantalla resultado
	System.out.println("El número1 es mayor al número2: " + resultado);
	
	teclado.close();
	
	}

}
