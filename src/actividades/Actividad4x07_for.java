package actividades;

import java.util.Scanner;

public class Actividad4x07_for {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final int TOTAL_NUMEROS = 10;
		int numero;
        
        System.out.print("¿Número Entero 0?: ");
        numero = teclado.nextInt();
        
        int contador;
		int minimo = numero;
        int maximo = numero;
		
		for (contador = 1; contador < TOTAL_NUMEROS; contador++) {
			System.out.print("¿Número Entero " + contador + "?: " );
			numero = teclado.nextInt();
			
			if (numero < minimo) {
				minimo = numero;
			} else if (numero > maximo) {
				maximo = numero;
			}
			
		}
		
		System.out.println("Mínimo: " + minimo);
		System.out.println("Máximo: " + maximo);
		
		teclado.close();
	}

}
