package me.hubailmn.programming.two.Lab2;

import me.hubailmn.utils.Exercise;

import java.util.Scanner;

@Exercise(
        exercise = 1,
        name = "Repeating Statement Recursively",
        description = "Uses recursion to print 'Hello World' a specified number of times based on user input."
)

public class RepeatingStatement {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the statement: ");
        String statement = scan.nextLine();

        System.out.print("Enter the number of times to repeat the statement: ");
        int number = scan.nextInt();

        repeat(statement, number);
        System.out.println("\nHave a nice day");

    }

    private static void repeat(String statement, int number) {

        if (number == 0) {
            return;
        }

        System.out.println("#" + number + " - " + statement);
        repeat(statement, number - 1);
    }

}
