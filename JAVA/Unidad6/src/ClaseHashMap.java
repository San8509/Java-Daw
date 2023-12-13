import java.util.HashMap;
public class ClaseHashMap {

	public static void main(String[] args) {
		// TAD tipo de datos abstractos
		
		/*DICCIONARIOS con HashMap
		 *  Clave_Valor
		 *  
		 *  • put: añade un elemento al diccionario. Necesita la clave y el valor.
            • get: devuelve un elemento del diccionario a partir de su clave.
            • remove: elimina un elemento del diccionario a partir de su clave.
            • replace: actualiza un elemento del diccionario a partir de su clave y el nuevo valor
            • keySet: devuelve un Set, que será el conjunto de claves de nuestro HashMap.
            • values(): devuelve una colección con todos los valores (los valores pueden estar duplicados a 
               diferencia de las claves).
            • entrySet(): devuelve un Set con todos los pares CLAVE-VALOR.
            • containsKey(clave): devuelve true si el diccionario contiene la clave indicada y false en caso contrario.
            • size(): devuelve el número de elementos que hay en el HashMap.
            • clear(): elimina todos los elementos del HashMap.
            • isEmpty(): comprueba si el HashMap ya no contiene elementos CLAVE-VALOR
		 */
		
          //crear el diccionario
		HashMap<String, Double> fuerzaPersonaje = new HashMap<String, Double>();
		
		// añadir elementos al diccionario
		fuerzaPersonaje.put("anakin", 1000.0);
		fuerzaPersonaje.put("luke", 1500.0);
		fuerzaPersonaje.put("jodda", 3500.0);
		fuerzaPersonaje.put("dark vader",2500.0);
		fuerzaPersonaje.put("leia", 500.0);
		
		// mostrar contenido del diccionario 
		System.out.println(fuerzaPersonaje);
		
		// acceder al dato del diccionario
		Double fuerza = fuerzaPersonaje.get("anakin");
		System.out.println("fuerza anakin: "+ fuerza);
		
		// eliminar datos del personaje
		fuerzaPersonaje.remove("anakin");
		System.out.println(fuerzaPersonaje);
		
		// actualizar dato del diccionario
	    fuerzaPersonaje.replace("leia", 800.0);
		System.out.println(fuerzaPersonaje );
		
		// recorrer datos del diccionario
		for(String clave: fuerzaPersonaje.keySet()) {
			Double valor = fuerzaPersonaje.get(clave);
			System.out.println("personaje "+ clave +" fuerza: "+ valor);
		}
		
	}
}
