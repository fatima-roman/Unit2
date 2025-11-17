package ejerciciosbucles;

import java.util.Scanner;

public class EJ02 {

	public static void main(String[] args) {
		//New Scanner
		Scanner sc = new Scanner(System.in); 
		
		//Create variables 
		int n, prim=0; 
		System.out.println("Introduce in número: ");
		n = sc.nextInt();
		
		for (int i=1;i<=n;i++) {
			for (int k=1; k<=i;k++) {
				if (i%k == 0) {prim++;}
			}
			if (prim<=2) {System.out.println(i);}
			prim =0;
		}
		

		sc.close();
	}

}
