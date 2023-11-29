package ud05EstructurasEstaticasDeDatos;

public class TestString01 {
    public static void main(String[] args) {
        // Ejemplo de trim()
    	String frutas = "manzana,pera,kiwi";
        String textoConEspacios = "   Hola, soy una cadena con espacios   ";
        String textoSinEspacios = textoConEspacios.trim();

        System.out.println("Resultado de trim():");
        System.out.println("Texto con espacios: " + textoConEspacios);
        System.out.println("Texto sin espacios: " + textoSinEspacios);

        // Ejemplo de indexOf()
        String otraFrase = "Hola, ¿cómo estás?";
        int posicion = otraFrase.indexOf("cómo");

        System.out.println("\nResultado de indexOf():");
        System.out.println("La subcadena 'cómo' comienza en la posición: " + posicion);
        
        // Otro ejemplo de uso indexOf()
        String carateresEspeciales = "!?$&%_-";

        char caracterABuscar = '$';
        boolean encontrado = false;
        System.out.println("\nResultado de indexOf():");
        System.out.println("Buscar caracter '" + caracterABuscar + "'" + " en cadena \"" + carateresEspeciales + "\"");
        for(int i = 0; i < otraFrase.length(); i++) {
        	if(carateresEspeciales.indexOf(caracterABuscar) >= 0) {
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

       
        // Ejemplo de split()
        
        String nombrePersonaje = "Rafael Nadal Parera";
        String[] partesDelNombre = nombrePersonaje.split(" ");
       
        String nombre = partesDelNombre[0];
        String apellido1 = partesDelNombre[1];
        String apellido2 = partesDelNombre[2];

        System.out.println("\nResultado de split():");

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido1: " + apellido1);
        System.out.println("Apellido2: " + apellido2);

        // Ejemplo de replaceAll()
        String nombrePersonaje2 = "   Rafael,  Nadal,Parera   ";  
        String nombrePersonaje3 = nombrePersonaje2.replaceAll(" ", "");
        System.out.println(nombrePersonaje2);
        System.out.println(nombrePersonaje3);
        
        String[] partesDelNombre2 = nombrePersonaje3.split(",");
        
        nombre = partesDelNombre2[0];
        apellido1 = partesDelNombre2[1];
        apellido2 = partesDelNombre2[2];
        
        System.out.println("\nResultado de replaceAll():");

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
