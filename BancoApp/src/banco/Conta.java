package banco;

// Classe abstrata Conta: representa a ideia geral de uma conta bancária
public abstract class Conta {
    private String numeroConta;
    private double saldo;

    public Conta(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    // Métodos encapsulados para alterar saldo
    protected void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    protected boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }
    }

    // Transferência entre contas do mesmo banco
    public boolean transferir(Conta destino, double valor) {
        if (this.sacar(valor)) {
            destino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }

    // Método abstrato para exibir informações específicas
    public abstract void exibirInfo();
}
