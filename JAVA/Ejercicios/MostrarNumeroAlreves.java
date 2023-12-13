import java.util.Scanner;
public class MostrarNumeroAlreves {

	public static void main(String[] args) {
	      Scanner sc = new Scanner(System.in);	
         // mostrar el numero al reves y decir si es capicua
	      int num = sc.nextInt();
	      
	      int unidad = num % 10;
	      num = num / 10;
	      
	      int decenas = num % 10;
	      num = num / 10;
	      
	      int centenas = num % 10;
	      num = num / 10;
	      
	      int millar = num % 10;
	      num = num / 10;
	      
	      System.out.println(unidad );
	      System.out.println(num);
	      
	      
	      if( unidad == millar && decenas == centenas) {
	    	  System.out.println("es capicua");
	       } else {
	    	  System.out.println("no es capicua");
	      }
	      
	      
	}
}
