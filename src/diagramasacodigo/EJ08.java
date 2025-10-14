package diagramasacodigo;

import java.util.Scanner;

public class EJ08 {
	public static void main(String[] args) {
		
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int num1; 
		int num2; 
		int num3; 
		
		//LEER EDAD
		System.out.print("Introduce un numero: ");
		num1 = sc.nextInt();
		
		System.out.print("Introduce otro numero: ");
		num2 = sc.nextInt();
		
		System.out.print("Introduce otro numero: ");
		num3 = sc.nextInt();
		
		//condicion es mayor o no  
		if (num1 > num2 && num1> num3) {
			System.out.println("num1 es mayor");
		} else if (num2 > num1 && num2 > num1) {
			System.out.println("num2 es mayor");
		}else {
			System.out.println("num3 es mayor");
		}
		
		//Close Scanner
		sc.close();
	}

}
