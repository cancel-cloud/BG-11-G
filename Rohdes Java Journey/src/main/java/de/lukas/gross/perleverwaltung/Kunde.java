package de.lukas.gross.perleverwaltung;
// Klasse Kunde, die von der abstrakten Klasse Person erbt
public class Kunde extends Person {
    private final String passwort;

    // Konstruktor der Klasse Kunde
    public Kunde(String name, String plz, String email, String passwort) {
        super(name, plz, email);
        this.passwort = passwort;
    }

    // Getter-Methode für das Passwort
    public String getPasswort() {
        return passwort;
    }

    // Getter-Methode für die Email
    public String getEmail() {
        return super.email;
    }

    // Implementierung der abstrakten Methode zur Abrechnung des Monats
    @Override
    public double abrechnenMonat(int monat, int jahr) {
        double betrag = 0;
        for (Buchung b : buchungen) {
            if (b.getReinigungsDatum().getMonth() == monat && b.getReinigungsDatum().getYear() == jahr) {
                betrag += b.getAnzahlStunden() * 0.1; // 10% Gebühr
            }
        }
        return betrag;
    }

    // Überschreiben der toString-Methode für eine benutzerfreundliche Ausgabe
    @Override
    public String toString() {
        return "Kunde " + super.toString();
    }
}
