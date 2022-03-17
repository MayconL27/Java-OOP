import model.Bola;

public class Exer01 {
    public static void main(String[] args) {
        
        /** 1.Classe Bola: Crie uma classe que modele uma bola:
         * Atributos: Cor, circunferência, material
         * Métodos: trocaCor e mostraCor */
        Bola b = new Bola(null);
        System.out.println(b.mostrarCor());
        b.trocaCor("Preta");
        System.out.println("Trocou para: " + b.mostrarCor());
    }  
}
