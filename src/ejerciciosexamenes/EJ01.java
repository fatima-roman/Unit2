package ejerciciosexamenes;

import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		//Create Scanner 
		Scanner sc = new Scanner(System.in);
		
		//Variable para introducir numero
		int n; 
		
		//Pedir datos al usuario 
		System.out.println("Introduce un número: ");
		n= sc.nextInt();
		
		//Primero for para las filas
		for(int i=1; i<=n; i++ ) {
			//Pinta un asterisco en la primera y última línea
			if(i==1 || i==n) {
				for(int j=1; j<=n; j++) {
				System.out.print("*");	
				}
			}else {
				//pinta un asterisco al inicio
				System.out.print("*");
				//pinta x numero de espacios
				for(int k=0; k<n-2;k++) {
					System.out.print(" ");
				}
				//pinta un asteristco al final 
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
	

}
