package ejerciciosswitch;

import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		// new scanner
		Scanner sc = new Scanner(System.in);

		// Create variables
		String num1;
		String num2;
		int num;
		int nume;

		// Input for variables
		System.out.println("Introduce un num: ");
		num1 = sc.next().toUpperCase();
		System.out.println("Introduce un num: ");
		num2 = sc.next().toUpperCase();

		// Evaluate and solve for the entered value
		num = switch (num1) {
		case "UNO": {
			yield 1;
		}
		case "DOS": {
			yield 2;
		}
		case "TRES": {
			yield 3;
		}
		case "CUATRO": {
			yield 4;
		}
		case "CINCO": {
			yield 5;
		}
		case "SEIS": {
			yield 6;
		}
		default: {
			yield 0;
		}
		};
		nume = switch (num2) {
		case "UNO": {
			yield 1;
		}
		case "DOS": {
			yield 2;
		}
		case "TRES": {
			yield 3;
		}
		case "CUATRO": {
			yield 4;
		}
		case "CINCO": {
			yield 5;
		}
		case "SEIS": {
			yield 6;
		}
		default: {
			yield 0;
		}
		};

		System.out.println(num + nume);

		// Close scanner
		sc.close();
	}
	

}
