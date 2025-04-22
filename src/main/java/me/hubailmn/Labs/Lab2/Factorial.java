package me.hubailmn.Labs.Lab2;

import me.hubailmn.utils.Exercise;

import java.util.Scanner;

@Exercise(
        exercise = 2,
        name = "Recursive Factorial Calculation",
        description = "Prompts the user for a number and uses recursion to calculate and display its factorial."
)
public class Factorial {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        int factorial = factorial(number);

        System.out.println("The factorial of the number " + number + " is: " + factorial);

    }

    private static int factorial(int number) {

        if (number == 0) {
            return 1;
        }

        return number * factorial(number - 1);

    }

}
