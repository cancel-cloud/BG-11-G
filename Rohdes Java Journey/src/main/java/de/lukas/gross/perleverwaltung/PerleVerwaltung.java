package de.lukas.gross.perleverwaltung;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Klasse PerleVerwaltung, die die Verwaltung der Personen übernimmt
public class PerleVerwaltung {
    final List<Person> personen;

    // Konstruktor der Klasse PerleVerwaltung
    public PerleVerwaltung() {
        this.personen = new ArrayList<>();
    }

    // Methode zum Anmelden eines Kunden
    public Kunde register(String email, String passwort) {
        for (Person p : personen) {
            if (p instanceof Kunde k) {
                if (k.getEmail().equals(email) && k.getPasswort().equals(passwort)) {
                    return k;
                }
            }
        }
        return null;
    }

    // Methode zum Registrieren eines neuen Kunden
    public Kunde registriereKunde(String name, String plz, String email, String pw) {
        Kunde k = new Kunde(name, plz, email, pw);
        personen.add(k);
        return k;
    }

    // Methode zur Suche einer freien Reinigungskraft
    public Reinigungskraft sucheFreieReinigungskraft(String plz, Date d) {
        Reinigungskraft freieKraft = null;
        int minStunden = Integer.MAX_VALUE;

        for (Person p : personen) {
            if (p instanceof Reinigungskraft rk) {
                if (rk.plz.equals(plz) && !hatBuchungAmDatum(rk, d)) {
                    int gebuchteStunden = getGebuchteStundenImMonat(rk, d);
                    if (gebuchteStunden < minStunden) {
                        minStunden = gebuchteStunden;
                        freieKraft = rk;
                    }
                }
            }
        }
        return freieKraft;
    }

    // Hilfsmethode, um zu prüfen, ob eine Reinigungskraft am gegebenen Datum gebucht ist
    private boolean hatBuchungAmDatum(Reinigungskraft rk, Date d) {
        for (Buchung b : rk.buchungen) {
            if (b.getReinigungsDatum().equals(d)) {
                return true;
            }
        }
        return false;
    }

    // Hilfsmethode, um die gebuchten Stunden im Monat zu berechnen
    private int getGebuchteStundenImMonat(Reinigungskraft rk, Date d) {
        int stunden = 0;
        for (Buchung b : rk.buchungen) {
            if (b.getReinigungsDatum().getMonth() == d.getMonth() && b.getReinigungsDatum().getYear() == d.getYear()) {
                stunden += b.getAnzahlStunden();
            }
        }
        return stunden;
    }
}
