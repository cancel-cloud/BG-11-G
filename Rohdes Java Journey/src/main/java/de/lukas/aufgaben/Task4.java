package de.lukas.aufgaben;

public class Task4 {
    /**
     * This method calculates the sum and average of several variables and outputs the results.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        byte byteVar = 10;
        short shortVar = 20;
        int intVar = 30;
        float floatVar = 40.0f;
        double doubleVar = 50.0;

        // Rechenoperationen
        int sum = byteVar + shortVar + intVar;
        double avg = (byteVar + shortVar + intVar + floatVar + doubleVar) / 5;

        System.out.println("Summe: " + sum);
        System.out.println("Durchschnitt: " + avg);
    }
}
