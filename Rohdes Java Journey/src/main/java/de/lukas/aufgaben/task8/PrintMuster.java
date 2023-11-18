package de.lukas.aufgaben.task8;

import java.util.Scanner;

public class PrintMuster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Geben Sie eine ungerade Zahl ein (0 zum Beenden):");
            int zahl = scanner.nextInt();

            if (zahl == 0) {
                break;
            }

            if (zahl % 2 == 0) {
                System.out.println("Fehler: Eine gerade Zahl wurde eingegeben. Bitte geben Sie eine ungerade Zahl ein.");
            } else {
                for (int i = 1; i <= zahl; i += 2) {
                    printSterne(i);
                }
                for (int i = zahl - 2; i > 0; i -= 2) {
                    printSterne(i);
                }
            }
        }
    }

    private static void printSterne(int anzahl) {
        for (int i = 0; i < anzahl; i++) {
            System.out.print("*");
        }
        System.out.println();  // Neue Zeile
    }
}