
import java.util.Random;
import java.util.Scanner;

public class Pasword {

static boolean caracterEspecial(String caracteres){
      
        String specialCaracters = "!/#&%()*" ;
        char c= ' ';
        boolean encontrado = false;
        
        for(int i=0; i< caracteres.length(); i++) {
        	 c = caracteres.charAt(i);//recorre la contraseña
        	
        if(specialCaracters.indexOf(c) >=0) {// comprueba si hay algun caracter igual en los arreglos
        	   encontrado = true;
        		break;
        	} 
        }    
        System.out.println(encontrado);
 

    return encontrado;
}


static boolean caracterMayuscula( String may){
    
        String specialCaracters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" ;
        char c= ' ';
        boolean encontrado = false;
        
        for(int i=0; i<may.length(); i++) {
        	 c = may.charAt(i);//recorre la contraseña
        	
        if(specialCaracters.indexOf(c) >= 0) {// comprueba si hay algun caracter igual en los arreglos
        	   encontrado = true;
               break;
        	}
        }
        System.out.println(encontrado);
    return encontrado;
}

static boolean caracterMinuscula( String min){

        String specialCaracters = "abcdefghijklmnopqrstuvwxyz" ;
        char c= ' ';
        boolean encontrado = false;
        
        for(int i=0; i<min.length(); i++) {
        	 c = min.charAt(i);//recorre la contraseña
        	
        if(specialCaracters.indexOf(c) >=0) {// comprueba si hay algun caracter igual en los arreglos
        	   encontrado = true;
        		break;
        	}
        }
        System.out.println(encontrado);
    return encontrado;
}

static boolean caracterNumber(String number){
    
        String specialCaracters = "0123456789";
        char c= ' ';
        boolean encontrado = false;
        
        for(int i=0; i<number.length(); i++) {
        	 c = number.charAt(i);//recorre la contraseña
        	
        if(specialCaracters.indexOf(c) >=0) {// comprueba si hay algun caracter igual en los arreglos
        	   encontrado = true;
        		break;
            }
        }
        System.out.println(encontrado);
    return encontrado;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("introduce tu password");
        String contraseña = sc.nextLine();

        caracterMayuscula(contraseña);
        caracterEspecial(contraseña);
        caracterMinuscula(contraseña);
        caracterNumber(contraseña);

    }
}
