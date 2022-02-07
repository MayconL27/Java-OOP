package ProgramacaoOrientadaObjetosDIO.MetodoExercicio;

public class App {
    public static void main(String[] args) {
        
        // instanciar objeto
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("BMW");
        carro1.setCapacidadeTanque(100);

        System.out.println("Carro 1");
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Capacidade: " + carro1.getCapacidadeTanque());
        System.out.println("ValorTanque: " + carro1.totalValorTanque(11.30));
        

        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C ", 66);
        
        System.out.println("Carro 2");
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Capacidade: " + carro2.getCapacidadeTanque());
        System.out.println("ValorTanque: " + carro2.totalValorTanque(11.30));


    }
    
}
