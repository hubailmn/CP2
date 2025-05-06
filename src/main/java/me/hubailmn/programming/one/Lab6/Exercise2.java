package me.hubailmn.programming.one.Lab6;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please Enter a positive number!");
            System.exit(0);
        }

        int sum = 0, counter = 1;

        do {
            sum += counter;
            counter++;
        } while (counter <= number);

        System.out.println("Sum of numbers up to " + number + ": " + sum);
    }
}
