package actividades;

import java.util.Scanner;

public class Actividad4x06 {

	public static void main(String[] args) {
			
		int numero;
		double suma = 0;
		int contador = 0;
		double media = 0.0;
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("¿Número Entero ( 0 para salir):" );
		numero = teclado.nextInt();
		
		while (numero != 0) {
			suma = suma + numero;
			contador = contador + 1;
			System.out.print("¿Número Entero ( 0 para salir):" );
			numero = teclado.nextInt();
		}

		if (contador == 0) {
			System.out.print("No hay Media Aritmética.");
		} else {
			media = suma / contador;
			System.out.printf("Media Aritmética: %.1f", media);
		
		}
		teclado.close();
	}

}