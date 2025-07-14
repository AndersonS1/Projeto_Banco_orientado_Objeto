package banco;

// Conta Corrente, com possibilidade de limite (exemplo)
public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(String numeroConta, double saldoInicial, double limite) {
        super(numeroConta, saldoInicial);
        this.limite = limite;
    }

    // Sobrescrevendo o método sacar para considerar limite
    @Override
    protected boolean sacar(double valor) {
        if (valor > 0 && getSaldo() + limite >= valor) {
            // Usar saldo e se precisar, usar limite
            double saldoAtual = getSaldo();
            if (saldoAtual >= valor) {
                // Usa só o saldo
                return super.sacar(valor);
            } else {
                // Usa o saldo e parte do limite
                double valorRestante = valor - saldoAtual;
                // Zera o saldo e desconta o valorRestante do limite
                super.sacar(saldoAtual);
                limite -= valorRestante;
                return true;
            }
        } else {
            System.out.println("Saldo + limite insuficiente ou valor inválido.");
            return false;
        }
    }

    @Override
    public void exibirInfo() {
        System.out.println("Conta Corrente Nº: " + getNumeroConta());
        System.out.println("Saldo: R$ " + getSaldo());
        System.out.println("Limite: R$ " + limite);
    }
}
