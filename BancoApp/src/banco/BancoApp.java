package banco;

// Exemplo de uso no main
public class BancoApp {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente("12345-6", 1000.0, 500.0);
        Conta cp = new ContaPoupanca("98765-4", 2000.0);

        cc.exibirInfo();
        System.out.println("-----");
        cp.exibirInfo();

        System.out.println("\nDepositando R$ 500 na conta corrente...");
        cc.depositar(500);
        cc.exibirInfo();

        System.out.println("\nSacando R$ 1700 da conta corrente...");
        cc.sacar(1700);
        cc.exibirInfo();

        System.out.println("\nTransferindo R$ 300 da poupança para a conta corrente...");
        cp.transferir(cc, 300);

        System.out.println("\nSaldo final:");
        cc.exibirInfo();
        cp.exibirInfo();
    }
}
