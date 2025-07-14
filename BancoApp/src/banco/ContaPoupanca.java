package banco;

// Conta Poupança, simples, sem limite
public class ContaPoupanca extends Conta {
    public ContaPoupanca(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public void exibirInfo() {
        System.out.println("Conta Poupança Nº: " + getNumeroConta());
        System.out.println("Saldo: R$ " + getSaldo());
    }
}
