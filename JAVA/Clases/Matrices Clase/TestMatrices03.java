package ud05EstructurasEstaticasDeDatos;

import java.util.Random;

public class TestMatrices03 {

	public static void rellenarMatriz(char[][] matriz, int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matriz[i][j] = '*';
			}
		}
	}
	
	public static void imprimirMatriz(char[][] matriz, int n) {
		
		// Recorrer matriz y mostrar
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int tam = 3;
		char[][] matriz = new char[tam][tam];

		rellenarMatriz(matriz, tam);
		
		imprimirMatriz(matriz, tam);
	}

}
