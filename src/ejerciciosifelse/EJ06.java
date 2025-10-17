package ejerciciosifelse;

import java.util.Scanner;

public class EJ06 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int num1; 
		int num2; 
		int num3; 
		
		//LEER EDAD
		System.out.print("Introduce  A: ");
		num1 = sc.nextInt();
		
		System.out.print("Introduce  B: ");
		num2 = sc.nextInt();
		
		System.out.print("Introduce  C: ");
		num3 = sc.nextInt();
		
		if (num1 + num2 == num3) {
			System.out.println("A + B = C");
		} else if (num1 + num3 == num2) {
			System.out.println("A + C = B");
		}else if (num2 + num3 == num1) {
			System.out.println("C + B = A");
		}else {
			System.out.println("No da como resultado un valor introducido");
		}
		
		//Close Scanner
		sc.close();
	}

}
