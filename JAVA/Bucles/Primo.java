import java.util.Scanner;

public class Primo {

	public static boolean esPrimo(int n) {
		boolean primo = false;
	  if (n > 1) {
		  primo = true;
		  int i = 2;
		  
		  while(i < n && primo) {
			  if(n % i == 0) {
				  primo = false;
			  } 
			  i++;
		  }
	  } else {
		  //System.out.println("Error");
	  }
		
	return primo;
}	
	
	
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  int contador = 0;
	  
    esPrimo(0);
     for(int i = 2; i <= 1000; i++) {
    	 if(esPrimo(i)) {
    		 System.out.print(i + "\t");
    		 contador++;
    		 
    		 if(contador % 3 == 0) {
    			 System.out.println();
    		 }
    	 }
     }
      
  }	
}
 