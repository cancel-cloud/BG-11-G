package de.lukas.aufgaben.task6;

public class Task6 {
    /**
     * The main method is the entry point of the application.
     * It calls the main method of BMICalculation, QuadraticFunction, and ShippingCosts classes,
     * passing the command line arguments to each of them.
     *
     * @param args The command line arguments passed to the application.
     *             These are typically strings that represent user input or configuration parameters.
     *             The main method doesn't use the command line arguments directly.
     *             However, it passes them to the main methods of other classes for further processing.
     */
    public static void main(String[] args) {
        BMICalculation.main(args);
        QuadraticFunction.main(args);
        ShippingCosts.main(args);
    }
}


