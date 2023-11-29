import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class FechasAndTime {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		 // Obtener la fecha actual
        LocalDate fechaActual = LocalDate.now();
        System.out.println("Fecha actual: " + fechaActual);
        
        LocalDate fechaModificada = LocalDate.of(2022,12,3);
        System.out.println("Fecha actual: " + fechaModificada);
        //formato de fecha personalizado
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate fecha = LocalDate.parse("01/5/2022", formatoFecha);//puedo dar entrada a traves de variables por teclado en los valores de la fecha

        
        // Obtener la hora actual
        LocalTime horaActual = LocalTime.now();
        System.out.println("Hora actual: " + horaActual);

        // Crear una fecha y hora específicas
        LocalDateTime fechaActualPersonalizada = LocalDateTime.of(2023, 11, 5, 15, 30);
        System.out.println("Fecha y hora personalizada: " + fechaActualPersonalizada);

        // Operaciones con LocalDate
        LocalDate manyana = fechaActual.plus(1, ChronoUnit.DAYS);
        LocalDate semanaPasada = fechaActual.minus(1, ChronoUnit.WEEKS);
        System.out.println("Mañana será: " + manyana);
        System.out.println("Hace una semana fue: " + semanaPasada);

        // Operaciones con LocalTime
        LocalTime unaHoraDespues = horaActual.plus(1, ChronoUnit.HOURS);
        LocalTime dosHorasAntes = horaActual.minus(2, ChronoUnit.HOURS);
        System.out.println("Una hora después será: " + unaHoraDespues);
        System.out.println("Dos horas antes fue: " + dosHorasAntes);

        // Combinar LocalDate y LocalTime en LocalDateTime
        LocalDateTime combinarFechaHora = fechaActual.atTime(horaActual);
        System.out.println("Fecha y hora combinadas: " + combinarFechaHora);

        // Uso de Period para representar un intervalo de días
        LocalDate fechaFutura = fechaActual.plus(Period.ofDays(30));
        System.out.println("Fecha dentro de 30 días: " + fechaFutura);

        // Uso de Duration para representar una duración de tiempo en segundos
        LocalTime horaFutura = horaActual.plus(Duration.ofSeconds(3600));
        System.out.println("Hora dentro de una hora: " + horaFutura);
        
        //saber tiempo entre fechas
        long anyos = ChronoUnit.YEARS.between(fechaFutura, horaFutura);
        long meses = ChronoUnit.MONTHS.between(fechaFutura, horaFutura);
        long days = ChronoUnit.DAYS.between(fechaFutura, horaFutura);
	}

}
