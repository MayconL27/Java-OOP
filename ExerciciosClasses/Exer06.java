import java.util.Scanner;

import model.TV;

public class Exer06 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        /**
         * Exer06: Classe TV: Faça um programa que simule um televisor criando-o como um objeto. 
         * O usuário deve ser capaz de informar o número do canal e aumentar ou diminuir o volume.
         * Certifique-se de que o número do canal e o nível do volume permanecem dentro de faixas válidas.
         */

         ControleRemoto();

    }

    public static void ControleRemoto() {

        System.out.println("\n********* CONTROLE REMOTO *********");
        System.out.println("1 - Informar número do canal.");
        System.out.println("2 - aumentar/diminuir o volume.");
        System.out.println("0 - Sair");
        int opc = sc.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Informe o número do canal:");
                
                break;
            case 2:
                System.out.println("Deseja diminuir ou aumentar?");
                break;
            case 0:
                System.out.println("********* Encerrado! *********");
                System.exit(0);
                break;
        
            default:
                System.out.println("********* Opção inválida! *********");
                ControleRemoto();
                break;
        }    
    }

    // Validando canal;
    public void validarCanal(int canalValid) {
        if ((canalValid > 0) && (canalValid <= 100)) {
            System.out.println("Canal:" + canalValid);
        } else {
            System.out.println("Canal não existe");
        }
    }
    
    public void mudarCanal(int mudarCanal) {
        validarCanal(mudarCanal);

    }
}