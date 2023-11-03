package de.lukas.aufgaben.task7;

import java.util.Scanner;

public class PrintMuster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte eine Zahl zwischen 1 und 20 eingeben:");
        int lines = scanner.nextInt();
        scanner.close();

        if (lines >= 1 && lines <= 20) {
            printTriangle(lines);
        } else {
            System.out.println("Ungültige Eingabe. Bitte eine Zahl zwischen 1 und 20 eingeben.");
        }
    }

    private static void printTriangle(int lines) {
        for (int i = 1; i <= lines; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
