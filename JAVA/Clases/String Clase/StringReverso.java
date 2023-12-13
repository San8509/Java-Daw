public class StringReverso {
    
    public static void main(String[] args) {
        
        //darle la vuelta a una cadena
		   String cadena = "acera";
		   String nueva = "";
		   
		   for(int i = 0; i<cadena.length(); i++) {
				 nueva = cadena.charAt(i) + nueva;          
		   }
		   System.out.print(nueva);
    }
}
