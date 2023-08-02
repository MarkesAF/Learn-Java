package application;

import java.util.Scanner;
import java.util.Locale;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

import model.entities.HourContract;
import model.entities.Department;
import model.entities.Worker;
import model.enums.WorkerLevel;

public class Program{
    public static void main(String[]args)throws ParseException{
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter departament's name: ");
        String departmentName = in.nextLine();
        System.out.println("Enter worker Data:");
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("Level: ");
        String workerLevel = in.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = in.nextDouble();

        Worker worker = new Worker(name,WorkerLevel.valueOf(workerLevel),baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("Enter contract #"+i+" data:");
            System.out.print("Date (dd/MM/yyyy): ");
            Date date = sdf.parse(in.next());
            System.out.print("Value per Hour: ");
            double valuePerHour = in.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = in.nextInt();

            HourContract contract = new HourContract(date, valuePerHour, hours);

            worker.addContract(contract);
        }
        System.out.println();
        System.out.print("Enter month and year to calculate income(MM/yyyy): ");
        String monthAndYear = in.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: "+worker.getName());
        System.out.println("Department: "+worker.getDepartment().getName());
        System.out.println("Income for "+monthAndYear+ ": "+String.format("%.2f",worker.income(month,year)));

    }
}
