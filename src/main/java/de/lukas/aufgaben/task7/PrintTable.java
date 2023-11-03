package de.lukas.aufgaben.task7;

public class PrintTable {
    public static void main(String[] args) {
        printFunctionTable(0, 10, 1);
    }

    private static void printFunctionTable(int start, int end, int step) {
        System.out.println("x | f(x)");
        for (int i = start; i <= end; i += step) {
            System.out.println(i + " | " + (i * i));
        }
    }
}
