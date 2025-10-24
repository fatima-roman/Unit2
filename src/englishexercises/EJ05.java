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
		int v;
		int t;
		int d;
		String data; 

		// Input for variables
		System.out.println("enter V/D/T: ");
		data = sc.next().toUpperCase();
		System.out.println("VALUE:");
		v= data.equals("V")?sc.nextInt():0;
		d= data.equals("D")?sc.nextInt():0;
		t= data.equals("T")?sc.nextInt():0;
		
		System.out.println("enter V/D/T: ");
		data = sc.next().toUpperCase();
		System.out.println("VALUE:");
		v= data.equals("V")?sc.nextInt():v;
		d= data.equals("D")?sc.nextInt():d;
		t= data.equals("T")?sc.nextInt():t;
		
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
