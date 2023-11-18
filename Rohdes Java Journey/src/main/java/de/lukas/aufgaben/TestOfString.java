package de.lukas.aufgaben;

public class TestOfString {
    /**
     * Main method that prints each character of the given string "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
     * and prints the length of the string.
     *
     * @param args The command line arguments passed to the program
     */
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < txt.length(); i++) {
            System.out.println(txt.charAt(i));
        }
        System.out.println("The length of the txt string is: " + txt.length());
    }
}