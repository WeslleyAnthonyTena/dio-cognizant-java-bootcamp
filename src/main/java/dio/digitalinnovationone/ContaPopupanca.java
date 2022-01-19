package dio.digitalinnovationone;

public class ContaPopupanca extends Conta{

    public ContaPopupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato Conta Poupanca: ");
        imprimirInfosComuns();
    }

    @Override
    public void imprimirDados() {
        System.out.println("Dados pessoais do cliente conta poupanca: ");
        imprimirDadosPessoais();
    }

}
