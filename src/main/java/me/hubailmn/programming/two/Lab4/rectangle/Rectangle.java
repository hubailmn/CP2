package me.hubailmn.programming.two.Lab4.rectangle;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Rectangle {

    private double length;
    private double width;

    public double getArea() {
        return width * length;
    }
}
