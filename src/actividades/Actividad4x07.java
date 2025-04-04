package actividades;

import java.util.Scanner;

public class Actividad4x07 {

	public static void main(String[] args) {
		
		final int TOTAL_NUMEROS = 10;
		int numero;
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("¿Número Entero 0?: ");
        numero = teclado.nextInt();
        
        int contador = 1;
    	int minimo = numero;
        int maximo = numero;
		
		while (contador < TOTAL_NUMEROS) {
			System.out.print("¿Número Entero " + contador + "?: " );
			numero = teclado.nextInt();
			
		
			if (numero < minimo) {
				minimo = numero;
			}
			
			if (numero > maximo) {
				maximo = numero;
			}
			
			contador = contador + 1;
		}
		
		System.out.println("Mínimo: " + minimo);
		System.out.println("Máximo: " + maximo);
		
		teclado.close();

	}

}
