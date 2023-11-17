package de.lukas.aufgaben.task8;

import java.util.Scanner;

public class GGT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie die erste Zahl ein:");
        int a = scanner.nextInt();

        System.out.println("Geben Sie die zweite Zahl ein:");
        int b = scanner.nextInt();

        System.out.println("Der größte gemeinsame Teiler ist: " + ggT(a, b));
    }

    public static int ggT(int a, int b) {
        while (b != 0) {
            int h = a % b;
            a = b;
            b = h;
        }
        return a;
    }
}