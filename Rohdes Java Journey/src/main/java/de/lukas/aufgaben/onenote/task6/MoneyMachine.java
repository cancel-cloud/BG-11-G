package de.lukas.aufgaben.onenote.task6;

import java.util.Scanner;

public class MoneyMachine {
    public static void main(String[] args) {
        int[] coinTypes = {200, 100, 50, 20, 10, 5, 2, 1};
        String[] coinNames = {"2 EUR", "1 EUR", "50 cent", "20 cent", "10 cent", "5 cent", "2 cent", "1 cent"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie den zurückzugebenden Betrag (in Euro) ein: ");
        double amount = scanner.nextDouble();

        if (amount < 0 || amount > 5) {
            System.out.println("Ungültiger Betrag eingegeben. Er muss zwischen 0 und 5 EUR liegen.");
            return;
        }

        int amountInCents = (int) (amount * 100);
        int[] coinCounts = new int[coinTypes.length];

        for (int i = 0; i < coinTypes.length; i++) {
            if (amountInCents >= coinTypes[i]) {
                coinCounts[i] = amountInCents / coinTypes[i];
                amountInCents = amountInCents % coinTypes[i];
            }
        }

        System.out.println("Der Rückzahlbetrag in Münzen würde lauten: ");
        for (int i = 0; i < coinCounts.length; i++) {
            if (coinCounts[i] != 0) {
                System.out.println(coinCounts[i] + "x " + coinNames[i]);
            }
        }
    }
}