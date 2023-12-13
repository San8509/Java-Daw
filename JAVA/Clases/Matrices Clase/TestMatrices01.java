package ud05EstructurasEstaticasDeDatos;
import java.util.Random;

public class TestMatrices01 {

	public static void main(String[] args) {

		int[][] alumnosNotasED = new int[2][3];
		
		// Relleno notas para el primer curso
		alumnosNotasED[0][0] = 5;
		alumnosNotasED[0][1] = 6;
		alumnosNotasED[0][2] = 9;
		
		// Relleno notas aleatorias entre 1-10 para el segundo curso
		Random r = new Random();
		for(int fila = 0; fila < alumnosNotasED.length; fila++) {
			for(int columna = 0; columna < alumnosNotasED[0].length; columna++)
				alumnosNotasED[fila][columna] = r.nextInt(10) + 1;
		}
		
		/*
		for(int fila = 0; fila < alumnosNotasED.length; fila++) {
			for(int columna = 0; columna < alumnosNotasED[fila].length; columna++)
				System.out.print(alumnosNotasED[fila][columna] + " ");
			System.out.println();
		}
		 */
			
		// Creo otra matriz con las notas rellanadas previamente
		int[][] alumnosNotasPRG = {
				{5,3,10}, 
				{8,7,9},
				{9,9,5}
		};
		
		// Recorro la matriz y muestros los datos
		for(int i = 0; i < alumnosNotasPRG.length; i++) {
			for(int j = 0; j < alumnosNotasPRG[i].length;j++) {
				System.out.print(alumnosNotasPRG[i][j] + " ");
			}
			System.out.println();
		}
		
		// Suma
		int totalSuma = 0;
		for(int fila = 0; fila < alumnosNotasPRG.length; fila++) {
			for(int columna = 0; columna < alumnosNotasPRG[fila].length; columna++) {
				totalSuma += alumnosNotasPRG[fila][columna];
			}
		}
		
		System.out.println(totalSuma);
		
		// Suma diagonal mayor
		totalSuma = 0;
		for(int fila = 0; fila < alumnosNotasPRG.length; fila++) {
			totalSuma += alumnosNotasPRG[fila][fila]; 
		}
		
		System.out.println(totalSuma);
		
		// Suma diagonal mayor
		totalSuma = 0;
		for(int columna = alumnosNotasPRG.length-1; columna >=0; columna--) {
			totalSuma += alumnosNotasPRG[alumnosNotasPRG.length-1-columna][columna]; // 1, 2
		}
		
		System.out.println(totalSuma);
	}
}
