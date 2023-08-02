package application;

import java.util.Scanner;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

import model.entities.OrderItems;
import model.entities.OrderStatus;
import model.entities.Order;
import model.entities.Product;
import model.entities.Client;

public class Program {
    public static void main(String[]args)throws ParseException{
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("Email: ");
        String email = in.nextLine();
        System.out.print("Birth Date (dd/MM/yyyy): ");
        Date date = sdf.parse(in.next());

        Client client = new Client(name,email,date);

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus orderStatus = OrderStatus.valueOf(in.next());

        Order order = new Order(new Date(),orderStatus,client);

        System.out.println("How many items to the Order? ");
        int n = in.nextInt();
        for(int i = 1;i<=n;i++){
            System.out.println("Enter the #"+i+" item data:");
            System.out.print("Product name: ");
            String product = in.next();
            System.out.print("Product price: ");
            double price = in.nextDouble();
            Product prod = new Product(product,price);

            System.out.print("Quantity: ");
            int quantity = in.nextInt();
            OrderItems items = new OrderItems(quantity, price, prod);

            order.addItem(items);
        }
        System.out.println();
        System.out.println("SUMMARY:");
        System.out.println(order);
    }
}
