package de.lukas.aufgaben.onenote;

public class IntroductionToArrays {
    public static void main(String[] args) {
        int zahl[] = new int[12];
        for (int i = 0; i < zahl.length; i++) {
            zahl[i] = i;
        }

        printArray(zahl);



    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.println(i);
        }
    }
}
