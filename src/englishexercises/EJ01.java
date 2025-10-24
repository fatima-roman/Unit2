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
		String extra;
		double pri = 375.99;

		// Input for variables
		System.out.println("1. 38 cm screen (costing 75.99) "
				+ "\n2. 43 cm screen (costing 99.99)"
				+ "\nEnter a number: ");
		screen = sc.nextInt();
		
		// Enter value and evaluate and solve 
		System.out.println("Antivirus software (65.99) Y/N:");
		extra = sc.next().toLowerCase();
		if (extra.equals("y")) {
			pri = pri + 65.99;
		}
		System.out.println("Printer (125.00) Y/N:");
		extra = sc.next().toLowerCase();
		if (extra.equals("y")) {
			pri = pri + 125.00;
		}
		
		switch (screen) {
		case 1 -> pri = pri + 75.99; 
		case 2 -> pri = pri + 99.99; 
		}; 
		
		
		
		System.out.println("TOTAL: " + (pri ));
		
		// Close scanner
		sc.close();
	}

}
