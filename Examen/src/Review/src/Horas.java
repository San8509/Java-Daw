import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
	

	public class Horas {

		/*
		 * Ramiro Santiago Velazquez
		 * 
		 * Ejercicio 4
		 * 
		 * */
		
		public static int segundos(LocalTime hora1, LocalTime hora2) {
			
			// diferencia de segundos entre las dos horas
			int seconds = (int) ChronoUnit.SECONDS.between(hora1, hora2);
			System.out.println("Los segundos de diferencia son: "+seconds);

			return seconds;
		}
			
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	    	
			System.out.println("a que hora comenzas a estudiar");
			String uno = sc.next();
			LocalTime hora1 = LocalTime.parse(uno);
			
			System.out.println("a que hora terminas de estudiar");
			String dos = sc.next();
			LocalTime hora2 = LocalTime.parse(dos);
				
			int resultadoSegundos = segundos(hora1, hora2);

			long horas = ChronoUnit.HOURS.between(hora1, hora2);
	        // saco el resto de el total de minutos que sera el tiempo en minutos
	    	long minutos = ChronoUnit.MINUTES.between(hora1, hora2) % 60; 
	    	long segundos = ChronoUnit.SECONDS.between(hora1, hora2) % 60;
	    	System.out.println("Has estado estudiando Programacion: "+horas+ " horas "+minutos+ " minutos "+segundos+" segundos");

		}		
	}
	

