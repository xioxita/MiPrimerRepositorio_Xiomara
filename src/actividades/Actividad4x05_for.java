package actividades;

import java.util.Scanner;

public class Actividad4x05_for {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		final int TOTAL_NUMEROS = 10;
		int suma = 0;
		int contador;
		
		for (contador = 0; contador < TOTAL_NUMEROS; contador++) {
			System.out.print("¿Número Entero " + contador + "?: " );
			int numero = teclado.nextInt();
			
			suma += numero;
		}
		
		System.out.println("La suma de los números es: " + suma);
		
		teclado.close();
	}

}
