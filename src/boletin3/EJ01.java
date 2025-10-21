package boletin3;

import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		/* PRUEBAS A REALIZAR
		 * 1. Comprobar valores negativos y fuera de rango
		 * 2. Comprobar números capicúas en todas las condiciones (9,99,989,9889)
		 * 3. Comprobar números normales (12,123,1234)
		 */
		// new scanner
		Scanner sc = new Scanner(System.in);

		// Create variables
		int num;

		// Input for variables
		System.out.println("Introduce un num: ");
		num = sc.nextInt();
	
		// Evaluate and solve for the entered value
		if (num <10 && num>0) {
			System.out.println("es");
		}else if (num >= 10 && num < 100 && (num/10 ==num%10)) {
			System.out.println("es");
		}else if (num >= 100 && num< 1000 &&(num/100 == num%10)) {
			System.out.println("es");
		}else if (num>= 1000 && num< 10000 &&(num/1000 == num%10)&&(num/100 == num%100)) {
			System.out.println("es");
		}else if (num>10000 || num < 0){
			System.out.println("num no válido");
		}else {
			System.out.println("no es ");
		}
		
		// Close scanner
		sc.close();

	}

}
