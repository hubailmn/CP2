package me.hubailmn.programming.one.Quiz;

import java.util.Scanner;

public class Quiz3 {

    public static void main(String[] args) {

        // a scanner object to get the input from the user.
        Scanner scanner = new Scanner(System.in);

        // prompt the user with a message asking to enter the input.
        System.out.print("Please Enter an integer value: ");

        // save the user input into a variable called number.
        int number = scanner.nextInt();

        // if statement to check if the number is
        // larger than 0 (positive) and is not dividable by 2 (odd)
        // and print the output to the user.
        if (number > 0 && number % 2 != 0) {
            System.out.println("The number is positive and odd");
        } else {
            System.out.println("Number is either negative or even");
        }


    }
}