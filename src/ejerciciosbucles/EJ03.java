package ejerciciosbucles;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b, i;
		int min;

		System.out.println("Introduce a:");
		a = sc.nextInt();
		System.out.println("Introduce b:");
		b = sc.nextInt();

		min = Math.min(a, b);
		i = min;

		while (a % i == 0 && b % i == 0) {
			if (a % i == 0 && b % i == 0) {
				System.out.println("MCD " + i);
			}
			--i;
		}

		sc.close();
	}

}
