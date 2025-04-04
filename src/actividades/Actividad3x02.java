package actividades;

import java.util.Scanner;

public class Actividad3x02 {

	public static void main(String[] args) {
		// Declarar variables
		int mes;
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
		
		// Se pide el año
		System.out.print("¿Mes? ");
		mes = teclado.nextInt();
		
		switch (mes) {
			case 1:
				System.out.print("31 días");
				break;
			case 2:
				System.out.print("28 días");
				break;
			case 3:
				System.out.print("31 días");
				break;
			case 4:
				System.out.print("30 días");
				break;
			case 5:
				System.out.print("31 días");
				break;
			case 6:
				System.out.print("30 días");
				break;
			case 7:
				System.out.print("31 días");
				break;
			case 8:
				System.out.print("31 días");
				break;
			case 9:
				System.out.print("30 días");
				break;
			case 10:
				System.out.print("31 días");
				break;
			case 11:
				System.out.print("30 días");
				break;
			case 12:
				System.out.print("31 días");
				break;
			default:
				System.out.print("El mes debe estar comprendido entre 1 y 12.");
		}
		teclado.close();
	}

}
