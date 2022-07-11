package model;

public class Retangulo {
    private float comprimento;
    private float largura;

    // Constructor
    public Retangulo(float comprimento, float largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float area() {
        return getComprimento() * getLargura();
    }
    
    public float perimentro() {
        return (2 * getComprimento()) + (2 * getLargura());
    }
}
