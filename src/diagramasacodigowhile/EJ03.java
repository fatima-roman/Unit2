package diagramasacodigowhile;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		/* PRUEBAS A REALIZAR
		 * 1. Check negative numbers
		 */
		
		// new scanner
		Scanner sc = new Scanner(System.in);

		// Create variables
		int num;
		int i = 0;
		int num1 = 0;

		// Input for variables
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		
		
		//sumar todos los números
		while (num >0) {
			i++;
			num1 += num; 
			System.out.println("Introduce otro número (negativo para terminar): ");
			num = sc.nextInt();
		}
		
		//Mostrar resultados
		System.out.println("Media: "+ num1/i);

		// Close scanner
		sc.close();
		
	}

}
