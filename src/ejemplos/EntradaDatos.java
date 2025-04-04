package ejemplos;

import java.util.Scanner;

/*
 * Este programa va a pedir que el usuario entre un número
 * por pantalla, y salga el resultado.
 */

public class EntradaDatos {

	public static void main(String[] args) {
		
	// Se declaran las variables
	int numero1;
	
	// Se declara e inicializa el teclado
	Scanner teclado = new Scanner(System.in);
	
	//////////////////////////////////////////
	
	// Saca por pantalla Escribe número1
	System.out.println("Escriba un número: ");
	// Leer el número del usuario
	numero1 = teclado.nextInt();
	
	//Saca por pantalla el número escrito
	System.out.println("El número escrito es: " + numero1);
	
	teclado.close();
	
	
	
		
	}

}
