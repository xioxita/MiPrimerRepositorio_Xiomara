package actividades;

import java.util.Scanner;

public class Actividad4x13 {

	public static void main(String[] args) {

		final int TOTAL_NUMEROS = 10;
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
        
        int contador = 0;
    	int numCeros = 0;
    	int sumaPositivos = 0;
    	int sumaNegativos = 0;
    	int contadorPositivos = 0;
    	int contadorNegativos = 0;
    	double mediaPositivos = 0.0;
    	double mediaNegativos = 0.0;
		
		while (contador < TOTAL_NUMEROS) {
			System.out.print("¿Número Entero " + contador + "?: " );
			int numero = teclado.nextInt();
			
			if (numero == 0) {
				numCeros++;
			} else if (numero > 0) {
				sumaPositivos += numero;
				contadorPositivos++;
			} else {
				sumaNegativos += numero;
				contadorNegativos++;
			}
			
			contador++;
		}
		
		if (numCeros == TOTAL_NUMEROS) {
			System.out.println("Número de ceros: " + numCeros);
			System.out.print("No hay Media Aritmética de Números Positivos.\nNo hay Media Aritmética de Números Negativos.");
		} else {
			System.out.println("Número de ceros: " + numCeros);
			mediaPositivos = (double) sumaPositivos / contadorPositivos;
			System.out.printf("Media Aritmética de Números Positivos: %.1f", mediaPositivos);
			mediaNegativos = (double) sumaNegativos / contadorNegativos;
			System.out.printf("\nMedia Aritmética de Números Negativos: %.1f", mediaNegativos);
		}
		
		teclado.close();
	}
}
