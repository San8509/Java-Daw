import java.util.Scanner;
public class Escalera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
	  int altura = sc.nextInt();
      
      for (int fila = 0; fila < altura; fila++) { 
  		  for (int columna = 0; columna < fila + 1; columna++) { // altura q me dice la cantidad de los asteriscos
  			  System.out.print(" * ");// imprime los asteriscos en escalera
  		}
  		
  		      System.out.println(" ");// da el salto de linea
  	 }

      
  }
}
