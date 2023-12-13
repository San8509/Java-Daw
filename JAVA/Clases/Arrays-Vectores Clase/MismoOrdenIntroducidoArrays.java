
import java.util.Collections;
import java.util.Scanner;

public class MismoOrdenIntroducidoArrays {
    
	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in); 	
	 float[]numeros = new float[5];
     
	 //Guardamos los valores en el array
	 System.out.println("Guardando los datos del arreglo");
	 for(int i=0; i<numeros.length; i++) {
		 System.out.print((i+1) +"Digite un numero: ");
		 numeros[i]= sc.nextFloat();
	 }
	  
	 System.out.println("\nImprimimos los datos por orden de entrada");
	 for(float i: numeros) {
		 System.out.println(i);
	 }
	 
	 //ARRAYS INVERTIDO
	
	}

}
