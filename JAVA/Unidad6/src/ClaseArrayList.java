import java.util.ArrayList;

public class ClaseArrayList {

	public static void main(String[] args) {
		// tipos abstractos de datos TAD
				/*
		         * metodos de ArrayList que mas usaremos
		         *
				 * add(element); añade un elemento al final de la lista
				 * add(X, element); añade un elemento en la posicion X
				 * get(X); consulta el elemento de la posicion X
				 * remove(X); elimina el elemento de la posicion X
				 * size(); devuelve el numero de elementos q tiene la list
				 * isEmpty(); devuelve verdadero si la lista está vacía, en caso contrario falso
				 * clear(); elimina los elementos de la lista pero no borra la lista
				 * indexOf(element); devuelve la posicion de la primera ocurrencia del elemento q se indica
				 * contains(element); devuelve true si el elemento se encuentra en la lista, false en caso contrario
				 * addAll(); añade todos los elementos de nuevaLista al final de la lista
				*/
				
				// creo una lista de cadenas de texto
				ArrayList<String> listaCompra = new ArrayList<String>();
				
				// Añade un elemento al final de la lista
				listaCompra.add("fruta");

				// Añade un elemento en la primera posicion de la lista
				listaCompra.add(0,"Arroz");

				// consulta el primer elemento de la lista indicando el primer indice que es el 0
				System.out.println("consulto un elemento de la lista" + listaCompra.get(0));

				// consulta el segundo elemento de la lista indicando el primer indice que es el 1
				System.out.println("consulto un elemento de la lista" + listaCompra.get(1));

				// muestro el numero de elementos que tiene la lista
				System.out.println("tamaño de la lista"+ listaCompra.size());

				// Elimino el primero elemento de la lista
				System.out.println("elimino elemento de la lista"+ listaCompra.remove(0));

				// elimino todos los elementos pero no borra la lista
				listaCompra.clear();

				// muestro los elementos que tiene
				System.out.println("mostrar lista: "+ listaCompra);
	}

}
