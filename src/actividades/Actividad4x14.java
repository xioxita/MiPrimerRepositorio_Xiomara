package actividades;

import java.util.Scanner;

public class Actividad4x14 {

	public static void main(String[] args) {
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
				
		final int NUM_SECRETO = 19;
		int numIntentos = 5;
		int num = 0;
		boolean acierto = false;

		while (numIntentos > 0 && acierto == false) {
		    System.out.print("Número? ");
		    num = teclado.nextInt();
		    numIntentos--;

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
