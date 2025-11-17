package ejerciciosbucles;

import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b;
        int max, min;

        System.out.println("Introduce a:");
        a = sc.nextInt();
        System.out.println("Introduce b:");
        b = sc.nextInt();

        // Determinar mayor y menor
        min = Math.min(a, b);
        max = Math.max(a, b);

        // Buscar el MCM sin usar break
        int i = max;

        // Seguimos mientras i NO sea múltiplo del menor
        while (i % min != 0) {
            i += max;  
        }

        // Cuando el while termina, i ya es el MCM
        System.out.println("MCM: " + i);

        sc.close();

	}

}
