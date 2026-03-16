package application;


import java.util.Scanner;

import entities.Rectangle;

import java.util.Locale;


public class RectangleProgram {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner (System.in);

        Rectangle rect = new Rectangle();

        System.out.print("Enter rectangle width and height: ");
        rect.width = sc.nextDouble();
        rect.height = sc.nextDouble();

        System.out.printf("AREA: %.2f%n", rect.area());
        System.out.printf("PERIMETER: %.2f%n", rect.perimetro());
        System.out.printf("DIAGONAL: %.2f%n", rect.diagonal());
        sc.close();
    }
}
