
import javax.swing.JOptionPane;
public class AreaCirculo {

	public static void main(String[] args) {
	
	
		String texto = JOptionPane.showInputDialog("introduce un radio");
		//pasamos el string a double
		double radio = Double.parseDouble(texto);
	   
		//formula area cirulo, usamos alunos de los metodos de Math
		double area = Math.PI*Math.pow(radio, 2);
		 area = Math.ceil(area);
		System.out.println("El area del circulo es: " + area);
		
		
		
		
	}

}
