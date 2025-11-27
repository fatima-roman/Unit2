package ejerciciosexamenes;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class EJ05 {

	public static void main(String[] args) {
		//Create Scanner 
		Scanner sc = new Scanner(System.in);
		
		//Variable para introducir numero
		int tamanoEscaque;
		int tInicial = 8; //nº lineas
		final int TLINEA = 8; //nº de casillas por linea
		
		//Pedir datos al usuario 
        System.out.print("Introduce el tamaño del escaque: ");
        tamanoEscaque = sc.nextInt();
        
        tInicial *= tamanoEscaque;
        
        for (int i=1; i<=tInicial;i++) {
        	
        	if (tInicial%i!=0) {
	        	for (int k=1;k<=TLINEA;k++) {
	        		if (k%tamanoEscaque!=0) {
	        			for (int j =1; j<=tamanoEscaque;j++) {
	        				System.out.print(" ");
	        			}
	        		}else {
	        			for (int j =1; j<=tamanoEscaque;j++) {
	        				System.out.print("#");
	        			}
	        		}
	        	}	
        	}else {
        		for (int k=1;k<=TLINEA;k++) {
	        		if (k%tamanoEscaque!=0) {
	        			for (int j =1; j<=tamanoEscaque;j++) {
	        				System.out.print("#");
	        			}
	        		}else {
	        			for (int j =1; j<=tamanoEscaque;j++) {
	        				System.out.print(" ");
	        			}
	        		}
	        	}	
        	}
        	
        	
        	
        	System.out.println();
        } //FIN PRIMER FOR
        
        sc.close();
	}

}
