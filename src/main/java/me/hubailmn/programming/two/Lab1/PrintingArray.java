package me.hubailmn.programming.two.Lab1;

import me.hubailmn.utils.Exercise;

@Exercise(
        exercise = 3,
        name = "Printing Array Elements",
        description = "Initializes an array of integers and prints each element using an enhanced for-loop."
)

public class PrintingArray {

    public static void main(String[] args) {

        int[] numbers = {10, 12, 15, 42, 85, 94, 12, 75};

        System.out.println("The elements of the array: ");
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}
