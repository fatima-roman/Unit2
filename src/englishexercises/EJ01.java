package englishexercises;

import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		/* PRUEBAS A REALIZAR
		 * 1. Check numbers outside the menu 
		 * 2. Check numbers in the menu
		 */
		
		// new scanner
		Scanner sc = new Scanner(System.in);

		// Create variables
		int screen;
		int extra;
		double pri;
		final double SYSTEM = 375.99;

		// Input for variables
		System.out.println("1. 38 cm screen (costing 75.99) "
				+ "\n2. 43 cm screen (costing 99.99)"
				+ "\nEnter a number: ");
		screen = sc.nextInt();
		System.out.println("1. Antivirus software (65.99) "
				+ "\n2. Printer (125.00)"
				+ "\n3. Both (190.99)"
				+ "\nEnter a number (optional enter 0):");
		extra = sc.nextInt();
		
	
		// Evaluate and solve for the entered value
		switch (extra) {
		case 1 -> pri = 65.99; 
		case 2 -> pri = 125.00; 
		case 3 -> pri = 190.99; 
		default -> pri = 0;
		};
		switch (screen) {
		case 1 -> pri = pri + 75.99; 
		case 2 -> pri = pri + 99.99; 
		}; 
		
		System.out.println("TOTAL: " + (pri + SYSTEM));
		
		// Close scanner
		sc.close();
	}

}
