public class Emprestimo {

    /**
     * Calcule o valor final de um empréstimo, a partir do valor solicitado. 
     * Taxas e parcelas influenciam. Defina arbitrariamente as faixas que 
     * influenciam nos valores.
     */
    public static int getDuasParcelas() {
        return 2;
    }
    public static int getTresParcelas() {
        return 3;
    }

    public static double getTaxaDois() {
        return 0.5;
    }

    public static double getTaxaTres() {
        return 0.8;
    }
    

    public static void calculoEmprestimo(int i, int parcela) {

        
        if (parcela == 1) {
            System.out.println("Sem taxa R$ " + i);
        } else if (parcela == 2) {
            double valorFinal = i + (i * getTaxaDois());
            System.out.println("Taxa duas parcelas R$: " + valorFinal);
        } else if (parcela == 3) {
            double valorFinal = i + (i * getTaxaTres());
            System.out.println("Taxa três parcelas R$: " + valorFinal);
        } else {
            System.out.println("Parcela não aceita!");
        }

     }
   
    
}
