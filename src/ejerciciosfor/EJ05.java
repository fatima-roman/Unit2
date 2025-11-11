package ejerciciosfor;

import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		//New Scanner
		Scanner sc = new Scanner(System.in); 
		
		//Create variables 
		int n, fac=0; 
		System.out.println("Introduce in número: ");
		n = sc.nextInt();
		
		for (int i=0;i<n;i++) {
			fac*=i ;
		}
		System.out.println(fac);
		
		sc.close();
	}

}
