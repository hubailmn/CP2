package me.hubailmn.Labs.Lab1.practice;

import java.util.Scanner;

public class ArrayOfTemperatures {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double[] temperature = new double[7];

        System.out.println("Enter 7 temperatures:");
        double sum = 0;

        for (int index = 0; index < 7; index++) {
            temperature[index] = keyboard.nextDouble();
            sum = sum + temperature[index];
        }

        double average = sum / 7;
        System.out.println("The average temperature is " + average);

        System.out.println("The temperatures are");
        for (int index = 0; index < 7; index++) {
            if (temperature[index] < average) {
                System.out.println(temperature[index] + " below average");
            } else if (temperature[index] > average) {
                System.out.println(temperature[index] + " above average");
            } else {
                System.out.println(temperature[index] + " the average");
            }
        }
        System.out.println("Have a nice week.");
    }
}
