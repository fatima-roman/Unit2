package diagramasacodigo;

import java.util.Scanner;

public class EJ04 {
	
public static void main(String[] args) {
		
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int n1; 
		int n2; 
		
		//LEER EDAD
		System.out.print("Introduce un numero: ");
		n1 = sc.nextInt();
		
		System.out.print("Introduce otro numero: ");
		n2 = sc.nextInt();
		
		//condicion es mayor o no  
		if (n1 > n2) {
			System.out.println(n1);
		} else {
			System.out.println(n2);
		}
		
		//Close Scanner
		sc.close();
	}
	

}
