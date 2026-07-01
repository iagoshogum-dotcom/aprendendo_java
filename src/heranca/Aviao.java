package heranca;

public class Aviao extends Transporte{
    private final int LIMITE_VELOCIDADE = 460;

    public Aviao(String nome, String marca, String modelo, int anoFabricacao, boolean isOn, double preco) {
        super(nome, marca, modelo, anoFabricacao, isOn, preco);
    }

    @Override
    public void acelerar() {
        System.out.printf("A velocidade maxima deste aviao é de {}km/h",LIMITE_VELOCIDADE);
        super.acelerar();
    }
    public void voar (){
        System.out.println("Voando...");
    }
    public void cair (){
        System.out.println("Caindo...");
    }
    public void explodindo (){
        System.out.println("Explodindo BUMMMMMMMMMM!");
    }
}
