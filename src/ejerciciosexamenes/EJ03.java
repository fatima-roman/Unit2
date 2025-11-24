package ejerciciosexamenes;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		//Create Scanner 
		Scanner sc = new Scanner(System.in);
		
		//Variable para introducir numero
		int n; 
		
		//Pedir datos al usuario 
        System.out.print("Introduce un número: ");
        n = sc.nextInt();

        for (int i = n; i >= 1; i--) {
            // espacios iniciales
            for (int s = 0; s < n - i; s++) {
                System.out.print(" ");
            }
            // primera y última fila (llenas)
            if (i == n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                    if (j < i) System.out.print(" ");
                }
            }
            // resto de filas (huecas)
            else if (i == 1) {
                System.out.print("*");
            } else {
                System.out.print("*");
                for (int j = 1; j <= (i - 2) * 2 + 1; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
		
		
		
		sc.close();
	}

}
