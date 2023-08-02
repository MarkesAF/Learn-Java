package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


import entities.Circle;
import entities.Shape;
import entities.Rectangle;
import entities.enums.Color;
public class Program {
    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner in = new Scanner(System.in);
        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of Shapes: ");
        int n = in.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("Shape #"+i+" data: ");
            System.out.print("Rectangle or Circle (r/c): ");
            char response = in.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(in.next());
            if(response == 'r'){
                System.out.print("Width: ");
                double width = in.nextDouble();
                System.out.print("Height: ");
                double height = in.nextDouble();
                list.add(new Rectangle(color, width,height));
            }else{
                System.out.print("Radius: ");
                double radius = in.nextDouble();
                list.add(new Circle(color, radius));
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS:");
        for(Shape shape : list){
            System.out.println(String.format("%.2f",shape.area()));
        }
        in.close();
    }
}
