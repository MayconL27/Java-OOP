package model;

public class Quadrado {
    private float tamanhoLado;



    public Quadrado (float tamanhoLado) {
        this.tamanhoLado = 50f;
    }
    public void MudarValorLado (float tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }
    public float retornarValorLado () {
        return tamanhoLado;
    }
    public float CalcularArea () {
        return this.tamanhoLado * this.tamanhoLado;

    }


    
}
