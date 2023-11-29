package Ejercicios;

import java.util.Random;
import java.util.Scanner;

public class Pasword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random run = new Random();
       
        String specialCaracters = "!/#&%()*" ;
        String password = sc.nextLine();
        //String password = "!abcd";
        boolean encontrado = false;
        
        for(int i=0; i<password.length(); i++) {
        	 char c = password.charAt(i);//recorre la contraseña
        	
        if(specialCaracters.indexOf(c) >=0) {// comprueba si hay algun caracter igual en los arreglos
        	   encontrado = true;
        		break;
        	}
        }
        System.out.println(encontrado +" "+ specialCaracters);
 


    }
}
