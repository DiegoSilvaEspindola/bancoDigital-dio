public class Main {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente();
        Cliente cli2 = new Cliente();
        Cliente cli3 = new Cliente();

        cli1.setNome("Zé");
        cli2.setNome("Grupo Andrade");
        cli3.setNome("Miguel");

        Conta cc = new ContaCorrente(cli1);
        Conta cp = new ContaPoupanca(cli1);

        cc.depositar(650);
        cc.transferir(450, cp);
        cp.transferir(250, cc);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
