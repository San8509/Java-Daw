import java.util.Scanner;

public class ExamenSantiago {

	/*
	 * Ramiro Santiago Velazuqez
	 * Ejercicio 2
	 */
	
	public static void Reverso(String cadena) {
		Scanner sc = new Scanner(System.in);
		
		// introducimos la cadena
		System.out.println("Introduce tu cadena");
	    cadena = sc.nextLine();
		String nuevaCadena = "";
		
		
		 for(int i = 0; i<cadena.length(); i++) {
			char c = cadena.charAt(i);
			//nuevaCadena = c.charAt(c) + nuevaCadena;
			 
			 if(Character.isUpperCase(c)){
				nuevaCadena += Character.toLowerCase(c); 
			 } else if (Character.isLowerCase(c)) {
                nuevaCadena += Character.toLowerCase(c);
			 }	else {
				nuevaCadena += c;
			 }
	   }
	   System.out.print(nuevaCadena);
	}
		
		
	
	
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);

	  Reverso("");
  }	  
}
