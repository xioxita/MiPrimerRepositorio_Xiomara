package actividades;
import java.util.Scanner;

public class Actividad3x03 {

	public static void main(String[] args) {
		// Declarar variables
		int horas, minutos, segundos;
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
		
		// Se pide las h, m y s
		System.out.print("¿Horas? ");
		horas = teclado.nextInt();
		
		System.out.print("¿Minutos? ");
		minutos = teclado.nextInt();
		
		System.out.print("¿Segundos? ");
		segundos = teclado.nextInt();
		
		boolean error = false;
		if (horas < 0 || horas > 23) {
			error = true;
			System.out.println("Las horas deben estar comprendidas entre 0 y 23.");
		}
		if (minutos < 0 || minutos > 59) {
			error = true;
			System.out.println("Los minutos deben estar comprendidos entre 0 y 59.");
		}
		if (segundos < 0 || segundos > 59) {
			error = true;
			System.out.println("Los segundos deben estar comprendidos entre 0 y 59.");
		}
		
		if (error == false) {
			 System.out.printf("%dh %dm %ds + 1s =", horas, minutos, segundos);
			 segundos++;
			 
			 if (segundos == 60) {
				 segundos = 0;
				 minutos++;
				 if (minutos == 60) {
					 minutos = 0;
					 horas++;
					 if (horas == 24) {
						 horas = 0;
						 System.out.print(" 1 día");
					 }
				 }
			 }
			 
			 System.out.printf(" %dh %dm %ds", horas, minutos, segundos);
		}

		teclado.close();
	}

}
