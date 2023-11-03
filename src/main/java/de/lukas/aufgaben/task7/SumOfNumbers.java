package de.lukas.aufgaben.task7;

import java.util.Scanner;

public class SumOfNumbers {
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

    private static int sumNumbers(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
