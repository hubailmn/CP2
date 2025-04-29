package me.hubailmn.Labs.Lab5.rectangle;

import me.hubailmn.utils.Exercise;

@Exercise(
        name = "Rectangle (OOP with constructor)",
        description = ""
)
public class RectangleDemo {

    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5.5, 8.5);

        System.out.println("Area of the rectangle: " + r1.getArea());
        System.out.println("Perimeter of the rectangle: " + r1.getPerimeter());

    }
}
