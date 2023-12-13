import java.util.Stack;

public class ClaseStack {
    
    static void main(String[] args) {
    Stack<Integer> pila = new Stack<Integer>();

    pila.push(1);
     pila.push(2);
      pila.push(3);
        
      System.out.println("cima pila: "+ pila.peek());
    }
}
