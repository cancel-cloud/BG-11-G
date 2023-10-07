package de.lukas.task6;

import java.util.Scanner;

public class ShippingCosts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter total purchase amount:");
        double totalAmount = input.nextDouble();

        if(totalAmount > 200) totalAmount += 0;
        else totalAmount += 5.95;

        System.out.println("Total cost with shipping: " + totalAmount + " EUR");
    }
}