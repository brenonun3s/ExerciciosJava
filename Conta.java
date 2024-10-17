import java.util.Scanner;

public class Conta {
    private int numeroConta;
    private String nomeCliente;
    private double valorInicial;
    private double saldo;
    Scanner sc = new Scanner(System.in);

    public Conta(int numeroConta, String nomeCliente) {
    }

    public Conta() {

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getValorInicial() {
        return valorInicial;
    }

    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double escolhaSaldo(double valorInicial) {
        System.out.println("Digite 'sim' para Conta Zerada ou 'nao' para Conta com valor");
        String escolha = sc.nextLine();

        switch (escolha.toLowerCase()) {
            case "sim":
                setValorInicial(0.00);
                System.out.println("Saldo Inicial: " + getValorInicial());
                return getValorInicial();

            case "nao":
                System.out.println("Digite o valor a ser depositado: ");
                double valorDeposito = sc.nextDouble();
                setValorInicial(valorDeposito + getValorInicial());
                System.out.println("Saldo Inicial: " + getValorInicial());
                return getValorInicial();

            default:
                System.out.println("Resposta Invalida");
                return getValorInicial();
        }
    }

    public double depositar(double valorDeposito) {
        System.out.println("Digite o valor a ser depositado na conta: ");
        valorDeposito = sc.nextDouble();
        setSaldo(getSaldo() + valorDeposito);
        return getSaldo();
    }

    public double saque(double valorSaque) {
        System.out.println("Digite o valor que deseja sacar");
        valorSaque = sc.nextDouble();
        setSaldo(getSaldo() - valorSaque);
        double saldoFinal = getSaldo() - 5.00; // Aplicar a taxa de saque
        sc.close(); // Fechar o scanner antes do return
        return saldoFinal;

    }

}
