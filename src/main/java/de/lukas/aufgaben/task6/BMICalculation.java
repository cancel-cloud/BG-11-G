package de.lukas.aufgaben.task6;

import java.util.Scanner;

public class BMICalculation {
    /**
     * This method calculates and prints the Body Mass Index (BMI) based on user input for weight and height.
     * It then classifies the BMI into categories such as Underweight, Normal weight, Overweight, and Obesity.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // new Scanner object to read input from user
        Scanner input = new Scanner(System.in);

        // enter your weight and height
        System.out.println("Enter weight in kilograms:");
        double weight = input.nextDouble();

        System.out.println("Enter height in centimeters:");
        double height = input.nextDouble();

        // calculate BMI
        double bmi = weight / Math.pow(height / 100, 2);

        System.out.println("BMI is: " + bmi);

        // classify BMI into categories
        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi >= 18.5 && bmi < 25) System.out.println("Normal weight");
        else if (bmi >= 25 && bmi < 30) System.out.println("Overweight");
        else System.out.println("Obesity");
    }
}
