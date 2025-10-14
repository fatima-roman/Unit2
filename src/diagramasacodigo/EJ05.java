package diagramasacodigo;

import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int n1; 
		
		//LEER EDAD
		System.out.print("Introduce un numero: ");
		n1 = sc.nextInt();
		
		//condicion es mayor o no  
		if (n1 >= 0 ) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}
		
		//Close Scanner
		sc.close();
	}

}
