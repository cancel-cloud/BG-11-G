package de.lukas;

import java.util.Scanner;

public class HelloWorld {
    /**
     * The main method is the entry point of the application.
     * It prompts the user to enter a username and then prints the entered username.
     *
     * @param args the command-line arguments passed to the program
     */
    public static void main(String[] args) {
        // Instantiate a Scanner object. This object can be used to read inputs from various sources like keyboard input, file, etc.
        Scanner scanner = new Scanner(System.in);
        // Print a prompt message to user to enter their username.
        System.out.println("Enter username: ");
        // Use the nextLine method of Scanner class to get the string input by user until they hit the enter key, store the entered string in username variable.
        String username = scanner.nextLine();
        // Print a message showing the entered username.
        System.out.println("Username is: " + username);
    }
}
