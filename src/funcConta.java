public interface FuncConta {

    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, FuncConta contaDestino);
    void imprimirExtrato();

}
