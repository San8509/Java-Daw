import java.util.Scanner;

public class NumerosPares {

	   static int pares( int numero ) {
		Scanner sc = new Scanner(System.in);
		  int digito = 0; int contador; int pares = 0; int resultado=0;
		  
		System.out.print("Introduce un numero: ");
		  numero = sc.nextInt();
		
		  while ( numero  > 0 ) {
	            digito = numero % 10;    // extrae el último dígito
	            numero = numero / 10;    // elimina el último dígito
	            //contador++;     // incrementa el contador de dígitos para saber la longitud del numero
	            
	            if (digito % 2 == 0) {    // si el dígito es par
	            	resultado += digito;    // añade el dígito par al resultado
	            	pares++;      // incrementa el contador de pares 
	            }
		  }
		 System.out.println("Pares encontrados: "+ pares);
		 System.out.println("total pares: "+ resultado);
		return pares;
}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			int contador=pares(0); 
		
		     for(int i=0; i < contador; i++) {
				}
	  }
}
