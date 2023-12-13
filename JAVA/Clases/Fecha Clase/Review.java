import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Review {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      // fecha actual
      LocalDate hoy = LocalDate.now();
      System.out.println(hoy);

      //mañana
      LocalDate mañana = LocalDate.now().plusDays(1);
      System.out.println(mañana);

      // Ayer
      LocalDate ayer = LocalDate.now().minusDays(1); 
      System.out.println(ayer);

      //Obtener la fecha actual y restarle un mes (fíjate cómo acepta un enum como unidad de tiempo):
      LocalDate mesAnteriorMismoDia = LocalDate.now().minus(1, ChronoUnit.MONTHS);
      System.out.println(mesAnteriorMismoDia);  

      // para optener una fecha especifica 
      LocalDate tomorrow = LocalDate.of(2023,05, 10);
      LocalDate cadena = LocalDate.parse("2023-05-10");// parsea una cadena como fecha
      System.out.println(tomorrow + " " + cadena);

     // para generar nuestro propio formato de fecha usamos..
     DateTimeFormatter miFormato = DateTimeFormatter.ofPattern("d/M/yyyy");
     // NOTA -puedo dar entrada a traves de variables por teclado en los valores de la fecha
     LocalDate fecha = LocalDate.parse("05/06/1990", miFormato);
     System.out.println("\nFecha con formato personal: "+fecha.format(miFormato));

    // Podemos averiguar si un año es bisiesto:
    boolean esBisiesto = LocalDate.now().isLeapYear();
    System.out.println(esBisiesto?"\nel año es bisiesto":"\nel año no es bisiesto");

     //También podemos saber la relación entre una fecha con otra, respecto a si ocurre antes o después:
     // 2023-05-04 no va antes que 2023-05-01
     boolean esAntes = LocalDate.parse("2023-05-04").isBefore(LocalDate.parse("2023-05-01"));
     // 2023-05-10 va después que 2023-05-04
     boolean esDespues = LocalDate.parse("2023-05-10").isAfter(LocalDate.parse("2023-05-04"));
     System.out.println(esAntes?"\nla fecha es anterior: ":"\nla fecha es posterior");
     System.out.println(esDespues?"\nla fecha es anterior: ":"\nla fecha es posterior");

     
    // Para obtener los límites de una fecha dada:
    // Obtenemos la hora de inicio del día 2023-05-04 i usamos LocalDateTime para 
    //guardar la hora que devuelve el método
     LocalDateTime comienzoDelDia = LocalDate.parse("2023-05-04").atStartOfDay();
     
     // Obtenemos la fecha del primer día del mes parseado
     LocalDate firstDayOfMonth = LocalDate.parse("2023-05-04").with(TemporalAdjusters.firstDayOfMonth());
     System.out.println("comienzo del dia selecciondo: "+comienzoDelDia);
     System.out.println("primerdia del mes pasado: "+firstDayOfMonth);
    }
}
