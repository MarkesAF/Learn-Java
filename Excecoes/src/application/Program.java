package application;

import java.util.Locale;
import java.util.Scanner;




import entities.Account;
import exceptions.BusinessExceptions;

public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        System.out.println("Enter account data:");
        System.out.print("Number: ");
        int number = in.nextInt();
        System.out.print("Holder: ");
        String holder = in.next();
        System.out.print("Initial balance: ");
        double balance = in.nextDouble();
        System.out.print("WithDraw Limit: ");
        double wdLimit = in.nextDouble();

        Account acc = new Account(number,holder,balance,wdLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = in.nextDouble();
        try{
            acc.withDraw(amount);
            System.out.printf("New Balance: %.2f",acc.getBalance());
        }catch(BusinessExceptions  e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
