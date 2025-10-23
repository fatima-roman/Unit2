package englishexercises;

import java.util.Scanner;

public class EJ02 {

	public static void main(String[] args) {
		/* PRUEBAS A REALIZAR
		 * 1. Check numbers outside the menu 
		 * 2. Check numbers in the menu
		 */
		
		// new scanner
		Scanner sc = new Scanner(System.in);

		// Create variables
		int money;
		String inte;
		double interesst = 0; 


		// Input for variables
		System.out.println("enter an amount of money: ");
		money = sc.nextInt();
		System.out.println("type of bank account:"
				+ "\nA: annual rate of interest 1.5%"
				+ "\nB: annual rate of interest 2%"
				+ "\nC: annual rate of interest 1.5%"
				+ "\nX: annual rate of interest 5%");
		inte = sc.next().toUpperCase();
		
	
		// Evaluate and solve for the entered value
		switch (inte) {
		case "A" -> interesst = (money*0.015);
		case "B" -> interesst = (money*0.02) ;
		case "C" -> interesst = (money*0.015) ;
		case "X" -> interesst = (money*0.05) ;
		default -> System.out.println("ERROR");
		};
		
		if (interesst != 0) {
			System.out.println("TOTAL: " + interesst);
		}
		
		
		// Close scanner
		sc.close();
	}

}
