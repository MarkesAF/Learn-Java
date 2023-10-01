package entities;

//Augusto Ferreira Marques - DS3P41 - N846844
//Pedro Andrade - DS3P41
//Renan Almeida - DS3P41

public class Carro extends Veiculo implements Promocional{
    private Integer numPortas;
    private String tipoCombustivel;

    public Carro() {
        super();
    }
    public Carro(String modelo, int ano, Double preco, Integer numPortas, String tipoCombustivel){
        super(modelo,ano, preco);
        this.numPortas = numPortas;
        this.tipoCombustivel = tipoCombustivel;
    }

    public Integer getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(Integer numPortas) {
        this.numPortas = numPortas;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Carro: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Preço: " + getPreco());
        System.out.println("Número de Portas: " + numPortas);
        System.out.println("Tipo de Combustível: " + tipoCombustivel);
    }

    @Override
    public double aplicarDesconto(double porcentagem) {
        return getPreco() * porcentagem;
    }
}
