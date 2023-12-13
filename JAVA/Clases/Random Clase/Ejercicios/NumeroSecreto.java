package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random n = new Random();
         
         int zize = n.nextInt(100);
         System.out.println(zize);

         int entrada =0;
         int contador =0;
         int finded = 0;
  
        while (zize > 0) {
            System.out.println("Digite la entrada: ");
            entrada = sc.nextInt();

            if(zize > entrada){
                System.out.println("mi numero es mayor ");
            } else if(zize < entrada){ 
                System.out.println("mi numero es menor");
            } else if(zize == entrada) {
                finded = entrada;
                System.out.println("Match!! el numero es: " + finded );
                break;
            }
        contador++;
    }
     System.out.println("EL numero de intentos fue: " + contador);


  }
}