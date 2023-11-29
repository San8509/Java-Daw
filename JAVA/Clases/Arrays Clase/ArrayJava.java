import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayJava {

	public static void main(String[] args) {
		/*ARRAYS
		  * es una estructura de datos q nos permite almacenar un	
	      *	un conjunto de datos de un mismo tipo. El tamaño del array
	      * se declara en un primer momento y no puede cambiar durante 
	      * la ejecucio del pograma	 
	      */
		
		//Ejemplo; se introduce la longitud del array y luego los valores
		int[]numero = new int[3];//longitud
		// 0tra manera mas facil
		//int[]numeros = {9, 8, 5}; //la cantidad de valores es = a la longitud
		
		numero[0]= 9; 
		numero[1]= 8;
		numero[2]= 5;
		
		Arrays.sort(numero);
		//Arrays con For 
		for(int i = 0; i < 3; i++) {
			System.out.print(numero[i] + ", ");	
		}
		
		System.out.println();
		/*para ordenar un array de menor a mayor solo es necesario utilizar
		 * Arrays.sort 
		/* Arrays.sort(nombre_array);*/
		
		
		int[]notas = {9, 7, 8, 5, 1, 3, 0};
		
		System.out.println("array antes de ordenarlo");
		for(int i=0; i < notas.length; i++) {
			System.out.print(notas[i] +", ");
		}
		System.out.println();
		
		Arrays.sort(notas);
        
		System.out.println("despues de ordenarlo");
		for(int i=0; i < notas.length; i++) {
			System.out.print(notas[i] +", ");
		}
		
	}

}
