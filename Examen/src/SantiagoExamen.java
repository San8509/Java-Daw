import java.lang.reflect.Array;
import java.util.Scanner;

public class SantiagoExamen {

	/*
	 * Ramiro Santiago Velazquez
	 * ejerc 1
	 * */
	public static void imprimirMatriz(int[][] matriz) {
		
		// Recorro la matriz y muestros los datos
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length;j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		// matriz de ejemplo 
		int[][] matriz = new int [][]{{1,1,1,1,1},{2,2,2,2,2},{1,1,1,1,1}};
		// nueva funcion  
		int [][]ma2 = {};
		
		// funcion imprimir matriz
		  imprimirMatriz(matriz);
		
		
			
			for(int i = 0; i < matriz.length; i++) {
				for(int j = 0; j < matriz[i].length;j++) {
					//ma2 = matriz[i][j];
				}
				System.out.println();
			}
			
		
		
		if(matriz == ma2) {
			System.out.println("no es simetrica");
		} else {
			System.out.println("Es simetrica");
		}
		
		
		
	
	}

}