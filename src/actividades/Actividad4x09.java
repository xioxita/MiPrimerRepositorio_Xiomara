package actividades;

import java.util.Scanner;

public class Actividad4x09 {

	public static void main(String[] args) {
		
		int numA, numB;
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("¿Número Entero A?: ");
		numA = teclado.nextInt();

		System.out.print("¿Número Entero B?: ");
		numB = teclado.nextInt();
		
		int suma = 0;
		int contador = numA;
		
		if (numA > numB) {
			System.out.print("El número entero A debe ser menor o igual que el número entero B.");
		} else {
			if (contador % 2 != 0) {
				contador = contador + 1;	
			}
			
			while (contador <= numB) {
				suma += contador;
				contador = contador + 2;	
			}
		}
			
		System.out.printf("Suma de Números  Pares comprendidos entre %d y %d: %d" , numA , numB, suma);
		
		
		teclado.close();
	}
}
