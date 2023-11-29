import java.util.Scanner;
public class TrianguloInvertido {
    // TRIAGULO INVERTIDO CON ESPACIOS
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int altura = sc.nextInt();
		
			//PRIMER EJERCICIO
		  
		for ( int fila = 0; fila < altura; fila++) { // altura q me dice la cantidad de los asteriscos
			System.out.print("*");
		}
		    System.out.println();
		
		// pinto el patron q se repite    
		for (int fila = 0; fila < altura - 2; fila++) { // altura q me dice la cantidad de los asteriscos
			System.out.print("*");
	  		  for (int columna = 0; columna < altura - fila - 3; columna++) { // resta la altura de 3 en 3S
	  			  System.out.print(" ");// imprime los espacios en escalera
	  		}
	  		
	  		      System.out.println("*");// asterisco + el salto de linea 
	  	}
		
		// astetisco final
		System.out.println("*");
		
		
		/*TRIANGULO INVERTIDO A LA INVERSA*/
		
		int alt = sc.nextInt();
		
		for (int fila = 0; fila < alt; fila++) { 
	  		  for (int columnaE = 0; columnaE <  fila ; columnaE++) { // altura q me dice la cantidad de los asteriscos
	  			  System.out.print(" ");// imprime los asteriscos en escalera
	  		}
	          for (int columnaAsterisco = 0; columnaAsterisco < alt - fila; columnaAsterisco++ ) {
	        	  System.out.print("*");
	        }  		
	  		
	          System.out.println();  
	  	 }
       
		

	}

}