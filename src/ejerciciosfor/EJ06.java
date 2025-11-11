package ejerciciosfor;

import java.util.Scanner;

public class EJ06 {

	public static void main(String[] args) {
		//New Scanner
		Scanner sc = new Scanner(System.in); 
		
		//Create variables 
		int n=0; 

		
		for (int i=1;i<=5;i++) {
			System.out.println("Introduce tu nota número "+i);
			n = sc.nextInt();
			if (n<5) {System.out.println("SUSPENSO");}
		}
		
		sc.close();
	}

}
