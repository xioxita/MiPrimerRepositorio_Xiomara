package actividades;

import java.util.Scanner;

public class Actividad3x07 {

	public static void main(String[] args) {
			double numero;
			
			// Se declara e inicializa el teclado
			Scanner teclado = new Scanner(System.in);
			
			// Se pide el número
			System.out.print("¿Nota? ");
			numero = teclado.nextDouble();
			
			if (numero < 0 || numero > 10) {
				System.out.print("La nota debe estar comprendida entre 0 y 10.");
			} else {
				if (numero < 1.5) {
					System.out.print("Muy Deficiente");
				} else if (numero < 3.5) {
						System.out.print("Deficiente");
				} else if (numero < 5) {
					System.out.print("Insuficiente");
				} else if (numero < 5.5) {
					System.out.print("Suficiente");
				} else if (numero < 6.5) {
					System.out.print("Bien");
				} else if (numero < 8.5) {
					System.out.print("Notable");
				} else if (numero < 10) {
					System.out.print("Sobresaliente");
				} else {
					System.out.print("Matrícula de Honor");
				}
			}
			
			 teclado.close();
		}

	}
