package ejerciciosexamenes;

import java.util.Scanner;

public class EJ02 {

	public static void main(String[] args) {
		//Create Scanner 
		Scanner sc = new Scanner(System.in);
		
		//Variable para introducir numero
		int n; 
		int par =0; 
		int impar=0; 
		int k; 
		int restaN;
		
		//Pedir datos al usuario 
		System.out.println("Introduce un número: ");
		n= sc.nextInt();
		restaN=n;
		
		//Primero for para  todos los caracteres de la variable 
		for (int i=1; i<=String.valueOf(n).length(); i++) {
			k = restaN%10; 
			restaN/=10;
			if (k%2==0) {
				par++; 
			}else {
				impar++; 
			}
		}
		
		System.out.println("Este número tiene "+ impar+" cifras impares y "+ par+" cifras pares");
		
		
		sc.close();
	}

}
