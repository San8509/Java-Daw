import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2,  resultado = 0;
		 
		System.out.println("introduce el numero 1");
		 num1 = sc.nextDouble();

		System.out.println("introduce el signo del operador");
		String operador = sc.next();
		
		System.out.println("introduce el segundo numero");
		 num2 = sc.nextDouble();
		
		switch (operador) {
		case " + " :
			resultado = num1 + num2;
			break;
		case " * " :
			resultado = num1 * num2;
			break;
		case " / " :
			resultado = num1 / num2;
			break;
		case " - " :
			resultado = num1 - num2;
			break;
		case " % " :
			resultado = num1 % num2;
			break;
		case " ª " :	
			resultado =(int) Math.pow(num1, num2);
			break;
		}			
		System.out.println(resultado);
		System.out.println(num1+"  "+ operador + "  " + num2 +  " = " +resultado );
	}

}
