package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//Augusto Ferreira Marques - DS3P41 - N846844
//Pedro Andrade - DS3P41
//Renan Almeida - DS3P41
public class Concessionaria {

    private List<Veiculo> veiculos = new ArrayList<>();

    Carro carro = new Carro();
    Moto moto = new Moto();
    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void addVeiculos(Veiculo veiculo){
       veiculos.add(veiculo);
    }

    public void listar(){
        for(Veiculo veiculo : veiculos){
            veiculo.exibirDetalhes();
            System.out.println();
        }
    }
    public void aplicarPromocaoEmVeiculosPromocionais(double percentual) {
        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Promocional) {
                Promocional veiculoPromocional = (Promocional) veiculo;
                veiculoPromocional.aplicarDesconto(percentual);
            }
        }
    }
}
