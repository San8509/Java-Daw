import java.util.Arrays;
import java.util.Scanner;

public class ExamenRepaso {
	
	public static boolean Vocales() {
	   Scanner sc = new Scanner(System.in);
	  
	   //declaro un boolean
	   boolean vocal= false;
	   int contador =0;
	   
	   // caracteres q deben estar en la entrada 
	   char[] caracter = {'a', 'e', 'i', 'o', 'u'};
	    char[] aChar ;
	   
	    System.out.println("introduce la cadena");
	     String entrada = sc.nextLine();
	    
	    // paso la cadena de entrada a char con el metodo toCharArray();
	      aChar = entrada.toCharArray();
	  
	   for (int i = 0; i < aChar.length; i++) {
		  
		   for( int j = 0; j < caracter.length; j++) {   
			   if ( Arrays.equals(aChar, caracter) ) {
				   contador++;
				   if (contador > 5) 
					   vocal = true;
			   } else {
				   vocal = false;
			   }
		   }
	   }   
	   System.out.println(vocal);
		return vocal;
	}
	
	public static void invertirPalabra(String word) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu cadena");
	     word = sc.nextLine();
		String safe="";
		
		for(int i = word.length() -1; i >= 0; i--) {
			safe += word.charAt(i);
		}
		System.out.print(safe);
		
	}
	
	public static boolean Cadena(String one, String two) {
		Scanner sc = new Scanner(System.in);
		 
		// chequea si los valores de una cadena se encuentra en otra
		System.out.println("Ingresa la primera Cadena");
		one= sc.nextLine(); 
		System.out.println("Ingresa la segunda Cadena");
		two=sc.nextLine();
		
		boolean si = one.contains(two);
		
		System.out.println("La cadena es: "+ si);
		return si;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Cadena("", "");
		//invertirPalabra("");
		//Vocales();
		
		//Strings
		// Ejemplo de split() eimina los caracteres como espacio o coma de una cadena y 
        // crea un arrgeglo nuevo con la cadena anterior.
        String nombrePersonaje = "Rafael,,,,,  Nadal, ,,,, Parera";
        String[] partesDelNombre = nombrePersonaje.split(","); //caracter a eliminar
		
        for( int i=0; i < partesDelNombre.length; i++ ) {
        	System.out.print(partesDelNombre[i]);
        }
        
        
		
		
		
	}	 

}