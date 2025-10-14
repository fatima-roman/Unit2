package diagramasacodigo;

import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int edad; 
		
		//LEER EDAD
		System.out.print("Introduce tu edad: ");
		edad = sc.nextInt();
		
		//condicion es mayor o no  
		if (edad>=18) {
			System.out.println("Eres mayor de edad");
		}
		
		//Close Scanner
		sc.close();
	}

}
