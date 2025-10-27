package diagramasacodigowhile;

import java.util.Scanner;

public class EJ05 {

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
		int numMayor = 0;
		int sumaEdades = 0;
		int mediaEdades = 0;
		int i = 0;

		// Input for variables
		System.out.println("Introduce un número: ");
		num = sc.nextInt();
		
		//sumar todos los números
		while (num>0) {
			i++;
			sumaEdades += num; 
			if (num>=18) {numMayor++;}
			num = sc.nextInt();
		}
		
		mediaEdades = sumaEdades/i; 
		//Mostrar resultados
		System.out.println("Suma edades: "+ sumaEdades
				+ "\nMedia edades: " + mediaEdades
				+ "\nMayor 18: " + numMayor);

		// Close scanner
		sc.close();
	}

}
