package me.hubailmn.programming.one.Lab3;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your family name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your weight: ");
        float weight = scanner.nextFloat();

        System.out.printf("""
                Full Name: %s %s
                Age: %d
                Weight: %.2f
                Year of Birth: %s
                """, firstName, lastName, age, weight, 2024 - age);
    }
}
