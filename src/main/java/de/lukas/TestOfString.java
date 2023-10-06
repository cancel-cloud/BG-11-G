package de.lukas;

public class TestOfString {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < txt.length(); i++) {
            System.out.println(txt.charAt(i));
        }
        System.out.println("The length of the txt string is: " + txt.length());
    }
}
