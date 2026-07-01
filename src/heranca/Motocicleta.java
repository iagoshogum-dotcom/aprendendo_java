package heranca;

public class Motocicleta extends Transporte{
    private final int LIMITE_VELOCIDADE = 160;

    public Motocicleta(String nome, String marca, String modelo, int anoFabricacao, boolean isOn, double preco) {
        super(nome, marca, modelo, anoFabricacao, isOn, preco);
    }

    @Override
    public void acelerar() {
        System.out.printf("A velocidade maxima desta motocicleta é de {}km/h",LIMITE_VELOCIDADE);
        super.acelerar();
    }
    public void colocarCapacete(){
        System.out.println("Colocando Capacete");
    }
}
