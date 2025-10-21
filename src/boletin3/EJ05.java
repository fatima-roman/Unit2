package boletin3;

import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		/* PRUEBAS A REALIZAR
		 * 1. Comprobar valores decimales y enteros
		 * 2. 
		 */
		// new scanner
		Scanner sc = new Scanner(System.in);

		// Create variables
		double dis;
		double pre;
		double est;

		// Input for variables
		System.out.println("Introduce la dis: ");
		dis = sc.nextInt();
		System.out.println("Introduce los días de est: ");
		est = sc.nextInt();
	
		// Evaluate and solve for the entered value
		pre = dis * 2.5;
		if (est>=7 && dis >=800) {
			pre = pre -(pre*0.30);
		}
		
		System.out.println(pre + "€");
		
		// Close scanner
		sc.close();

	}

}
