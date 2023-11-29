import java.util.Scanner;
public class RectanguloDefinitivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ancho = sc.nextInt();
		int alto = sc.nextInt();
         
       for (int col = 0; col <= ancho; col++) {
    	   System.out.print(" * ");
       }
       System.out.println();
       
       // paredes
       for(int fila = 0; fila <= alto; fila++) {
    	   System.out.print(" * ");
    	   for (int col = 0; col <= ancho - 2 ; col++) {
    		   System.out.print("  ");
    	   }
    	   System.out.println(" * ");
       }
       
       
       for (int col = 0; col <= ancho; col++) {
    	   System.out.print(" * ");
       }
	}

}
