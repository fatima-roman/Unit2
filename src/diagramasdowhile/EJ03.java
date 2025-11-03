package diagramasdowhile;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		//New Scanner
		Scanner sc = new Scanner(System.in); 
		
		//Create variables 
		int n, cont = 0, i=0; 
		System.out.println("Introduce in número: ");
		n = sc.nextInt();
		
		do {
			++cont; 
			i+=cont;
		}while(cont != n); 
		System.out.println(i);
		
		sc.close();
		
	}

}
