public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato(){
        System.out.println("========== Extrato conta Poupanca ==========");
        super.imprimirInfos();
        System.out.println("\n\n");
        
    }
}