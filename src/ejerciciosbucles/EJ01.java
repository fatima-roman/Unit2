package ejerciciosbucles;

import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int hora; 
		int min; 
		int seg; 
		int tAumen; 
		
		//LEER HORA
		System.out.println("TIEMPO A AUMENTAR (SEG)");
		tAumen=sc.nextInt();
		System.out.print("Introduce h: ");
		hora = sc.nextInt();
		System.out.print("Introduce m: ");
		min = sc.nextInt();
		System.out.print("Introduce s: ");
		seg = sc.nextInt();
		
		
		//condicion es mayor o no  
		seg += tAumen;
		if (seg > 59){
			min += seg/60;
			seg = seg - 60*(seg/60); 
			if (min > 59) {
				hora += min/60;
				min = min - 60*(min/60);
				if (hora>23) {
					hora = hora - 24*(hora/24);
				}}}
				
			
		System.out.println(hora +":"+min+":"+seg);
		//Close Scanner
		sc.close();
	}
}

	


