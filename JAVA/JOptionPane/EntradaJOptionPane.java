// Librerias a importar
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class EntradaJOptionPane {

	public static void main(String[] args) throws IOException {
       
		//Notar que readLine() nos obliga a declarar IOException
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"

		         System.out.println("Por favor ingrese su nombre");//Se pide un dato al usuario
		         String nombre = br.readLine(); //Se lee el nombre con readLine() que retorna un String con el dato

		         System.out.println("Bienvenido " + nombre + ". Por favor ingrese su edad");//Se pide otro dato al usuario
		         String entrada = br.readLine(); //Se guarda la entrada (edad) en una variable

		         //Nótese que readLine siempre retorna String y la clase BufferedReader...
		         //no tiene un método para leer enteros, así que debemos convertirlo.

		         int edad = Integer.parseInt(entrada);//Se transforma la entrada anterior en un entero
		         //Si el usuario ingresó solo números funcionará bien, de lo contrario generará una excepción

		         System.out.println("Gracias " + nombre + " en 10 años usted tendrá " + (edad + 10) + " años."); //Operacion numerica con la edad
	
	     /*======================================================================*/
		      // to Strings 
		 		String name = JOptionPane.showInputDialog("show input your name: ");
		 		 System.out.println(name);
		         
		 		 //convert to string at numbers
		 		 String edge = JOptionPane.showInputDialog("intrduce your edge: ");
		 		 int edgeNumber = Integer.parseInt(edge);
		 		 System.out.println("your edge is: " + edgeNumber);
		/**==============================================================================*/
		 		 
		 // examples of in
		 		 int entero = Integer.parseInt(edge);
		 		 double decimlExactly = Double.parseDouble(edge);
		 		 float deciml = Float.parseFloat(edge);
		 		 
	    }
	
	}


