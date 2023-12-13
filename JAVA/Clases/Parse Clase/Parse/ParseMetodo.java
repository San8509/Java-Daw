package Parse Clase;

public class ParseMetodo {
    public static void main(String[] args) {
        
        //convierte una cadena de texto en un número, parseInt() puede tener uno o dos argumentos
        int x = Integer.parseInt("12");
        double c = Double.parseDouble("12");
        int b = Integer.parseInt("100",2);

        System.out.println(Integer.parseInt("12"));
        System.out.println(Double.parseDouble("12"));
        System.out.println(Integer.parseInt("100",2));
        System.out.println(Integer.parseInt("101", 8));  



    }
}
