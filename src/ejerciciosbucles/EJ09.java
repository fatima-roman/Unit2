package ejerciciosbucles;

import java.util.Scanner;

public class EJ09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long n;
        long original;
        long invertido = 0;
        long dig;
		
        do {
	        System.out.print("Introduce un número mayor o igual que 0: ");
	        n = sc.nextLong();
        }while(n<0);
        
        original = n;


        while (n > 0) {
            dig = n % 10;
            invertido = invertido * 10 + dig;
            n /= 10;
        }

        System.out.println(original == invertido ? "ES CAPICÚA" : "NO ES");

        sc.close();
	}

}
