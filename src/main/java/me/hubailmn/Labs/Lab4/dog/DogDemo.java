package me.hubailmn.Labs.Lab4.dog;

import me.hubailmn.utils.Exercise;

@Exercise(
        name = "Dog Class and Age Conversion",
        description = "Introduces object-oriented programming by modeling a dog with attributes such as name, breed, and age. " +
                "Includes a method to convert the dog's age from calendar years to human-equivalent years using a standard formula. " +
                "Outputs all relevant information to demonstrate encapsulation and simple logic operations."
)

public class DogDemo {

    public static void main(String[] args) {
        Dog ballot = new Dog();
        ballot.name = "Balto";
        ballot.age = 8;
        ballot.breed = "Siberian Husky";

        ballot.writeOutput();

        Dog scooby = new Dog();
        scooby.name = "Scooby";
        scooby.age = 42;
        scooby.breed = "Great Dane";

        System.out.println(scooby.name + " is a " + scooby.breed + ".");
        System.out.print("He is " + scooby.age + " years old, or ");

        int humanYears = scooby.getAgeInHumanYears();
        System.out.println(humanYears + " in human years.");

    }
}
