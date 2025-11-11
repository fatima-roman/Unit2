package ejerciciosfor;

import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		//New Scanner
		Scanner sc = new Scanner(System.in); 
		
		//Create variables 
		int n; 
		System.out.println("Introduce in número: ");
		n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			System.out.println(i);
		}
		
		sc.close();
	}

}
