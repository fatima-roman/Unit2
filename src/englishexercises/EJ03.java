package englishexercises;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		/* PRUEBAS A REALIZAR
		 * 1. Check hours in the table of exercise 
		 * 2. Check hours like 13:69
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
		
		// Comprobar horas y minutos bien introducidos
		if ((hour > 12 || hour < 0) || min < 0 || min >=60) {
			System.out.println("ERROR");
		} else if (min == 0) { 
			//Si los minutos son 0 se resta 12. EJ: 12-3 = 9 
			hour = 12 - hour;
			System.out.println(hour + ":"+min);
		} else if ((hour != 12 && hour != 6 )) { 
			//Si hay minutos hora se resta -11 porque toma 1 hora (60 min) para los minutos
			hour = 11 - hour; 
			min = 60 - min; 
			System.out.println(hour + ":"+min);
		} else {
			if (min!= 0) {
				min = 60 - min; 
			}
			System.out.println(hour + ":"+min);
		}
		
		
		
		
		// Close scanner
		sc.close();
	}

}
