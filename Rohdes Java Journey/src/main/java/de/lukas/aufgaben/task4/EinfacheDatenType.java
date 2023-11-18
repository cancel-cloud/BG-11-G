package de.lukas.aufgaben.task4;

public class EinfacheDatenType {

    public static void main(String[] args) {
        //Variablen deklarieren
        byte byteVar = 10;
        short shortVar = 20;
        int intVar = 30;
        float floatVar = 40.0f;
        double doubleVar = 50.0;
        //Variablen addieren
        int sum = byteVar + shortVar + intVar;
        double floatDoubleSum = floatVar + doubleVar;

        //Variablen ausgeben
        System.out.println("Die Summe von byteVar, shortVar und intVar ist: " + sum);
        System.out.println("Die Summe von floatVar und doubleVar ist: " + floatDoubleSum);
    }
}
