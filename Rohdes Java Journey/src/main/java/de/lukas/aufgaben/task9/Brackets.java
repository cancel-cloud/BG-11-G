package de.lukas.aufgaben.task9;

public class Brackets {

        public static void main(String[] args) {
            String text = "((()))";
            System.out.println(istKorrektGeklammert(text));
        }



        public static boolean istKorrektGeklammert(String text) {
            int klammerZaehler = 0;
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (c == '(') {
                    klammerZaehler++;
                } else if (c == ')') {
                    klammerZaehler--;
                    if (klammerZaehler < 0) {
                        return false;
                    }
                }
            }
            return klammerZaehler == 0;
        }

}
