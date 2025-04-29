package me.hubailmn.Labs.Lab5.dimension;

import me.hubailmn.utils.Exercise;

import java.util.Scanner;

@Exercise(
        name = "Dimension Converter",
        description = ""
)
public class DimensionConverterDemo {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a measurement in inches: ");
        double inches = keyboard.nextDouble();

        double feet = DimensionConverter.convertInchesToFeet(inches);
        System.out.println(inches + " inches = " + feet + " feet.");

        System.out.print("Enter a measurement in feet: ");
        feet = keyboard.nextDouble();

        inches = DimensionConverter.convertFeetToInches(feet);
        System.out.println(feet + " feet = " + inches + " inches.");
    }

}
