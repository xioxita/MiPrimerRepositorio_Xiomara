package ejemplos;

import java.util.Scanner;

/*
 * Este programa se encarga de perdile al usuario dos números
 * y saca por pantalla la suma de estos dos.
 */

public class SumarNumeros {

	public static void main(String[] args) {
		
		// Se declaran las variables
		int numero1, numero2;
		int resultado;
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
		
		//////////////////////////////////////////
		
		// Sacara por pantalla escribe un número
		System.out.println("Escriba un número: ");
		// Leer el número del usuario
		numero1 = teclado.nextInt();
		
		//////////////////////////////////////////
				
		// Sacara por pantalla escribe un número
		System.out.println("Escriba otro número: ");
		// Leer el número del usuario
		numero2 = teclado.nextInt();
		
		// Se realiza la operación
		resultado = numero1 + numero2;
		
		// Saca por pantalla el resultado de la operación
		System.out.println("El resultado de la suma es: " + resultado);
		
		teclado.close();
		
		
	}

}
