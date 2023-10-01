package entities;



//Augusto Ferreira Marques - DS3P41 - N846844
//Pedro Andrade - DS3P41
//Renan Almeida - DS3P41 


public abstract class Veiculo {

    private String modelo;
    private int ano;
    private Double preco;

    public Veiculo(){
    }

    public Veiculo(String modelo,int ano, Double preco){
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public abstract void exibirDetalhes();

}
