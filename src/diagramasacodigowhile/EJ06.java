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
		double num;
		double numMax = 0;

		// Input for variables
		System.out.println("Introduce un número (-1 para terminar): ");
		num = sc.nextDouble();
		
		//sumar todos los números
		while (num!=-1) {
			if (num>numMax) {numMax=num;}
			num = sc.nextDouble();
		}
		
		//Mostrar resultados
		System.out.println("Número alto: "+ numMax);

		// Close scanner
		sc.close();
	}

}
