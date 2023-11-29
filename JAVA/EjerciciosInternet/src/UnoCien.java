import java.util.Scanner;
public class UnoCien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	 /*
        for ( int i = 0; i <= 100; i++) {
        	
              if ( i % 2 == 0 ||  i % 3 == 0 ) {
            	  System.out.print(i + ", ");
        	}
        }
      
        System.out.println();
        
        int num = 0;
        while ( num<= 100) {
        	System.out.print(num+ ",");
        	num++;
        }
        
        
       
        
        System.out.println("introduce la cantidad de ventas");
        int entrada = sc.nextInt();
        int ventas = 0;
        int total = 0;
        
        for ( int i = 0; i <= entrada; i++) {
        	System.out.println("introduce el saldo de la venta - " + (i + 1));
               ventas = sc.nextInt();
               total = total + ventas;
         
        }
        
      System.out.println("el dinero total ganado es de: " + total);
		
	
	int num = 0;	
		
		do {
			
				System.out.println("introduce un num mayor  q cero");
				 num = sc.nextInt();
			
		} while(num <= 0);
     
		System.out.println(num + " es mayor o igual");
		 
		 System.out.println("wellcome! you have three rounds");
		 String pass = "A";
		 String match;
		 
		
		 for ( int i = 1; i <= 3; i++) {
			 System.out.println("introduce the pasword - " + (i + 0) + " time");
			 match = sc.nextLine();
			  
			  if (match.equals(pass) ) { // para string recuerda usar el metodo equals 
				  System.out.println("Enhorabuena your'e in");
				  break;
			  } 
		 }
		 
		 System.out.println("Fin del programa");
		 System.out.println("introduce un dia de la semana");
		 String diaz = sc.nextLine();
		 
		 switch (diaz) {
              case "lunes":
              case "martes":
              case "miercoles": 
              case "jueves":
              case "viernes":
             	 System.out.println("Dia laborable");
             	 break;
             case "sabado":
             case "domingo":
            	 System.out.println("Dia no laborable");
            	 break;
            	 default: System.out.println("introduce un dia valido");
		 }
		 
		 
		 //GENERAR UN NUMERO ALEATORIO
		 System.out.println("introduce el primer numero");
		 int num1 = sc.nextInt();
		 
		 System.out.println("introduce el segundo numero");
		 int num2 = sc.nextInt();
        
		 for ( int i = 0; i < 10; i++) {
			 
			 int numAleatorio = (int)Math.floor(Math.random() * (num1 - num2) + num2); // asi se genera un numero aleatorio
			 System.out.println("numnero aleatorio; " + numAleatorio);
		 }
		 
		 
		 CIFRAS DE UN NUMERO
		 System.out.println("introduce un numero");
		 int num = sc.nextInt();
		 int parts = 0;
		 int rest = 0;
		 
		 while ( num > 0) {
				 rest = num % 10; // me recoge el resto digito a digito
				 num = num / 10;	 // divide y trunca y cuenta la cantiadad de digitos del numero
				 parts++;
				 //System.out.print( rest + ", ");  me muestra el numero ingresado al reves
				 
		 }
		 System.out.println("el numero introducido tiene: " + parts + " cifras");
		
		 OTRA MANERA
		 int num2 = sc.nextInt();
		 int contador = 0;
		 
		 for ( int i = num2; i > 0; i /= 10) {
			 contador++;
		 }
		 System.out.println(contador);
		 
		 
		 
		 NUMERO PRIMO
		 System.out.println("introduce el numero");
		 int num = sc.nextInt();
		 int contador = 0;
		 
		 
		 int raiz = (num / 2); // casteamos el numero para saber la raiz
		 System.out.println("the number is divisible only for: " + raiz);
		 
		 while ( num > 1 ) {
			 if (  num % raiz  == 0) {
				 contador++;// si acumula directamente el numero no es primo
			}
			     System.out.println("rest of the divide is: " + contador);
			     
			     if ( contador < 1) {
			    	 System.out.println("the number " + num + " is prime: ");
			    	 break;
			     } else {
			    	 System.out.println("is not prime");
			    	 break;
			     }
			 
		 }
		 /*
	     PRIMO DEL UNO AL CIEN
		 for (int i=1;i<=100;i++){
	            //Hacemos un casting para que nos devuelva un numero entero
	            int raiz=(int)Math.sqrt(i);
	            int contador=0;
	  
	            //Hacemos otro bucle para contar los divisibles
	            for (int j=raiz;j>1;j--){
	                if (i%j==0){
	                    contador++;
	                }
	            }
	  
	            Segun el numero de divisibles, sabemos si es primo o no
	            Si es primo el contador sera 0
	             
	  
	            if (contador<1){
	                System.out.println(i);
	            }
	  
	        }*/
		 
		 /*CONTADOR DE CARACTERES
		 String lluvia = "La lluvia en Sevilla es una Maravilla";
		 
		 int numCaracteres = lluvia.length();
		 System.out.println(numCaracteres);
		 
		  int contador = 0;
	         
	         for ( int i = 0; i < lluvia.length(); i++) {
	        	  if ( lluvia.charAt( i ) == 'a') { // comillas simples para caracteres
	        		  contador++;
	        	  }
	         }
		 System.out.println("hay " + contador + " vocales a en la cadena de texto");*/
		 
		 
 String lluvia = "La lluvia en Sevilla es una Maravilla";
		 
		 int numCaracteres = lluvia.length();
		 System.out.println(numCaracteres);
		 
		  int contador = 0;
	         
	         for ( int i = 0; i < lluvia.length(); i++) {
	        	  if ( lluvia.charAt( i ) == 'a') { // comillas simples para caracteres
	        		  contador++;
	        	  }
	         }
		 System.out.println("hay " + contador + " vocales a en la cadena de texto");
		 
		 //reemplazar un caracter por otro
		 //System.out.println(lluvia.replace("a", "o"));
		 
		 for ( int j = 0; j < lluvia.length(); j++) {
			 // hacemos el casting para convertir chart a integer
			 System.out.print( ( int ) lluvia.charAt (j) + ", ");
		 }
		 
		 
		 
		 
	}

}
