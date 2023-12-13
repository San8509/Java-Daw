import java.util.Stack;

public class ClasePila {

	public static void main(String[] args) {
     Stack <Integer> pila = new Stack<Integer>();
     
     /* TAD
      * 
      * push(elemento); para añadir un elemento a la lista
      * peek(); para mostrar el elemento que esta en la cima de la pila
      * pop(); elimina el elemento de la cima de la pila
      * clear(); vacia los elementos que contiene la pila
      * isEmpty(); comprueba si la pila esta vacia
      * */
     
     pila.push(1); pila.push(2); pila.push(3);
     System.out.println("cima pila: "+ pila.peek());// muestra el elemento que esta en la cima del la pila
     
     System.out.println("desapilar: "+ pila.pop()); //elimina el elemento que esta en la cima del la pila
     
     System.out.println(pila);
	}

}
