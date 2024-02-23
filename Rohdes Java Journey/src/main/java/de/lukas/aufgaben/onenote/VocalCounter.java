package de.lukas.aufgaben.onenote;

public class VocalCounter {
    public static void main(String[] args) {
        String input = "Ihr String hier"; // Ersetzen Sie dies mit Ihrem tatsächlichen String
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        int vowelCount = 0;

        for (int i = 0; i < input.length(); i++) {
            for (char vowel : vowels) {
                if (input.charAt(i) == vowel) {
                    vowelCount++;
                    break; // Stoppt die innere Schleife, wenn ein Vokal gefunden wurde
                }
            }
        }
        System.out.println("Anzahl der Vokale: " + vowelCount);
    }
}
