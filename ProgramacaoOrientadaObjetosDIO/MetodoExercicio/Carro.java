package ProgramacaoOrientadaObjetosDIO.MetodoExercicio;

public class Carro {
       
        // Atributos.
        String cor;
        String modelo;
        double capacidadeTanque;

        // Construtor.
        Carro() {

        }

        Carro(String cor, String modelo, int capacidadeTanque) {
            this.cor = cor;
            this.modelo = modelo;
            this.capacidadeTanque = capacidadeTanque;
        }

        // Gets e sets.
        public String getCor() {
            return cor;
        }
        public void setCor(String cor) {
            this.cor = cor;
        }
        public String getModelo() {
            return modelo;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
        public double getCapacidadeTanque() {
            return capacidadeTanque;
        }
        public void setCapacidadeTanque(int capacidadeTanque) {
            this.capacidadeTanque = capacidadeTanque;
        }
        
        // Métodos.
        double totalValorTanque(double valorCombustivel) {
            return capacidadeTanque = valorCombustivel;
        }
    
    
}
