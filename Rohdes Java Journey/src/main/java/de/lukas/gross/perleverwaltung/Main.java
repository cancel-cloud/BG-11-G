package de.lukas.gross.perleverwaltung;

import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Erstellen einer Instanz der Verwaltungsklasse
        PerleVerwaltung verwaltung = new PerleVerwaltung();

        // Registrierung von Kunden
        Kunde kunde1 = verwaltung.registriereKunde("Max Mustermann", "12345", "max@example.com", "passwort123");
        Kunde kunde2 = verwaltung.registriereKunde("Erika Mustermann", "54321", "erika@example.com", "passwort321");

        // Registrierung von Reinigungskräften
        Reinigungskraft reinigungskraft1 = new Reinigungskraft("Hans Müller", "12345", "hans@example.com", 15.0);
        Reinigungskraft reinigungskraft2 = new Reinigungskraft("Anna Schmidt", "12345", "anna@example.com", 18.0);

        // Hinzufügen von Reinigungskräften zur Verwaltung
        verwaltung.personen.add(reinigungskraft1);
        verwaltung.personen.add(reinigungskraft2);

        // Buchungen hinzufügen
        Calendar cal = Calendar.getInstance();
        cal.set(2023, Calendar.JUNE, 15);
        Date datum1 = cal.getTime();

        cal.set(2023, Calendar.JUNE, 20);
        Date datum2 = cal.getTime();

        Buchung buchung1 = new Buchung(datum1, 2);
        Buchung buchung2 = new Buchung(datum2, 4);

        kunde1.hinzufuegenBuchung(buchung1);
        reinigungskraft1.hinzufuegenBuchung(buchung1);

        kunde2.hinzufuegenBuchung(buchung2);
        reinigungskraft2.hinzufuegenBuchung(buchung2);

        // Monatliche Abrechnung für die Reinigungskräfte
        System.out.println("Monatliche Abrechnung für Reinigungskraft1: " + reinigungskraft1.abrechnenMonat(Calendar.JUNE, 2023));
        System.out.println("Monatliche Abrechnung für Reinigungskraft2: " + reinigungskraft2.abrechnenMonat(Calendar.JUNE, 2023));

        // Anmeldung eines Kunden
        Kunde angemeldeterKunde = verwaltung.registriereKunde("Max", "43598", "max@example.com", "passwort123");
        if (angemeldeterKunde != null) {
            System.out.println("Kunde erfolgreich angemeldet: " + angemeldeterKunde);
        } else {
            System.out.println("Anmeldung fehlgeschlagen.");
        }

        // Suche nach einer freien Reinigungskraft
        Reinigungskraft freieKraft = verwaltung.sucheFreieReinigungskraft("12345", datum2);
        if (freieKraft != null) {
            System.out.println("Freie Reinigungskraft gefunden: " + freieKraft);
        } else {
            System.out.println("Keine freie Reinigungskraft gefunden.");
        }
    }
}
