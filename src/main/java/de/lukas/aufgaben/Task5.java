package de.lukas.aufgaben;

import java.util.Scanner;

public class Task5 {
    /**
     * The main method is the entry point of the program. It calls three methods: Währungsrechner(),
     * Zinsrechner(), and Sinusfunktion().
     *
     * @param args An array of command-line arguments.
     */
    public static void main(String[] args) {
        Zinsrechner();
        Währungsrechner();
        Sinusfunktion();
    }


    /**
     * Performs currency conversion from Euro to US-Dollar.
     * <p>
     * This method prompts the user to enter the amount of Euro to be converted,
     * calculates the equivalent amount in US-Dollar, and prints the result.
     *
     * @return void
     */
    // Task 5.1
    public static void Währungsrechner() {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie die Menge an Euro ein, die Sie umrechnen möchten:");
        double euro = input.nextDouble();
        double usd = euro * 1.10536; // Umrechnungsfaktor kann variieren
        System.out.format("%.2f Euro sind %.2f US-Dollar (Stand 6.10.2023)\n", euro, usd);
    }


    /**
     * Calculates and prints the interest for a given principal amount, interest rate, and time period.
     * The result is printed in the console.
     */
    // Task 5.2
    public static void Zinsrechner() {
        double grundbetrag = 5000;  // Euro
        double zinssatz = 0.05;     // 5%
        int laufzeit = 2;           // Jahre
        double zinsen = grundbetrag * Math.pow((1 + zinssatz), laufzeit);
        System.out.format("Die Zinsen für den Grundbetrag von %.2f Euro nach %d Jahren belaufen sich auf %.2f Euro.\n", grundbetrag, laufzeit, zinsen - grundbetrag);
    }

    /**
     * This method calculates and prints the sinus value of a given angle in degrees.
     * The angle is converted to radians before calculating the sinus value.
     */
    // Task 5.3
    public static void Sinusfunktion() {
        double winkelInGrad = 90;
        double winkelInBogenmass = Math.toRadians(winkelInGrad);
        double sinus = Math.sin(winkelInBogenmass);
        System.out.println("Der Sinus von " + winkelInGrad + " Grad ist " + sinus);
    }


    /**
     * Generates a random number between 1 and 100 (inclusive) and prints it to the console.
     *
     * @param none
     * @return void
     */
    // Task 5.4
    public void Zufallszahlen() {
        int randNum = (int) (Math.random() * 100) + 1;
        System.out.println("Die Zufallszahl zwischen 1 und 100 ist: " + randNum);
    }

    /**
     * Generates a random number between 1 and 6 and prints it as the dice roll result.
     */
    // Task 5.5
    public void Würfel() {
        int randNum = (int) (Math.random() * 6) + 1;
        System.out.print("Die Würfelzahl ist: " + randNum);
    }

    // Task 5.6

    /**
     * Calculates the Body Mass Index (BMI) based on weight and height.
     * <p>
     * Usage:
     * - Call BMI() to calculate and print the BMI.
     * <p>
     * Note:
     * - The weight should be in kilograms (kg).
     * - The height should be in meters (m).
     */
    public void BMI() {
        double gewicht = 75.0;
        double groesse = 1.8;
        double bmi = berechneBMI(gewicht, groesse);
        System.out.println("Der BMI beträgt: " + bmi);
    }

    /**
     * Calculates the Body Mass Index (BMI) based on the given weight and height.
     *
     * @param gewicht the weight in kilograms
     * @param groesse the height in meters
     * @return the calculated BMI as a double value
     */
    public static double berechneBMI(double gewicht, double groesse) {
        return gewicht / (groesse * groesse);
    }
}