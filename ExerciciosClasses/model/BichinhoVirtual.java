package model;

public class BichinhoVirtual {

    private String nome;
    private int fome;
    private int saude;
    private int idade;
    

    public BichinhoVirtual(String nome, int fome, int saude, int idade) {
        this.nome = nome;
        this.fome = fome;
        this.saude = saude;
        this.idade = idade;  
    }

    public int humor() {
        return getFome() + getSaude();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getFome() {
        return fome;
    }
    public void setFome(int fome) {
        this.fome = fome;
    }
    public int getSaude() {
        return saude;
    }
    public void setSaude(int saude) {
        this.saude = saude;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "BichinhoVirtual [fome=" + fome + ", idade=" + idade + ", nome=" + nome + ", saude=" + saude + "]";
    }

    
    
}
