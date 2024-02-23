package de.lukas.aufgaben.onenote;

import java.util.Scanner;


public class Fakultaet {

    /**
     * The main method is the entry point of the program. It prompts the user to input a number
     * and calculates the factorial of that number using the calculateFactorial method.
     * It then prints the result to the console.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int input = 0;
        //new scanner to read user input
        Scanner scanner = new Scanner(System.in);
        //ask user to enter a number
        System.out.println("Bitte geben Sie eine Zahl ein: ");
        //read next integer from user input
        input = scanner.nextInt();

        long result = calculateFactorial(input);
        //Give user feedback of the result
        System.out.println("Die Fakultät von " + input + " ist " + result);
    }

    /**
     * The calculateFactorial method calculates the factorial of a given integer.
     *
     * @param n the integer for which the factorial will be calculated
     * @return the factorial of the given integer
     */
    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}