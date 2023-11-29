import java.util.Scanner;

public class Text2 {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner (System.in);
		
		int a = 8;
		int b = 3;
		int resultado = 0;
		
		resultado = a + b;
		
		//System.out.printf("la suma es: %d %n", resultado); %d coge el valor de una variable de numero entero
		System.out.printf("la suma de %d mas %d es: %d\n", a, b, resultado);
		
		resultado = (a - b);
		System.out.printf("la resta de %d menos %d es: %d\n", a, b, resultado);
		
	}

}
