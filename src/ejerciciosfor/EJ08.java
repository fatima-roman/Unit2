package ejerciciosfor;

import java.util.Scanner;

public class EJ08 {

	public static void main(String[] args) {
		//New Scanner
		Scanner sc = new Scanner(System.in); 
		
		//Create variables 
		int n, n1; 
		System.out.println("Introduce in número: ");
		n = sc.nextInt();
		System.out.println("Introduce otro número: ");
		n1 = sc.nextInt();
		
		if (n>n1) {
			System.out.println("el primer número es mayor");
			for (int i = n1; i<n; i++) {
				System.out.println(i);
			}
		}else {
			System.out.println("el segundo número es mayor");
			for (int i = n; i<n1; i++) {
				System.out.println(i);
			}
		}
			
		
		sc.close();
	
	}
}
	

