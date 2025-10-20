package ejerciciosswitch;

import java.util.Scanner;

public class EJ02 {

	public static void main(String[] args) {
		//new scanner 
		Scanner sc = new Scanner(System.in);
		
		//Create variables
		int dia; 
		
		//Input for variables 
		System.out.println("Introduce un día: ");
		dia = sc.nextInt();
		
		//Evaluate and solve for the entered value
		switch (dia) {
		case 1:{ 
			System.out.println("LUNES");
			break;}
		case 2:{ 
			System.out.println("MARTES");
			break;}
		
		case 3:{ 
			System.out.println("MIERCOLES");
			break;}
		
		case 4:{ 
			System.out.println("JUEVES");
			break;}
		
		case 5:{ 
			System.out.println("VIERNES");
			break;}
		case 6:{ 
			System.out.println("SABADO");
			break;}
		case 7:{ 
			System.out.println("DOMINGO");
			break;}
		};
		
		//Close scanner
		sc.close();
	}

}
