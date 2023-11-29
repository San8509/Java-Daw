import java.util.Random;

public class RandomClase {

	public static void main(String[] args) {
		// creo el objeto random
		Random r = new Random();

		// uso el objeto random y la entrada para asignar un rango 
		int n = r.nextInt(5);//creara un numero entero aleatorio hasta el 4
		System.out.println("El numero aleatorio es: "+ n);
		
		// pasamos de un double a un entero, y añadimos un rango maximo de la siguiente manera 
		int z = (int)(r.nextDouble() * 10); // casteamos a int y damos rango maximo de numero aleatorio
        System.out.println(z);

		// O con la clase Math.random tambien podemos crear numeros aleatorios
		// multiplicamos por el valor que necesitemos (100) para agregar un rango maximo 
		int num2 = (int) Math.random() * 100; // casteamos para obtener un entero
		System.out.println("El numero aleatorio es: "+ num2);

	}

}
