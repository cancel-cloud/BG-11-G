package de.lukas.aufgaben;

import java.util.Scanner;

public class Task5 {
    /**
     * Die main-Methode ist der Einstiegspunkt des Programms. Sie ruft drei Methoden auf: Währungsrechner(),
     * Zinsrechner() und Sinusfunktion().
     *
     * @param args Ein Array von Befehlszeilenargumenten.
     */
    public static void main(String[] args) {
        Zinsrechner();
        Währungsrechner();
        Sinusfunktion();
    }

    /**
     * Führt die Währungsumrechnung von Euro in US-Dollar durch.
     * <p>
     * Diese Methode fordert den Benutzer auf, den umzurechnenden Euro-Betrag einzugeben,
     * berechnet den entsprechenden Betrag in US-Dollar und gibt das Ergebnis aus.
     *
     * @return void
     */
    // Aufgabe 5.1
    public static void Währungsrechner() {
        Scanner input = new Scanner(System.in);
        System.out.println("Geben Sie die Menge an Euro ein, die Sie umrechnen möchten:");
        double euro = input.nextDouble();
        double usd = euro * 1.10536; // Umrechnungsfaktor kann variieren
        System.out.format("%.2f Euro sind %.2f US-Dollar (Stand 6.10.2023)\n", euro, usd);
    }

    /**
     * Berechnet und gibt die Zinsen für einen gegebenen Anfangsbetrag, Zinssatz und Laufzeit aus.
     * Das Ergebnis wird in der Konsole angezeigt.
     */
    // Aufgabe 5.2
    public static void Zinsrechner() {
        double grundbetrag = 5000;  // Euro
        double zinssatz = 0.05;     // 5%
        int laufzeit = 2;           // Jahre
        double zinsen = grundbetrag * Math.pow((1 + zinssatz), laufzeit);
        System.out.format("Die Zinsen für den Grundbetrag von %.2f Euro nach %d Jahren belaufen sich auf %.2f Euro.\n", grundbetrag, laufzeit, zinsen - grundbetrag);
    }

    /**
     * Diese Methode berechnet und gibt den Sinuswert eines gegebenen Winkels in Grad aus.
     * Der Winkel wird vor der Berechnung des Sinuswerts in Bogenmaß umgewandelt.
     */
    // Aufgabe 5.3
    public static void Sinusfunktion() {
        double winkelInGrad = 90;
        double winkelInBogenmaß = Math.toRadians(winkelInGrad);
        double sinus = Math.sin(winkelInBogenmaß);
        System.out.println("Der Sinus von " + winkelInGrad + " Grad ist " + sinus);
    }

    /**
     * Generiert eine zufällige Zahl zwischen 1 und 100 (einschließlich) und gibt sie in der Konsole aus.
     *
     * @return void
     */
    // Aufgabe 5.4
    public void Zufallszahlen() {
        int randNum = (int) (Math.random() * 100) + 1;
        System.out.println("Die Zufallszahl zwischen 1 und 100 ist: " + randNum);
    }

    /**
     * Generiert eine zufällige Zahl zwischen 1 und 6 und gibt sie als Ergebnis eines Würfelwurfs aus.
     */
    // Aufgabe 5.5
    public void Würfel() {
        int randNum = (int) (Math.random() * 6) + 1;
        System.out.print("Die Würfelzahl ist: " + randNum);
    }

    // Aufgabe 5.6

    /**
     * Berechnet den Body-Mass-Index (BMI) basierend auf Gewicht und Größe.
     * <p>
     * Verwendung:
     * - Rufen Sie BMI() auf, um den BMI zu berechnen und auszugeben.
     * <p>
     * Hinweis:
     * - Das Gewicht sollte in Kilogramm (kg) angegeben werden.
     * - Die Größe sollte in Metern (m) angegeben werden.
     */
    public void BMI() {
        double gewicht = 75.0;
        double größe = 1.8;
        double bmi = berechneBMI(gewicht, größe);
        System.out.println("Der BMI beträgt: " + bmi);
    }

    /**
     * Berechnet den Body-Mass-Index (BMI) basierend auf dem angegebenen Gewicht und der Größe.
     *
     * @param gewicht das Gewicht in Kilogramm
     * @param größe   die Größe in Metern
     * @return der berechnete BMI als double-Wert
     */
    public static double berechneBMI(double gewicht, double größe) {
        return gewicht / (größe * größe);
    }
}
