package me.hubailmn.Labs.Lab4.rectangle;

import me.hubailmn.utils.Exercises;

@Exercises(
        name = "Rectangle Class Demonstration",
        description = "Demonstrates the use of a custom Rectangle class by setting its length and width, " +
                "then calculating and displaying its area. This exercise reinforces object-oriented programming concepts " +
                "such as encapsulation, setter/getter methods, and basic geometric calculations."
)

public class RectangleDemo {

    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        R1.setLength(5.5);
        R1.setWidth(10.5);

        System.out.println("The length is " + R1.getLength());
        System.out.println("The width is " + R1.getWidth());
        System.out.println("The area is " + R1.getArea());
    }
}
