package de.lukas.gross.perleverwaltung;

// Klasse Reinigungskraft, die von der abstrakten Klasse Person erbt
public class Reinigungskraft extends Person {
    private final double stundenSatz;

    // Konstruktor der Klasse Reinigungskraft
    public Reinigungskraft(String name, String plz, String email, double satz) {
        super(name, plz, email);
        this.stundenSatz = satz;
    }

    // Implementierung der abstrakten Methode zur Abrechnung des Monats
    @Override
    public double abrechnenMonat(int monat, int jahr) {
        double betrag = 0;
        for (Buchung b : buchungen) {
            if (b.getReinigungsDatum().getMonth() == monat && b.getReinigungsDatum().getYear() == jahr) {
                betrag += b.getAnzahlStunden() * stundenSatz * 0.9; // 20% Gebühr abziehen
                if (b.getAnzahlStunden() < 3) {
                    betrag += 10; // Fahrtkostenpauschale
                }
            }
        }
        return betrag;
    }

    // Überschreiben der toString-Methode für eine benutzerfreundliche Ausgabe
    @Override
    public String toString() {
        return "Reinigungskraft " + super.toString() + ", Stundensatz " + stundenSatz + " EURO";
    }
}
