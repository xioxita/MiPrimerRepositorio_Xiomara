package actividades;

import java.util.Scanner;

public class Actividad1x08 {

	public static void main(String[] args) {
		// Declarar variables
		double velocidadInicial, tiempo, aceleracion, distanciaRecorrida;
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
		
		/////////////////////////////////////////////////
		
		// Sacar por pantalla Escribe la velocidad
		System.out.print("Escribe la velocidad inicial en metros: ");
		velocidadInicial = teclado.nextDouble();
		
		// Sacar por pantalla Escribe la acelaración
		System.out.print("Escribe la acelaración en metros: ");
		aceleracion = teclado.nextDouble();
		
		// Sacar por pantalla Escribe el tiempo
		System.out.print("Escribe el tiempo en metros: ");
		tiempo = teclado.nextDouble();
		
		// Se realiza la operación
		distanciaRecorrida = (velocidadInicial * tiempo) + (0.5 * aceleracion * tiempo * tiempo);
		
		// Sacar por pantalla resultado
		System.out.printf("Distancia recorrida:  %.3f metros" , distanciaRecorrida);
		
		teclado.close();
	}

}
