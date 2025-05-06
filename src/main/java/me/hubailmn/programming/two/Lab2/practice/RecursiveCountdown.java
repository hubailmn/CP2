package me.hubailmn.programming.two.Lab2.practice;

import me.hubailmn.utils.Exercise;

@Exercise(
        name = "Recursive Countdown",
        description = "Demonstrates a simple recursive method that counts down from a given number to 1 and prints each step."
)

public class RecursiveCountdown {
    public static void main(String[] args) {

        countDown(3);

    }

    public static void countDown(int num) {
        if (num <= 0) {
            System.out.println();
            return;
        }

        System.out.println(num);
        countDown(num - 1);

    }
}
