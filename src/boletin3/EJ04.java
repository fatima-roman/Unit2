package boletin3;

import java.util.Random;
import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		/* PRUEBAS A REALIZAR
		 * 1. Comprobar valores correctos e incorrectos
		 */
		// new scanner and random
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		// Create variables
		int num1 = rd.nextInt(0,100);
		int num2 = rd.nextInt(0,100);
		int sol; 
		
		// Evaluate and solve for the entered value
		System.out.println(num1 +"+"+num2);

		// Input for variables
		System.out.println("Introduce sol: ");
		sol = sc.nextInt();
	
		// Evaluate and solve for the entered value
		
		System.out.println(num1+num2==sol?"BIEN":"MAL");
		
		// Close scanner
		sc.close();

	}

}
