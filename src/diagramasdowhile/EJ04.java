package diagramasdowhile;

import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		//New Scanner
		Scanner sc = new Scanner(System.in); 
		
		//Create variables 
		int n, cont = 0; 
		System.out.println("Introduce in número: ");
		n = sc.nextInt();
		
		do {
			++cont; 
			System.out.println(n +" x "+cont+" = "+n*cont);
		}while(cont != 10); 
		
		sc.close();
	}

}
