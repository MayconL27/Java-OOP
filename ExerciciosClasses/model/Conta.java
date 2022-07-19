package model;

public class Conta {

    private static int contadorDeContas = 1;

    private int numConta;
    private String nome;
    private Double saldo = 0.0;


    public Conta(int numConta, String nome) {
        this.numConta = contadorDeContas;
        this.nome = nome;
        contadorDeContas += 1;
    }

    

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public static int size() {
        return 0;
    }

    public String toString() {
        return "\nNome: " + this.getNome() + 
                "\nnumConta: " + this.getNumConta() +
                "\nsaldo: " + this.getSaldo();
        
    }


    // deposito:
    public void depositar(Double valorDeposito) {
        if(valorDeposito > 0) {
            setSaldo(getSaldo() + valorDeposito);
            System.out.println("********* Seu depósito foi realizado! *********");
        } else {
            System.out.println("********* Valor negado *********");
        }
    }

    // Saque:
    public void sacar(Double valorSaque) {
        if(valorSaque > 0 && this.getSaldo() >= valorSaque) {
            setSaldo(getSaldo() - valorSaque);
            System.out.println("********* Saque realizado! *********");
        } else {
            System.out.println("********* Saque não realizado *********");
        }      
    }
    
}

