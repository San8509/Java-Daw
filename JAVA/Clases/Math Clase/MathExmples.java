
public class MathExmples{

     public static void main(String[] args) {
      
        // numero elevado a otro
         int a = (int) Math.pow(4, 4); // para usar un entero casteamos a integer
        System.out.println(a);
         int x = (int)Math.abs(2.5);// devuleve el valor absoluto de un numero
        System.out.println(x); 

        //podemos escoger el numero q querramos como potencia, sera el segundo despues de la coma
        double c = Math.pow(2, 4);// debemos usar una variable tipo double
        System.out.println(c);
      
        double b = Math.sqrt(9);// devuelve la raiz cuadrada de un numero
        System.out.println(b);//su variable siempre sera de tipo double

        double y = Math.ceil(5.32);// devuleve el valor mas cercano por arriba
        System.out.println(y);
        y = Math.floor(5.43);// devuleve el valor mas cercano por de bajo
        System.out.println(y);

        double i = Math.round(4.67);// devuelve el entero mas cercano
        System.out.println(i);
        
        double j = Math.random();// devuleve un numero aleatorio entre 0 y 1
        System.out.println(j); // se puede cambiar el rango de valor 

        int q = Math.max(7,9);// devuelve el valor mayor entre dos numeros
        System.out.println(q);
        q = Math.min(6,3);// devuelve el valor menor entre dos numeros

     }
    
}