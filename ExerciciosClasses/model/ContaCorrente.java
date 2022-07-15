package model;

import java.util.ArrayList;

public class ContaCorrente {
    private int numConta;
    private String nome;
    private float saldo;

    ArrayList<ContaCorrente> cc = new ArrayList<ContaCorrente>();
    
    public ContaCorrente(int numConta, String nome, float saldo) {
        this.numConta = numConta;
        this.nome = nome;
        this.saldo = saldo;
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

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public static int size() {
        return 0;
    }


    // deposito:
    public void deposito(float valor) {
        this.saldo += valor;
    }
    
}
