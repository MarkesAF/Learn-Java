package entities;


//Augusto Ferreira Marques - DS3P41 - N846844
//Pedro Andrade - DSS3P41
//Renan Almeida - DS3P41

public class Moto extends Veiculo{
    private Integer cilindradas;


    public Moto(){
    }
    public Moto(String modelo, int ano, Double preco, Integer cilindradas){
        super(modelo,ano,preco);
        this.cilindradas = cilindradas;
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Moto: " + getModelo());
        System.out.println("Ano: " + getAno());
        System.out.println("Cilindradas: "+ cilindradas);
        System.out.println("Preço: " + getPreco());


    }
}
