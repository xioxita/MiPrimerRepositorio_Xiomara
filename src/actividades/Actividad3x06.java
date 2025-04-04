package actividades;

import java.util.Scanner;

public class Actividad3x06 {

	public static void main(String[] args) {
		int numero;
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
		
		// Se pide el número
		System.out.print("¿Índice de Calidad del Aire? ");
		numero = teclado.nextInt();
		
		if (numero < 0 || numero > 500) {
			System.out.print("El índice de calidad del aire debe estar comprendido entre 0 y 500.");
		} else {
			if (numero <= 50) {
				System.out.print("Bueno");
			} else if (numero <= 100) {
					System.out.print("Moderado");
			} else if (numero <= 150) {
				System.out.print("No Saludable para Grupos Sensibles");
			} else if (numero <= 200) {
				System.out.print("No Saludable para Todos");
			} else if (numero <= 300) {
				System.out.print("Insalubre");
			} else {
				System.out.print("Peligroso");
			}
		}
		
		 teclado.close();
	}

}
