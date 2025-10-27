package diagramasacodigowhile;

import java.util.Scanner;

public class EJ06 {

	public static void main(String[] args) {
		/* PRUEBAS A REALIZAR
		 * 1. Check negative numbers
		 * 2. Check count 18 
		 * 
		 */
		
		// new scanner
		Scanner sc = new Scanner(System.in);

		// Create variables
		int num;
		int numMax = 0;

		// Input for variables
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		
		//sumar todos los números
		while (num>0) {
			if (num>numMax) {numMax=num;}
			num = sc.nextInt();
		}
		
		//Mostrar resultados
		System.out.println("Número alto: "+ numMax);

		// Close scanner
		sc.close();
	}

}
