package ejerciciosbucles;

import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a, b;
		int max, min;
		boolean u = true;

		System.out.println("Introduce a:");
		a = sc.nextInt();
		System.out.println("Introduce b:");
		b = sc.nextInt();

		// Determinar cuál es mayor y cuál menor
		min = Math.min(a, b);
		max = Math.max(a, b);

		// Buscar el mcm
		int i = max;
		while (u) {
		    if (i % min == 0) {
		        System.out.println("MCM: " + i);
		        u = false;
		    }
		    i += max;  // ir sumando el mayor
		}

		sc.close();

	}

}
