package me.hubailmn.Labs.Lab2;

import java.util.Scanner;

public class Exercise2Factorial {

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
