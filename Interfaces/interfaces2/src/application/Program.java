package application;

import java.text.ParseException;
import java.util.Scanner;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import entities.Installment;
import entities.Contract;
import services.ContractService;
import services.OnlinetPaymentService;
import services.PayPalService;


public class Program {
    public static void main(String[]args)throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");
        System.out.print("Numero: ");
        int number = in.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(in.next(),dtf);
        System.out.print("Valor do contrato: ");
        double totalValue = in.nextDouble();

        Contract obj = new Contract(number,date,totalValue);

        System.out.print("Entre com o numero de parcelas: ");
        int n = in.nextInt();

        ContractService contractService = new ContractService(new PayPalService());

        contractService.processContract(obj,n);

        System.out.println("Parcelas:");
        for(Installment installment: obj.getInstallments()){
            System.out.println(installment);
        }
    }
}
