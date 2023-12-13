import java.util.Scanner;

public class ArrayInvertido {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 
        // // array con posiciones
	    // String[] chain = new String[5];
		// // forma larga de rellenar las posiciones del array 
		// chain[0] ="";
		// chain[2] ="";
		// chain[3] =""; 
		// chain[4] ="";
		// chain[5] ="";
		// chain[6] ="";

		
        // forma corta de rellenar las posiciones
		String [] otra = {"eres", "tremendo", "carastaca", "y", "hombre", "vas", "aaprender"};
		// para recorrer el array usamos un bucle for 
		for (int i = 0; i<otra.length; i++){
            System.out.print(otra[i] + " ");
		}
		
	}

}
