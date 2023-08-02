package application;

import java.util.Locale;
import java.util.Scanner;

import entities.StudentGrade;

public class ProgStudent {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        StudentGrade sg = new StudentGrade();

        sg.name = in.next();
        sg.grade1 = in.nextDouble();
        sg.grade2 = in.nextDouble();
        sg.grade3 = in.nextDouble();

        System.out.printf("Final grade: %.2f",sg.finalGrade());
        if(sg.finalGrade() < 60.0){
            System.out.println("Failed");
            System.out.printf("Missing Points: %.2f",sg.missingPoints());
        }else{
            System.out.println("PASS");
        }
    }
}
