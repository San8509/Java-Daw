import java.util.Scanner;
public class MostrarNumCapicuaMetodos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		int num = sc.nextInt(); 
		
		String st = Integer.toString(num);
		String rev = new StringBuilder(st).reverse().toString();
		
		int x = Integer.parseInt(st);
		int y = Integer.parseInt(rev);
		
		if( x == y ) {
			System.out.println("matches");
			
			
		} else {
			System.out.println("!Matches");
		}
        sc.close();
	}

}
