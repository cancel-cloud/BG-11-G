package de.lukas.task6;

import java.util.Scanner;

public class QuadraticFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter values for a, b and c:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double determinant = b * b - 4 * a * c;

        if (determinant > 0) {
            double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.println("Roots are: " + root1 + " and " + root2);
        } else if (determinant == 0) {
            double root = -b / (2 * a);
            System.out.println("Root is: " + root);
        } else {
            System.out.println("No real roots.");
        }
    }
}
