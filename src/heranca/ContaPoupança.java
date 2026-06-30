package heranca;

public class ContaPoupança extends Conta{
    public ContaPoupança(int agencia, int numeroConta, String titularConta, double saldo, boolean isActive) {
        super(agencia, numeroConta, titularConta, saldo, isActive);
    }

    @Override
    public void depositar(double valor) {
        double renda = (getSaldo()+valor)*0.01;
        super.depositar(valor+renda);
    }
}
