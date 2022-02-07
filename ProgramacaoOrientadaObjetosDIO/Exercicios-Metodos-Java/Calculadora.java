public class Calculadora {

    /**Calcule as 4 operações básicas: 
     * soma, subtração, multiplicação e divisão.
     * Sempre 2 valores devem ser passados. */

    public static void calcularNumeros(double num1, double num2){
     
        double soma = num1 + num2;
        System.out.println("Subtração: " + soma);

        double sub = num1 - num2;
        System.out.println("Adição: " + sub);

        double mult = num1 * num2;
        System.out.println("Multiplicação: " + mult);

        double div = num1 / num2;
        System.out.println("Divisão: " + div);
    }
    
}
