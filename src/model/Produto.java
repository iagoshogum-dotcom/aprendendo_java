package model;

public class Produto {
    //Atributos
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private String tamanho;

    //Construtor
    public Produto(String nome,double preco,int quantidadeEstoque,String tamanho){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.tamanho = tamanho;
    }

    //Metodos
    public void mostrarEstoque(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Preço: "+this.preco);
        System.out.println("Quantidade em Estoque: "+this.quantidadeEstoque);
        System.out.println("Tamanho: "+this.tamanho);
    }
    public int adicionarEstoque(int quatidade){
        this.quantidadeEstoque += quatidade; //Atualiza valor de estoque
        return this.quantidadeEstoque; //Retorna valor de estoque atualizado
    }
}
