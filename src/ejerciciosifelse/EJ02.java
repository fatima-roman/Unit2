package ejerciciosifelse;

import java.util.Scanner;

public class EJ02 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		double num; 
		
		//LEER EDAD
		System.out.print("Introduce tu NUM: ");
		num = sc.nextDouble();
		
		//condicion es mayor o no  
		if (num!=0 && num <=1 && num >= -1) {
			System.out.println("CASI-CERO");
		}else {
			System.out.println("NUM");
		}
		
		//Close Scanner
		sc.close();
	}

}
