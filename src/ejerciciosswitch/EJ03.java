package ejerciciosswitch;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		//new scanner 
		Scanner sc = new Scanner(System.in);
		
		//Create variables
		int num1; 
		int num2; 
		String letra; 
		
		//Input for variables 
		System.out.println("Introduce un num: ");
		num1 = sc.nextInt();
		System.out.println("Introduce un num: ");
		num2 = sc.nextInt();
		System.out.println("A. SUMAR LOS NÚMEROS\r\n"
				+ "B. RESTAR LOS NÚMEROS\r\n"
				+ "C. MULTIPLICAR LOS NÚMEROS\r\n"
				+ "D. DIVIDIR LOS NÚMEROS\r\n"
				+ "\nIntroduce una opcion: ");
		letra = sc.next().toUpperCase();
		
		//Evaluate and solve for the entered value
		switch (letra) {
		case "A":{ 
			System.out.println("SUMAR LOS NUMEROS " + (num1+num2));
			break;}
		case "B":{ 
			System.out.println("RESTAR LOS NUMEROS " + (num1-num2) );
			break;}
		
		case "C":{ 
			System.out.println("MULTIPLICAR LOS NUMEROS " + (num1*num2));
			break;}
		
		case "D":{ 
			System.out.println("DIVIDIR LOS NUMEROS ");
			System.out.println(num2 ==0 ?"NO SE PUEDE":(num1/num2));
			break;}
		default:{
			System.out.println("OPCIóN INCORRECTA");
		}
		};
		
		//Close scanner
		sc.close();
	}

}
