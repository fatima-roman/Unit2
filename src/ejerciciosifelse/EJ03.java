package ejerciciosifelse;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int num1; 
		int num2; 
		int num3; 
		double x; 
		double x1; 
		
		//LEER EDAD
		System.out.print("Introduce  A: ");
		num1 = sc.nextInt();
		
		System.out.print("Introduce  B: ");
		num2 = sc.nextInt();
		
		System.out.print("Introduce  C: ");
		num3 = sc.nextInt();
		
		x= (num2 * num2) - (4 * num1 * num3);
		
		
		//condicion es mayor o no  
		if (x < 0 || num1 == 0) {
			System.out.println("no tiene solucines reales ");
		} else {
			x = (-num2 + Math.sqrt(x))/(2*num1);
			x1 = (-num2 - Math.sqrt(x))/(2*num1);
			System.out.println("El resultado es: "+ x + "," + x1);
		}
		
		//Close Scanner
		sc.close();
	}

}
