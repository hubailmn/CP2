package me.hubailmn.Labs.Lab5.pet;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pet {
    @Setter
    private String name;
    private int age;
    private double weight;

    public Pet(String initialName, int initialAge, double initialWeight) {
        name = initialName;
        if ((initialAge < 0) || (initialWeight < 0)) {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        } else {
            age = initialAge;
            weight = initialWeight;
        }
    }

    public Pet(String initialName) {
        name = initialName;
        age = 0;
        weight = 0;
    }

    public Pet(int initialAge) {
        name = "No name yet.";
        weight = 0;
        if (initialAge < 0) {
            System.out.println("Error: Negative age.");
            System.exit(0);
        } else
            age = initialAge;
    }

    public Pet(double initialWeight) {
        name = "No name yet";
        age = 0;
        if (initialWeight < 0) {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        } else
            weight = initialWeight;
    }

    public Pet() {
        name = "No name yet.";
        age = 0;
        weight = 0;
    }

    public void setPet(String newName, int newAge, double newWeight) {
        name = newName;
        if ((newAge < 0) || (newWeight < 0)) {
            System.out.println("Error: Negative age or weight.");
            System.exit(0);
        } else {
            age = newAge;
            weight = newWeight;
        }
    }

    public void setAge(int newAge) {
        if (newAge < 0) {
            System.out.println("Error: Negative age.");
            System.exit(0);
        } else
            age = newAge;

    }

    public void setWeight(double newWeight) {
        if (newWeight < 0) {
            System.out.println("Error: Negative weight.");
            System.exit(0);
        } else
            weight = newWeight;
    }

    public void writeOutput() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years");
        System.out.println("Weight: " + weight + " pounds");
    }
}
