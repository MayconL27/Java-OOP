package model;

public class Pessoa {

    private String nome;
    private int idade;
    private float peso, altura;

    public Pessoa(String nome, int idade, float peso, float altura) {
        
        // Atributos.
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // Métodos.

    public void envelhecer(int anos) {
        this.idade += anos;
        if (this.idade < 21) {
            crescer(0.5f);
        }
    }

    public void engordar(float peso) {
        this.peso += peso;
    }

    public void crescer(float altura) {
        this.altura += altura;
    }

    public String info() {
        return "Pessoa: nome= " + nome + ", idade= " +  idade + ", peso= " + peso + ", altura= " + altura;
    } 
    
}
