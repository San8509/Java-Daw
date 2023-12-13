import java.util.Scanner;
import java.util.Stack;

public class Ejerc_2_Pilas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack <Integer> pila = new Stack<Integer>();
		// rellenar la pila de elementos
		Integer n=0;
		while(true) {
			System.out.println("añade el elemento a la pila:");
			n=sc.nextInt();
			if(n<0)
				break;
			pila.push(n);
		}
		System.out.println("elementos de la pila: "+pila);
		
		// mostrar el elemento que esta en la cima de la pila
		System.out.println("elemento en la cima de la pila: "+pila.peek());
		// elimina el elemento que esta en la cima de la pila
		pila.pop();
		System.out.println("elemento de la cima removido: "+pila+ "\n");
		
		// mostrar la pila verticalmente
        for(Integer i: pila)  {
        	System.out.println(i);
        }  
        
        // vaciar la pila y mostrarla
        pila.clear();
        System.out.println("elementos eliminados: "+pila);
        
        System.out.println(pila.isEmpty());
	}
}
