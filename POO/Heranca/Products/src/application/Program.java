package application;

import java.util.Locale;
import java.text.ParseException;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.ArrayList;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
    public class Program {
        public static void main(String[]args)throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of Products: ");
        int n = in.nextInt();
        for(int i = 1;i<=n;i++){
            System.out.println("Product #"+i+" Data: ");
            System.out.print("Common, Used or Imported (c/u/i)? ");
            char response = in.next().charAt(0);
            System.out.print("Name: ");
            String name = in.next();
            System.out.print("Price: ");
            double price = in.nextDouble();
            if(response == 'c'){
                list.add(new Product(name, price));
            }else if(response == 'u'){
                System.out.print("Manufacture date (dd/MM/yyyy): ");
                LocalDate manuDate = LocalDate.parse(in.next(),DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name,price,manuDate));
            }else{
                System.out.print("Customs Fee: ");
                double customsFee = in.nextDouble();
                list.add(new ImportedProduct(name,price,customsFee));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS:");
        for(Product prod : list){
            System.out.println(prod.priceTag());
        }
        in.close();
    }
}
