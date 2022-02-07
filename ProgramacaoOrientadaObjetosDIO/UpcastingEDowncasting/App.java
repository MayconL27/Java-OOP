public class App {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario();

        // Upcasting
        Funcionario gerente = new Gerente();
        Funcionario vendendor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        // Downcasting
        Vendedor vendendor = (Vendendor) new Funcionario();
    }
    
}
