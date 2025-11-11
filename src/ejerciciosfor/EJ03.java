package ejerciciosfor;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		//New Scanner
		Scanner sc = new Scanner(System.in); 
		
		//Create variables 
		double n=0, cont=0; 
		
		for (int i=0; i<=10; i++) {
			System.out.println("Introduce un número, vas por el número "+ i);
			n+= sc.nextInt(); 
			++cont; 
		}
		System.out.println("Media = " + (double)(n/cont));
		
		sc.close();
	}

}
