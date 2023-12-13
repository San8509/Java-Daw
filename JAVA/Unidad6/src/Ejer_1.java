import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Ejer_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		//introducir los valores
		int n=0;
		while(true) {
			System.out.println("introduce el numero:");
			n=sc.nextInt();
			if(n<0)
				break; // en caso de introducir un numero negativo cierra el bucle
			num.add(n);
		}
		// mostral la ArrayLista
		System.out.println("los valores son:"+num);
		
		// añadir el valor en la primera posicion
		num.add(0, 101);
		System.out.println("añadir el numero: "+num);
		
		// comprobar si existen los valores en al ArrayList
		if(num.contains(101) && num.contains(-1)) {
			System.out.println("X: encontrado");
		  } else  {
		    System.out.println("X: no encontrado");		
		  }
		
		// obtener media
		Integer media=0;
		for(Integer i: num) {
			media += i;
		}
		// media arigmetica
		media/=num.size();
		System.out.println("la media es: "+media);
		
		// extraer el elemento en la posicion 4
		System.out.println("el elemento de la posicion es: "+num.get(4));
		
		// actualizar el ultimo elemento
		//num.get();
		
		// eliminar el primer elemento de la lista
		num.remove(0);
		System.out.println("primer elemento eliminado: "+num);
		
		// ordenar forma ascendente
		Collections.sort(num);
		System.out.println("orden lista ascendente"+num);
		
		// ordenar de forma descendente
		Collections.reverse(num);
		System.out.println("orden lista descendente"+num);
		
		// desordenar aleatoriamente la lista
		Collections.shuffle(num);
		System.out.println("orden lista aleatoria"+num);
		
		// tamaño de la ArrayList num
		Integer size = num.size();
		System.out.println("el tamaño es: " +size);
		
		// NUEVO ARRAYLIST del mismo tamaño que la anterior
		ArrayList<Integer> nueva = new ArrayList<Integer>(size);
		
		// rellenar con numeros aleatorios
		for(Integer i: num) {
			nueva.add(r.nextInt(100)+5);			
		}
		System.out.println("nueva lista: "+nueva);
        
		// comparar si hay igualdad entre las listas 
		if(num.equals(nueva)) {
			System.out.println("son iguales");
		} else {
			System.out.println("no son iguales");
		}
		
		// crear ArrayList para guardar los dos arraylist
		ArrayList<Integer> union = new ArrayList<Integer>();
		
        // uno los valores de las dos listas	
		nueva.addAll(num);
		System.out.println("union de las listas: "+nueva);
		// guardo en una nueva
		union.addAll(nueva);
		System.out.println("nueva lista"+union);
	}

}
