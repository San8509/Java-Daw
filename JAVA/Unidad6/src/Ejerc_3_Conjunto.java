import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Ejerc_3_Conjunto {

	public static void main(String[] args) {
		// TAD tipo de datos abstractos
        // Listas desordenadas y no duplicadas
		
		Scanner sc = new Scanner(System.in);
		// crear el conjunto desordenado
	    HashSet<Integer> dorsal = new HashSet<Integer>();
		// rellenar el conjunto
		Integer n=0;
		while(true) {
			System.out.println("introduce el dorsal");
			n=sc.nextInt();
			if(n<0)
				break;
			dorsal.add(n);
		}
		// comprobar si el elemento existe 
		System.out.println(dorsal.contains(10));
		// imprime el conjunto
		System.out.println(dorsal);
		// elimina el elemento indicado del conjunto
		dorsal.remove(13);
		System.out.println(dorsal);
		// elimina los elementos del conjunto
		dorsal.clear();
		System.out.println(dorsal);
		// comprueba si esta vacio
		System.out.println(dorsal.isEmpty());
	}
}
