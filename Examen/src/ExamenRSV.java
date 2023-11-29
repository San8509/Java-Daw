import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ExamenRSV {

	/*
	 * Ramiro Santiago Velazquez
	 * 
	 * Ejercicio 4
	 * 
	 * */
	
	public static void Segundos(int horas, int minutos, int segundos) {
		Scanner sc = new Scanner(System.in);
		
		horas=0;
		minutos=0;
		segundos=0;
		
		System.out.println("introduce la primera hora");
		horas = sc.nextInt(); minutos = sc.nextInt(); segundos = sc.nextInt();
		LocalTime start = LocalTime.of(horas, minutos, segundos);
		
		System.out.println("introduce la segunda hora");
		horas = sc.nextInt(); minutos = sc.nextInt(); segundos = sc.nextInt();
		LocalTime end = LocalTime.of(horas, minutos, segundos);
		
		// diferencia de segundos entre las dos horas
		long seconds = ChronoUnit.SECONDS.between(start, end);
		System.out.println("Los segundos de diferencia son: "+seconds);
		
	}
	
	
	public static void DiferenciaTiempo(int horas, int minutos, int segundos) {
	  Scanner sc = new Scanner(System.in);
		horas=0;
		minutos=0;
		segundos=0;
		
		
		// declaro la hora del comienzo con entrada por teclado
		System.out.println("\nA que hora empiezas a estudiar");
		horas = sc.nextInt(); minutos = sc.nextInt(); segundos = sc.nextInt();
		LocalTime start = LocalTime.of(horas, minutos, segundos);
        System.out.println(start);
        
        // declaro la hora del final con entrada por tecado
        System.out.println("A q hora terminas de estudiar");
        horas = sc.nextInt(); minutos = sc.nextInt(); segundos = sc.nextInt();
		LocalTime end = LocalTime.of(horas, minutos, segundos);
        System.out.println(end);
        
		Duration diferencia = Duration.between(start, end);
        

        // diferencia entre valores
        long hour = ChronoUnit.HOURS.between(start, end);
    	long minuts = diferencia.toMinutes() % 60;
    	long seconds = diferencia.toSeconds() % 60;
        
         // Muestro el resultado de la diferencia
    	System.out.println("Has estudiado programacion: "+hour+" hora :"+minuts+" minutos y "+seconds+" segundos"); 
    	
		
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	
		Segundos(0,0,0);
		
		DiferenciaTiempo(0,0,0);

	}

}