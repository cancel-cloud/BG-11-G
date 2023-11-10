package de.lukas.aufgaben.task8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MoneyMover {
    public static void main(String[] args) {
        double amount;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Wie viel Geld schulde ich dir?");
            amount = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Bitte gib einen gültigen Betrag ein.");
            return;
        }

        // Convert all amounts to cents
        int remaining = (int) (amount * 100);

        int funfeuro = 0;
        int zweieuro = 0;
        int euro = 0;
        int funfzigcent = 0;
        int zwanzigcent = 0;
        int zehncent = 0;
        int funfcent = 0;
        int zweicent = 0;
        int cent = 0;

        while (remaining > 0) {
            if (remaining >= 500) {
                funfeuro += 1;
                remaining -= 500;
            } else if (remaining >= 200) {
                zweieuro += 1;
                remaining -= 200;
            } else if (remaining >= 100) {
                euro += 1;
                remaining -= 100;
            } else if (remaining >= 50) {
                funfzigcent += 1;
                remaining -= 50;
            } else if (remaining >= 20) {
                zwanzigcent += 1;
                remaining -= 20;
            } else if (remaining >= 10) {
                zehncent += 1;
                remaining -= 10;
            } else if (remaining >= 5) {
                funfcent += 1;
                remaining -= 5;
            } else if (remaining >= 2) {
                zweicent += 1;
                remaining -= 2;
            } else if (remaining >= 1) {
                cent += 1;
                remaining -= 1;
            }
        }

        System.out.println("Ich gebe dir:");
        System.out.println(funfeuro + " 5€-Scheine");
        System.out.println(zweieuro + " 2€-Münzen");
        System.out.println(euro + " 1€-Münzen");
        System.out.println(funfzigcent + " 50-Cent-Münzen");
        System.out.println(zwanzigcent + " 20-Cent-Münzen");
        System.out.println(zehncent + " 10-Cent-Münzen");
        System.out.println(funfcent + " 5-Cent-Münzen");
        System.out.println(zweicent + " 2-Cent-Münzen");
        System.out.println(cent + " 1-Cent-Münzen");
    }
}