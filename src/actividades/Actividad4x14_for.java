package actividades;

import java.util.Scanner;

public class Actividad4x14_for {

	public static void main(String[] args) {
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
				
		final int NUM_SECRETO = 19;
		int numeroIntentos;
		int num = 0;
		boolean acierto = false;
		
		for (numeroIntentos = 5; numeroIntentos > 0 && acierto == false; numeroIntentos--) {
			System.out.print("¿Número? ");
		    num = teclado.nextInt();
		    
		    if (num == NUM_SECRETO) {
		        acierto = true;
		    } else {
		        System.out.println("Has fallado el número secreto.");

		        if (num < NUM_SECRETO) {
		            System.out.printf("El número %d es menor que el número secreto.\n", num);
		        } else {
		            System.out.printf("El número %d es mayor que el número secreto.\n", num);
		        }
		    }
		}

		teclado.close();

		if (acierto == true) {
		    System.out.print("Has acertado el número secreto.");
		} else {
		    System.out.print("Has agotado los 5 intentos.");
		}
	}
}
