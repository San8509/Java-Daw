import java.util.Scanner;
//import javax.swing.JOptionPane;
public class EjerciciosFuncionesCubo {

	public static void main(String[] args) {
	
		//cuboFloat(0); // entre los paretesis van los argumentos
		//estaAprobado(0, 0);
		//Calcular(0, 0, (char)0);
	}
	/*
	static void cuboFloat ( float num) {
		Scanner sc = new Scanner(System.in);
		num = sc.nextFloat();
		
		num = (float) Math.pow(num, 3); // casteamos a float para q el resultado sea float,  ponemos primero el valor y despues el exponente
		System.out.println(num);
		System.out.println("========FIN=========");
	}
    
	 static  void estaAprobado(int nota, int minima) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("cual es la nota minima para aprobar");
		 minima = sc.nextInt();
		nota = 0;
		 
		 while(nota != -1) {
			 System.out.println("introduce la nota");
			  nota = sc.nextInt();
			  
			if (nota < minima) {
				System.out.println("el estudiante no ha alcanzado la nota minima ");
			} else {
				System.out.println("el estudiante ha aprobado");
			}
		 }
	 }*/
	
	 static void Calcular(String num, String num3, char operando ) {
	
		 Scanner sc = new Scanner(System.in);
		 int resultado = 0;
		 int num1 = Integer.parseInt(num);
		 int num2 = Integer.parseInt(num3);
		 System.out.println("introduce la operacion: ");
		  operando = sc.next().charAt(operando);
		  
		  switch (operando) {
		  case 's':
			  resultado = num1 + num2;
			  break;
		  case 'r':
			  resultado = num1 - num2;
			  break;
		  case 'm':
			  resultado = num1 * num2;
			  break;
		  case 'd':
			  resultado = num1 / num2;
			  break;
		  case '%':
			  resultado = num1 % num2;
			  break;
			  default:
			  System.out.println("operacion desconcida");
		  }
			System.out.println("la operacion: "+ operando+ " de "+ num1 + " y " +  num2+ " = "+ resultado );
	 }
}
