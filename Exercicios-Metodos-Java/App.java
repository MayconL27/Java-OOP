public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Exercício calculadora");
        Calculadora.calcularNumeros(20, 2);

        System.out.println("*********");

        System.out.println("Exercício Hora dia");
        HoraDia.horaDia(5);

        System.out.println("*********");

        System.out.println("Exercício Emprestimo");
        Emprestimo.calculoEmprestimo(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calculoEmprestimo(1000, Emprestimo.getTresParcelas());
        Emprestimo.calculoEmprestimo(1000, 10);



    }
}
