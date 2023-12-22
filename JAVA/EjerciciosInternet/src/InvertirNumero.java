import java.util.ArrayList;
import java.util.Scanner;

public class InvertirNumero {

	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
	
       int n = sc.nextInt();
       int counter =0;
       int x = 0;
       int[] array = new int[4];
       
       while(n !=0) {
    	   x = n % 10;
    	   array[x]= x;
    	   n /= 10;
     
    	   counter++;
    	   System.out.print(x+ ", ");
       }
       System.out.println("\n"+counter);
       
       for(int i=0; array.length; i++) {
    	   System.out.print(i);
       }
	}    
}
