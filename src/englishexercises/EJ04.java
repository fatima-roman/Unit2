package englishexercises;

import java.util.Scanner;

public class EJ04 {

	public static void main(String[] args) {
		/* PRUEBAS A REALIZAR
		 * 1. Check negative numbers
		 */
		
		// new scanner
		Scanner sc = new Scanner(System.in);

		// Create variables
		int pay;
		int give;
		int c2e = 0, c1e = 0, c50=0, c20=0, c10=0, c5=0, c2=0, c1=0; 


		// Input for variables
		System.out.println("enter quantity that the client must pay (cents): ");
		pay = sc.nextInt();
		System.out.println("enter the quantity that the client gives (cents):");
		give = sc.nextInt();
		
	
		// Evaluate and solve for the entered value
		give = give - pay; 
		if (give <1) {
			System.out.println("ERRORR");
		}
		if (give >= 200) {
			c2e =give/200;
			give = give%200;}
		if (give >= 100) {
			c1e=give/100;
			give = give%100;}
		if (give >= 50) {
			c50=give/50;
			give = give%50;}
		if (give >= 20) {
			c20= give/20;
			give = give%20;}
		if (give >= 10) {
			c10=give/10;
			give = give%10;}
		if (give >= 5) {
			c5=give/5;
			give = give%5;}
		if (give >= 2) {
			c2=give/2;
			give = give%2;}
		if (give >= 1) {
			c1= give/1;
			give = give%1;}
		
		
		System.out.println(c2e + " " + c1e + " " +c50 + " " +c20 + " " +c10 + " " +c5 + " " +c2 + " " +c1 + " " );
		
		
		// Close scanner
		sc.close();
	}

}
