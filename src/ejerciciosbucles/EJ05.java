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
		
		System.out.println();
		
		/*for (int i = 1; i<=n; i++) {
			for (int k = 1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                if (j < i) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
		sc.close();
	}

}
