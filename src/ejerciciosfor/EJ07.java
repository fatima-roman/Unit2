package ejerciciosfor;

import java.util.Scanner;

public class EJ07 {

	public static void main(String[] args) {
		//New Scanner
		Scanner sc = new Scanner(System.in); 
		
		//Create variables 
		int n, prim=0; 
		System.out.println("Introduce in número: ");
		n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			if (n%i==0) {prim++;}
		}
		
		System.out.println(prim>2?"NO ES PRIMO":"ES PRIMO");
		sc.close();
	}

}
