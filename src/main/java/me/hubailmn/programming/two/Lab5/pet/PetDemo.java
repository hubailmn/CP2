package me.hubailmn.programming.two.Lab5.pet;

import me.hubailmn.utils.Exercise;

import java.util.Scanner;

@Exercise(
        name = "Pet (OOP with constructor)",
        description = "Demonstrates object-oriented programming concepts with constructors by managing pet information. " +
                "The program creates a pet object with initial data, displays the current information, " +
                "and allows users to update the pet's name, age, and weight through console input. " +
                "Finally, it shows the updated pet information."
)
public class PetDemo {

    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Pet yourPet = new Pet("Jane Doe");

        System.out.println("My records on your pet are inaccurate.");
        System.out.println("Here is what they currently say:");
        yourPet.writeOutput();

        System.out.println("Please enter the correct pet name:");
        String correctName = keyboard.nextLine();

        yourPet.setName(correctName);
        System.out.println("Please enter the correct pet age:");

        int correctAge = keyboard.nextInt();
        yourPet.setAge(correctAge);
        System.out.println("Please enter the correct pet weight:");

        double correctWeight = keyboard.nextDouble();
        yourPet.setWeight(correctWeight);
        System.out.println("My updated records now say:");

        yourPet.writeOutput();
    }

}
