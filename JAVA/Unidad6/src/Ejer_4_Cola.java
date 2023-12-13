import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ejer_4_Cola {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> cola = new LinkedList<Integer>();
		// rellenar la cola
		Integer n=0;
		while(true) {
			System.out.println("añade el elemento a la cola:");
			n=sc.nextInt();
			if(n<0)
				break;
			cola.add(n);
		}
		// mostral la cola
		for(Integer i: cola) {
			System.out.println(i);
		}
		// mostral el primer elemento de la cola
		System.out.println(cola.peek());
		
		// remover el primer elemento de la cola
		cola.remove();
		System.out.println(cola);
		
		cola.clear();
		System.out.println(cola.isEmpty());
	
		
	}
}
