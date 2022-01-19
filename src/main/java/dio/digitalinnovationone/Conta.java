package dio.digitalinnovationone;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(Double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(Double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d ", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        System.out.println(" ");
    }

    protected void imprimirDadosPessoais() {
        System.out.println("Dados pessoais do cliente: ");
        System.out.println(String.format("Nome: " + cliente.nome));
        System.out.println(String.format("Endereço: " + cliente.endereco));
        System.out.println(String.format("Email: " + cliente.email));
        System.out.println(String.format("Telefone: " + cliente.telefone));


    }

}

