package ejerciciosexamenes;

import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		//Create Scanner 
		Scanner sc = new Scanner(System.in);
		
		//Variable para introducir numero
		int n; 
		int nTotalFilas;
		int anchoFilas;
		int espacios;
		int asteriscos;
		
		//Pedir datos al usuario 
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        
        nTotalFilas = n*2-1; //Lineas total
        anchoFilas = n*2+1; //Ancho MAX 
        
        for (int i=1;i<=nTotalFilas;i++) {
        	if (i <= n-1) {
        		espacios = n -1 *(i-1);
        		asteriscos = n+2 *(i-1);
        	}else {
        		espacios = i - n;
                asteriscos = n + 2 * (nTotalFilas - i);
        	}
        	
        	for (int k=1; k<=espacios; k++) {
        		System.out.print(" ");
        	}
        	
        	for (int k=1; k<=asteriscos;k++) {
        		System.out.print("*");
        	}
        	
        	System.out.println();
        }//for inicial del tamaño total 
	}

}
