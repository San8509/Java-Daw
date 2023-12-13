import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Hora {

	/*
	 * Ramiro Santiago Velazquez
	 * 
	 * Ejercicio 4
	 * 
	 * */
	
	public static long Segundos(long seconds) {
				
		LocalTime start = LocalTime.of(10, 30, 30);
		LocalTime end = LocalTime.of(12, 30, 30);
		
		// diferencia de segundos entre las dos horas
		seconds = ChronoUnit.SECONDS.between(start, end);
		System.out.println("Los segundos de diferencia son: "+seconds);

		return seconds;
	}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    	
		Segundos(0);

		LocalTime start = LocalTime.of(10,30,30);
        System.out.print("a q hora empiezas a estudiar "+ start+"\n");
		LocalTime end = LocalTime.of(12,00,40);
        System.out.print("a q hora terminas de estudiar "+end+"\n");


		long horas = ChronoUnit.HOURS.between(start, end);
        // saco el resto de el total de minutos que sera el tiempo en minutos
    	long minutos = ChronoUnit.MINUTES.between(start, end) % 60; 
    	long segundos = ChronoUnit.SECONDS.between(start, end) % 60;
    	System.out.println("Has estado estudiando Programacion: "+horas+ " horas "+minutos+ " minutos "+segundos+" segundos");


	}

}
