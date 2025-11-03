package diagramasdowhile;

import java.util.Scanner;

public class EJ06 {

	public static void main(String[] args) {
		//New Scanner
		Scanner sc = new Scanner(System.in); 
		
		//Create variables 
		String item;  
		String item2; 
		String siONo;  
		
		
		//Leer datos j1
		do {
			System.out.println("JUGADOR 1: Inteoduce un item (PIEDRA, PAPEL O TIJERA): ");
			item = sc.next().toUpperCase();
		} while (!item.equals("PIEDRA") && !item.equals("PAPEL") && !item.equals("TIJERA") );
		
		
		//Leer datos j2 
		do {
			System.out.println("JUGADOR 2: Inteoduce otro item (PIEDRA, PAPEL O TIJERA): ");
			item2 = sc.next().toUpperCase();
		}while(!item2.equals("PIEDRA") && !item2.equals("PAPEL") && !item2.equals("TIJERA") );
		
		//
		do {
			if (item.equals(item2) ) {
				System.out.println("EMPATE");
			} else if ((item.equals("PIEDRA")&& item2.equals("TIJERA"))
				||(item2.equals("PIEDRA")&& item.equals("PAPEL"))
				||(item.equals("TIJERA")&& item2.equals("PAPEL"))) {
				System.out.println("GANA 1");
			} else {
				System.out.println("GANA 2");}
			System.out.println("¿Quieres seguir jugando?(S/N)");
			siONo = sc.next().toUpperCase(); 
		}while (!siONo.equals("S") ); 
		
		sc.close();
	}

}
