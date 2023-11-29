import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Time {

	public static void main(String[] args) {
		
		/*
    	 *  Creo hora con valores numéricos enteros
    	 */
    	LocalTime hora1 = LocalTime.of(15, 15);
     	hora1 = LocalTime.of(15, 15, 34); // También podemos indicar los segundos
    	System.out.println(hora1);
    	
     	hora1 = LocalTime.of(15, 15, 34);
    	System.out.println(hora1);

    	/*
    	 *  Creo hora como String (formato ISO 8601)
    	 */
    	LocalTime hora2 = LocalTime.parse("14:30");
    	hora2 = LocalTime.parse("14:30:12");  // También podemos indicar los segundos
    	System.out.println(hora2);
        	
    	/*
    	 * Tiempo entre horas
    	 */
    	long horas = ChronoUnit.HOURS.between(hora1, hora2);
    	System.out.println(horas);
    	long minutos = ChronoUnit.MINUTES.between(hora1, hora2);
    	System.out.println(minutos);
    	long segundos = ChronoUnit.SECONDS.between(hora1, hora2);
    	System.out.println(segundos);
    	
       	/*
    	 *  Formato de hora personalizado
    	 */
    	DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm:ss");
    	LocalTime hora3 = LocalTime.parse("17:45:34", formatoHora);
    	System.out.println(hora3.format(formatoHora)); // Lo muestro con el formato personalizado

    	/*
    	 *  Incremento/decremento en días, meses o años
    	 */
		// hora actual
    	LocalTime ahora = LocalTime.now();
    	System.out.println(ahora);

    	// aumento de horas, minutos y segundos
		LocalTime otraHora;
    	otraHora = ahora.plusHours(8); // aumento de horas
    	System.out.println(otraHora);
    	// Lo mismo que antes pero usando ChronoUnit
        otraHora = ahora.plus(8, ChronoUnit.HOURS); // aumento de horas
    	System.out.println(otraHora);
		otraHora = ahora.plus(10, ChronoUnit.MINUTES); // aumento de minutes
    	System.out.println(otraHora);
		otraHora = ahora.plus(30, ChronoUnit.SECONDS); // aumento de seconds
    	System.out.println(otraHora);
    	
    	otraHora = ahora.plusMinutes(30); // aumento de minutos
    	System.out.println(otraHora);
    	otraHora = ahora.plusSeconds(50); // aumento de segundos
    	System.out.println(otraHora);

		// decremento de horas, minutos y segundos
    	otraHora = otraHora.minusHours(12); // resta de horas
    	System.out.println(otraHora);
		otraHora = otraHora.minusMinutes(30); // resta de minutes
    	System.out.println(otraHora);
		otraHora = otraHora.minusSeconds(120); // resta de seconds
    	System.out.println(otraHora);

		// cambio de formato horario segun quiera
    	DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
    	otraHora = LocalTime.parse("22:35:01");
		System.out.println(otraHora.format(formato));

		//Podemos obtener la hora, minutos o segundos:
        int hora = LocalTime.parse("12:34").getHour(); // Devuelve 12
        int minuto = LocalTime.parse("12:34").getMinute(); // Devuelve 34
        System.out.println(hora+" "+minuto);

		//También, al igual que en las fichas, podemos comprobar si una hora es anterior o posterior a otra:
        boolean esAntes = LocalTime.parse("12:34").isBefore(LocalTime.parse("13:30"));
        System.out.println(esAntes);

	}

}
