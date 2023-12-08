package de.lukas.aufgaben.exams.exam;

import java.util.Scanner;

public class Task4 {


    public static void main(String[] args) {
        //gesammtsumme am Start auf 0 setzen
        int sumOfInput = 0;
        //neuer scanner für das einlesen des inputs des users
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Gebe doch eine Zahl ein, welche addiert werden soll:");
            //Zeile einlesen und zu variable read hinzufügen
            int read = scanner.nextInt();
            //wenn 0 dann hören wir auf
            if (read == 0) break;
            //addieren zur gesammt Summe
            sumOfInput =+ read;
        }
        //Ausgeben der GesammtSumme
        System.out.println("Die Summe aller Eingaben ist: " + sumOfInput);
    }




}
