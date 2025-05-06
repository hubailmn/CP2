package me.hubailmn.programming.one.Lab6;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();

        if (number <= 0) {
            System.out.println("Please Enter a positive number!");
            System.exit(0);
        }

        int counter = 2;

        System.out.print("Even number up to " + number + ": ");
        while (counter <= number) {
            System.out.print(counter % 2 == 0 ? counter + " " : "");
            counter++;
        }
    }
}
