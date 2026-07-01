package heranca;

public class Carro extends Transporte{
    private final int LIMITE_VELOCIDADE = 200;

    public Carro(String nome, String marca, String modelo, int anoFabricacao, boolean isOn, double preco) {
        super(nome, marca, modelo, anoFabricacao, isOn, preco);
    }


    @Override
    public void acelerar() {
        System.out.printf("A velocidade maxima deste carro é de {}km/h",LIMITE_VELOCIDADE);
        super.acelerar();
    }

    }




