import java.util.ArrayList;
import java.util.Collections;
public class ClaseCollections {

	public static void main(String[] args) {
		// TAD  tipod de datos abstractos
		
		/*COLLECTIONS
		 * 
		 * • sort(): recibe como parámetro un objeto de tipo List (ArrayList por ejemplo) y ordena sus elementos.
           • reverse(): recibe como parámetro un objeto de tipo List (ArrayList por ejemplo) e invierte el orden de 
             sus elementos.
           • shuffle(): recibe como parámetro un objeto de tipo List (ArrayList por ejemplo) y mezcla 
             aleatoriamente sus elementos, es decir, como en una baraja de cartas.
           • max(): recibe como parámetro cualquier objeto de tipo Collection (cualquiera de los que hemos 
             estudiado) y devuelve el máximo del orden natural de los valores que contiene dicha colección.
           • min(): recibe como parámetro cualquier objeto de tipo Collection (cualquiera de los que hemos 
             estudiado) y devuelve el mínimo del orden natural de los valores que contiene dicha colección
		 * */
		// crear la lista
		ArrayList<Integer> lista = new ArrayList<Integer>();
		// asignar valores
		lista.add(4); lista.add(3); lista.add(5); lista.add(2); lista.add(1);
		System.out.println(lista);
        
		// ordenar lista
		Collections.sort(lista);
		System.out.println(lista);
		
		// obtener el valor maximo
		Integer max = Collections.max(lista);
		System.out.println(max);
	}

}
