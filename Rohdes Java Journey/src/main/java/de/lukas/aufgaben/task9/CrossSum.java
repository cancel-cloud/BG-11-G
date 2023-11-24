package de.lukas.aufgaben.task9;

import java.util.Scanner;

public class CrossSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib eine Zahl ein:");
        char[] numbers = scanner.nextLine().toCharArray();
        System.out.println("Quersumme: " + calculateCrossSum(numbers));
    }

    private static int calculateCrossSum(char[] inputArray) {
        int sum = 0;
        for (char c : inputArray) {
            sum += c - '0';
        }
        return sum;
    }

}
