import java.util.Scanner;
public class EscaleraInvertida {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int altura = sc.nextInt();
	      
	      for (int fila = 0; fila < altura; fila++) { 
	  		  for (int columna = 0; columna < altura - fila; columna++) { // altura q me dice la cantidad de los asteriscos
	  			  System.out.print(" * ");// imprime los asteriscos en escalera
	  		}
	  		
	  		      System.out.println(" ");// da el salto de linea
	  	 }
         
	      // otra manera de hacerlo
	      for (int fila = altura; fila > 0; fila--) { 
	  		  for (int columna = 0; columna < fila; columna++) { // altura q me dice la cantidad de los asteriscos
	  			  System.out.print(" * ");// imprime los asteriscos en escalera
	  		}
	  		
	  		      System.out.println(" ");// da el salto de linea
	  	 } 
	
	}

}
