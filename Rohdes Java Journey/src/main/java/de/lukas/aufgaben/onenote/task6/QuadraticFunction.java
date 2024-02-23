package de.lukas.aufgaben.onenote.task6;

import java.util.Scanner;

public class QuadraticFunction {
    /**
     * This method calculates the roots of a quadratic equation given the values of a, b, and c.
     * It prompts the user to enter the values and calculates the discriminant, which determines the nature of the roots.
     * If the discriminant is greater than 0, it calculates two real roots and displays them.
     * If the discriminant is equal to 0, it calculates a single real root and displays it.
     * If the discriminant is less than 0, it displays a message indicating that there are no real roots.
     *
     * @param args - the command-line arguments
     */
    public static void main(String[] args) {
        //new Scanner object to read input from user
        Scanner input = new Scanner(System.in);

        //enter your 3 desired numbers
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
