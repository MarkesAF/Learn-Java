package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Employee;

public class ProgEmployee {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.name = in.next();
        System.out.print("Gross Salary: ");
        emp.grossSalary = in.nextDouble();
        System.out.print("Tax: ");
        emp.tax = in.nextDouble();

        System.out.println();
        System.out.println("Employee: "+emp);
        System.out.println();
        System.out.print("Wich percentage to Increase salary: ");
        double percentage = in.nextDouble();
        emp.increaseSalary(percentage);

        System.out.println();
        System.out.println("Updated data: "+emp);
    }
}
