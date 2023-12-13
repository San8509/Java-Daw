import java.util.Scanner;
public class BarraTransversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
	
	int altura = sc.nextInt();
	
	for (int fila = 0; fila < altura; fila++) { // controlamos la altura
		for (int columna = 0; columna < fila; columna++) {
			System.out.print(" ");//imprime espacios en blanco
		}
		
		System.out.println("*");// imprime el asterisco y da el salto de linea
	}
	
	
  }

}
