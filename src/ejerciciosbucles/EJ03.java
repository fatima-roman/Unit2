package ejerciciosbucles;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b; 
		int max,min;
		
		System.out.println("Introduce a:");
		a =sc.nextInt();
		System.out.println("Introduce b:");
		b = sc.nextInt();
		
		min =Math.min(a, b);
		max = Math.max(a, b);
		
		for (int i =min; i>=0; i--) {
			if (min%i==0 && max%i==0) {System.out.println("MCD "+i); break;}
		}
		
		sc.close();
	}

}
