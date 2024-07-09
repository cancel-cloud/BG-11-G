package de.lukas.gross.perleverwaltung;

import java.util.ArrayList;
import java.util.List;

// Abstrakte Klasse Person, die als Basisklasse für Kunde und Reinigungskraft dient
public abstract class Person {
    private final int personNr;
    private final String name;
    String plz;
    String email;
    private static int autoWert = 1;
    protected List<Buchung> buchungen;

    // Konstruktor der Klasse Person
    public Person(String name, String plz, String email) {
        this.personNr = autoWert++;
        this.name = name;
        this.plz = plz;
        this.email = email;
        this.buchungen = new ArrayList<>();
    }

    // Methode zum Hinzufügen einer Buchung
    public void hinzufuegenBuchung(Buchung b) {
        buchungen.add(b);
    }

    // Abstrakte Methode zur Abrechnung des Monats, die in den Unterklassen implementiert wird
    public abstract double abrechnenMonat(int monat, int jahr);

    // Überschreiben der toString-Methode für eine benutzerfreundliche Ausgabe
    @Override
    public String toString() {
        return name + " (Personennummer: " + personNr + "), " + email + ", PLZ " + plz;
    }
}
