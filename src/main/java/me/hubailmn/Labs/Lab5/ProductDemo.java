package me.hubailmn.Labs.Lab5;

import me.hubailmn.utils.Exercise;

@Exercise(
        name = "Product (OOP with constructor )",
        description = "Demonstrates object creation and manipulation using a Product class with constructors. " +
                "Creates multiple product instances with varying properties (name, price, quantity), " +
                "shows input validation for negative values, and illustrates property modification using setter methods. " +
                "The program displays the state of each product after creation and updates."
)
public class ProductDemo {

    public static void main(String[] args) {

        Product iceCream = new Product("Ice Cream", 3.5, 20);
        System.out.println(iceCream);

        Product chocolateChip = new Product("Chocolate Chip", 5.99, 23);
        System.out.println(chocolateChip);

        Product water = new Product("Water (300 milliliter)", 0.5, 100);
        System.out.println(water);

        Product screen = new Product("HP Screen", -10.5, 0);
        System.out.println(screen);

        screen.setPrice(499.99);
        screen.setQuantity(1);

        System.out.println(screen);
    }
}
