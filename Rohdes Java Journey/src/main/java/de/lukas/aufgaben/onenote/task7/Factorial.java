package de.lukas.aufgaben.onenote.task7;

import java.util.Scanner;

/**
 * This class calculates the factorial of a given number.
 */
public class Factorial {
    public static void main(String[] args) {
        // Read the number for which to calculate the factorial from the console.
        Scanner scanner = new Scanner(System.in);
        // Ask user to input a number.
        System.out.println("Bitte eine Zahl für die Fakultätsberechnung eingeben:");
        int number = scanner.nextInt();
        // Close the Scanner object to prevent resource leaks.
        scanner.close();

        long result = factorial(number);
        System.out.println(number + "! = " + result);
    }

    /**
     * Calculate the factorial of a given number.
     *
     * @param number the number for which to calculate the factorial
     * @return the factorial of the given number
     */
    private static long factorial(int number) {
        long result = 1;
        for (int factor = 2; factor <= number; factor++) {
            result *= factor;
        }
        return result;
    }
}
