package actividades;

import java.util.Scanner;

public class Actividad4x10 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("¿Número Natural N?: ");
		int num = teclado.nextInt();
		teclado.close();
		
		int suma = 0;
		int contador = num;
		int numPares = 0;
		
		if (num <= 0) {
			System.out.print("El número natural N debe ser positivo.");
		} else {
			if (contador % 2 != 0) {
				contador = contador + 1;	
			}
			while (numPares < num) {
				System.out.printf("%d, " , contador);
				suma += contador;
				contador = contador + 2;	
				numPares++;
				
			}
			System.out.printf("\nSuma de %d primeros Números Pares a partir de %d: %d" , numPares, num , suma);
		}
		
	}

}
