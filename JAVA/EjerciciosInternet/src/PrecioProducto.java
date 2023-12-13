import java.util.Scanner;
import javax.swing.JOptionPane;
public class PrecioProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		String text = JOptionPane.showInputDialog( "introduce the price");
		double price = Double.parseDouble(text);
	    final double IVA =  0.21; 
        double finalPrice = ((price * IVA)  / 100) + price;
        
        System.out.println("the final price with IVA is: " + finalPrice);
	
	}

}
