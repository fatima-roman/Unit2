package englishexercises;

import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		/* PRUEBAS A REALIZAR
		 * 1. Check negative numbers
		 */
		
		// new scanner
		Scanner sc = new Scanner(System.in);

		// Create variables
		int v = 0;
		int t = 0;
		int d = 0;
		String data; 

		// Input for variables
		System.out.println("enter V/D/T: ");
		data = sc.next().toUpperCase();
		System.out.println("VALUE:");
		switch (data) {
		case "V" -> {v=sc.nextInt();}
		case "D" -> {d=sc.nextInt();}
		case "T" -> {t=sc.nextInt();}
		default -> {System.out.println("LETRA INCORRECTA");}
		};
		
		System.out.println("enter V/D/T: ");
		data = sc.next().toUpperCase();
		System.out.println("VALUE:");
		switch (data) {
		case "V" -> {v=sc.nextInt();}
		case "D" -> {d=sc.nextInt();}
		case "T" -> {t=sc.nextInt();}
		default -> {System.out.println("LETRA INCORRECTA");}
		};
		
		if (v!=0 && d!=0) {
			t= d/v;
			System.out.println("RESULT: T = " + t);
		}else if (v!=0 && t!=0) {
				d=v*t;
				System.out.println("RESULT: D = " + d);
		}else if (d!=0 && t!=0) {
			v=d/t;
			System.out.println("RESULT: V = " + v);
		}
		
		

		// Close scanner
		sc.close();
	}

}
