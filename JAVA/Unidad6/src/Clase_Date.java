import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class Clase_Date {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// fecha actual
		Date fecha = new Date();
		
		// cambiar formato de fecha
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaFormato = sdf.format(fecha);  
	    System.out.println(fechaFormato);
	   
	}

}
