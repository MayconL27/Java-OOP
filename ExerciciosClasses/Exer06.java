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

        TV tv = new TV(0, 0);
        System.out.println("\n********* CONTROLE REMOTO *********");
        System.out.println("1 - Informar número do canal.");
        System.out.println("2 - aumentar/diminuir o volume.");
        System.out.println("0 - Sair");
        int opc = sc.nextInt();

        switch (opc) {
            case 1:
                mudarCanal();
                break;
            case 2:
                mudarVol();
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


    // Mudar canal
    public static void mudarCanal() {
        sc.nextLine();
        System.out.println("Informe o número do canal:");
        int canal = sc.nextInt();

        if ((canal > 0) && (canal <= 100)) {
            System.out.println("Canal:" + canal);
            ControleRemoto();
        } else {
            System.out.println("Canal não existe");
            mudarCanal();
        }     
    }

    // Aumentar volume
    public static void mudarVol() {
        sc.nextLine();
        System.out.println("Deseja diminuir ou aumentar? + ou - ");
        String opcVol = sc.nextLine();
        if (opcVol.equalsIgnoreCase("+")) {
            sc.nextLine();
            System.out.println("Aumentar volume para: ");
            int volume = sc.nextInt();
                if ((volume >= 0) && (volume <= 100)) {
                 System.out.println("Volume:" + volume);
                 ControleRemoto();
                 } else {
                    System.out.println("Volume não suportado!");
                    mudarVol();
                 } 
            
            } else if (opcVol.equalsIgnoreCase("-")){
                sc.nextLine();
                System.out.println("Diminuir volume para: ");
                int volume = sc.nextInt();
                if ((volume >= 0) && (volume <= 100)) {
                    System.out.println("Volume: " + volume);
                    ControleRemoto();
                } else {
                    System.out.println("Volume não suportado!");
                    mudarVol();
                }
                
        }          
    }

   
   
}