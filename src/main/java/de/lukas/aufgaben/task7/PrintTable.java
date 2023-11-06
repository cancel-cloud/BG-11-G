package de.lukas.aufgaben.task7;

public class PrintTable {
    public static void main(String[] args) {
        printFunctionTable(0, 10, 1);
    }

    /**
     * Prints a function table for a given range and step size.
     *
     * The table consists of two columns: 'x' and 'f(x)', where 'x' ranges from 'start' to 'end'
     * (inclusive) with a step size of 'step'. For each value of 'x', the corresponding 'f(x)' value
     * is computed as 'x' squared.
     *
     * The table is printed to the console in the following format:
     * x | f(x)
     * -------
     * 1 | 1
     * 2 | 4
     * 3 | 9
     * ...
     *
     * @param start the starting value of 'x'
     * @param end the ending value of 'x'
     * @param step the step size for incrementing 'x'
     */
    private static void printFunctionTable(int start, int end, int step) {
        System.out.println("x | f(x)");
        for (int i = start; i <= end; i += step) {
            System.out.println(i + " | " + (i * i));
        }
    }
}
