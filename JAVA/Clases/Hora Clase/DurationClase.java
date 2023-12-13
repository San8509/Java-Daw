import java.time.Duration;
import java.time.LocalTime;

public class DurationClase {

    public static void main(String[] args) {
 
    /*Algunos ejemplos de uso de la clase Duration:
    Manipular el tiempo:*/
      LocalTime tiempoInicial = LocalTime.of(12, 34, 0); // 12:34:00
      LocalTime tiempoFinal = tiempoInicial.plus(Duration.ofSeconds(30)); // 12:34:30
    
      //Calcular la diferencia en segundos entre dos tiempos:
      Long tiempoSegundos = Duration.between(tiempoInicial, tiempoFinal).getSeconds(); // 30
      System.out.println(tiempoSegundos);

 }
}

