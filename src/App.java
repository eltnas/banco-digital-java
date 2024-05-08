public class App {
    public static void main(String[] args) {
		Cliente elton = new Cliente();
		elton.setNome("Elton");
		
		Conta cc = new ContaCorrente(elton);
		Conta poupanca = new ContaPoupanca(elton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
