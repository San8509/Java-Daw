import java.util.Random;
import java.util.Scanner;

public class Matrices {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Matriz;
		* bidimensionales
        */
	 
		
		// para saber el numero de filas
		//int nFilas = matriz.length;
		// numero de columnas
		//int nColumn = matriz[0].length;
		
		 
		int n = sc.nextInt();
		int [][] matriz = new int[n][n];
		/*
		// para crear matrices con entrada
		
		int filas = sc.nextInt();
		int column = sc.nextInt();
		int [][] matris = new int[filas][column];
		*/
		
		Random r = new Random();
		for(int i=0; i < n; i++) {
			for(int j=0; j < n; j++) {
				matriz[i][j]= i+j;//el numero aleatorio sera de 0 a 4 incluido
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(matriz[i][j] + " ");
			}
		}
		
		
		/*System.out.println("nFilas: "+ matriz.length);//para saber filas de la matriz
		*System.out.println("nColumn: "+ matriz[0].length);//para saber el numero de columnas hay q poner los corchetes y el indice cero
		*/
		
	}
}
