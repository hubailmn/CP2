package me.hubailmn.Labs.Lab2;

import me.hubailmn.utils.Exercises;

@Exercises(
        exercise = 3,
        name = "Recursive Range Printer",
        description = "Prints all integers in a specified range using recursion, starting from a given number up to an end number."
)
public class Range {

    public static void main(String[] args) {

        int start = 1;
        int end = 10;

        range(start, end);
    }

    private static void range(int num1, int num2) {

        if (num1 > num2) {
            return;
        }

        System.out.println(num1);
        num1++;
        range(num1, num2);
    }
}
