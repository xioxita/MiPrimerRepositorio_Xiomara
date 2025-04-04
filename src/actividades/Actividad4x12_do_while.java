package actividades;

public class Actividad4x12_do_while {

	public static void main(String[] args) {
		// Declarar variables

		final double celsiusC = 273.15;
		int celsius = -20;
		int fahrenheit, kelvin;
		
		System.out.println("Celsius Fahrenheit Kelvin");
		do {
			fahrenheit = (int) (celsius * 1.8 + 32);
			kelvin = (int) (celsius + celsiusC);
			
			System.out.printf("%7d %10d %6d\n", celsius, fahrenheit, kelvin);
			
			celsius += 10;
			
		} while (celsius <= 100);
	}

}
