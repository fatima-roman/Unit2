package boletin3;

import java.util.Scanner;

public class EJ06 {

	public static void main(String[] args) {
		/* PRUEBAS A REALIZAR
		 * 1. Comprobar años no bisiestos y bisiesto /4 (2024) y bisiesto /400 (2000)
		 * 2. Comprobar distintos meses 
		 * 3. Comprobar meses inexistentes 
		 */
		// new scanner
		Scanner sc = new Scanner(System.in);

		// Create variables
		int anio;
		int mes;
		String bis; 

		// Input for variables
		System.out.println("Introduce el año: ");
		anio = sc.nextInt();
		System.out.println("Introduce el mes: ");
		mes = sc.nextInt();
	
		// Evaluate and solve for the entered value
		if (anio%4 ==0 || anio%400 == 0 ) {
			bis ="Tiene 29 días, es año bisiesto";
		} else {
			bis= "Tiene 28 días";
		}
		switch (mes) {
		case 1 -> System.out.println("Tiene 31 días");
		case 2 -> System.out.println(bis);
		case 3 -> System.out.println("Tiene 31 días");
		case 4 -> System.out.println("Tiene 30 días");
		case 5 -> System.out.println("Tiene 31 días");
		case 6 -> System.out.println("Tiene 30 días");
		case 7 -> System.out.println("Tiene 31 días");
		case 8 -> System.out.println("Tiene 31 días");
		case 9 -> System.out.println("Tiene 30 días");
		case 10 -> System.out.println("Tiene 31 días");
		case 11 -> System.out.println("Tiene 30 días");
		case 12 -> System.out.println("Tiene 31 días");
		default -> System.out.println("No existe ese mes");
		};
		
		// Close scanner
		sc.close();
	}

}
