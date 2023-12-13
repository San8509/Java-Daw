
public class MetodoMath {

	public static void main(String[] args) {
		
		//ALGUNOS EJEMPLOS DE USO DEL METODO MATH
        double operador1 = 25.4;
        double operador2 = 15.21;
         
        // Devuelve el entero mas cercano por de arriba, o sea redondea al proximo numero entero por encima del valor dado
        System.out.println(Math.ceil(operador1)); // Devuelve 26.0 
        
        // Devuelve el entero mas cercano por debajo
        System.out.println(Math.floor(operador2)); //Devuelve 15.0
        
        // Devuelve  un número elevado a un exponente, Dos parámetros double (base y exponente) 
        System.out.println(Math.pow(operador1, operador2)); // Devuelve 2.474435537975361E21
        
        // Devuelve el mayor de dos entre dos valores
        System.out.println(Math.max(operador1, operador2)); //Devuelve 25.5
        
        //Devuelve la raiz cuadrada de un numero
        System.out.println(Math.sqrt(operador1)); ////Devuelve 5.049752469181039
        
        // Devuelve el entero mas cercano, o sea redondea al entero mas cercano del numero
        System.out.println(Math.floor(operador1));// Devuelve 25.0
	}

}
