package de.lukas;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Opt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Hello and welcome!");

        // Press Ctrl+R or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Ctrl+D to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Cmd+F8.
            System.out.println("i = " + i);
        }

        // A random number will be printed 5 times
        for (int i = 1; i <= 5; i++) {
            System.out.println("Random number: " + Math.random());
        }
        // Now ill print something in the same line
        System.out.print("Hello and welcome!");
        System.out.print(" and this here will be added");
        // Now some numbers
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        int eins = 11;
        int zwei = 11;
        System.out.println("Das Ergebniss ist: " + (eins + zwei));
    }
}