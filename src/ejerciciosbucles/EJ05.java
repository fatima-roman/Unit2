package ejerciciosbucles;

import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n;

		System.out.println("Introduce N:");
		n=sc.nextInt();
		
		for (int i = 1; i<=n; i++) {
			for (int k = 1; k<=i; k++) {
				System.out.print(k);
			}
			System.out.println();
		}
		
		
		for (int i = 1; i<=n; i++) {
			for (int k = 1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		sc.close();
	}

}
