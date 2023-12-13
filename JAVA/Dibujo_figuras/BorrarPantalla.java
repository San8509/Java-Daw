import java.util.Scanner;
public class BorrarPantalla {

	public static void main(String[] args) {
		
		borrar();
		dibujarCuadrado3x3();
		dibujarRectangulo(0, 0 ); // con datos de entrada por teclado dejamos los valores q nos pedira en la funcion
		escribirRepetidor((char) 0, 0); // casteamos el caracter para q lo admita en el main
		newDibuRectangulo((char)0, 0);
	}
	
	 static void borrar() { // las funciones se define con el metodo STATIC
		int delete = 25;
		for ( int i = 1; i <= delete; i++) {
			for ( int j = 1; j <= delete; j++ ) {
				System.out.print(" ");
			}
			System.out.println(" ");
		}
	}
	 
	 static void dibujarCuadrado3x3 () {
		 int num = 3;
		 for ( int i = 1; i <= num; i++) {
				for ( int j = 1; j <= num; j++ ) {
					System.out.print(" * ");
				}
				System.out.println("");
			}
	 }
	 
	 static void dibujarRectangulo( int ancho, int largo) {
		 Scanner sc = new Scanner(System.in);
		 ancho = sc.nextInt();
		 largo = sc.nextInt();
		 
		 for (int i = 0; i <= largo; i++) {
			 for ( int j = 0; j <= ancho; j++) {
				 System.out.print(" * ");
			 }
			 System.out.println("");
		 }
		 
	 }
	 
	 static void escribirRepetidor( char letra, int repetir) {
		 Scanner sc = new Scanner(System.in);
		 letra = sc.next().charAt(0);
		 repetir = sc.nextInt();
		 
		 for ( int i = 0; i <= repetir; i++) {
			dibujarRectangulo(0, 0);	 
			 System.out.print(letra);
		 }
	 }
	 
	 static void newDibuRectangulo( char letra, int contador) {
		 Scanner sc = new Scanner(System.in);
		 letra = sc.next().charAt(0); 
		 contador = sc.nextInt();
		 
		 for ( int i = 0; i <= contador; i++) {
			 for (int j = 2; j <= contador;) {
				 System.out.print(letra + " ");
				 j += 1;
			 }
			 System.out.println("");
		 }
	 }
}
