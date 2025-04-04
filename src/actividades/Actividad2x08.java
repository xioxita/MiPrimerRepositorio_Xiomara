package actividades;

import java.util.Scanner;

public class Actividad2x08 {

	public static void main(String[] args) {
		// Declarar variables
		double importeCompra, rebaja, importeDescuento;
		boolean comprendido;
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
		
		// Se pide por pantalla el numero real
		System.out.print("¿Importe de la Compra? ");
		importeCompra = teclado.nextDouble();
		
		/////////////////////////////////////////////////////////////////
		// Se realizan las operaciones
		comprendido = (importeCompra >= 200) && (importeCompra <= 800);
		
		
		if (importeCompra < 0) {
			System.out.print("El importe de la compra debe ser positivo");
		} else if (comprendido) {
			rebaja = importeCompra * 0.10;
			importeDescuento = importeCompra - (importeCompra * 0.1);
			System.out.printf("Rebaja : %.2f euros\n" , rebaja);
			System.out.printf("Importe con Descuento : %.2f euros\n" , importeDescuento);
		} else if (importeCompra >= 800) {
			rebaja = importeCompra * 0.15;
			importeDescuento = importeCompra - (importeCompra * 0.15);
			System.out.printf("Rebaja : %.2f euros\n" , rebaja);
			System.out.printf("Importe con Descuento : %.2f euros\n" , importeDescuento);
		} else {
			rebaja = 0;
			importeDescuento = importeCompra;
			System.out.printf("Rebaja : %.2feuros\n" , rebaja);
			System.out.printf("Importe con Descuento : %.2f euros\n" , importeDescuento);
		}
		
		teclado.close();
		
	}
}
