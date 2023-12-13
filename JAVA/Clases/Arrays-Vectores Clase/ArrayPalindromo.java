import java.util.Arrays;
import java.util.Scanner;

public class ArrayPalindromo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        // Array palindromo con enteros
        int[] numbers = {1, 2, 3, 4, 5, 4, 3, 2, 1};

        // creamos un boolean para comprobar si es verdadero o falso
        boolean palindromo = true; 
 
        // creamos dos variables para recorrer el arreglo de incremento a  decremento
        int increment = 0;
        int decrement = numbers.length - 1; // para decremento comenzamos desde la ultima posicion

        while( palindromo && increment < decrement){
           if(numbers[increment] != numbers[decrement]){
              palindromo = false;
           } else {
            increment++;
            decrement--;
           }
        }
        //System.out.println("Valores del arreglo");
        System.out.println(palindromo?"El arreglo es palindromo":"no es palindromo");


        // DE ARRAY STRING PALINDROMO A CHAR
    
        // System.out.println("introduce la cadena");
        // String in = sc.nextLine();

        String[] words = {"r","e","i","n","i","e","r"};

        boolean igual = true;
        char[] upper={};
        char[] lower={};

        String keep="";
        String back="";

            // recorro desde el inicio hasta la mitad
            for ( int i = 0; i < words.length; i++ ){
               keep += words[i];
                upper = keep.toCharArray(); 
             }
             // compruebo si es igual de principio a fin  
            //System.out.println(upper); 

            // recorro desde el final hasta el inicio
            for (int j = words.length - 1; j >= 0 ; j--){ 
                 back += words[j];
                  lower = back.toCharArray();    
            }
            // compruebo si es igual de fin a principio
            //System.out.print(lower);    
                  
            // compruebo si los arreglos son iguales o no: palindromo
              if(Arrays.equals(upper, lower)){
                  igual = true; 
                } else {
                  igual = false;  
                }
    
        // lo muestro por pantalla 
        System.out.println(igual?" El arreglo es palindromo":" no es palindromo");
    }
}