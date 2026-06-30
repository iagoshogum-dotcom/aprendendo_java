package heranca;

public class ContaCorrente extends Conta{

    public ContaCorrente(int agencia, int numeroConta, String titularConta, double saldo, boolean isActive){
        super(agencia,numeroConta,titularConta,saldo,isActive);
    }

    @Override
    public void sacar(double valor) {
        double taxaSaque = valor * 0.005;
        super.sacar(valor+taxaSaque);
    }
}
