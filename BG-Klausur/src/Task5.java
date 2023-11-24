import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        //scanner zum einlesen des Inputs
        Scanner scanner = new Scanner(System.in);
        //bestellwert ist am anfang immer 0
        double bestellwert = 0;
        System.out.println("Wie hoch ist dein Bestellwert?");
        //bestellwert als String einlesen und dann zu einem richtigen Double konvertieren
        String bestellwertString = scanner.nextLine();
        //Deutsches komma mit englischem double '.' replacen
        bestellwert = Double.parseDouble(bestellwertString.replace(',', '.'));
        //wenn bestellung über 200 dann frei, wenn nicht, dann Versand bezahlen
        if (bestellwert > 200) System.out.println("Deine Bestellung ist Versandfrei!");
        else System.out.println("Du musst leider 5,95€ Versand bezahlen.");
    }
}
