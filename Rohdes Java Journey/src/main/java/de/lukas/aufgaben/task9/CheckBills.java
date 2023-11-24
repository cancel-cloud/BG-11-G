package de.lukas.aufgaben.task9;

import java.util.Scanner;

public class CheckBills {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gib die Seriennummer des Geldscheins ein (ohne Leerzeichen):");
        String serialnumber = scanner.nextLine();

        if (istSeriennummerKorrekt(serialnumber)) {
            System.out.println("Die Seriennummer ist korrekt.");
        } else {
            System.out.println("Die Seriennummer ist nicht korrekt.");
        }
    }



    public static boolean istSeriennummerKorrekt(String seriennummer) {
        if (seriennummer.length() == 12) {
            // Euro Banknoten 1. Generation
            return checkBillsValidityfirstGeneration(seriennummer);
        } else if (seriennummer.length() == 13) {
            // Euro Banknoten 2. Generation
            return checkBillsValiditySecondGeneration(seriennummer);
        }
        return false;
    }

    private static boolean checkBillsValidityfirstGeneration(String serialnumber) {
        int nzbNummer = serialnumber.charAt(0) - 'A' + 1;
        int summe = nzbNummer;
        for (int i = 1; i < serialnumber.length() - 1; i++) {
            summe += serialnumber.charAt(i) - '0';
        }
        int rest = summe % 9;
        int validationNumber = (rest == 0) ? 9 : 8 - rest;
        return validationNumber == serialnumber.charAt(11) - '0';
    }

    private static boolean checkBillsValiditySecondGeneration(String serialnumber) {
        int summed = 0;
        for (int i = 0; i < 2; i++) {
            summed += serialnumber.charAt(i) - 'A' + 1;
        }
        for (int i = 2; i < serialnumber.length() - 1; i++) {
            summed += serialnumber.charAt(i) - '0';
        }
        int rest = summed % 9;
        int validationNumber = (rest == 0) ? 9 : 7 - rest;
        return validationNumber == serialnumber.charAt(12) - '0';
    }
}
