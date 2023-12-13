import java.util.Scanner;

import javax.swing.JOptionPane;

public class ComoLLenarArreglos {
 
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  int nElements;
	  // Cantidad o longitud de elementos del array
	  nElements = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de elementos: "));
	  char[]letras = new char[nElements];
		
	  System.out.println("digite los elementos: ");
	  // pedimos los elementos para llenar el array con un bucle
	  for(int i=0; i<nElements; i++) {
		  System.out.print((i + 1) +" digite un caracter: "); 
		  // guardamos cada entrada con el iterador (i)
		   letras[i]= sc.next().charAt(0);// la posicion 0 guarda el primer caracter q encuentre  
	  }
	  
	  // lo mostramos en pantalla
	  System.out.println("\nLos caracteres del arreglo son: ");
      for(int i=0; i<nElements ; i++) {
    	  System.out.print(letras[i] + ", ");
      }
  	  
	}

}
