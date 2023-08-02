package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyCoverter;

public class ProgDolar {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        CurrencyCoverter cv = new CurrencyCoverter();

        System.out.print("What is the dollar price: ");
        cv.dolar = in.nextDouble();
        System.out.print("How many dollars will be bought: ");
        double amount = in.nextDouble();
        System.out.printf("Amount to paid in reais: %.2f",cv.coverter(amount));
    }
}
