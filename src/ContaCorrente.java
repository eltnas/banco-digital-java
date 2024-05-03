public class ContaCorrente extends Conta {

    @Override
    public void imprimirExtrato(){
        System.out.println("========== Extrato ==========");
        super.imprimirInfos();
        System.out.println("\n\n");
        
    }
}
