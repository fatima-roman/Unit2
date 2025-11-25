package ejerciciosexamenes;

import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		//Create Scanner 
		Scanner sc = new Scanner(System.in);
		
		//Variable para introducir numero
		int n; 
		
		//Pedir datos al usuario 
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
        
        for (int j=1; j<=n*2; j++) {
        	//Espacios parte 1 
        	if (j<=n-1) {
	        	for (int i=n-1; i>=j;--i) {
		        	System.out.print("_");
		        }	
        	}//fin if espacios parte1
        	
        	//Espacios parte2
        	if (j>=n+1) {
	        	for (int i=1;i<=(j/2)-1;i++) {
	        		System.out.print("-");
	        	}
        	}//fin if espacios parte2
        	
        	//lineas inicial y final
        	if (j==(n*2)-1 || j==1) {
        		for (int i=1; i<=n; i++ ) {
        			System.out.print("*");
        		}
        	}else if (j<=(n*2)-1){//fin if lineas inicio y fin
	        	for (int i=n; i<=n*2;i=i+2) {
	        		System.out.print("p");
	        	}	
        	}

        	System.out.println();
        }//fin for inicial
        
	}

}
