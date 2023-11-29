import java.lang.invoke.StringConcatFactory;
import java.util.Scanner;

public class ReviewString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // para saber si una cadena esta contenida dentro de otra usamos el metodo contains();
       String uno = "Castor";
       String dos = "Ayer, en Castellón hubo tormenta";
       boolean result;

       if(uno.contains(dos)){
          result = true;
       }else {
          result = false;
       }
       System.out.println(result);

    // para saber si una cadena es igua a otra con el metodo equals();
       String a = "Hola";
       String b = "Hola";
       boolean c;
       
       if(a.equals(b)){
        c = true;
       } else {
        c = false;
       }
       System.out.println(c); 

       // como comparar strings sin importar mayusculas o min con equalsIgnoreCase();
        String ab = "Hola";
       String bc = "Hola";
       boolean cd;
       
       if(ab.equalsIgnoreCase(bc)){
        cd = true;
       } else {
        cd = false;
       }
       System.out.println(cd); 


       // mayusculas minusculas numeros y letras
       String entrada = "Hola Mundo 123";
       
       String may; String min; String num; String letras;
       int nMay; int nMin; int n_Num; int nLetras; int nEspacios;

       for (int i = 0; i < entrada.length(); i++) {
         if(Character.isLetter(entrada.charAt(i))){ // letras
            letras += entrada.charAt(i);
            nLetras++;   
        }
         if(Character.isUpperCase(entrada.charAt(i))){ //mayusculas
            may += entrada.charAt(i);
            nMay++;
         }
         if(Character.isLowerCase(entrada.charAt(i))){ // minusculas
            min += entrada.charAt(i);
            nMin++;
         }
         if(Character.isDigit(entrada.charAt(i))){ // numeros
            num += entrada.charAt(i);
            n_num++;
         }
         if(Character.isSpaceChar(entrada.charAt(i))){ // espacios
            nEspacios++;
         }
       }
       System.out.println(cadena);
       System.out.println(may+" "+nMay);
       System.out.println(min+" "+nMin);
       System.out.println(letras+" "+nLetras);
       System.out.println(nEspacios);

    }
}
