package ejerciciosifelse;

import java.util.Scanner;

public class EJ05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String item;  
		String item2;  
		
		System.out.println("JUGADOR 1: Inteoduce un item (PIEDRA, PAPEL O TIJERA): ");
		item = sc.next().toUpperCase();
		System.out.println("JUGADOR 2: Inteoduce otro item (PIEDRA, PAPEL O TIJERA): ");
		item2 = sc.next().toUpperCase();
		
		if (item.equals(item2) ) {
				System.out.println("EMPATE");
		} else if (item.equals("PIEDRA")&& item2.equals("TIJERA")) {
			System.out.println("GANA 1");
		} else if (item2.equals("PIEDRA")&& item.equals("PAPEL")) {
			System.out.println("GANA 1");
		}else if (item.equals("TIJERA")&& item2.equals("PAPEL")) {
			System.out.println("GANA 1");
		} else {
			System.out.println("GANA 2");

		}
		
		
		sc.close();
	}

}
