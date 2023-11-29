import java.util.Scanner;
public class Figuras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     
     int altura = sc.nextInt();
     int ancho = sc.nextInt();
      
     for( int i = 0; i < altura; i++) {
    	 for(int j = 0; j < ancho; i++) {
    		 
    	 System.out.print(" * ");
         }
    	 
         System.out.println();
        }
     }

}
