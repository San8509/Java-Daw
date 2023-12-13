
public class DibujoMatriz {

	public static void main(String[] args) {
		
		
		String [][] casa = new String [10][10];
		int n=6; // tamaño del dibujo
		
		for(int f=0; f<=n; f++) {     // filas
			for(int c=0; c<=n; c++) {  // columnas
				if( f==n) { // depende de la condicion dibujara lo que querramos h==n-p
					casa[f][c]= "x ";
				} else {
					casa[f][c]="o ";
				}
			}	
		}
		
		for(int p=0; p<=n; p++) {
			for(int h=0; h<=n; h++) {
				System.out.print(" "+casa[p][h]);
			}
			System.out.println();
		}	
	}
}
