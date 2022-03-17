package model;


public class Bola {

    // Atributos.
    private String cor;
    private int circunferencia;
    private String material;

    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getCircunferencia() {
        return circunferencia;
    }
    public void setCircunferencia(int circunferencia) {
        this.circunferencia = circunferencia;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }

    // Métodos.

    // Construtor:
    public Bola(String cor) {
        this.cor = "Azul";
    }

    public void trocaCor(String cor) {
        this.cor = cor;
    }
    
    public String mostrarCor() {
        return this.cor;
    }
    
}