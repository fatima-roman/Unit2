package diagramasdowhile;

import java.util.Scanner;

public class EJ08 {

	public static void main(String[] args) {
		//New Scanner
		Scanner sc = new Scanner(System.in); 
		
		// Create variables
		String num1;
		String num2;
		int num;
		int nume;

		// Evaluate and solve for the entered value
		
		/*ya se que debería ser solo en el input porque sino evalua lo
		 * mismo más de lo que debería, pero eran muchas condiciones 
		 */
		do {		
			System.out.println("Introduce num1: ");
			num1 = sc.next().toUpperCase();
			num = switch (num1) {
			case "UNO": {yield 1;}
			case "DOS": {yield 2;}
			case "TRES": {yield 3;}
			case "CUATRO": {yield 4;}
			case "CINCO": {yield 5;}
			case "SEIS": {yield 6;}
			default: {yield 0;}
			};
		}while (num ==0); 
		
		do {
			System.out.println("Introduce num2: ");
			num2 = sc.next().toUpperCase();
			nume = switch (num2) {
			case "UNO": {yield 1;}
			case "DOS": {yield 2;}
			case "TRES": {yield 3;}
			case "CUATRO": {yield 4;}
			case "CINCO": {yield 5;}
			case "SEIS": {yield 6;}
			default: {yield 0;}
			};
		}while(nume == 0);

		System.out.println(num + nume);
		
		sc.close();
	}

}
