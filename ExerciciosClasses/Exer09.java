import model.Ponto;
import model.RetanguloExer09;

public class Exer09 {
    public static void main(String[] args) {
        /** Exer09:
         * Classe Ponto e Retangulo: Faça um programa completo utilizando funções e classes que:
         *     a. Possua uma classe chamada Ponto, com os atributos x e y.
         *     b. Possua uma classe chamada Retangulo, com os atributos largura e altura.
         *     c. Possua uma função para imprimir os valores da classe Ponto.
         *     d. Possua uma função para encontrar o centro de um Retângulo.
         *     e. Você deve criar alguns objetos da classe Retangulo.
         *     f. Cada objeto deve ter um vértice de partida, por exemplo, o vértice inferior esquerdo 
         *       do retângulo, que deve ser um objeto da classe Ponto.
         *     g. A função para encontrar o centro do retângulo deve retornar o valor para um objeto do 
         *        tipo ponto que indique os valores de x e y para o centro do objeto.
         *     h. O valor do centro do objeto deve ser mostrado na tela.
         *     i. Crie um menu para alterar os valores do retângulo e imprimir o centro deste retângulo. 
         * */

       
        
        Ponto p1 = new Ponto(10,20);
        Ponto p2 = new Ponto(20,50);
        RetanguloExer09 r = new RetanguloExer09(p1,p2);
        System.out.println(r.centro());

    }
}
