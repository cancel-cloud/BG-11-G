package de.lukas.aufgaben.exams.corrected;

public class Task3 {

    public static void main(String[] args) {
        // Aufruf der Methode printStarPattern mit dem Wert 4 für die Anzahl der Zeilen
        printStarPattern(4);
    }

    /**
     * Diese Methode druckt ein Muster aus Sternen, basierend auf der angegebenen Zeilenzahl.
     * @param starCount Anzahl der Zeilen des Musters
     */
    private static void printStarPattern(int starCount) {
        // Zeichen, das im Muster verwendet wird (hier Stern)
        String zeichen = "*";

        // Äußere Schleife: Steuert die Anzahl der Zeilen
        for (int i = 0; i < starCount; i++) {
            // Innere Schleife: Steuert die Anzahl der Zeichen in jeder Zeile
            for (int j = 0; j <= i; j++) {
                // Druckt das Zeichen (Stern) in einer Zeile
                System.out.print(zeichen);
            }
            // Erzeugt einen Zeilenumbruch nach dem Füllen einer Zeile mit Sternen
            System.out.println();
        }
    }
}
