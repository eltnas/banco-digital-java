public abstract class Conta implements funcConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int numAgencia;
    protected int numConta;
    protected double saldo;

    

    public Conta(){
        this.numAgencia = Conta.AGENCIA_PADRAO;
        this.numConta = SEQUENCIAL++;
    }

    @Override
    public void sacar(double valor) {
        // TODO Gerar a função de saque
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        // TODO Gerar a função de deposito
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        // TODO Gerar a função de transferencia
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getnumConta() {
        return numConta;
    }

    public void setnumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    protected void imprimirInfos() {
        System.out.println(String.format("Agencia: %d", this.numAgencia));
        System.out.println(String.format("Conta: %d", this.numConta));
        System.out.println(String.format("saldo: %.2f", this.saldo));
    }
}
