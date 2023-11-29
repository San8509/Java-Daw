
public class TestString01 {
  public static void main(String[] args) {


    // para saber si una cadena esta contenida dentro de otra usamos el metodo contains();
    String uno = "Castor";
    String dos = "Ayer, en Castellón hubo tormenta";
    
    boolean result = uno.contains(dos);
    System.out.println(result);

    // para saber si una cadena es igua a otra
    String a = "Hola";
    String b = "Hola";
    String c = a.equals(b);
    System.out.println(c); 

    // Ejemplo de trim()
        String textoConEspacios = "   Hola, soy una cadena con espacios   ";
        String textoSinEspacios = textoConEspacios.trim();// elimina los espacios al      
        //principio y al final y crea otra cadena de texto, hay q guardarla en otro String

        System.out.println("Resultado de trim():");
        System.out.println("Texto con espacios: " + textoConEspacios);
        System.out.println("Texto sin espacios: " + textoSinEspacios);

        // Ejemplo de indexOf()
        String otraFrase = "Hola, ¿cómo estás?";
        int posicion = otraFrase.indexOf("cómo");// devuelve el la posicion del primer
        //caracter de la palabra q buscamos

        System.out.println("\nResultado de indexOf():");
        System.out.println("La subcadena 'cómo' comienza en la posición: " + posicion);
        
        // Otro ejemplo de uso indexOf()
        String carateresEspeciales = "!?$&%_-";

        char caracterABuscar = '$';
        boolean encontrado = false;
        System.out.println("\nResultado de indexOf():");
        System.out.println("Buscar caracter '" + caracterABuscar + "'" + " en cadena \"" + carateresEspeciales + "\"");

        for(int i = 0; i < otraFrase.length(); i++) {
        	if(carateresEspeciales.indexOf(caracterABuscar) != -1) {
        		encontrado = true;
        		break;
        	} 
        }
        
        if (encontrado) {
    		System.out.println("El caracter " +  caracterABuscar + " encontrado.");
        } else {
    		System.out.println("El caracter '" +  caracterABuscar + "' NO encontrado.");
        }
        
        // Ejemplo de charAt()
        String palabra = "Java";
        char tercerCaracter = palabra.charAt(2);

        System.out.println("\nResultado de charAt():");
        System.out.println("El tercer carácter de la palabra 'Java' es: " + tercerCaracter);

       
        // Ejemplo de split() eimina los caracteres como espacio o coma de una cadena y 
        // crea un arrgeglo nuevo con la cadena anterior.
        String nombrePersonaje = "Rafael Nadal Parera";
        String[] partesDelNombre = nombrePersonaje.split(" ");

        String nombre = partesDelNombre[0];
        String apellido1 = partesDelNombre[1];
        String apellido2 = partesDelNombre[2];

        System.out.println("\nResultado de split():");

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido1: " + apellido1);
        System.out.println("Apellido2: " + apellido2);

        // Ejemplo de substring()
        String otraFraseMas = "Java es divertido";
        String subcadena = otraFraseMas.substring(5, 10);
        
        System.out.println("\nResultado de substring():");
        System.out.println("La subcadena de la posición 5 a 10 es: " + subcadena);
    }
}
