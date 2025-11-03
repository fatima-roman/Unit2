package diagramasdowhile;

import java.util.Random;
import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		//New Scanner
		Scanner sc = new Scanner(System.in); 
		//New Random
		Random rand = new Random();
		
		//Create variables 
		int min=1, max = 101, n, i; 
		String item; 
		System.out.println("Introduce in número: ");
		n = sc.nextInt();
		
		System.out.println(i= rand.nextInt(min,max));
		
		do {
			item = sc.next().toUpperCase();
			if (item.equals("MAYOR")) {
				min = i; 
				System.out.println(i= rand.nextInt(min,max));
			} else if (item.equals("MENOR")) {
				max= i; 
				System.out.println(i= rand.nextInt(min,max));}
			}while(i != n); 
		System.out.println("ES IGUAL");
		
		sc.close();
	}

}
