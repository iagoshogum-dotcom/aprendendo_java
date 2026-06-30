import heranca.Conta;
import heranca.ContaCorrente;
import heranca.ContaPoupança;

public class Banco {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(1001,8468468,"Iago",50.00,true);
        Conta cp = new ContaPoupança(1001,645564,"Jose",100.00,true);

        System.out.println("=".repeat(25));
        System.out.println("Conta Corrente");
        System.out.printf("Saldo Inicial CC: %.2f\n", cc.getSaldo());
        cc.depositar(950);
        cc.sacar(500);
        System.out.printf("Saldo Final CC: %.2f\n", cc.getSaldo());

        System.out.println("=".repeat(25));
        System.out.println("Conta Poupança");
        System.out.printf("Saldo Inicial CP: %.2f\n", cp.getSaldo());
        cp.depositar(900);
        cp.sacar(500);
        System.out.printf("Saldo Final CP: %.2f", cp.getSaldo());

    }

}
