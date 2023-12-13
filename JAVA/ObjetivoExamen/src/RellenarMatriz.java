import java.util.Scanner;

public class RellenarMatriz {

public static int[][] rellenaCuadros(int zize) {
		
		int [][] matriz = new int[zize][zize];
		
		return matriz;
	}
	
	public static void imprimirMatriz(int[][] matriz) {
		
		for(int i =0; i < matriz.length; i++) {
			for(int j=0; j< matriz[i].length; j++) {
				System.out.print(matriz[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
  	public static int[][] rellenarCuadros(int zize, int a, int b, int c, int d){
		
		int[][]matriz = new int[zize][zize];
		
		//relleno cuadro superior izquierdo
		for(int i =0; i < matriz.length /2; i++) { // me imprime la mitad de la longuitud en filas y columnas
			for(int j=0; j< matriz[i].length /2; j++) {
				matriz[i][j] = a;
			}
			System.out.println();
		}
		
		
		//relleno cuadro superior derecho
		for(int i =0; i < matriz.length /2; i++) { // me imprime la segunda mitad de la longuitud en filas y columnas
			for(int j= matriz[i].length /2; j< matriz[i].length; j++) {
				matriz[i][j] = b;
			}
			System.out.println();
		}
		
		
		// lleno cuadro inferior izquierdo
		for(int i = matriz.length /2; i < matriz.length;  i++) { // me imprime la segunda mitad de la longuitud en filas y columnas
			for(int j= 0; j< matriz[i].length /2; j++) {
				matriz[i][j] = c;
			}
			System.out.println();
		}

		
		//relleno cuadro inferior derecho
		for(int i = matriz.length /2; i < matriz.length; i++) { // me imprime la segunda mitad de la longuitud en filas y columnas
			for(int j= matriz[i].length /2; j< matriz[i].length; j++) {
				matriz[i][j] = d;
			}
			System.out.println();
		}
		
		return matriz;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         
    // matriz 4x4
	int [][]matriz = rellenarCuadros(4, 7, 5, 3, 1);	
	imprimirMatriz(matriz);
		
	}	 


}
