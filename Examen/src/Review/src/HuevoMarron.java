import java.util.Random;

public class HuevoMarron {

	public static int[] Numeros( ) {
		Random r = new Random();
		int[] numbers = new int[10];
		int valores = 0;

		for (int i = 0; i < numbers.length; i++) {
			valores = r.nextInt(3);
			numbers[i] = valores;
			System.out.print(numbers[i]);
		}
		return numbers;
	}
	
	
    public static boolean Marron(int[] numbers) {
    
    	for (int i = 1; i < numbers.length - 1; i++) {
			if (numbers [i] == 1) {
				if (numbers[i + 1] == 2 && numbers [i - 1] == 2) {
					return true;
				}
			}
		}
    	return false;
    }
	
    
    static void Tabla(int[] numbers) {
    	
    	System.out.print("posiciones: ");
    	for(int i=0; i<numbers.length; i++ ) {
    		System.out.print(i+" ");
    	}
    	System.out.println();
    	
    	System.out.print("valores   : ");
    	for(int i=0; i<numbers.length; i++ ) {
    		System.out.print(numbers[i]+" ");
    	}
    } 
    
	public static void main(String[] args) {

	   int[] numbers= Numeros();
	   System.out.println();
	   
       Tabla(numbers);
	   
       System.out.println();
	   if(Marron(numbers)) {
		   System.out.println("si");
	   } else {
		   System.out.println("no");
	   }
				
	}
}