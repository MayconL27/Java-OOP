import java.util.Scanner;

import model.Pessoa;

public class Exer04 {
    public static void main(String[] args) {

        String nome;
        int idade;
        float peso, altura;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        nome = sc.nextLine();
        System.out.println("Digite sua idade:");
        idade = sc.nextInt();
        System.out.println("Digite seu peso:");
        peso = sc.nextFloat();
        System.out.println("Digite sua altura:");
        altura = sc.nextFloat();
        Pessoa p = new Pessoa(nome, idade, peso, altura);

        p.envelhecer(1);
        p.engordar(10);
        p.crescer(10);

        System.out.println(p.info());

        sc.close();
    } 
}
