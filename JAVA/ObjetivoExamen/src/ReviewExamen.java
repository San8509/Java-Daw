import java.util.Scanner;

public class ReviewExamen {

	public static void IntroduceNota(int estudiantes, int nota) {
		Scanner sc = new Scanner(System.in);
		int aprobados=0; int suspensos=0; int notaMaxima=0; int minima=0;
		
		System.out.print("Cuantos estudiantes se examinan: ");
	    estudiantes = sc.nextInt();
	    
	    for (int i =0; i < estudiantes; i++) {
	    	System.out.print("introduce tu nota: ");
	    	nota = sc.nextInt();
	    	
	    	if ( nota >= 5) {
	    		aprobados++;
	    	} else if (nota <= 4) {
	    		suspensos++;
	    	} 
	    	
	    	if (nota > notaMaxima) {
	    		notaMaxima = nota;
	    	} else if (nota < notaMaxima) {
	            minima = nota;
	    	}
	    	
	    }
	    
	    System.out.println("\n===Resultados de Sistemas Informaticos===");
	    System.out.println("No estudiantes suspensos: "+ suspensos);
	    System.out.println("No estudiantes aprobados: "+aprobados);
	    System.out.println("\nNota maxima es: "+notaMaxima);
	    System.out.println("Nota minima es: "+minima);
	    System.out.println("FIN");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
	    System.out.print("Nombre de la asignatura: ");
	    String asign = sc.nextLine();
	    
	    System.out.print("Cual es la nota minima para aprobar: ");
	    int notaMinima = sc.nextInt();
	    IntroduceNota(0, 0);
	    
	    
   }
}