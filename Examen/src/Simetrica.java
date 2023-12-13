
public class Simetrica {
	/*
	 * Ramiro Santiago Velazquez
	 * ejerc 1
	 * */
	public static void imprimirMatriz(int[][] matriz) {
		// Recorro la matriz y muestros los datos
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length;j++){
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}	
	

    public static boolean esSimetrica( int[][]matriz ){
        //MATRIZ ASIMETRICA
		boolean esSimetrica = true;
        int nFilas = matriz.length;
        int nCol = matriz[0].length;
   
        //para acceder a la utlima fila de una matriz seria el numero de filas -1 - i
        // o sea; matriz [nFilas - 1 - i] [j];
        for(int i = 0; i < nFilas/2; i++) { // comparo hasta la mitad; nFilas/2;
				for(int j = 0; j < nCol;j++) {
					if(matriz[i][j] != matriz[nFilas -1-i][j]){
                     esSimetrica = false;
                     break;   
                }			
			  }

           }
		return esSimetrica;

	}

	 public static void main(String[] args) {
		
		// matriz de ejemplo 
		int[][] m1 = new int [][]{{1,1,1,1,1},{2,2,2,2,2},{1,1,1,1,1}};
		int[][] m2 = new int [][]{{1,1},{2,2},{2,2},{1,1}};
        int[][] m3 = new int [][]{{1,1,1,1,1},{2,2,2,2,2},{1,1,1,1,1}};
        int[][] m4 = new int [][]{{1,1},{2,2},{3,3},{2,2},{3,3}};

		// funcion imprimir matriz
		  imprimirMatriz(m4);
		
        // fincion es simetrica
          esSimetrica(m4);

		if(esSimetrica(m4)) {
			System.out.println("Es simetrica");
		} else {
			System.out.println("No es simetrica");
		}
	
	}

}
