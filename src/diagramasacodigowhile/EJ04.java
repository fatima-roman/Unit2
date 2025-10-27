package diagramasacodigowhile;

import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		/* PRUEBAS A REALIZAR
		 * 1. Check negative numbers
		 * 2. Check count 0 
		 * 
		 */
		
		// new scanner
		Scanner sc = new Scanner(System.in);

		// Create variables
		int num;
		int num0 = 0;
		int numPos = 0;
		double numNeg = 0;
		int numNegI = 0;
		int i = 0;

		// Input for variables
		System.out.println("Introduce un número: ");
		
		
		//sumar todos los números
		while (i <10) {
			num = sc.nextInt();
			i++;
			if (num == 0) {num0++;
			}else if (num<0) {
				numNeg += num; 
				numNegI++;
			}else {numPos += num;}
		}
		
		//Mostrar resultados
		System.out.println("Suma positivos: "+ numPos 
				+ "\nMedia negativos: " + (numNeg ==0 ? numNeg :numNeg/numNegI)
				+ "\nNúmero ceros: "+ num0);

		// Close scanner
		sc.close();
	}

}
