import java.util.Scanner;
public class ImprimeCajaTexto {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
	  int ancho = sc.nextInt();	
	  int altura = sc.nextInt();
		
		//techo
		for (int i = 0; i < ancho; i ++) {
			System.out.print(" * ");
		}
		System.out.println();
		
		//columnas
		for ( int i = 0; i <= altura; i++) {
			 System.out.print(" * ");
			 
			for ( int j = 0; j <= ancho; j++) {
		        System.out.print(" ");
			}
			System.out.println(" * ");
		}
		
	    //suelo
		for (int i = 0; i < ancho; i ++) {
			System.out.print(" * ");
		}
	
	// public static void convierteEnCodigoBarras(int n) {
	// 	Scanner sc = new Scanner(System.in);
	// 	n = sc.nextInt();
	// 	String barra = Integer.toString(n);
	}				
}


