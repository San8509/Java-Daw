import java.util.Random;

import javax.swing.JOptionPane;

public class NumeroAleatorio {

	public static void main(String[] args) {
		Random N = new Random();

		int numero, aleatorio, contador =0;
		
		
		aleatorio = (int) (Math.random() * 100);// 100 es el rango escogido
		//System.out.println(aleatorio);
		
		do {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
			
			if(aleatorio > numero) {
				System.out.println("digite un numero mayor");
			} else {
				System.out.println("digite un numero menor");
			}
			contador++;
		}while(numero != aleatorio);
		
		System.out.println("\nAdivinaste el numero!! en: "+ contador+ " intentos");
		
	}

}
