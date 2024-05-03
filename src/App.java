public class App {
    public static void main(String[] args) throws Exception {
        Conta cc = new ContaCorrente();
        Conta poup = new ContaPoupanca();

        cc.imprimirExtrato();
        poup.imprimirExtrato();
    }
}
