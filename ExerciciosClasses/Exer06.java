import model.TV;
public class Exer06 {
   
    
    public static void main(String[] args) { 
        /**
         * Exer06: Classe TV: Faça um programa que simule um televisor criando-o como um objeto. 
         * O usuário deve ser capaz de informar o número do canal e aumentar ou diminuir o volume.
         * Certifique-se de que o número do canal e o nível do volume permanecem dentro de faixas válidas.
         */
        TV tv = new TV();
        System.out.println(tv.toString());
        tv.setCanal(10);
        System.out.println(tv.toString());
        tv.aumentarVolume();
        System.out.println(tv.toString());
        tv.diminuirVolume();
        System.out.println(tv.toString());
         

    }

}