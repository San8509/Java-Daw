import java.util.Scanner;


public class Text3 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner (System.in);
		
		double a = 8;
		double b = 3;
		
		double res = (double) a / b;
		
		System.out.printf("La división de %b y %b es: %f\n", a, b, res);
	
		//2,67
		System.out.printf("La division con dos valores despues de la coma %.2f %n", res);		

	}

}
