import java.util.Scanner;

public class RectanguloMatriz {

	public static void rellenarMatriz(String[][] matriz) {
      Scanner sc = new Scanner(System.in);	
		System.out.println("dame el caracter para rellenar la matriz");
		String caracter= sc.next();
		for(int i=0; i< matriz.length; i++) {
			for(int j=0; j<matriz[0].length; j++) {
				matriz[i][j]= caracter; // O = '*';
				System.out.print(caracter+" ");
			}
			System.out.println();
		}
		
	}
	

	public static void rellenarMatriz(char[][]matriz) {
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String [][]matriz = new String[n][n];
		
		rellenarMatriz(matriz);
	}

}
