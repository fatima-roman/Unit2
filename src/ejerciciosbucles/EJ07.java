package ejerciciosbucles;

import java.util.Scanner;

public class EJ07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n,n2;
		boolean u = true; 
		
		System.out.print("Introduce un número inicial: ");
		n = sc.nextInt();
		
		while (u) {
		System.out.print("Introduce un número: ");
		n2 = sc.nextInt();
			if (n2<=0) {u = false;}
			if (n2<n && n2 !=0) {System.out.println("Fallo es menor.");}
		n = n2; 
		}
		

		sc.close();
	}

}
