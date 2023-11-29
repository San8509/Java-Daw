import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import javax.swing.text.DateFormatter;

public class DiasVividos {

	public static void main(String[] args) {
		
		LocalDate fechaNacimiento = LocalDate.of(1990, 6, 5);
        LocalDate hoy = LocalDate.now();
        
        
        //dias vividos desde mi nacimiento
        long anyos = ChronoUnit.YEARS.between(fechaNacimiento, hoy);
        System.out.println("años vividos: "+ anyos+"\n");

        // fecha de 8000 dias vividos desde mi nacimiento 
        LocalDate cumplire = fechaNacimiento.plus(8000, ChronoUnit.DAYS);
        long anyosDesde = ChronoUnit.YEARS.between(fechaNacimiento, cumplire);
        System.out.println("fecha de 8000 dias vividos desde mi nacimiento: "+cumplire);
        System.out.println("tenia :"+anyosDesde+" años en ese entonces");
        
	}

}
