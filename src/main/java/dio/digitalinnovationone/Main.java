package dio.digitalinnovationone;

public class Main {
    public static void main(String[] args) {
        Cliente dados = new Cliente();
        dados.setNome("Weslley");
        dados.setEndereco("Avenida Tiradentes, 12");
        dados.setEmail("weslley@dio.com");
        dados.setTelefone("43999887766");

        Conta cc = new ContaCorrente(dados);
        Conta poupanca = new ContaPopupanca(dados);

        cc.depositar(100.0);
        cc.transferir(100, poupanca);
        poupanca.depositar(500.0);
        poupanca.transferir(100, cc);

        cc.imprimirExtrato();
        cc.imprimirDadosPessoais();
        separacaoConta();
        poupanca.imprimirExtrato();
        poupanca.imprimirDadosPessoais();
    }

    protected static void separacaoConta() {
        System.out.println("---------------------------------");
    }
}

