package application;

import entities.Carro;
import entities.Concessionaria;
import entities.Moto;

//Augusto Ferreira Marques - DS3P41 - N846844
//Pedro Andrade - DS3P41
//Renan Almeida - DS3P41

public class SistemaVendas {
    public static void main(String[]args){


        Carro carro1 = new Carro("Ferrari", 2023, 500000.0, 2, "Gasolina");
        Carro carro2 = new Carro("Toyota Corolla", 2022, 35000.0, 4, "Gasolina");
        Moto moto1 = new Moto("Honda CB500X", 2023, 15000.0, 500);
        Moto moto2 = new Moto("Suzuki GSX-R1000", 2023, 18000.0, 1000);

        Concessionaria concessionaria = new Concessionaria();
        concessionaria.addVeiculos(carro1);
        concessionaria.addVeiculos(carro2);
        concessionaria.addVeiculos(moto1);
        concessionaria.addVeiculos(moto2);

        System.out.println("Lista de Veículos:");
        concessionaria.listar();

        double percentualDesconto = 10.0;
        concessionaria.aplicarPromocaoEmVeiculosPromocionais(percentualDesconto);

        System.out.println("\nLista de Veículos após a promoção de " + percentualDesconto + "% de desconto:");
        concessionaria.listar();
    }
}

