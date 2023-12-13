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
	
	public static String invertirPalabra(String word) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce tu cadena");
	     word = sc.nextLine();
		String safe="";
		
		for(int i = word.length() -1; i >= 0; i--) {
			safe += word.charAt(i);
		}
		System.out.print(safe);
		return safe;
		
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
	
	public static void split() {
		//Strings
				// Ejemplo de split() elimina los caracteres como espacio o coma de una cadena y 
		        // crea un arrgeglo nuevo con la cadena anterior.
		        String nombrePersonaje = "Rafael,,,,,  Nadal, ,,,, Parera";
		        String[] partesDelNombre = nombrePersonaje.split(","); //caracter a eliminar
				
		        for( int i=0; i < partesDelNombre.length; i++ ) {
		        	System.out.print(partesDelNombre[i]);
		        }
		        
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// cadena
		String cadena = "Santiago Velazquez";
		String resultado ="";
		
		// cadena con los valores de reves
		String temporal = "";	
		for( int i= cadena.length()-1; i >=0; i--) {
			temporal += cadena.charAt(i) ;
	  }	
			 
        // divido la cadena original para los condicionales
		String[] point = cadena.split(" ");
		String name = point[0];
		String lastName = point[1];	   
		
	    // divido la cadena de reves para ajustar valores con los condicionales
		String[] concat = temporal.split(" ");
		String one = concat[0];
		one = one.substring(1).toLowerCase();
		String two = concat[1];	
		two = two.substring(0).toLowerCase();
		
		
		// condicionales is UpperCase or LowerCase
		if ( Character.isUpperCase(name.charAt(0))) {
			one = Character.toUpperCase(one.charAt(0)) + one.substring(1,one.length());
		} else {
			one.toLowerCase();
		}
		if ( Character.isUpperCase(lastName.charAt(0))) {
			two = Character.toUpperCase(two.charAt(0)) + two.substring(1,two.length());
		} else {
			one.toLowerCase();
		}
		
		System.out.println(cadena);
		resultado = String.join(" ", one, two); //metodo para concatenar 
		
		// lo muestro por pantalla 
		System.out.println(resultado);
		
	}
}
