package me.hubailmn.Labs.Lab6;

import me.hubailmn.utils.Exercise;

import java.util.Scanner;

@Exercise(
        name = "Dollar Formater",
        description = "prompt the user for a double value and convert it into a Dollar format and print it out"
)
public class DollarFormatFirstTryDriver {
    public static void main(String[] args) {
        double amount;
        String response;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Testing DollarFormatFirstTry.write:");
        do {
            System.out.print("Enter a value of type double: ");
            amount = keyboard.nextDouble();
            DollarFormatFirstTry.write(amount);
            System.out.println();
            System.out.println("Test again?");
            response = keyboard.next();
        } while (response.equalsIgnoreCase("yes") || response.equalsIgnoreCase(""));
        System.out.println("End of test.");
    }
}