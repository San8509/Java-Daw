import javax.swing.JOptionPane;
public class CodogpASCIIApp {

	public static void main(String[] args) {
		
		String texto = JOptionPane.showInputDialog("introduce el codigo de la tabla ascii");
        int codigo = Integer.parseInt(texto);// paso el string a numero
        char caracter = (char) codigo;//convierto el numero a la letra q le corresponde en la tabla ASCII
        
        System.out.println( caracter);
	}

}
