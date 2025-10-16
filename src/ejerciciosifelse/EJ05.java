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
		
		if (item.equals("PIEDRA") ) {
			if (item.equals(item2)) {
				System.out.println("EMPATE");
			} else if (item2.equals("PAPEL")) {
				System.out.println("GANA JUGARDOR 2");
			}else if (item2.equals("TIJERA")) {
				System.out.println("GANA JUGADOR 1");
			}
		}
		if (item.equals("PAPEL") ) {
			if (item.equals(item2)) {
				System.out.println("EMPATE");
			} else if (item2.equals("TIJERA")) {
				System.out.println("GANA JUGARDOR 2");
			}else if (item2.equals("PIEDRA")) {
				System.out.println("GANA JUGADOR 1");
			}
		}
		if (item.equals("TIJERA") ) {
			if (item.equals(item2)) {
				System.out.println("EMPATE");
			} else if (item2.equals("PIEDRA")) {
				System.out.println("GANA JUGARDOR 2");
			}else if (item2.equals("PAPEL")) {
				System.out.println("GANA JUGADOR 1");
			}
		}
		
		sc.close();
	}

}
