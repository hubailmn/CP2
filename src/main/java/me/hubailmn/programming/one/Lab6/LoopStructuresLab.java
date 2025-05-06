package me.hubailmn.programming.one.Lab6;

import java.util.Random;
import java.util.Scanner;

public class LoopStructuresLab {

    public static void main(String[] args) {

        System.out.println("\nStep 2: Prints the numbers from 1 to 5.");
        int count = 1;

        while (count <= 5) {
            System.out.print(count + " ");
            count++;
        }

        System.out.println("""


                Step 3: Asks the user to enter a number between 1 and 10\s
                (inclusive) repeatedly until a valid input is provided.
                """);

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNumber = random.nextInt(10);
        int number, guesses = 0;

        do {

            if (guesses != 0) {
                System.out.println("Wrong number!");
            }

            System.out.print("Guess the number: ");

            number = scanner.nextInt();
            guesses++;

        } while (randomNumber != number);

        System.out.println("You have guest the number \"" + randomNumber + "\" in " + guesses + (guesses <= 1 ? " try!" : " tries!"));


        System.out.println("\nStep 4: Sum of the numbers from 1 to 10");

        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
        }

        System.out.println("The Sum of the number from 1 to 10 is " + sum + "!");
    }
}
