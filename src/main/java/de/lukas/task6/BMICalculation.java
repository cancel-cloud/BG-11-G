package de.lukas.task6;

import java.util.Scanner;

public class BMICalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in kilograms:");
        double weight = input.nextDouble();

        System.out.println("Enter height in centimeters:");
        double height = input.nextDouble();

        double bmi = weight / Math.pow(height / 100, 2);

        System.out.println("BMI is: " + bmi);

        if (bmi < 18.5) System.out.println("Underweight");
        else if (bmi >= 18.5 && bmi < 25) System.out.println("Normal weight");
        else if (bmi >= 25 && bmi < 30) System.out.println("Overweight");
        else System.out.println("Obesity");
    }
}
