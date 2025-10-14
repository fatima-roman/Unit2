package diagramasacodigo;

import java.util.Scanner;

public class EJ09 {
	public static void main(String[] args) {
		
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int num1; 
		//LEER EDAD
		System.out.print("Introduce tu nota: ");
		num1 = sc.nextInt();
		
		//condicion es mayor o no  
		if (num1>=0&&num1<3) {
			System.out.println("MUY DEFICIENTE");
		} else if (num1>=3&&num1 <5) {
			System.out.println("INSUFICIENTE");
		}else if (num1>=5&&num1 <7){
			System.out.println("BIEN");
		}else if (num1>=7&&num1 <9){
			System.out.println("NOTABLE");
		} else if(num1>=9&&num1<=10) {
			System.out.println("SOBRESALIENTE");
		}else {
			System.out.println("ERROR");
		}
			
		//Close Scanner
		sc.close();
	}

}
