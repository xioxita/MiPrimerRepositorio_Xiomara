package actividades;

import java.util.Scanner;

public class Actividad2x09 {

	public static void main(String[] args) {
		// Declarar variables
		int turno, ordinarias, extraordinarias, salario;
		boolean comprendidasA, comprendidasB, comprendidasC;
		
		// Se declara e inicializa el teclado
		Scanner teclado = new Scanner(System.in);
		
		// Se pide por pantalla los datos
		System.out.print("¿Turno de trabajo (1-diurno, 2-vespertino)? ");
		turno = teclado.nextInt();
		
		System.out.print("¿Número de Horas Ordinarias? ");
		ordinarias = teclado.nextInt();
		
		System.out.print("¿Número de Horas Extraordinarias? ");
		extraordinarias = teclado.nextInt();
		
		/////////////////////////////////////////////////////////////////
		// Se relacionan las variables enteras con las booleanas.
		comprendidasA = (turno >= 1) && (turno <= 2);
		comprendidasB = (ordinarias >= 20) && (ordinarias <= 40);
		comprendidasC = (extraordinarias >= 0) && (extraordinarias <= 5);
		
		// Se calcula el salario
		if (comprendidasA && comprendidasB && comprendidasC) {
			if (turno == 1) {
				salario = ( ordinarias * 5 ) + ( extraordinarias * 7);
				System.out.print("Salario Mensual: " + salario + " euros");
			} else {
				salario = ( ordinarias * 8 ) + ( extraordinarias * 11);
				System.out.print("Salario Mensual: " + salario + " euros");
			}
		} else {
			System.out.println("El turno de trabajo debe estar comprendido entre 1 y 2.");
			
		}
			
		if (comprendidasB) {
			if (turno == 1) {
				salario = ( ordinarias * 5 ) + ( extraordinarias * 7);
			} else {
				salario = ( ordinarias * 8 ) + ( extraordinarias * 11);
			}
		} else {
			System.out.println("El número de horas ordinarias debe estar comprendido entre 20 y 40.");
		}
		
		if (comprendidasC) {
			if (turno == 1) {
				salario = ( ordinarias * 5 ) + ( extraordinarias * 7);
			} else {
				salario = ( ordinarias * 8 ) + ( extraordinarias * 11);
			}
		} else {
			System.out.println("El número de horas extraordinarias debe estar comprendido entre 0 y 5.");
		}
		
		teclado.close();
	}
}