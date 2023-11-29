package Ejercicios;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

public class MenuOperacionesFecha {

    public static  void fechaActual (){  
        LocalDate date = LocalDate.now();
        System.out.println(date+ "\n");
    }
    public static void fechaActual (int days){
        Scanner sc = new Scanner(System.in);
        days = sc.nextInt();
        LocalDate date = LocalDate.now().plusDays(days);
        System.out.println(date+"\n");
    }

    public static void horaAactual(){
        LocalTime time = LocalTime.now();
        //DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm:ss");
    	//time = LocalTime.parse("22:35:01");
		//System.out.println(time.format(formato));
        System.out.println(time+"\n");;
    }
    public static void diferenciaFechas(int y, int m, int d) { 
       Scanner sc = new Scanner(System.in);

       System.out.println("introduce la primera fecha");
        y = sc.nextInt(); m = sc.nextInt(); d = sc.nextInt();
       LocalDate one = LocalDate.of(y, m, d);

       System.out.println("introduce la segunda fecha");
        y = sc.nextInt();  m = sc.nextInt();  d = sc.nextInt();
       LocalDate two = LocalDate.of(y, m, d);

       long dayDiference = ChronoUnit.DAYS.between(one, two);
       System.out.println(one+ " "+two+ " la diferencia es de: "+dayDiference+ " en dias\n");   
    }

    public static void afterBefore(int year, int month, int day){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una fecha: ");
         year = sc.nextInt(); month = sc.nextInt(); day = sc.nextInt();

        boolean esAntes;
        boolean esDespues;
        
        if(esAntes = LocalDate.of(year, month, day).isBefore(LocalDate.now())){
          System.out.println("la fecha es anterior?: "+esAntes);
        } else if (esDespues = LocalDate.of(year, month, day).isAfter(LocalDate.now())){        
          System.out.println("la fecha es posterior?: "+esDespues);
        }
    }
   

    public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);
      
       System.out.println("La Fecha actual es: "); 
       fechaActual();

       System.out.println("la hora actual es: ");
       horaAactual();

       System.out.println("dias sumados a la fecha actual: ");
       fechaActual(0);

       System.out.println("diferencia entre fechas"); 
       diferenciaFechas(0,0,0); 
      
       System.out.println("anterior o posterior?");
       afterBefore(0, 0, 0);

       System.out.println("\n'FIN DEL PROGRAMA SEE YOU SOON'\n");
     
      } 
    }