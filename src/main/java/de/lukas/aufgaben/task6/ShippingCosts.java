package de.lukas.aufgaben.task6;

import java.util.Scanner;

public class ShippingCosts {
    /**
     * The main method calculates the total cost of a purchase including shipping based on the user's input.
     * It prompts the user to enter the total purchase amount, and applies a shipping fee of 5.95 EUR if the
     * total amount is less than or equal to 200 EUR. If the total amount exceeds 200 EUR, then no shipping fee is applied.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object. This object can be used to read inputs from various sources like keyboard input, file, etc.
        Scanner input = new Scanner(System.in);

        // Print a prompt message to user to enter the total purchase amount.
        System.out.println("Enter total purchase amount:");
        double totalAmount = input.nextDouble();

        // Apply shipping fee if total amount is less than or equal to 200 EUR.
        if (totalAmount > 200) totalAmount += 0;
        else totalAmount += 5.95;

        System.out.println("Total cost with shipping: " + totalAmount + " EUR");
    }
}