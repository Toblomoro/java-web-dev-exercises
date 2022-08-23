package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        double radius = input.nextDouble();
        while (radius < 0){
            System.out.println("enter a positive number for radius");
            radius = input.nextDouble();
        } if (radius > 0){
            double area = Circle.getArea(radius);
            System.out.println(" The circle's area is "+area ) ;
            input.close();
        }


    }
}
