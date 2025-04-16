package me.hubailmn.Labs.Lab2;

import me.hubailmn.utils.Exercises;

import java.util.Scanner;

@Exercises(
        exercise = 1,
        name = "Repeating Statement Recursively",
        description = "Uses recursion to print 'Hello World' a specified number of times based on user input."
)

public class RepeatingStatement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the number of times to repeat a statement: ");
        int number = scan.nextInt();

        repeat(number);

        System.out.println("\nHave a nice day");

    }

    private static void repeat(int number) {

        if (number == 0) {
            return;
        }

        System.out.println("Hello World");
        repeat(number - 1);

    }

}
