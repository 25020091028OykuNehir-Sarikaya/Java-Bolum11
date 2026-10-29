package Test_11;

import java.util.Locale;
import java.util.Scanner;

import tr.edu.istiklal.Triangle;

public class Test_11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("1. kenarı girin: ");
        double side1 = input.nextDouble();
        System.out.print("2. kenarı girin: ");
        double side2 = input.nextDouble();
        System.out.print("3. kenarı girin: ");
        double side3 = input.nextDouble();

        System.out.print("Renk girin: ");
        String color = input.next();

        System.out.print("Üçgen dolu mu? (true/false): ");
        boolean filled = Boolean.parseBoolean(input.next());

        Triangle triangle = new Triangle(side1, side2, side3);
        triangle.setColor(color);
        triangle.setFilled(filled);

        System.out.println(triangle);
        System.out.println("Alan: " + triangle.getArea());
        System.out.println("Çevre: " + triangle.getPerimeter());
        System.out.println("Renk: " + triangle.getColor());
        System.out.println("Dolu mu: " + triangle.isFilled());

        input.close();
    }
}