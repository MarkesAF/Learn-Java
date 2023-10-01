package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Rectangle;

public class ProgRectangle {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);

        Rectangle rect = new Rectangle();

        System.out.println("Enter rectangle width and height ");
        rect.width = in.nextDouble();
        rect.height = in.nextDouble();

        System.out.printf("Area: %.2f",rect.area());
        System.out.printf("Perimeter: %.2f",rect.perimeter());
        System.out.printf("Diagonal: %.2f",rect.diagonal());

    }
}
