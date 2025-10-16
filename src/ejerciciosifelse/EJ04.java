package ejerciciosifelse;

import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num; 
		
		System.out.println("Inteoduce un número: ");
		num = sc.nextInt();
		
		if (num <= 10) {
			System.out.println("Tiene 1 cifras");
		} else if (num >= 100 && num < 1000) {
			System.out.println("Tiene 2 cifras");
		} else if (num >= 1000 && num < 10000) {
			System.out.println("Tiene 3 cifras");
		} else if (num >= 10000 && num < 100000) {
			System.out.println("Tienes 4 cifras");
		}
		
		sc.close();
		
	}

}
