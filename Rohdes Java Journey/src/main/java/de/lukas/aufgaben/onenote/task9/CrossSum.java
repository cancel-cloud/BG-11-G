package de.lukas.aufgaben.onenote.task9;

import java.util.Scanner;

public class CrossSum {

    public static void main(String[] args) {
        //read user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein:");
        char[] numbers = scanner.nextLine().toCharArray();
        //calculate cross-sum and print it
        System.out.println("Quersumme: " + calculateCrossSum(numbers));
    }

    /**
     * This method calculates the cross-sum of the given character array.
     * The cross-sum is calculated by converting each character to its corresponding
     * integer value and adding it to the sum.
     *
     * @param inputArray  the character array for which the cross-sum is to be calculated
     * @return the cross-sum of the input array
     */
    private static int calculateCrossSum(char[] inputArray) {
        int sum = 0;
        for (char c : inputArray) {
            sum += c - '0';
        }
        return sum;
    }

}
