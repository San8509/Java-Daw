package Wrapper Clase;

import java.util.Scanner;
public class WrapperClaseEnvoltorio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
    // clase envoltorio o wrapper
    //Constantes
    int max = Integer.MAX_VALUE;
    int min = Integer.MIN_VALUE;
    
    //Métodos
    //Pasar de INT a String
    int a1 = 45678;
    String a2 = Integer.toString( a1 );
    
    //Pasar de String a INT
    String b1 = "45678";
    int b2 = Integer.parseInt( b1 );
    
    
    //Ejemplo:
    String cadena = sc.next(); // Lee la siguiente cadena: “13-14”
    String[] separada = cadena.split("-");

    int a = Integer.parseInt( separada[0] ); // Pasar el 13 de texto a número
    int b = Integer.parseInt( separada[1] ); // Pasar el 14 de texto a número
    

  }
}