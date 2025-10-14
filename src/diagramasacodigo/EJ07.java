package diagramasacodigo;

import java.util.Scanner;

public class EJ07 {
	public static void main(String[] args) {
		
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int num1; 
		int num2; 
		
		//LEER EDAD
		System.out.print("Introduce un numero: ");
		num1 = sc.nextInt();
		
		System.out.print("Introduce otro numero: ");
		num2 = sc.nextInt();
		
		//condicion es mayor o no  
		if (num1 > num2) {
			System.out.println(num1);
		} else if (num1 == num2) {
			System.out.println("Iguales");
		}else {
			System.out.println(num2);
		}
		
		//Close Scanner
		sc.close();
	}

}
