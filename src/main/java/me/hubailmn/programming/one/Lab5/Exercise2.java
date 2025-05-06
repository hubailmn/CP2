package me.hubailmn.programming.one.Lab5;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day number (1-7): ");
        int dayOfWeek = scanner.nextInt();

        if (dayOfWeek > 0 && dayOfWeek <= 5) {
            System.out.println("It is a weekday.");
        } else if (dayOfWeek > 5 && dayOfWeek <= 7) {
            System.out.println("It is a weekend day.");
        } else {
            System.out.println("Invalid day.");
        }
        

    }
}
