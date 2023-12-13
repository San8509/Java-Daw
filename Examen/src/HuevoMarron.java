import java.util.Random;

public class HuevoMarron {
    
     public static int Numeros(int[] numbers){
           Random r = new Random();
       numbers = new int[10];
       int valores=0;

       for(int i = 0; i < numbers.length; i++){
         valores = r.nextInt(3);
         numbers[i] = valores;
         System.out.print(numbers[i]);
      } 
        return numbers.length;
     }

    public static void main(String[] args) {
        
        boolean marron; int[] numbers={};
        
        Numeros(numbers);
        System.out.println(numbers);

        for(int i = 1; i < numbers.length -1; i++) {

           if (i == 1){
            if(i+1==2 && i-1==2){
               System.out.println("marron");
           }
         } 
      } 
    }
}
