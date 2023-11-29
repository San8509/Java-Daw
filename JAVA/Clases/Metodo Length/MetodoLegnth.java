import java.util.Scanner;
public class MetodoLegnth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// METODO SUBSTRING Y LENGTH
		
		String cadena = "";
		String susbtraido = "";
        int numCaracteres = 0;
        int desde = 0;
        int hasta = 0;
        
        System.out.print("introduce una cadena de caracteres: ");
        cadena = sc.nextLine();
        
        numCaracteres = cadena.length(); // cuenta los caracteres de la cadena de texto
	    System.out.println("La cadena de caracteres " + cadena + " posee " + numCaracteres + " caracteres");
	
	    System.out.print("Desde que caracter desea obtener la nueva cadena?");
	    desde = sc.nextInt();
	    
	    System.out.print("Hasta que caracter desea obtener la nueva cadena");
	    hasta = sc.nextInt();
	    
	    susbtraido = cadena.substring(desde, hasta);//guardamos con el metodo (substring) desde donde hemos cortado o sustraido
	    System.out.println("La nueva cadena es: " + susbtraido);
	    
	}

}
