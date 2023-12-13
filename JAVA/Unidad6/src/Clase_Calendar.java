import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Scanner;

public class Clase_Calendar {

	public static void main(String[] args) {
		Calendar numFecha = Calendar.getInstance(); 
		Scanner sc = new Scanner(System.in);
		//fecha.set(2016, 6, 3);
		/*
		int y= 2020;  
		
		fecha.set(Calendar.YEAR, y);
		fecha.set(Calendar.MONTH, 10);
		fecha.set(Calendar.DATE, 20);
		
		System.out.println(fecha.getTime());*/
		HashSet<Calendar> registroFecha = new HashSet<Calendar>();
		ArrayList<String> lista = new ArrayList<String>();
		String partes="";
		
		 // pasar a subcadenas dias, mes, año
		String inList = "";
		
		while(true) {
			System.out.println("introduce la fecha");
			inList = sc.nextLine();
			if(inList.equals("fin"))
				break;
			lista.add(inList);
		}
		
		 String dia =""; String mes ="";  String año ="";
		 
		 for(Integer i=0; i<lista.size(); i++ ) {
			 partes = lista.get(i);
			 // pasar a subcadenas dias, mes, año
		     String [] f = partes.split("/");
			  dia = f[0];  
			  mes = f[1]; 
			  año = f[2];
			 
		 }
		 
		
		 int day = Integer.parseInt(dia); int month = Integer.parseInt(mes); int year = Integer.parseInt(año);
		 Calendar fecha2 = new GregorianCalendar(year,month,day);
		 System.out.println(fecha2.get(Calendar.DATE)+"/"+ fecha2.get(Calendar.MONTH)+"/"+fecha2.get(Calendar.YEAR) );
         
		 registroFecha.add(fecha2);
		 
		
	}

}
