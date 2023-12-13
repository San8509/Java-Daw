import java.util.Scanner;
public class SumaUno {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("introduce el numero");
		int num = sc.nextInt();
		int suma = 0;
       for (int i = 1; i <= num; i++ ) {
    	   suma += i;
       }
       
       System.out.println(suma);
	
	====================================================	
	 
	int num = 0;
	int suma = 0;
	
	while ( num != -1) {
		System.out.println("introduce un numero");
		num = sc.nextInt();
		suma += num;
	}

		System.out.println("el total es:  "+ (suma + 1));*/
		
		//QUITAR ESPACIOS EN UNA CADENA DE TEXTO
		
		System.out.println("introduce la cadena");
		String texto = sc.nextLine();
		String sinEspacios = "";
		char caracterActual;
		
		//recorro el array
        for(int i=0;i<texto.length();i++){
             
            caracterActual=texto.charAt(i);
             
            //Cuando es un espacio no lo copia a la cadena
            if(caracterActual!=' '){
                sinEspacios+=String.valueOf(caracterActual);
            }
             
        }
		System.out.println("el texto sin espacios es: "+ sinEspacios);
		
		
		
	
	}

}
