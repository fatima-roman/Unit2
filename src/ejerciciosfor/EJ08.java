package ejerciciosfor;

import java.util.Scanner;

public class EJ08 {

	public static void main(String[] args) {
		//New Scanner
		Scanner sc = new Scanner(System.in); 
		
		//Create variables 
		int n, n1, temp, tempM; 
		System.out.println("Introduce in número: ");
		n = sc.nextInt();
		System.out.println("Introduce otro número: ");
		n1 = sc.nextInt();
		
		temp = n>n1?n1:n;
		tempM= n>n1?n:n1;
		System.out.println(n>n1?"El primero es mayor":"El segundo es mayor");
	
		for (int i = ++temp; i<tempM; i++) {
			System.out.println(i);
		}
		
			
		
		sc.close();
	
	}
}
	

