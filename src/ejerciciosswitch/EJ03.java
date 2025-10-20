package ejerciciosswitch;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		//new scanner 
		Scanner sc = new Scanner(System.in);
		
		//Create variables
		int num1; 
		int num2; 
		int letra; 
		
		//Input for variables 
		System.out.println("Introduce un num: ");
		num1 = sc.nextInt();
		System.out.println("Introduce un num: ");
		num2 = sc.nextInt();
		System.out.println("1. SUMAR LOS NÚMEROS\r\n"
				+ "2. RESTAR LOS NÚMEROS\r\n"
				+ "3. MULTIPLICAR LOS NÚMEROS\r\n"
				+ "4. DIVIDIR LOS NÚMEROS\r\n"
				+ "\nIntroduce una opcion: ");
		letra = sc.nextInt();
		
		//Evaluate and solve for the entered value
		switch (letra) {
		case 1:{ 
			System.out.println("SUMAR LOS NUMEROS" + (num1+num2));
			break;}
		case 2:{ 
			System.out.println("RESTAR LOS NUMEROS " + (num1-num2) );
			break;}
		
		case 3:{ 
			System.out.println("MULTIPLICAR LOS NUMEROS " + (num1*num2));
			break;}
		
		case 4:{ 
			System.out.println("DIVIDIR LOS NUMEROS " + (num1/num2));
			break;}
		default:{
			System.out.println("OPCIóN INCORRECTA");
		}
		};
		
		//Close scanner
		sc.close();
	}

}
