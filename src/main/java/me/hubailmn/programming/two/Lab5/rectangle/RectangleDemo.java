package me.hubailmn.programming.two.Lab5.rectangle;

import me.hubailmn.utils.Exercise;

@Exercise(
        name = "Rectangle (OOP with constructor)",
        description = "Demonstrates object-oriented programming concepts using a Rectangle class. " +
                "The program creates a rectangle object with specified dimensions (length and width) " +
                "and calculates its area and perimeter using the constructor and methods. " +
                "It showcases basic OOP principles including object instantiation and method invocation."
)
public class RectangleDemo {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5.5, 8.5);

        System.out.println("Area of the rectangle: " + r1.getArea());
        System.out.println("Perimeter of the rectangle: " + r1.getPerimeter());

    }
}
