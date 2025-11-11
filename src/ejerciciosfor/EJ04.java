package ejerciciosfor;

import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		//New Scanner
		Scanner sc = new Scanner(System.in); 
		
		//Create variables 
		int n =0, cont=1; 
		
		for (int i=0; cont<=10; i++) {
			if(i%2!=0) {n+=i; ++cont;}
		}
		System.out.println(n);
		
		sc.close();
	}

}
