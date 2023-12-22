

import java.util.Scanner;

public class CadenaReves {
		/*
		 * Ramiro Santiago Velazuqez
		 * Ejercicio 2
		 */
		
		 public static String Cadena(String cadena){
	       Scanner sc = new Scanner(System.in);
				   
	 
			String temporal = "";
	        String[] point={};
			String one="";
			
			// cadena con los valores de reves	
			for( int i= cadena.length()-1; i >=0; i--) {
				temporal += cadena.charAt(i) ;
				point = temporal.split(" ");
		    }	
	        // cadena con los valores divididos
		    for(int j=0; j<point.length; j++) {
			     one = point[j];
			     
			     if(Character.isLowerCase(one.charAt(j))) {
			     one = one.toLowerCase();
			     }
			     
				 if ( Character.isLowerCase(one.charAt(0))) {
				one = Character.toUpperCase(one.charAt(0)) + one.substring(1,one.length()); 
			}
			System.out.print(one+ " ");
		  }
			return one;
		}

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			 System.out.print("introduce tu cadena: ");
			 String cadena = sc.nextLine();
			
			Cadena(cadena);
			
			
	  
	}
}
