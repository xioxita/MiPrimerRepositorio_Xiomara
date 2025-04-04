package actividades;

import java.util.Scanner;

public class Actividad4x11_do_while {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		System.out.print("¿Número Natural N?: ");
		int num = teclado.nextInt();
		teclado.close();
		
		final int TOTAL_NUMEROS = 5;
		int producto = 1;
		int contador = num;
		int numPares = 0;	
		
		if ((num <= 0) || (num % 2 == 0)) {
			System.out.print("El número natural N debe ser positivo e impar.");
		} else {
			
			do {
				System.out.printf("%d, " , contador);
				producto *= contador;
				contador = contador + 2;	
				numPares++;
			} while (numPares < TOTAL_NUMEROS);
			
			System.out.printf("\nProducto de %d Números Impares a partir de %d: %d" , numPares, num , producto);
		}
		
	}

}
