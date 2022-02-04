public class HoraDia {
    //A partir da hora do dia, informe a mensagem adequada: Bom dia, Boa tarde e Boa noite.

    public static void horaDia(int hora) {
        
        if (hora >= 5 && hora <=12 ) {
            System.out.println("Bom dia");
        } else if (hora >= 13 && hora <= 17) {
            System.out.println("Boa tarde");
        } else if (hora >= 18 && hora <=4) {
            System.out.println("Boa noite");
        } else {
            System.out.println("Hora invalido!");
        }

    }
    
}
