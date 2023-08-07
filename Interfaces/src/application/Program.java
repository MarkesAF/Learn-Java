package application;

import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


import model.entities.Invoice;
import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.TaxService;
import model.services.RentalService;
import model.services.BrazilTaxService;


public class Program {
    public static void main(String[]args)throws ParseException{
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        System.out.println("Entre com os Dados do Aluguel");
        System.out.print("Modelo do Carro: ");
        String model = in.nextLine();
        System.out.print("Retirada (dd/MM/yyyy HH/mm): ");
        LocalDateTime start = LocalDateTime.parse(in.nextLine(),dtf);
        System.out.print("Retorno (dd/MM/yyyy HH/mm): ");
        LocalDateTime finish = LocalDateTime.parse(in.nextLine(),dtf);

        CarRental cr = new CarRental(start,finish, new Vehicle(model));

        System.out.print("Entre com preço por Hora: ");
        double pricePerHour = in.nextDouble();
        System.out.print("Entre com preço por Dia: ");
        double pricePerDay = in.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour,pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println("FATURA:");
        System.out.println("Pagamento basico: "+String.format("%.2f",cr.getInvoice().getBasicPayment()));
        System.out.println("Imposto: "+String.format("%.2f",cr.getInvoice().getTax()));
        System.out.println("Pagamento total: "+String.format("%.2f",cr.getInvoice().getTotalPayment()));
    }
}
