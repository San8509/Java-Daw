package ud05EstructurasEstaticasDeDatos;

import java.util.Random;
import java.util.Scanner;

public class TestMatrices02 {

	public static void imprimirMatriz(int[][] matriz, int n) {
		
		// Recorrer matriz y mostrar
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame números de filas: ");
		int n = sc.nextInt();
		
		//System.out.println("Dame números de columnas: ");
		//int nColumnas = sc.nextInt();
		
		int[][] matriz = new int[n][n];
	
		// Obtener el número de filas y columnas que hay
		//int nFilas = matriz.length;
		//int nColumnas = matriz[0].length;
			
		Random r = new Random();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matriz[i][j] = r.nextInt(4); 
			}
		}
		
		imprimirMatriz(matriz, n);
		
		/*
		 *     0,0  0,1  0,2
		 *     1,0  1,1  1,2
		 *     2,0	2,1	 2,2
		 */
		
		// Recorrer diagonal mayor
		int totalSuma = 0;
		for(int i = 0; i < n; i++) {
			totalSuma += matriz[i][i];
		}
		
		System.out.println(totalSuma);
		
		// Recorrer diagonal menor
		totalSuma = 0;
		for(int i = 0; i < n; i++) {
			totalSuma += matriz[i][matriz[0].length-1-i];
		}
		
		System.out.println(totalSuma);
	}
}
