package application;

import java.util.Scanner;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;

import entities.TaxPayer;
import entities.Company;
import entities.Individual;

public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Tax payer #"+i+" Data:");
            System.out.print("Individual or Company (i/c)? ");
            char response = in.next().charAt(0);
            System.out.print("Name: ");
            String name =  in.next();
            System.out.print("Anual Income: ");
            double anual = in.nextDouble();
            if(response == 'i'){
                System.out.print("Health Expenditures: ");
                double healthExpenditures = in.nextDouble();
                list.add(new Individual(name,anual,healthExpenditures));
            }else{
                System.out.print("Number of Employees: ");
                int employees = in.nextInt();
                list.add(new Company(name,anual,employees));
            }
        }
        System.out.println();
        System.out.println("TAXES PAID:");
        double sum = 0.0;
        for(TaxPayer tp : list){
            System.out.println(tp.getName() + ": $"+String.format("%.2f",tp.tax()));
            sum = sum + tp.tax();
        }
        System.out.println();
        System.out.println("Total TAXES = $"+String.format("%.2f",sum));
    }
}
