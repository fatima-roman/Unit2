package extras;

import java.util.Random;
import java.util.Scanner;

public class apuntesDeJavaEnJava {

	public static void main(String[] args) {
		/*-------------
		 * ESCANER
		 * ------------
		 */
		 Scanner sc = new Scanner(System.in);
		 
		 /*------------------------
		  * VARIABLES Y SUS USOS
		  * -----------------------
		  * 
		  * Byte ==corto muy corto 
		  * Short == corto 
		  * Int == uso habitual 
		  * long == int largo 
		  * float == int pero con decimales 
		  * double == uso habitual al trabajar con decimales 
		  * boolean == true or false 
		  * char == algun caracter pero solo uno 
		  * String == cadena de caracteres 
		  * 
		  * 
		  * SCANNER EN VARIABLES
		  * nextLine() === lee el string 
		  * next() == lee una cadena de caracteres hasta que encuentra un tab, un espacio en blanco o un intro 
		  * 
		  * --------------
		  * MATH RANDOM
		  * --------------
		  * 
		  * Math.random(): Dentro de la clase Math existe un método llamado random()
		  * que genera un número comprendido entre 0 y 1 pero excluendo el 1: [0,1). Ejemplos:
		  * Número entre 0 y 100: Math.random() * 101
		  * Número entre 1 y 100: Math.random() * 100 + 1
		  * Número entre 40 y 60: Math.random() * 20 + 40
		  * 
		  * -----------
		  * RANDOM
		  * -----------
		  * 
		  * Con la clase random tambien se puede 
		  * EJ: 
		  * Random rand = new Random()
		  * int u = rend.nextInt(1,100)  NUMERO DEL 1 AL 99
		  * 
		  * 
		  * 
		  * ---------------
		  * CONDICIONALES
		  * ---------------
		  * 
		  * if (condicion){
		  * instrucciones si la condicion se cumple
		  * }else if (Condicion){
		  * instruciones si la primera condicion no se cumple pero esta si 
		  * }else{
		  * si ninguna condición se cumple
		  * }
		  * 
		  * switch (dia) {
		  * 	case 1:{ 
		  * 		System.out.println("LUNES");
		  * 		break;}
		  * 	case 2:{ 
		  * 		System.out.println("MARTES");
		  * 		break;}
		  * 	default:{ 
		  * 		System.out.println("UwU");
		  * 		break;}
		  * };
		  * 
		  * ****Sin el break se cumple todo abajo del caso que se cumpla 
		  * ***** si se una -> en vez de : no hay que poner break 
		  * ***** se usa yield para asignar el valor a una variable 
		  * 
		  * 
		  * ---------
		  * BUCLES
		  * ---------
		  * 
		  * while (condicion){
		  * 	Instrucciones que se repiten hasta que la condición se cumpla
		  * }
		  * 
		  * do{
		  * 	Intrucciones que se repiten hasta que la condición se cumpla,
		  * 	estas acciones siempre se ejecutan mínimo una vez, 
		  * 	porque la condición se encuentra luego de ellas. 
		  * }while(condicion);
		  * 
		  * 
		  * for (variable, mientras condicion no se cumpla, a paso de..){
		  * 	Intrucciones 
		  * 	****desp de las intrucciones se hace el incremento o decremento del a paso de..
		  * }
		  * 
		  * 
		  * 
		  * --------------
		  * EXCEPCIONES
		  * --------------
		  * 
		  * try-catch
		  * try {
		  * 	Bloque de intrucciones 
		  * }catch(ArithmeticException e){
		  * 	Mensaje o intruccion que cumple si hay una excepcion aritmetica 
		  * }finally{
		  * 	Se EJECUTA SIEMPRE
		  * }
		  * *****Con esta estructura estamos sometiendo a observación al bloque de código encerrado entre las llaves del try. 
		  * Si salta una excepción en ese bloque de código será capturada por el bloque catch. 
		  * 
		  * ******Una vez salta la excepción, se interrumpe la ejecución del código que está entre las llaves del try, 
		  * pasando a ejecutar la primera línea que se encuentra en el bloque catch. 
		  * 
		  * ****El parámetro e se puede usar como una variable local dentro del bloque. Hace referencia al objeto de la excepción 
		  * y contiene toda la información sobre el error que la ha producido.
		  * 
		  * 
		  * -------------
		  * ASERCIONES
		  * -------------
		  * 
		  * assert condición : mensaje (opcional)
		  * Si la condición no se cumple muestra el mensaje como si fuera un error 
		  * 
		  * 
		  * -------------------
		  * EJERCICIO CON TODO
		  * -------------------
		  */
	        // Objeto Random como en los apuntes
	        Random rand = new Random();

	        // Pedimos una cadena de texto
	        System.out.print("Escribe un número del 1 al 5 en texto (uno, dos, tres, cuatro, cinco): ");
	        String entrada = sc.nextLine().toLowerCase();

	        // Variable donde guardaremos el número convertido
	        int numero = 0;

	        // Convertimos texto a número usando switch con flechas
	        switch (entrada) {
	            case "uno"     -> numero = 1;
	            case "dos"     -> numero = 2;
	            case "tres"    -> numero = 3;
	            case "cuatro"  -> numero = 4;
	            case "cinco"   -> numero = 5;

	            // Default si no coincide con nada
	            default -> {
	                System.out.println("Valor no válido.");
	                System.exit(0);
	            }
	        }

	        // Mostramos el número convertido
	        System.out.println("Número introducido: " + numero);

	        // Ejemplo simple de if
	        if (numero > 3) {
	            System.out.println("El número es mayor que 3.");
	        } else {
	            System.out.println("El número es menor o igual a 3.");
	        }

	        // Número aleatorio usando Math.random
	        int aleatorioMath = (int)(Math.random() * 5 + 1);
	        System.out.println("Aleatorio (Math.random) entre 1 y 5: " + aleatorioMath);

	        // Número aleatorio usando Random
	        int aleatorioRand = rand.nextInt(1, 6);
	        System.out.println("Aleatorio (Random) entre 1 y 5: " + aleatorioRand);

	        // Dibujar un cuadrado hueco usando for
	        System.out.println("\nDibujando un cuadrado HUECO de lado " + numero + ":\n");

	        for(int i=1; i<=numero; i++ ) {
				//Pinta un asterisco en la primera y última línea
				if(i==1 || i==numero) {
					for(int j=1; j<=numero; j++) {
					System.out.print("*");	
					}
				}else {
					//pinta un asterisco al inicio
					System.out.print("*");
					//pinta x numero de espacios
					for(int k=0; k<numero-2;k++) {
						System.out.print(" ");
					}
					//pinta un asteristco al final 
					System.out.print("*");
				}
				System.out.println();
			}
		
	        // Bucle while: cuenta atrás
	        System.out.println("\nCuenta atrás con while:");
	        int contador = numero;
	        while (contador > 0) {
	            System.out.println(contador);
	            contador--;
	        }

	        // Ejemplo de try-catch
	        try {
	            int division = 20 / numero;
	            System.out.println("\n20 dividido entre " + numero + " = " + division);
	        } catch (ArithmeticException e) {
	            System.out.println("Error: división entre cero.");
	        } finally {
	            System.out.println("El bloque finally siempre se ejecuta.");
	        }

	        // Aserción como en los apuntes
	        assert numero > 0 : "El número debe ser mayor que 0";

	        sc.close();

	}

}
