package de.lukas.aufgaben.exams.corrected;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bestellwert = 0;
        System.out.println("Wie hoch ist dein Bestellwert?");
        String bestellwertString = scanner.nextLine();
        bestellwert = Double.parseDouble(bestellwertString.replace(',', '.'));

        // Versandkosten definieren
        double versandkosten = 5.95;

        // Berechnung der Gesamtkosten
        if (bestellwert > 200) {
            System.out.println("Deine Bestellung ist Versandfrei! Der Gesamtbetrag beträgt " + bestellwert + "€.");
        } else {
            double gesamtkosten = bestellwert + versandkosten;
            System.out.println("Du musst leider 5,95€ Versand bezahlen. Der Gesamtbetrag beträgt " + gesamtkosten + "€.");
        }
    }
}