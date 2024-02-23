package de.lukas.aufgaben.onenote.task9;

public class Brackets {

    public static void main(String[] args) {
        //simulated input from user
        String text = "((()))";
        //print result
        System.out.println(istKorrektGeklammert(text));
    }


    /**
     * Checks whether the given text has correct brackets.
     *
     * @param text the text to be checked
     * @return true if the text has correct brackets, false otherwise
     */
    public static boolean istKorrektGeklammert(String text) {
        int klammerZaehler = 0;
        //for each character in the text
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            //if the character is an opening bracket, increase the counter
            if (c == '(') {
                klammerZaehler++;
            } else if (c == ')') {
                //if the character is a closing bracket, decrease the counter
                klammerZaehler--;
                if (klammerZaehler < 0) {
                    //if the counter is any other than 0, the text is not correctly bracketed
                    return false;
                }
            }
        }
        //if the counter is 0, the text is correctly bracketed
        return klammerZaehler == 0;
    }

}
