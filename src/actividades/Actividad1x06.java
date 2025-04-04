package actividades;

import java.util.Scanner;

public class Actividad1x06 {

	public static void main(String[] args) {
		
		// Declarar variables
		int numeroChicos, numeroChicas;
		double total, porcentajeChicos, porcentajeChicas;
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
		
		//////////////////////////////////////////
		
		// Se pide número de chicos
		System.out.print("¿Número de Chicos? ");
		numeroChicos = teclado.nextInt();
		
		// Se pide número de chicas
		System.out.print("¿Número de Chicas? ");
		numeroChicas = teclado.nextInt();
		
		// Se realiza porcentaje
		total = numeroChicos + numeroChicas;
		porcentajeChicos = (numeroChicos / total) * 100;
		porcentajeChicas = (numeroChicas / total) * 100;

		// Se saca por pantalla
		System.out.printf("Porcentaje de Chicos: %.2f\nPorcentaje de Chicas: %.2f\n" , porcentajeChicos, porcentajeChicas);
		
		teclado.close();
	
		
	}

}
