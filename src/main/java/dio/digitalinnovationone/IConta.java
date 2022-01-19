package dio.digitalinnovationone;

public interface IConta {

    void sacar(Double valor);

    void depositar(Double valor);

    void transferir(double valor,  Conta contaDestino);

    void imprimirExtrato();

    void imprimirDados();

}