package ejerciciosswitch;

import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		//new scanner 
		Scanner sc = new Scanner(System.in);
		
		//Create variables
		int nota; 
		
		//Input for variables 
		System.out.println("Introduce tu nota: ");
		nota = sc.nextInt();
		
		//Evaluate and solve for the entered value
		switch (nota) {
		case 0,1,2,3,4:{ 
			System.out.println("INSUFICIENTE");
			break;}
		case 5:{ 
			System.out.println("SUFICIENTE");
			break;}
		
		case 6:{ 
			System.out.println("BIEN");
			break;}
		
		case 7,8:{ 
			System.out.println("NOTABLE");
			break;}
		
		case 9,10:{ 
			System.out.println("SOBRESALIENTE");
			break;}
		};
		
		//Close scanner
		sc.close();
		
	}

}
