package dio.digitalinnovationone;

public class ContaCorrente extends Conta {


    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Corrente: ");
        imprimirInfosComuns();
    }

    @Override
    public void imprimirDados() {
        System.out.println("Dados pessoais do cliente conta corrente: ");
        imprimirDadosPessoais();

    }
}