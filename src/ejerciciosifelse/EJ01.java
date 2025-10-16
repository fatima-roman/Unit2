package ejerciciosifelse;

import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int num; 
		
		//LEER EDAD
		System.out.print("Introduce tu edad: ");
		num = sc.nextInt();
		
		//condicion es mayor o no  
		if (num%2==0) {
			System.out.println("ES PAR");
		}else {
			System.out.println("IMPAR");
		}
		
		//Close Scanner
		sc.close();
	}

}
