package me.hubailmn.Labs.Lab1;

import java.util.Scanner;

public class Exercise1SumOfArray {

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
