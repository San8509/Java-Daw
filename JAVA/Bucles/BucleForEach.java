
public class BucleForEach {

	public static void main(String[] args) {
	  
		String[]names = {"juan, carlos, audi, honda, pepe, luisa, pepe, rob"};
		/*para saber la longitud del array podemos utilizar el metodo length
        ejemplo : names.length y lo convertira a un entero */
		
	  //for(int i=0; i < names.length; i++) {
		//  System.out.print(names[i] +", ");
	  //}	
	  
	  //System.out.println();
	  
	  /*FOR EACH con arrays mejorado
	  declaramos una variable del tipo string i: despues el array  */
	  for(String i: names) {
		  System.out.println("nombres: "+ i);
	  }
	}

}
