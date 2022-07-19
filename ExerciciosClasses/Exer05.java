import java.util.ArrayList;
import java.util.Scanner;

import model.Conta;

public class Exer05 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Conta> contas;
    public static void main(String[] args) {

        contas = new ArrayList<Conta>();
        telaInicial();
    
    } 

    public static void telaInicial() {
        
        System.out.println("\n********* Menu principal *********");
        System.out.println("1- Cadastrar Conta:");
        System.out.println("2- Alterar Nome da conta");
        System.out.println("3- Depósito");
        System.out.println("4- Saque");
        System.out.println("5- Exibir");
        System.out.println("0- Sair");

        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                criarConta();
                break;
            case 2:
                mudarNome();
                break;
            case 3:
                depositar();
                break;
            case 4:
                sacar();
                break;
            case 5:
                exibir();
                break;
            case 0:
                System.out.println("********* Encerrado! *********");
                System.exit(0);
            default:
                System.out.println("********* Opção inválida! *********");
                telaInicial();
                break;
        }        
    }

    // Cadastrar conta;
    public static void criarConta() {
        sc.nextLine();
        System.out.println("\nNome: ");
        String nome = sc.nextLine();
        

        Conta conta = new Conta(0, nome);
        contas.add(conta);
        System.out.println("Conta criada");

        telaInicial();
    }

    private static Conta encontrarConta(int numeroConta) {
        Conta conta = null;
        if (contas.size() > 0) {
            for(Conta c: contas) {
                if (c.getNumConta() == numeroConta) {
                    conta = c;
                }                   
            }     
        }
        return conta;
    }

    // Alterar nome da conta;
    public static void mudarNome() {
        sc.nextLine();
        System.out.println("Digite o Nome que deseja alterar:");
        String mudarNome = sc.nextLine();
        System.out.println("Digite o novo nome:");
        String novo = sc.nextLine();
        for (int i = 0; i < contas.size(); i++) {
            if (contas.get(i).getNome().equals(mudarNome)) {
                contas.get(i).setNome(novo);
              } 
        }
        telaInicial();
    }

    // depositar;
    public static void depositar() {
        System.out.println("Número da conta: ");
        int numeroConta = sc.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if (conta != null) {
            System.out.println("Valor para depositar:");
            Double valorDeposito = sc.nextDouble();
            conta.depositar(valorDeposito);
            System.out.println("Valor depositado!");
        } else {
            System.out.println("conta não encontrada");
        }
        telaInicial();  
    }

    // sacar;
    public static void sacar() {
        System.out.println("Número da conta: ");
        int numeroConta = sc.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if (conta != null) {
            System.out.println("Valor para sacar:");
            Double valorSaque = sc.nextDouble();
            conta.sacar(valorSaque);
        } else {
            System.out.println("conta não encontrada");
        }
        telaInicial();  
    }

    // exibir todos os cadastros;
    public static void exibir() {
        if (contas.size() > 0) {
            for(Conta conta: contas) {
                System.out.println(conta);
            }
        } else {
            System.out.println("Não há contas cadastradas");
        }
        telaInicial();
    }
}
