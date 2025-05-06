package me.hubailmn.programming.one.Lab5;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        if (number > 0 && number < 10) {
            System.out.println("It is a single-digit positive number.");
        } else if (number > 0 && number >= 10) {
            System.out.println("It is a double-digit or more positive number.");
        } else if (number < 0 && number % 5 == 0) {
            System.out.println("It is a negative number divisible by 5.");
        } else if (number < 0 && number % 5 != 0) {
            System.out.println("It is a negative number but not divisible by 5.");
        } else {
            System.out.println("It is zero.");
        }


    }
}
