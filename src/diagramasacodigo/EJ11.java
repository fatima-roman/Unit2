package diagramasacodigo;

import java.util.Scanner;

public class EJ11 {
	public static void main(String[] args) {
		
		// Create new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Create variables 
		int hora; 
		int tarNor; 
		double salBr; 
		double salNeto; 
		double imp; 
		String nombre; 
		
		//LEER EDAD
		System.out.print("Introduce hora: ");
		hora = sc.nextInt();
		System.out.print("Introduce tarifa normal: ");
		tarNor = sc.nextInt();
		System.out.print("Introduce nombre: ");
		nombre = sc.next();
		
		
		//condicion es mayor o no  
		
		if (hora <= 35){
			salBr = hora * tarNor;
			}else {
					salBr = 35 * tarNor+ (hora-35)*(tarNor*1.5);
				}
		
		
		if (salBr <=500 ) {
			imp = 0;  
		}else if (salBr <=900) {
				imp = (salBr-500)*0.25;
		}else {
				imp=(400*0.25)+(salBr-900)*0.45;
			}
		
			
		salNeto = salBr - imp; 
		System.out.println("nombre: "+nombre+ " salBr: "+ salBr+ " imp: "+ imp + " salNeto: " + salNeto);
		//Close Scanner
		sc.close();
	}
}
