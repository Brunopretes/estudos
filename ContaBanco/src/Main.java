public class Main {
    public static void main(String[] args) {
        
        Cliente bruno  = new Cliente();
        bruno.setNome("Bruno");


        Conta cc = new ContaCorrente(bruno);
        Conta cp = new ContaPoupanca(bruno);

        cc.depositar(100);
    

        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
