package actividades;

import java.util.Scanner;

public class Actividad4x06_for {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		int suma = 0;
		int contador = 0;
		double media = 0.0; 
		
		System.out.print("¿Número Entero ( 0 para salir ): ");
        numero = teclado.nextInt();
		
		for (; numero != 0; contador++ ) {
			System.out.print("¿Número Entero ( 0 para salir ): " );
			numero = teclado.nextInt();
			suma += numero;
		}
		
		if (contador == 0) {
            System.out.print("No hay Media Aritmética.");
        } else {
            media = (double) suma / (contador--); // Calcular la media
            System.out.printf("Media Aritmética: %.1f", media);
        }
        
        teclado.close();

	}	

}
