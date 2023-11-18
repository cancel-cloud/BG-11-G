package de.lukas.aufgaben.task7;

import java.util.Scanner;

/**
 * The DigitSum class calculates the digit sum of a given number.
 */
public class DigitSum {
    public static void main(String[] args) {
        // Create a Scanner object to read user input from the console.
        Scanner scanner = new Scanner(System.in);
        // Ask user to input a number.
        System.out.println("Bitte eine Zahl für die Quersummenberechnung eingeben:");
        int number = scanner.nextInt();
        // Close the Scanner object to prevent resource leaks.
        scanner.close();

        // Calculate the digit sum of the given number.
        int digitSum = calculateDigitSum(number);
        System.out.println("Die Quersumme von " + number + " ist: " + digitSum);
    }

    /**
     * Calculates the sum of the digits in a given integer number.
     *
     * @param number the integer number to calculate the digit sum for
     * @return the sum of the digits in the given number
     */
    private static int calculateDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
