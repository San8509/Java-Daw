import java.util.Scanner;

public class MediaArreglos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float[]numeros = new float[5];
		float sumaPositivos =0, sumaNegativos =0, mediaPositivos =0, mediaNegativos =0;
        int conteoPositivos =0, conteoNegativos =0, conteoCeros =0;
        
        System.out.println("==== guardando los valores ====");
        for(int i=0; i<numeros.length; i++) {
        	
        	System.out.println("digite un numero: ");
        	numeros[i] = sc.nextFloat();
        	
           if(numeros[i] == 0){
        	   conteoCeros++;
           } else if (numeros[i] > 0){
        	   sumaPositivos += numeros[i];
        	   conteoPositivos++;
           } else {
        	   sumaNegativos += numeros[i];
        	   conteoNegativos++;
           }	
        }
        
        // Media de los numeros positivos
        if(conteoPositivos ==0){
        	System.out.println("Error");
        } else {
        	mediaPositivos = sumaPositivos / conteoPositivos;
        	System.out.println("La media positivos es: "+ mediaPositivos);
        }
        
        // Media de los numeros negativos
        if(conteoNegativos == 0) {
        	System.out.println("Error negativos");
        } else {
        	mediaNegativos = sumaNegativos / conteoNegativos;
        	System.out.println("La media negativos es: "+ mediaNegativos);
        }
        
        System.out.println("La cantidad de ceros es: "+ conteoCeros);
        
        
	}

}
