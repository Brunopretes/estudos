public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
        //TODO Auto-generated constructor stub
    }

    public void imprimirExtrato(){
        System.out.println("--- Extrato conta corrente ---");
        super.imprimirInfComuns();
    }       
}