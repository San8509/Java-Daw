
public class TestCaracteres {

	public static void mostrarCalificaciones(char[] calif) {
		System.out.println();
		for(char letra : calif) {
			System.out.print(letra);
		}
	}
	
	public static void main(String[] args) {
		
		// Creo el array de caracteres
		char[] calificaciones1 = new char[4];
		
		// Relleno cada elemento del array de caracteres
		calificaciones1[0] = 'a';
		calificaciones1[1] = 'p';
		calificaciones1[2] = 't';
		calificaciones1[3] = 'o';
		
		// Creo otro array de caracteres previamente rellenado
		char[] calificaciones2 = {'a','p','t','o'};
		
		// Recorro el array
		for(char letra : calificaciones2) {
			System.out.print(letra);
		}
		
		// Modifico un elemento del array
		calificaciones2[3] = 'a';

		System.out.println();
		for(char letra : calificaciones2) {
			System.out.print(letra);
		}
		
		// Modularizo la muestra de las calificaciones
		mostrarCalificaciones(calificaciones2);
	}
}
