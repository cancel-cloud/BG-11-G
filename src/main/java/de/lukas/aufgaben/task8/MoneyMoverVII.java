package de.lukas.aufgaben.task8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MoneyMoverVII {
    public static void main(String[] args) {
        double amount;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Wie viel Geld schulde ich dir?");
            String stringAmount = scanner.nextLine();
            amount = Double.parseDouble(stringAmount.replace(',', '.'));
        } catch (InputMismatchException e) {
            System.out.println("Bitte gib einen gültigen Betrag ein.");
            return;
        }

        int totalCents = (int) Math.round(amount * 100);
        int[] values = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        String[] denominations = {"5€", "2€", "1€", "50 Cent", "20 Cent", "10 Cent", "5 Cent", "2 Cent", "1 Cent"};
        int[] counts = new int[9];

        for (int i = 0; i < values.length; i++) {
            if (totalCents >= values[i]) {
                counts[i] = totalCents / values[i];
                totalCents -= counts[i] * values[i];
            }
        }

        System.out.println("Ich schulde dir:");
        for (int i = 0; i < 9; i++) {
            if (counts[i] != 0) {
                System.out.println(counts[i] + "x " + denominations[i]);
            }
        }
    }
}