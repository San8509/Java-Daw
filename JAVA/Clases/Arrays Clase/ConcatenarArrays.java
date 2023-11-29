import java.util.Arrays;
import java.util.stream.Stream;

public class ConcatenarArrays {
    
    public static void main(String[] args) {
     
    // STREAM .... como concatenar arrays de strings  
      String[] ar1={"h","o","l","a"};
      String[] ar2={" m","u","n","d","o"};
      String[] ar3={" q","u","e","d","o","1"};

    // concatenar con el uso de la interface STREAM  creando un nuevo array
      String[] result = Stream.of(ar1, ar2, ar3).flatMap(Stream::of).toArray(String[]::new);
      
      System.out.println(Arrays.toString(result));  



    // ARRAYCOPY(); ... concatenar con el uso del metodo arrayCopy();
    // creo un nuevo array de longitud igual a la suma de las longitudes de los q quieres concatenar
     String[] ar0={"h","o","l","a"};
      String[] ar9={" m","u","n","d","o","2"};
      String[] res = new String[ ar0.length + ar9.length ];
      
    //Los guardas en el nuevo array:
      System.arraycopy( ar0, 0, res, 0, ar0.length );
      System.arraycopy( ar9, 0, res, ar0.length, ar9.length );

      System.out.println(Arrays.toString(res));
    /* Los parámetros que recibe arrayCopy() son:
      Array de origen... ar1
      Posición inicial del array origen... 0
      Array destino... res
      Posición incial en el array de destino... 0
      Número de elementos a copiar... ar1.length que es la longitud del array inicial
    */  



    // Concatenar con BUCLES  
      String[] ar4={"h","o","l","a"};
      String[] ar5={"m","u","n","d","o","3"};
      String[] ar6 = new String[ar4.length + ar5.length];
 
    // declaro la variable fuera del loop para poder usarla fuera del bucle
      int i = 0;
      for (i = 0; i < ar4.length; i++ ){
          ar6[i] = ar4[i];

      }
      for (int a = 0; a < ar5.length; a++ ){
          ar6[i] = ar5[a];
          i++;
      }
    // mostrar la concatenacion de las cadenas 
    System.out.println(Arrays.toString(ar6));
    }
}
