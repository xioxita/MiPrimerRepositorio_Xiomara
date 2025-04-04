package actividades;
import java.util.Scanner;

public class Actividad3x04 {

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
		if ((horas == 0 && minutos == 0 && segundos == 0)) {
			error = true;
			System.out.println("El tiempo debe ser igual o superior a 1 segundo.");
		}
		
		if (error == false) {
			 System.out.printf("%dh %dm %ds - 1s =", horas, minutos, segundos);
			 segundos--;
			 if (segundos < 0) {
				 segundos = 59;
				 minutos--;
				 if (minutos < 0) {
					 minutos = 59;
					 horas--;
					 if (horas < 0) {
						 horas = 23;
					 }
				 }
			 }
			 System.out.printf(" %dh %dm %ds", horas, minutos, segundos);
		}
	
		 
		 teclado.close();		 
		
	}	
}	