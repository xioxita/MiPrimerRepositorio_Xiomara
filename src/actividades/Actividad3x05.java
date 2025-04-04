package actividades;

import java.util.Scanner;

public class Actividad3x05 {

	public static void main(String[] args) {
		// Declarar variables
		int numero;
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
		
		// Se pide el número
		System.out.print("¿Número Entero (entre 0 y 99999)? ");
		numero = teclado.nextInt();
		
		if (numero < 0 || numero > 99999) {
			System.out.print("El número entero debe estar comprendido entre 0 y 99999");
		} else {
			if (numero < 10) {
				System.out.printf("El número %d tiene 1 cifra.", numero);
			} else if (numero < 100) {
				System.out.printf("El número %d tiene 2 cifras.", numero);
			} else if (numero < 1000) {
				System.out.printf("El número %d tiene 3 cifras.", numero);
			} else if (numero < 10000) {
				System.out.printf("El número %d tiene 4 cifras.", numero);
			} else {
				System.out.printf("El número %d tiene 5 cifras.", numero);
			}
		}
	
		 teclado.close();
	}

}
