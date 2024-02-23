package de.lukas.aufgaben.onenote.task7;

import java.util.Scanner;

public class SummationOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.println("Bitte eine Zahl eingeben (0 zum Beenden):");
            number = scanner.nextInt();
            sum += number;
        } while (number != 0);

        scanner.close();
        System.out.println("Die Summe der eingegebenen Zahlen ist: " + sum);
    }
}
