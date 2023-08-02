package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Sobrecarga;

public class Program {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Sobrecarga sob = new Sobrecarga();

        System.out.print("Enter account number: ");
        int number = in.nextInt();
        System.out.print("Enter account holder: ");
        String holder = in.next();
        System.out.print("Is there an initial deposit? (y/n): ");
        char response = in.next().charAt(0);
        if(response == 'y'){
            System.out.print("Enter an initial Deposit: ");
            double initialDeposit = in.nextDouble();
            System.out.println();
            System.out.println("Account data: ");
            sob = new Sobrecarga(number, holder, initialDeposit);
            System.out.println(sob);
        }else{
            System.out.println();
            System.out.println("Account data:");
            sob = new Sobrecarga(number, holder);
            System.out.println(sob);
        }
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double deposit = in.nextDouble();
        sob.deposit(deposit);
        System.out.println("Account data:");
        System.out.println(sob);
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withDraw = in.nextDouble();
        sob.withDraw(withDraw);
        System.out.println("Account Data:");
        System.out.println(sob);
    }
}
