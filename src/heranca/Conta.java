package heranca;

public class Conta {
    private int agencia;
    private int numeroConta;
    private String titularConta;
    private double saldo;
    private boolean isActive;

    public Conta(int agencia, int numeroConta, String titularConta, double saldo, boolean isActive) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.titularConta = titularConta;
        this.saldo = saldo;
        this.isActive = isActive;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitularConta() {
        return titularConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }
    public void sacar(double valor){
        if (valor <= saldo){
            this.saldo -= valor;
        }else{
            System.out.printf("Saldo insuficiente:\n saldo atual: %.2f",this.saldo);
        }
    }
}
