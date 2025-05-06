package me.hubailmn.programming.two.Lab5.rectangle;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }
}
