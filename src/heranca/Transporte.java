package heranca;

public class Transporte {
    private String nome;
    private String marca;
    private String modelo;
    private String cor;
    private int capacidade;
    private double custoManutencao;
    private int anoFabricacao;
    private boolean isOn;
    private double preco;

    public void setCustoManutencao(double custoManutencao) {
        this.custoManutencao = custoManutencao;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public double getCustoManutencao() {
        return custoManutencao;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public boolean isOn() {
        return isOn;
    }
    public double getPreco(){
        return preco;
    }

    public Transporte(String nome, String marca, String modelo, int anoFabricacao, boolean isOn, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.isOn = isOn;
        this.preco = preco;


    }
    public void ligar(){
        this.isOn = true;
        System.out.println("Ligando os motores");
    }
    public void desligar() {
        this.isOn = false;
        System.out.println("Desligando motores");
    }
    public void acelerar(){

    }
    public void frear(){
        System.out.println("Freando");
    }
    public double calcularSeguro(){
        return preco*0.1;
    }
}

