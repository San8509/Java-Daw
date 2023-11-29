import java.util.Scanner;
public class MetodoChart {

	public static void main(String[] args) {
		         Scanner sc = new Scanner(System.in);
               
     // Ayuda: utiliza la función charAt(0) para obtener el carácter introducido por el usuario (ej. sc.next().charAt(0));
	// me muestra el primer caracter de la palabra q introduzca  .charAt(0) dependiendo del valor dentro del partentesis mostrara la posicion
	// Verifique la igualdad de caracteres utilizando el método equals() en Java
         
         Character ch1 = 'J';
         Character ch2 = 'K';
         Character ch3 = 'J';
         System.out.println(ch1.equals(ch2));
         System.out.println(ch2.equals(ch3));
         System.out.println(ch1.equals(ch3));
         
		        
          /*Verifique la igualdad de caracteres usando el método compare() en Java
		         Esta es otra solución que se puede usar para verificar la igualdad de dos caracteres.
		         El método compare () pertenece a la clase String y devuelve 0 si ambos valores son iguales.*/
	
         Character ch4  = 'J';
         Character ch5 = 'K';
         Character ch6 = 'J';
         System.out.println(Character.compare(ch1, ch4) == 0);
         System.out.println(Character.compare(ch2, ch5) == 0);
         System.out.println(Character.compare(ch1, ch6) == 0);
	      
	    //REEMPLAZAR CARACTERES POR OTRO	
         String cadena = "Diego lava la loza.";
         System.out.println(cadena.replace("a", "o"));// este metodo reemplaza el primer caracter por el segundo
         
         String lluvia ="La lluvia en Sevilla es una Maravilla";
         //asi recorremos un string y pasamos los caracteres al codigo ASCII integer
         for ( int j = 0; j < lluvia.length(); j++) {
			 // hacemos el casting para convertir chart a integer
			 System.out.print( ( int ) lluvia.charAt (j) + ", ");
		 }
         
           // para convrertir cadenas a otro tipo de datos usamos la funcion parseInt();
                      String n = "y";
           int num = Integer.parseInt(n);
	}

}
