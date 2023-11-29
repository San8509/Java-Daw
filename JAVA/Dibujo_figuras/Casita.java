import java.util.Scanner;
public class Casita {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int altura = sc.nextInt();
		int anchura = sc.nextInt();
		
		for( int columna = 0; columna < anchura; columna++){// imprime el techo
			System.out.print("*");
		}
		System.out.println();
		
		for( int fila = 0; fila < altura - 2; fila++){//imprime las columnas
			System.out.print("*");
			
			for( int columna = 0; columna < anchura - 2; columna++){//imprime los espacios de las columnas
				System.out.print(" ");
			}
			
			System.out.println("*");
		    }
		
		for( int columna = 0; columna < anchura; columna++){// imprime la base
			System.out.print("*");
		}

	}

}
