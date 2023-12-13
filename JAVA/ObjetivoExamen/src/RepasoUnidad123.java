import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class RepasoUnidad123 {

	static void borrarPantalla() {
	   
		int n=25;
		for(int i=0; i<=n;i++) {
			System.out.println(" ");
		}
	}
	
	static void dibujarCuadrado3x3() {
	    
		for(int i=0; i<3;i++) {
			for(int j=0; j<3; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void dibujarRectangulo(int alt, int ancho) {
		
		for(int i=0; i<alt;i++) {
			for(int j=0; j<ancho; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	
	static void escribirRepetido(char a, int n) {
		
		for(int i=0; i<=n; i++) {
			System.out.print(a+" ");
		}
	}
	
	static void rectanguloLetras(char letra, int altura, int anch) {
		
		for(int i=0; i<altura; i++) {
			for(int j=0; j<anch; j++ ) {
				System.out.print(letra+" ");
			}
			System.out.println();
		}
	}
	
	static float cubo(float num) {
		
		num = (float) Math.pow(num, 3);
		System.out.println(num);
		return num;
	}
	
	static boolean estaAprobado( int nota, int notaMinima ) {
        	if(nota >= notaMinima) {
        		System.out.println("aprobado");
        	} else if(nota < notaMinima) {
        		System.out.println("suspenso");
        	} 
         return true;
	}
	
	static  int suma(int a, int b) {
		int s = a+b;
		System.out.println(s);
		return s;
	}
	
	static  int resta(int a, int b) {
		int s = a-b;
		System.out.println(s);
		return s;
	}
	
	static  double division(double a, double b) {
		double s = a/b;
		System.out.println(s);
		return s;
	}
	
	static  int multiplicacion(int a, int b) {
		int s = a*b;
		System.out.println(s);
		return s;
	}
	
	static  int resto(int a, int b) {
		int s = a%b;
		System.out.println(s);
		return s;
	}
	
	static void calculadora(int a, int b, char letra) {
		
		switch( letra ) {
		case 's':
			suma(a, b);
			break;
		case 'r':
			resta(a, b);
			break;
		case 'm':
		multiplicacion(a, b);
			break;
		case 'd':
			division(a, b);
			break;
		case '%':
		resto(a, b);
			break;
		}
	}
	
	static boolean primo(int n) {
		boolean primo=false;
		
		
		return primo;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int a=sc.nextInt();
		int b=sc.nextInt();
		char letra=sc.next().charAt(0);
		*/
		//System.out.println("introduce tu numero ");
		//int n=sc.nextInt();
		/* 
		borrarPantalla();
		dibujarCuadrado3x3();
	    dibujarRectangulo(a, b);
		escribirRepetido(a2, n);
		rectanguloLetras(a2, a, b);
		cubo(n);
		estaAprobado(nota, notaMinima);
		suma(a, b);
		resta(a, b);
		multiplicacion(a, b);
		division(a, b);
		resto(a, b);
		calculadora(a, b, letra);
		*/
		
		
	}
}