package actividades;

import java.util.Scanner;

public class Actividad4x08 {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("¿Número Natural N?: ");
		int num = teclado.nextInt();
		teclado.close();
		
		if (num <= 0) {
			System.out.print("El número natural N debe ser positivo.");
		} else {
			int suma = 0;
			int contador = 1;
			
			while (contador <= num) {
					suma += contador;
					contador = contador + 2;
					
			}
			System.out.printf("Suma de Números Impares menores o iguales que %d: %d" , num , suma);
		}
		
	}

}
