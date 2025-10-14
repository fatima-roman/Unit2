package diagramasacodigo;

import java.util.Scanner;

public class EJ03 {
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
		
		//Imprimir cosas 
		System.out.println("n1+n2 =" + (n1+n2));
		System.out.println("n1-n2 =" + (n1-n2));
		System.out.println("n1*n2 =" + (n1*n2));
		
		//condicion es mayor o no  
		if (n2!=0) {
			System.out.println("n1*n2 =" + (n1/n2));
		} else {
			System.out.println("ERROR");
		}
		
		//Close Scanner
		sc.close();
	}
	
}
