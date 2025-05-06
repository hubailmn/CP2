package me.hubailmn.programming.two.Lab1;

import me.hubailmn.utils.Exercise;

import java.util.Scanner;

@Exercise(
        exercise = 1,
        name = "Sum of Array Elements",
        description = "Prompts the user to enter a specified number of numeric values, stores them in an array, " +
                "and calculates the total sum of the elements."

)
public class SumOfArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the amount of the elements: ");
        int size = scan.nextInt();

        double[] numbers = new double[size];
        double sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter #" + (i + 1) + " number: ");
            numbers[i] = scan.nextDouble();
            sum += numbers[i];
        }

        System.out.println("The sum of the entered numbers: " + sum);
    }
}
