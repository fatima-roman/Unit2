package boletin3;

import java.util.Scanner;

public class EJ02 {

	public static void main(String[] args) {
		/* PRUEBAS A REALIZAR
		 * 1. Comprobar valores negativos y positivos
		 */
		// new scanner
		Scanner sc = new Scanner(System.in);

		// Create variables
		float num;
		int sol;

		// Input for variables
		System.out.println("Introduce un num: ");
		num = sc.nextInt();
	
		// Evaluate and solve for the entered value
		sol = (int) (num<0 ? ((num +(-num)*2)):num);
		
		System.out.println(sol);
		
		// Close scanner
		sc.close();

	}

}
