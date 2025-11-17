package ejerciciosbucles;

import java.util.Scanner;

public class EJ08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int temp, digitos = 0;
		
		System.out.print("Introduce un número: ");
		temp = sc.nextInt();
		
        while (temp > 0) {
            temp /= 10;
            digitos++;
        }
        System.out.println(digitos);

		sc.close();

	}

}
