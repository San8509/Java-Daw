import java.util.Scanner;

public class RectanguloVacio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		 
		  System.out.print("Introduce la altura: ");
		  int altura = sc.nextInt();
		  System.out.print("Introduce la anchura: ");
		  int anchura = sc.nextInt();
		  String aux = "";
		  // Imprimir
		  for (int alto = 0; alto < altura; alto++) {
		      for (int largo = 0; largo < anchura; largo++) {
		          // Primera y Ultima Linea (Todo con *)
		          if (alto==0 | alto == altura-1) {
		                  aux="*";                    
		          } else {
		          // Zona media (* o blanco)
		              if (largo == 0 | largo == anchura-1) aux="*";
		              if (largo !=0 & largo != anchura-1) aux=" ";
		          }
		          // Pintamos caracter que corresponda
		          System.out.print(aux);
		          // Si es final de linea un salto
		          if (largo == anchura-1) System.out.print("\n");
		      }
		  }
		  
		  
		  
	}

}
