 import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		//fechas
		int anyo= sc.nextInt();
		int mes= sc.nextInt();
		int dias= sc.nextInt();
		
		LocalDate fecha1 = LocalDate.of(anyo, mes, dias);
		System.out.print(fecha1);
		
		// creamos una fecha mediante una entrada por teclado
		String fechaCadena = sc.nextLine();
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("d/M/yyyy");
        LocalDate fecha2 = LocalDate.parse( fechaCadena, formatoFecha);
        System.out.println(fecha2.format(formatoFecha));
        
        LocalDate fecha3 = fecha2.plusYears(2);// aumento dos años a la fecha y lo guardo en una variable
       
		/*   para saber la diferencia entre fechas y cada uno de sus casos
		 long anyos = ChronoUnit.YEARS.between(fecha1, fecha2);
	        long meses = ChronoUnit.MONTHS.between(fecha1, fecha2);
	        long days = ChronoUnit.DAYS.between(fecha1, fecha2);
		*/
        
		
        //contraseña
		/*String specialCaracters = "!\"$%&/()";
        String password = "abcd!";
        
        boolean encontrado = false;
        
        for(int i=0; i<password.length(); i++) {
        	 char c = password.charAt(i);//recorre la contraseña
        	
        	if(specialCaracters.indexOf(c) >=0) {
        	   encontrado = true;
        		break;
        	}
        }
        System.out.println(encontrado);*/
        
        
       
        //darle la vuelta a una cadena
        String cadena = "acera";
        String nueva = "";
        
        for(int i = 0; i<cadena.length(); i++) {
              nueva = cadena.charAt(i) + nueva;          
        }
        System.out.print(nueva);
	}

}
