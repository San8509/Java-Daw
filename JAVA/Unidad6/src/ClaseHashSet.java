import java.util.HashSet;
public class ClaseHashSet {

	public static void main(String[] args) {
		// TAD tipos abstractos de datos
		
		/*add(elemento): añade un elemento al conjunto, si este no existe todavía.
          contains(elemento): nos dice si un elemento en concreto existe en el conjunto.
          remove(elemento): elimina el elemento del conjunto si este existe en dicho conjunto.
          clear(): elimina todos los elementos del conjunto.
          size(): devuelve el número de elementos que contiene el conjunto.
           isEmpty(): comprueba que no hay elementos en el conjunto.
		 */
		
		// creo el conjunto
		HashSet<String> nombres = new HashSet<String>();
		
		// añado elementos al conjunto
		nombres.add("leia");
		nombres.add("anakin");
		nombres.add("Dark vader");
		nombres.add("Obijuan");
		
		// Añado y muestro si se ha podido añadir
		System.out.println(nombres.add("leia"));
		
		// pregunto si existe
		System.out.println(nombres.contains("anakin"));
		
		// elimina si existe
		System.out.println(nombres.remove("Obijuan"));
		System.out.println(nombres.remove("Jabba"));
		
		System.out.println(nombres);
		

	}

}
