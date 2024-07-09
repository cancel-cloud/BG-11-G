package de.lukas.gross.perleverwaltung;

import java.util.Date;

// Klasse Buchung, die die Details einer Buchung speichert
public class Buchung {
    private Date reinigungsDatum;
    private int anzahlStunden;

    // Konstruktor der Klasse Buchung
    public Buchung(Date reinigungsDatum, int anzahlStunden) {
        this.reinigungsDatum = reinigungsDatum;
        this.anzahlStunden = anzahlStunden;
    }

    // Getter-Methode für das Reinigungsdatum
    public Date getReinigungsDatum() {
        return reinigungsDatum;
    }

    // Getter-Methode für die Anzahl der Stunden
    public int getAnzahlStunden() {
        return anzahlStunden;
    }
}
