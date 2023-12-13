public class OperacionesComunes {
 
    public static void main(String[] args){
     
        // elemnto maximo o minimo de un array
        int[] notas = new int[5];
        int notaMax = notas[0]; // tomamos el primer elemento como maximo

        for(int i=0; i<notas.length; i++){
           if(notas[i] > notaMax){
              notaMax = notas[i];
           }
        }


    }
}
