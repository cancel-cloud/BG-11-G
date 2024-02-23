package de.lukas.aufgaben.onenote.task7;

import java.util.Scanner;

public class SumOfNumbers {
    /**
     * The main method is the entry point of the Java program.
     * It performs the following tasks:
     * - Prints the sum of numbers from 1 to 100
     * - Prompts the user to enter a start value and an end value
     * - Computes and prints the sum of numbers from the start value to the end value
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Die Summe der Zahlen von 1 bis 100 ist: " + sumNumbers(1, 100));

        System.out.println("Bitte Startwert eingeben:");
        int startValue = scanner.nextInt();
        System.out.println("Bitte Endwert eingeben:");
        int endValue = scanner.nextInt();
        scanner.close();

        int customSum = sumNumbers(startValue, endValue);
        System.out.println("Die Summe der Zahlen von " + startValue + " bis " + endValue + " ist: " + customSum);
    }

    /**
     * Calculates the sum of all numbers from start to end (inclusive).
     *
     * @param start the starting number
     * @param end   the ending number
     * @return the sum of all numbers from start to end
     */
    private static int sumNumbers(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
