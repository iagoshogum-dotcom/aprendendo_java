package model;

public class Caneta {

    //Atribute
    private String cor;
    private double ponta;
    private boolean tampada;
    private boolean carga;
    private String material;

    //Constructor
    //vazio
    public Caneta() {}
    //parametro
    public Caneta(String cor, double ponta, boolean tampada, boolean carga, String material) {
        this.cor = cor;
        this.ponta = ponta;
        this.tampada = tampada;
        this.carga = carga;
        this.material = material;
    }

    //Getters
    public String getCor() {
        return cor;
    }

    public double getPonta() {
        return ponta;
    }

    public boolean isTampada() {
        return tampada;
    }

    public boolean isCarga() {
        return carga;
    }

    public String getMaterial() {
        return material;
    }

    // Setters

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void setCarga(boolean carga) {
        this.carga = carga;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}

