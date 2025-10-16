package diagramasacodigo;

import java.util.Scanner;

public class EJ10 {
	public static void main(String[] args) {
		
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int hora; 
		int min; 
		int seg; 
		
		//LEER EDAD
		System.out.print("Introduce h: ");
		hora = sc.nextInt();
		System.out.print("Introduce m: ");
		min = sc.nextInt();
		System.out.print("Introduce s: ");
		seg = sc.nextInt();
		
		
		//condicion es mayor o no  
		if (seg == 59){
			++min;
			seg = seg- 59;
			if (min==60) {
				++hora; 
				min = min - min; 
				if (hora == 24) {
					hora = hora - hora; 
				}
			}
		}else {
			seg++;
		}
			
		System.out.println(hora +":"+min+":"+seg);
		//Close Scanner
		sc.close();
	}
}
