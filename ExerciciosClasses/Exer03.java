import java.util.Scanner;

import model.Retangulo;


public class Exer03 {
    public static void main(String[] args) {
        float comprimento, largura;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do comprimento do rentagulo: ");
        comprimento = sc.nextFloat();
        System.out.println("Digite o valor de largura do retangulo: ");
        largura = sc.nextFloat();

        Retangulo r = new Retangulo(comprimento, largura);

        System.out.println("Área: " + r.area());
        System.out.println("Perimetro: " + r.perimentro());

        sc.close();    
    }
    
}
