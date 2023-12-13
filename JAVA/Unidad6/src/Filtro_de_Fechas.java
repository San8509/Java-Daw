import java.util.HashSet;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Filtro_de_Fechas {

	public static void main(String[] args) {
		// TDA tipos datos abstractos
		Scanner sc = new Scanner(System.in);
		String entrada=""; String inList=""; String partes="";
		
		//crear arrayList de lista
		ArrayList<String> lista = new ArrayList<String>();
		HashSet<Calendar> registroFecha = new HashSet<Calendar>();
        	
		// introducir la fecha
		while(true){
		System.out.println("introduce la fecha en formato:  DD/MM/AAAA");
		entrada=sc.nextLine();
		// condicion de cierre 
		if(entrada.equals("fin"))
	    	 break;
		// formato del ejercicio
	     DateTimeFormatter miFormato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	     LocalDate fecha1 = LocalDate.parse( entrada, miFormato);
	     // guardar la fecha en un String
	     inList = fecha1.format(miFormato);
	     // añadir el elemento string a la arrayList
	     lista.add(inList);
		}
		
		// crear los string para dia mes y año
		String dia = "";  String mes = "";   String año = "";
		 
		// crear el objeto calendar con el arrayList
		for(Integer i=0; i<lista.size(); i++ ) {
			 partes = lista.get(i);
			 // pasar a subcadenas dias, mes, año
		     String[] f = partes.split("/");
			 dia = f[0];  mes = f[1]; año = f[2];
			  // parsear a integer 
			 int day = Integer.parseInt(dia);
			 int month = Integer.parseInt(mes);
			 int year = Integer.parseInt(año);
			 // crear el los valores calendar
			 Calendar fecha2 = new GregorianCalendar(year,month,day);
			 System.out.println(fecha2.get(Calendar.DATE)+"/"+ fecha2.get(Calendar.MONTH)+"/"+fecha2.get(Calendar.YEAR) );
	         // rellenar el hashSet con los strings calendar
			 registroFecha.add(fecha2); 	 
		 }
		 System.out.println("La cantidad de fechas introducidas son: "+registroFecha.size());
		 
	}
}
