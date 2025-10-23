package englishexercises;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		/* PRUEBAS A REALIZAR
		 * 1. Check numbers outside the menu 
		 * 2. Check numbers in the menu
		 */
		
		// new scanner
		Scanner sc = new Scanner(System.in);

		// Create variables
		int min;
		int hour;


		// Input for variables
		System.out.println("enter an hour looked at the mirror: ");
		hour = sc.nextInt();
		System.out.println("enter an minutes looked at the mirror");
		min = sc.nextInt();
		
	
		// Evaluate and solve for the entered value
		if (min > 0 && min<60) {
			min = 60 -min; 
		} 
		
		if (hour != 12 && hour != 6 && (hour <= 12 && hour > 0 )) {
			hour = 11 - hour; 
			System.out.println(hour + ":"+min);
		} else if ((hour > 12 || hour < 0) || min < 0 || min >=60) {
			System.out.println("ERROR");
		} else {
			System.out.println(hour + ":"+min);
		}
		
		
		
		// Close scanner
		sc.close();
	}

}
