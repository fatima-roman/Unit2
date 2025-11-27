package ejerciciosexamenes;

import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		//Create Scanner 
		Scanner sc = new Scanner(System.in);
		
		//Variable para introducir numero
		int tamanoEscaque;
		int fila; 
		boolean negra; 
		int tInicial = 8; //nº lineas
		final int TLINEA = 8; //nº de casillas por linea
		
		//Pedir datos al usuario 
        System.out.print("Introduce el tamaño del escaque: ");
        tamanoEscaque = sc.nextInt();
        
        tInicial *= tamanoEscaque; //nº de lineas total segun tamaño escaque 
        
        for (int i=2; i<=tInicial+1;i++) {
        	
        	fila =i/tamanoEscaque;
        	for (int k=0; k<TLINEA;k++) {
        		negra = (fila+k)%2==0;
        		for (int p=0; p<tamanoEscaque;p++) {
        			System.out.print(negra?"#":" ");
        		}
        	}

        	System.out.println();
        } //FIN PRIMER FOR
        
        sc.close();
	}

}
